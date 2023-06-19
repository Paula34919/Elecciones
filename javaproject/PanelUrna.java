package javaproject;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

//import uniandes.cupi2.elecciones.mundo.Urna;

/**
 * Panel que contiene la informaci�n de la urna de votos en las elecciones cupi2
 */
@SuppressWarnings("serial")
public class PanelUrna extends JPanel
{
    // -----------------------------------------------------------------
    // Atributos de la interfaz
    // -----------------------------------------------------------------

    /**
     * Etiqueta total votos en urna.
     */
    private JLabel lblTotalVotos;

    /**
     * Etiqueta Promedio costo de campa�a.
     */
    private JLabel lblPromedioCostoCampaña;
    
    /**
     * Caja de texto total votos en urna.
     */
    private JTextField txtTotalVotos;

    /**
     * Caja de texto Promedio costo de campa�a.
     */
    private JTextField txtPromedioCostoCampaña;
    
    /**
     * Dataset de los votantes por g�nero.
     */
    private DefaultPieDataset<String> datosGenero;
    
    /**
     * Dataset de los votantes por rango de edad.
     */
    private DefaultPieDataset<String> datosRangoEdad;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Constructor del panel
     */
    public PanelUrna() {
        setPreferredSize(new Dimension(300, 200));
        setBorder(new TitledBorder("Totales"));
        setLayout(new BorderLayout());

        JPanel auxCentro = new JPanel();
        auxCentro.setLayout(new GridLayout(1, 3));

        DefaultPieDataset<String> datosGenero = new DefaultPieDataset<>();
        JFreeChart graficoGenero = crearGrafico("Género", datosGenero);
        ChartPanel auxGenero = new ChartPanel(graficoGenero);
        auxGenero.setPreferredSize(new Dimension(200, 200));

        DefaultPieDataset<String> datosRangoEdad = new DefaultPieDataset<>();
        JFreeChart graficoRangoEdad = crearGrafico("Rango de edad", datosRangoEdad);
        ChartPanel auxRangoEdad = new ChartPanel(graficoRangoEdad);

        auxCentro.add(auxGenero);
        auxCentro.add(auxRangoEdad);

        add(auxCentro, BorderLayout.CENTER);

        JPanel auxSur = new JPanel();
        auxSur.setLayout(new GridLayout(2, 2));

        // Etiqueta total votos
        lblTotalVotos = new JLabel("Total votos");
        lblTotalVotos.setForeground(Color.BLUE.darker());
        lblTotalVotos.setFont(new Font("Tahoma", Font.BOLD, 19));

        // Etiqueta total costo de campaña
        lblPromedioCostoCampaña = new JLabel("Costo promedio campaña");
        lblPromedioCostoCampaña.setForeground(Color.BLUE.darker());
        lblPromedioCostoCampaña.setFont(new Font("Tahoma", Font.BOLD, 19));

        txtTotalVotos = new JTextField();
        txtTotalVotos.setEditable(false);
        txtTotalVotos.setForeground(Color.BLUE.darker());
        txtTotalVotos.setFont(new Font("Tahoma", Font.BOLD, 19));

        txtPromedioCostoCampaña = new JTextField();
        txtPromedioCostoCampaña.setEditable(false);
        txtPromedioCostoCampaña.setForeground(Color.BLUE.darker());
        txtPromedioCostoCampaña.setFont(new Font("Tahoma", Font.BOLD, 19));

        auxSur.add(lblTotalVotos);
        auxSur.add(txtTotalVotos);
        auxSur.add(lblPromedioCostoCampaña);
        auxSur.add(txtPromedioCostoCampaña);

        add(auxSur, BorderLayout.SOUTH);
    }


    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Actualiza la informacipn
     * @param urna Urna de la cual se va a mostrar la informacipn. urna != null.
     */
    public void actualizar( Urna urna )
    {
        txtTotalVotos.setText(""+ urna.calcularTotalVotos( ) );
        txtPromedioCostoCampaña.setText( "$ " + formatearValorReal( urna.calcularCostoPromedioCampaña( ) ) );

        datosGenero.setValue("Masculino", urna.calcularTotalVotosGeneroMasculino());
        datosGenero.setValue("Femenino", urna.calcularTotalVotosGeneroFemenino());
        
        datosRangoEdad.setValue("18 - 34 ", urna.calcularTotalVotosEdadJoven());
        datosRangoEdad.setValue("35 - 54 ", urna.calcularTotalVotosEdadMedia());
        datosRangoEdad.setValue("55 ó más ", urna.calcularTotalVotosEdadMayor());
    }

    /**
     * Formatea un valor numerico real para presentar en la interfaz <br>
     * @param valor El valor numerico a ser formateado
     * @return Cadena con el valor formateado con puntos y signos.
     */
    private String formatearValorReal( double valor )
    {
        DecimalFormat df = ( DecimalFormat )NumberFormat.getInstance( );
        df.applyPattern( " ###,###.##" );
        df.setMinimumFractionDigits( 2 );
        return df.format( valor );
    }

    private static JFreeChart crearGrafico(String titulo, PieDataset datos) 
    {
        JFreeChart chart = ChartFactory.createPieChart(titulo, datos, true, true ,false);

        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setLabelFont(new Font("SansSerif", Font.PLAIN, 12));
        plot.setNoDataMessage("No hay datos disponibles");
        plot.setCircular(true);
        PieSectionLabelGenerator gen = new StandardPieSectionLabelGenerator("{0}: {1}", new DecimalFormat("0"), new DecimalFormat("0%"));
        plot.setLabelGenerator(gen);
        plot.setSimpleLabels(true);
        plot.setBackgroundPaint(Color.WHITE);
        plot.setOutlineVisible(false);
        return chart;

    }
}
