package javaproject;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelImagen extends JPanel
{
    
    private JLabel etiquetaImagen;
   
    /**
     * Constructor del Panel
     */
    public PanelImagen( )
    {
        setLayout( new BorderLayout( ) );
        setBackground( Color.WHITE );

     
        ImageIcon icono = new ImageIcon( "D:\\Mi unidad\\Profesional\\2023 EAN - Docente Catedra\\Programacion Orientada a Objetos\\Pruebas BlueJ\\Elecciones\\Elecciones\\data\\Encabezado.png" );
        etiquetaImagen = new JLabel( "" );
        etiquetaImagen.setIcon( icono );
        etiquetaImagen.setHorizontalAlignment( JLabel.CENTER );
        etiquetaImagen.setVerticalAlignment( JLabel.CENTER );
        etiquetaImagen.setIcon( new ImageIcon( "D:\\Mi unidad\\Profesional\\2023 EAN - Docente Catedra\\Programacion Orientada a Objetos\\Pruebas BlueJ\\Elecciones\\Elecciones\\data\\Encabezado.jpg" ) );
        add( etiquetaImagen, BorderLayout.CENTER );

    }

}
