package javaproject;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JDialog;
public class DialogoVotar extends JDialog
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------
    /**
     * Es una referencia a la ventana principal de la interfaz
     */
    private InterfazElecciones ventanaPrincipal;
    private int numeroCandidato;
    // -----------------------------------------------------------------
    // Atributos de la Interfaz
    // -----------------------------------------------------------------
    /**
     * Es el panel donde se registran los datos del votante
     */
    private PanelVotar panelVotar;
    
    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye el dialogo e inicializa sus componentes
     * @param ia Es una referencia a la ventana principal de la interfaz - ia!=null
     * @param numCandidato numero del candidato a adicionar el voto.
     */
    public DialogoVotar( InterfazElecciones ia, int numCandidato )
    {
        super( ia, true );
        ventanaPrincipal = ia;
        numeroCandidato = numCandidato;
        panelVotar = new PanelVotar( this );
        setDefaultCloseOperation( DISPOSE_ON_CLOSE );
        getContentPane( ).add( panelVotar );
        setResizable( false );
        setTitle( "Votar" );
        pack( );
        centrar( );
    }
    
    // -----------------------------------------------------------------
    // Metodos
    // -----------------------------------------------------------------

    /**
     * Registra un voto a un candidato.
     * @param influencia La influencia del votante.
     * @param genero El genero del votante.
     * @param rangoEdad El rango de edad del votante.
     */
    public void votar( String influencia, String genero, String rangoEdad )
    {
        ventanaPrincipal.adicionarVotoCandidato(numeroCandidato, influencia, genero, rangoEdad);
    }

    /**
     * Centra el dialogo en la pantalla
     */
    private void centrar( )
    {
        Dimension screen = Toolkit.getDefaultToolkit( ).getScreenSize( );
        int xEsquina = ( screen.width - getWidth( ) ) / 2;
        int yEsquina = ( screen.height - getHeight( ) ) / 2;
        setLocation( xEsquina, yEsquina );
    }
}
