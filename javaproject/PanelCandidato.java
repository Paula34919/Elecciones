package javaproject;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 * Panel que contiene la informacion de un candidato.
 */
@SuppressWarnings("serial")
public class PanelCandidato extends JPanel implements ActionListener
{
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------
    /**
     * Comando mostrar estadisticas del candidato.
     */
    private static final String ESTADISTICAS_VOTOS = "Estadisticas";
    /**
     * Comando votar por el candidato.
     */
    private static final String VOTAR = "Votar";
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------
    /**
     * Ventana principal de la aplicacion
     */
    private InterfazElecciones principal;
    /**
     * Numero del candidato.
     */
    private int numCandidato;

    // -----------------------------------------------------------------
    // Atributos de la interfaz
    // -----------------------------------------------------------------

    /**
     * Etiqueta nombre del candidato.
     */
    private JLabel lblNombreCandidato;

    /**
     * Etiqueta edad del candidato.
     */
    private JLabel lblEdadCandidato;

    /**
     * Etiqueta partido politico del candidato.
     */
    private JLabel lblPartidoPoliticoCandidato;

    /**
     * Etiqueta Costo de campaña del candidato.
     */
    private JLabel lblCostoCampañaCandidato;

    /**
     * Etiqueta numero de votos del candidato.
     */
    private JLabel lblNumeroVotos;
    
    /**
     * Caja de texto nombre del candidato.
     */
    private JTextField txtNombreCandidato;

    /**
     * Caja de texto edad del candidato.
     */
    private JTextField txtEdadCandidato;

    /**
     * Caja de texto partido politico del candidato.
     */
    private JTextField txtPartidoPoliticoCandidato;

    /**
     *Caja de texto Costo de campaña del candidato.
     */
    private JTextField txtCostoCampañaCandidato;

    /**
     * Caja de texto número de votos del candidato.
     */
    private JTextField txtNumeroVotos;

    /**
     * Boton mostrar estadisticas.
     */
    private JButton btnEstadisticas;

    /**
     * Boton Votar.
     */
    private JButton btnVotar;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Constructor del panel
     * @param laPrincipal Ventana principal. laPrincipal != null.
     * @param nCandidato Numero del candidato.
     */
    public PanelCandidato( InterfazElecciones laPrincipal, int nCandidato )
    {
        principal = laPrincipal;
        numCandidato = nCandidato;

        // Boton actualizar datos
        btnEstadisticas = new JButton( ESTADISTICAS_VOTOS );
        btnEstadisticas.setPreferredSize( new Dimension( 160, 20 ) );
        btnEstadisticas.setActionCommand( ESTADISTICAS_VOTOS );
        btnEstadisticas.addActionListener( this );

        btnVotar = new JButton( VOTAR );
        btnVotar.setPreferredSize( new Dimension( 160, 20 ) );
        btnVotar.setActionCommand( VOTAR );
        btnVotar.addActionListener( this );

        lblNombreCandidato = new JLabel( "Nombre" );
        lblNombreCandidato.setHorizontalAlignment( JLabel.LEFT );

        lblEdadCandidato = new JLabel( "Edad" );
        lblEdadCandidato.setHorizontalAlignment( JLabel.LEFT );

        lblPartidoPoliticoCandidato = new JLabel( "Partido político" );
        lblPartidoPoliticoCandidato.setHorizontalAlignment( JLabel.LEFT );

        lblCostoCampañaCandidato = new JLabel( "Costo campaña" );
        lblCostoCampañaCandidato.setHorizontalAlignment( JLabel.LEFT );

        lblNumeroVotos = new JLabel( "Número de votos" );
        lblNumeroVotos.setHorizontalAlignment( JLabel.LEFT );
        lblNumeroVotos.setForeground( Color.RED.darker( ) );
        
        txtNombreCandidato = new JTextField();
        txtNombreCandidato.setEditable(false);
        txtNombreCandidato.setFont( new Font( "Dialog", Font.BOLD, 12 ) );
        
        txtEdadCandidato = new JTextField();
        txtEdadCandidato.setEditable(false);
        txtEdadCandidato.setFont( new Font( "Dialog", Font.BOLD, 12 ) );
        
        txtPartidoPoliticoCandidato = new JTextField();
        txtPartidoPoliticoCandidato.setEditable(false);
        txtPartidoPoliticoCandidato.setFont( new Font( "Dialog", Font.BOLD, 12 ) );
        
        txtCostoCampañaCandidato = new JTextField();
        txtCostoCampañaCandidato.setEditable(false);
        txtCostoCampañaCandidato.setFont( new Font( "Dialog", Font.BOLD, 12 ) );
       
        txtNumeroVotos = new JTextField();
        txtNumeroVotos.setEditable(false);
        txtNumeroVotos.setFont( new Font( "Dialog", Font.BOLD, 12 ) );
        txtNumeroVotos.setForeground( Color.RED.darker( ) );
        
        JPanel panelImagen = new JPanel( );
        JPanel panelInformacionGlobal = new JPanel( );
        JPanel panelInformacionDatos = new JPanel( );
        JPanel panelInformacionBotones = new JPanel( );

        setLayout( new java.awt.BorderLayout( ) );
        setBorder( javax.swing.BorderFactory.createTitledBorder( "Candidato" + numCandidato ) );
        
        panelImagen.setLayout( new BorderLayout( ) );
        
        JLabel temp = new JLabel( );
        temp.setHorizontalAlignment( JLabel.CENTER );
        //temp.setPreferredSize(new Dimension(1000, 1000));
        temp.setIcon( new ImageIcon( "\\data\\candidato" + numCandidato + ".jpg" ) );
        //ImageIcon icono = new ImageIcon( "D:\\Mi unidad\\Profesional\\2023 EAN - Docente Catedra\\Programacion Orientada a Objetos\\Pruebas BlueJ\\Elecciones\\Elecciones\\data\\candidato" + numCandidato + ".jpg" );
        //System.out.println(icono);
        
        panelImagen.add( temp, BorderLayout.CENTER );
        
        add( panelImagen, java.awt.BorderLayout.CENTER );
        
        panelInformacionGlobal.setLayout( new BorderLayout() );
        panelInformacionDatos.setLayout( new GridLayout( 5, 2 ) );
        panelInformacionBotones.setLayout( new GridLayout( 2, 1 ) );

        panelInformacionDatos.add( lblNombreCandidato );
        panelInformacionDatos.add( txtNombreCandidato );
        panelInformacionDatos.add( lblEdadCandidato );
        panelInformacionDatos.add( txtEdadCandidato );
        panelInformacionDatos.add( lblPartidoPoliticoCandidato );
        panelInformacionDatos.add( txtPartidoPoliticoCandidato );
        panelInformacionDatos.add( lblCostoCampañaCandidato );
        panelInformacionDatos.add( txtCostoCampañaCandidato );
        
        
        panelInformacionDatos.add( lblNumeroVotos );
        panelInformacionDatos.add( txtNumeroVotos );
        
        
        panelInformacionBotones.add( btnEstadisticas );
        panelInformacionBotones.add( btnVotar );
        
        panelInformacionGlobal.add(panelInformacionDatos, BorderLayout.CENTER);
        panelInformacionGlobal.add(panelInformacionBotones, BorderLayout.SOUTH);
   
        add( panelInformacionGlobal, BorderLayout.SOUTH );
    }

    // -----------------------------------------------------------------
    // Metodos
    // -----------------------------------------------------------------

    /**
     * Actualiza la visualizaci�n de la informacion
     * @param candidato Candidato de donde se saca la informacion. candidato != null.
     */
    public void actualizar( Candidato candidato )
    {
        txtNombreCandidato.setText( candidato.darNombre( ) + " " +  candidato.darApellido() );
        txtEdadCandidato.setText( "" + candidato.darEdad( ) );
        txtPartidoPoliticoCandidato.setText( String.valueOf( candidato.darPartidoPolitico( ) ) );
        txtCostoCampañaCandidato.setText( formatearValorReal( candidato.darCostoCampaña( ) ) );
        txtNumeroVotos.setText( "" + candidato.darVotos( ) );

        if( principal.darTotalVotosUrna( ) == 0 )
            btnEstadisticas.setEnabled( false );
        else
            btnEstadisticas.setEnabled( true );

    }

    /**
     * Manejo de eventos del usuario
     * @param e Evento de usuario. e != null.
     */
    public void actionPerformed( ActionEvent e )
    {
        if( VOTAR.equals( e.getActionCommand( ) ) )
        {
            principal.mostrarDialogoVotar(numCandidato);
        }
        else if( ESTADISTICAS_VOTOS.equals( e.getActionCommand( ) ) )
        {
            principal.mostrarDialogoEstadisticasCondidato( numCandidato );
        }

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
}
