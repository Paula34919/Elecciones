package javaproject;

import junit.framework.TestCase;

public class CandidatoTest extends TestCase
{

    //Iniciar los test 
    private Candidato candidato;

    private void setupEscenario1( )
    {
        candidato = new Candidato( "Felipe", "Pitti", "Independiente", 27 );
    }

    //Iniciar los test 
    public void testInicializar( )
    {
        setupEscenario1( );

        assertTrue( "No se crea con el nombre dado por parametro", candidato.darNombre( ).equals( "Felipe" ) );
        assertTrue( "No se crea con el apellido dado por parametro", candidato.darApellido( ).equals( "Pitti" ) );
        assertTrue( "No se crea con el partido politico dado por parametro", candidato.darPartidoPolitico( ).equals( "Independiente" ) );
        assertTrue( "No se crea con la edad dada por parametro", candidato.darEdad( ) == 27 );
        assertTrue( "No se crea con el costo de campaña en 0", candidato.darCostoCampaña( ) == 0 );
        assertTrue( "No se crea con el numero de votos en 0", candidato.darVotos( ) == 0 );
       
    }

    //Se Agrega un voto al candidato influenciado por la television 
    public void testAgregarVotoTelevision( )
    {
        setupEscenario1( );

        candidato.agregarVotoTelevision( );
        assertTrue( "No aumenta el costo de campaña en 1000", candidato.darCostoCampaña( ) == 1000 );
    }

    //Se Agrega un voto al candidato influenciado por la radio 
    public void testAgregarVotoRadio( )
    {
        setupEscenario1( );

        candidato.agregarVotoRadio( );
        assertTrue( "No aumenta el costo de campaña en 500", candidato.darCostoCampaña( ) == 500 );
    }

    //Se Agrega un voto al candidato influenciado por Internet 
    public void testAgregarVotoInternet( )
    {
        setupEscenario1( );

        candidato.agregarVotoInternet( );
        assertTrue( "No aumenta el costo de campaña en 100", candidato.darCostoCampaña( ) == 100 );
    }

    //Se reinician los votos del candidato 
    public void testReiniciarConteoVotos( )
    {
        setupEscenario1( );

        candidato.agregarVotoTelevision( );
        candidato.agregarVotoRadio( );
        candidato.agregarVotoInternet( );
        candidato.reiniciarConteoVotos( );

        assertTrue( "No inicializa el numero de votos a 0", candidato.darVotos( ) == 0 );
        assertTrue( "No inicializa el numero de votos influenciados por internet a 0.", candidato.darVotosInfluenciaInternet()==0 );
    }

    //Reiniciar el costo de campaña del candidato
    public void testReiniciarCostoCampaña( )
    {
        setupEscenario1( );

        candidato.agregarVotoTelevision( );
        candidato.agregarVotoRadio( );
        candidato.agregarVotoInternet( );
        candidato.reiniciarCostoCampaña( );

        assertTrue( "No inicializa el costo de campaña a 0", candidato.darCostoCampaña( ) == 0 );
    }
    
    //Agregar voto en el genero masculino.
    public void testAgregarVotoGeneroMasculino()
    {
        setupEscenario1();
        candidato.agregarVotoGeneroMasculino();
        assertEquals("Deberia tener 1 voto.", 1, candidato.darVotosGeneroMasculino());
        candidato.agregarVotoGeneroMasculino();
        candidato.agregarVotoGeneroMasculino();
        assertEquals("Deberia tener 3 votos.", 3, candidato.darVotosGeneroMasculino());
    }
    
    //Agregar un voto en el genero femenino.
    public void testAgregarVotoGeneroFemenino()
    {
        setupEscenario1();
        candidato.agregarVotoGeneroFemenino();
        assertEquals("Deberia tener 1 voto.", 1, candidato.darVotosGeneroFemenino());
        candidato.agregarVotoGeneroFemenino();
        candidato.agregarVotoGeneroFemenino();
        assertEquals("Deberia tener 3 votos.", 3, candidato.darVotosGeneroFemenino());
    }
    
    //Agregar un voto en el rango de edad joven.
    public void testAgregarVotoEdadJoven()
    {
        setupEscenario1();
        candidato.agregarVotoEdadJoven();
        assertEquals("Deberia tener 1 voto.", 1, candidato.darVotosEdadJoven());
        candidato.agregarVotoEdadJoven();
        candidato.agregarVotoEdadJoven();
        assertEquals("Deberia tener 3 votos.", 3, candidato.darVotosEdadJoven());
    }
    
    //Agregar un voto en el rango de edad media.
    public void testAgregarVotoEdadMedia()
    {
        setupEscenario1();
        candidato.agregarVotoEdadMedia();
        assertEquals("Deberia tener 1 voto.", 1, candidato.darVotosEdadMedia());
        candidato.agregarVotoEdadMedia();
        candidato.agregarVotoEdadMedia();
        assertEquals("Deberia tener 3 votos.", 3, candidato.darVotosEdadMedia());
    }
    
    //Agregar un voto en el rango de edad mayor.
    public void testAgregarVotoEdadMayor()
    {
        setupEscenario1();
        candidato.agregarVotoEdadMayor();
        assertEquals("Deberia tener 1 voto.", 1, candidato.darVotosEdadMayor());
        candidato.agregarVotoEdadMayor();
        candidato.agregarVotoEdadMayor();
        assertEquals("Deberia tener 3 votos.", 3, candidato.darVotosEdadMayor());
    }
    
}
