package javaproject;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
/**
 * Panel de manejo de extensiones
 */
@SuppressWarnings("serial")
public class PanelExtension extends JPanel implements ActionListener
{
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------
    /**
     * Comando Vaciar Urna
     */
    private static final String VACIAR_URNA = "VACIAR_URNA";
    /**
     * Comando Opcion 1
     */
    private static final String OPCION_1 = "OPCION_1";
    /**
     * Comando Opcion 2
     */
    private static final String OPCION_2 = "OPCION_2";
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------
    /**
     * Ventana principal de la aplicacion
     */
    private InterfazElecciones principal;

    // -----------------------------------------------------------------
    // Atributos de interfaz
    // -----------------------------------------------------------------

    /**
     * Boton VaciarUrna
     */
    private JButton btnVaciarUrna;

    /**
     * Boton Opcion 1
     */
    private JButton btnOpcion1;

    /**
     * Boton Opcion 2
     */
    private JButton btnOpcion2;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Constructor del panel
     * @param ventana Ventana principal
     */
    public PanelExtension( InterfazElecciones ventana )
    {
        principal = ventana;

        setBorder( new TitledBorder( "Opciones" ) );
        setLayout( new GridLayout( 1, 3 ) );

        // Bot�n vaciar urna
        btnVaciarUrna = new JButton( "Vaciar urna" );
        btnVaciarUrna.setActionCommand( VACIAR_URNA );
        btnVaciarUrna.addActionListener( this );
        add( btnVaciarUrna );

        // Bot�n opci�n 1
        btnOpcion1 = new JButton( "Opción 1" );
        btnOpcion1.setActionCommand( OPCION_1 );
        btnOpcion1.addActionListener( this );
        add( btnOpcion1 );

        // Bot�n opci�n 2
        btnOpcion2 = new JButton( "Opción 2" );
        btnOpcion2.setActionCommand( OPCION_2 );
        btnOpcion2.addActionListener( this );
        add( btnOpcion2 );
    }

    // -----------------------------------------------------------------
    // Metodos
    // -----------------------------------------------------------------

    /**
     * Manejo de los eventos de los botones
     * @param e Accion que genero el evento.
     */
    public void actionPerformed( ActionEvent e )
    {
        if( OPCION_1.equals( e.getActionCommand( ) ) )
        {
            principal.reqFuncOpcion1( );
        }
        else if( OPCION_2.equals( e.getActionCommand( ) ) )
        {
            principal.reqFuncOpcion2( );
        }
        else if( VACIAR_URNA.equals( e.getActionCommand( ) ) )
        {

            principal.vaciarUrna( );
        }
    }

}
