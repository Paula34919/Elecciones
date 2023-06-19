package javaproject;
import junit.framework.TestCase;

public class UrnaTest extends TestCase
{
    //Clase donde se haran las pruebas
    private Urna urna;

    
    //Construye una urna, donde cada candidato tiene un voto de cada tipo
    private void setupEscenario1( )
    {
        urna = new Urna( );
    }

    //Construye una urna, donde cada candidato tiene un voto de cada tipo
    private void setupEscenario2( )
    {
        urna = new Urna( );

        urna.ingresarVotoTelevisionCandidato1( );
        urna.ingresarVotoTelevisionCandidato2( );
        urna.ingresarVotoTelevisionCandidato3( );

        urna.ingresarVotoRadioCandidato1( );
        urna.ingresarVotoRadioCandidato2( );
        urna.ingresarVotoRadioCandidato3( );

        urna.ingresarVotoInternetCandidato1( );
        urna.ingresarVotoInternetCandidato2( );
        urna.ingresarVotoInternetCandidato3( );
    }
    
    //Construye una urna donde los candidatos tiene votos por internet
    private void setupEscenario3( )
    {
        urna = new Urna( );
        
        urna.ingresarVotoInternetCandidato1();
        urna.ingresarVotoInternetCandidato1();
        urna.ingresarVotoInternetCandidato1();
        urna.ingresarVotoInternetCandidato1();
        urna.ingresarVotoInternetCandidato1();
        urna.ingresarVotoInternetCandidato2();
        urna.ingresarVotoInternetCandidato2();
        urna.ingresarVotoInternetCandidato2();
        urna.ingresarVotoInternetCandidato3();
        urna.ingresarVotoInternetCandidato3();
    }

    //Inicializacion de los candidatos
    public void testInicializacion( )
    {
        setupEscenario1( );
        assertNotNull( "El candidato 1 debe estar inicializado", urna.darCandidato1( ) );
        assertNotNull( "El candidato 2 debe estar inicializado", urna.darCandidato2( ) );
        assertNotNull( "El candidato 3 debe estar inicializado", urna.darCandidato3( ) );
    }

    //Ingresa el voto influenciado por la television al candidato 1
    public void testIngresarVotoTelevisionCandidato1( )
    {
        setupEscenario1( );
        urna.ingresarVotoTelevisionCandidato1( );
        assertTrue( "Debería aumentar el costo de campaña en 1000", urna.darCandidato1( ).darCostoCampaña( ) == 1000 );
    }

    //Ingresa el voto influenciado por la radio al candidato 1
    public void testIngresarVotoRadioCandidato1( )
    {
        setupEscenario1( );
        urna.ingresarVotoRadioCandidato1( );
        assertTrue( "Debería aumentar el costo de campaña en 500", urna.darCandidato1( ).darCostoCampaña( ) == 500 );
    }

    //Ingresa el voto influenciado por el internet al candidato 1
    public void testIngresarVotoInternetCandidato1( )
    {
        setupEscenario1( );
        urna.ingresarVotoInternetCandidato1( );
        assertTrue( "Debería aumentar el costo de campaña en 100", urna.darCandidato1( ).darCostoCampaña( ) == 100 );
    }

    //Ingresa el voto influenciado por la television al candidato 2
    public void testIngresarVotoTelevisionCandidato2( )
    {
        setupEscenario1( );
        urna.ingresarVotoTelevisionCandidato2( );
        assertTrue( "Debería aumentar el costo de campaña en 1000", urna.darCandidato2( ).darCostoCampaña( ) == 1000 );
    }

    //Ingresa el voto influenciado por la radio al candidato 2
    public void testIngresarVotoRadioCandidato2( )
    {
        setupEscenario1( );
        urna.ingresarVotoRadioCandidato2( );
        assertTrue( "Debería aumentar el costo de campaña en 500", urna.darCandidato2( ).darCostoCampaña( ) == 500 );
    }

    //Ingresa el voto influenciado por el internet al candidato 2
    public void testIngresarVotoInternetCandidato2( )
    {
        setupEscenario1( );
        urna.ingresarVotoInternetCandidato2( );
        assertTrue( "Debería aumentar el costo de campaña en 100", urna.darCandidato2( ).darCostoCampaña( ) == 100 );
    }

    //Ingresa el voto influenciado por la television al candidato 3
    public void testIngresarVotoTelevisionCandidato3( )
    {
        setupEscenario1( );
        urna.ingresarVotoTelevisionCandidato3( );
        assertTrue( "Debería aumentar el costo de campaña en 1000", urna.darCandidato3( ).darCostoCampaña( ) == 1000 );
    }

    //Ingresa el voto influenciado por la radio al candidato 3
    public void testIngresarVotoRadioCandidato3( )
    {
        setupEscenario1( );
        urna.ingresarVotoRadioCandidato3( );
        assertTrue( "Debería aumentar el costo de campaña en 500", urna.darCandidato3( ).darCostoCampaña( ) == 500 );
    }

    //Ingresa el voto influenciado por Internet al candidato 3
    public void testIngresarVotoInternetCandidato3( )
    {
        setupEscenario1( );
        urna.ingresarVotoInternetCandidato3( );
        assertTrue( "Debería aumentar el costo de campaña en 100", urna.darCandidato3( ).darCostoCampaña( ) == 100 );
    }

    //Se calcula el total de votos que tiene la urna
    public void testCalcularTotalVotos( )
    {
        setupEscenario2( );

        assertTrue( "No calcula el total de votos correctamente", urna.calcularCostoPromedioCampaña() == 1600 );

    }

    //Se calcula el costo promedio de campaña de los candidatos
    public void testCalcularCostoPromedioCampaña( )
    {
        setupEscenario2( );
        assertTrue( "No calcula el costo promedio de campaña correctamente", urna.calcularCostoPromedioCampaña( ) == 1600 );
    }

    //Se vacia la urna
    public void testVaciarUrna( )
    {
        setupEscenario2( );

        urna.vaciarUrna( );

        assertTrue( "No inicializa el número de votos a 0 del candidato 1", urna.darCandidato1( ).darVotos( ) == 0 );
        assertTrue( "No inicializa el costo de campaña a 0 del candidato 1", urna.darCandidato1( ).darCostoCampaña( ) == 0 );

        assertTrue( "No inicializa el número de votos a 0 del candidato 2", urna.darCandidato2( ).darVotos( ) == 0 );
        assertTrue( "No inicializa el costo de campaña a 0 del candidato 2", urna.darCandidato2( ).darCostoCampaña( ) == 0 );

        assertTrue( "No inicializa el número de votos a 0 del candidato 3", urna.darCandidato3( ).darVotos( ) == 0 );
        assertTrue( "No inicializa el costo de campaña a 0 del candidato 3", urna.darCandidato3( ).darCostoCampaña( ) == 0 );

    }
    
    //Se registran los votos para la edad joven del candidato 1
    public void testRegistrarVotoEdadJoven1()
    {
        setupEscenario1();
        urna.registrarVotoEdadJovenCandidato1();
        assertEquals( "No registra bien el voto.", 1, urna.darCandidato1().darVotosEdadJoven());
        urna.registrarVotoEdadJovenCandidato1();
        assertEquals( "No registra bien el voto.", 2, urna.darCandidato1().darVotosEdadJoven());
        urna.registrarVotoEdadJovenCandidato1();
        assertEquals( "No registra bien el voto.", 3, urna.darCandidato1().darVotosEdadJoven());
    }
    
    //Se registran los votos para la edad joven del candidato 2
    public void testRegistrarVotoEdadJoven2()
    {
        setupEscenario1();
        urna.registrarVotoEdadJovenCandidato2();
        assertEquals( "No registra bien el voto.", 1, urna.darCandidato2().darVotosEdadJoven());
        urna.registrarVotoEdadJovenCandidato2();
        assertEquals( "No registra bien el voto.", 2, urna.darCandidato2().darVotosEdadJoven());
        urna.registrarVotoEdadJovenCandidato2();
        assertEquals( "No registra bien el voto.", 3, urna.darCandidato2().darVotosEdadJoven());
    }
    
    //Se registran los votos para la edad joven del candidato 3
    public void testRegistrarVotoEdadJoven3()
    {
        setupEscenario1();
        urna.registrarVotoEdadJovenCandidato3();
        assertEquals( "No registra bien el voto.", 1, urna.darCandidato3().darVotosEdadJoven());
        urna.registrarVotoEdadJovenCandidato3();
        assertEquals( "No registra bien el voto.", 2, urna.darCandidato3().darVotosEdadJoven());
        urna.registrarVotoEdadJovenCandidato3();
        assertEquals( "No registra bien el voto.", 3, urna.darCandidato3().darVotosEdadJoven());
    }
    
    //Se registran los votos para la edad media del candidato 1
    public void testRegistrarVotoEdadMedia1()
    {
        setupEscenario1();
        urna.registrarVotoEdadMediaCandidato1();
        assertEquals( "No registra bien el voto.", 1, urna.darCandidato1().darVotosEdadMedia());
        urna.registrarVotoEdadMediaCandidato1();
        assertEquals( "No registra bien el voto.", 2, urna.darCandidato1().darVotosEdadMedia());
        urna.registrarVotoEdadMediaCandidato1();
        assertEquals( "No registra bien el voto.", 3, urna.darCandidato1().darVotosEdadMedia());
    }
    
    //Se registran los votos para la edad media del candidato 2
    public void testRegistrarVotoEdadMedia2()
    {
        setupEscenario1();
        urna.registrarVotoEdadMediaCandidato2();
        assertEquals( "No registra bien el voto.", 1, urna.darCandidato2().darVotosEdadMedia());
        urna.registrarVotoEdadMediaCandidato2();
        assertEquals( "No registra bien el voto.", 2, urna.darCandidato2().darVotosEdadMedia());
        urna.registrarVotoEdadMediaCandidato2();
        assertEquals( "No registra bien el voto.", 3, urna.darCandidato2().darVotosEdadMedia());
    }
    
    //Se registran los votos para la edad media del candidato 3
    public void testRegistrarVotoEdadMedia3()
    {
        setupEscenario1();
        urna.registrarVotoEdadMediaCandidato3();
        assertEquals( "No registra bien el voto.", 1, urna.darCandidato3().darVotosEdadMedia());
        urna.registrarVotoEdadMediaCandidato3();
        assertEquals( "No registra bien el voto.", 2, urna.darCandidato3().darVotosEdadMedia());
        urna.registrarVotoEdadMediaCandidato3();
        assertEquals( "No registra bien el voto.", 3, urna.darCandidato3().darVotosEdadMedia());
    }
   
    //Se registran los votos para los de la edad mayor del candidato 1
    public void testRegistrarVotoEdadMayor1()
    {
        setupEscenario1();
        urna.registrarVotoEdadMayorCandidato1();
        assertEquals( "No registra bien el voto.", 1, urna.darCandidato1().darVotosEdadMayor());
        urna.registrarVotoEdadMayorCandidato1();
        assertEquals( "No registra bien el voto.", 2, urna.darCandidato1().darVotosEdadMayor());
        urna.registrarVotoEdadMayorCandidato1();
        assertEquals( "No registra bien el voto.", 3, urna.darCandidato1().darVotosEdadMayor());
    }
    
    //Se registran los votos para los de la edad mayor del candidato 2
    public void testRegistrarVotoEdadMayor2()
    {
        setupEscenario1();
        urna.registrarVotoEdadMayorCandidato2();
        assertEquals( "No registra bien el voto.", 1, urna.darCandidato2().darVotosEdadMayor());
        urna.registrarVotoEdadMayorCandidato2();
        assertEquals( "No registra bien el voto.", 2, urna.darCandidato2().darVotosEdadMayor());
        urna.registrarVotoEdadMayorCandidato2();
        assertEquals( "No registra bien el voto.", 3, urna.darCandidato2().darVotosEdadMayor());
    }
    
    //Se registran los votos para los de la edad mayor del candidato 3
    public void testRegistrarVotoEdadMayor3()
    {
        setupEscenario1();
        urna.registrarVotoEdadMayorCandidato3();
        assertEquals( "No registra bien el voto.", 1, urna.darCandidato3().darVotosEdadMayor());
        urna.registrarVotoEdadMayorCandidato3();
        assertEquals( "No registra bien el voto.", 2, urna.darCandidato3().darVotosEdadMayor());
        urna.registrarVotoEdadMayorCandidato3();
        assertEquals( "No registra bien el voto.", 3, urna.darCandidato3().darVotosEdadMayor());
    }

    //Se registra los votos del genero masculino del candidato 1
    public void testRegistrarVotoGeneroMasculino1()
    {
        setupEscenario1();
        urna.registrarVotoGeneroMasculinoCandidato1();
        assertEquals( "No registra bien el voto.", 1, urna.darCandidato1().darVotosGeneroMasculino());
        urna.registrarVotoGeneroMasculinoCandidato1();
        assertEquals( "No registra bien el voto.", 2, urna.darCandidato1().darVotosGeneroMasculino());
        urna.registrarVotoGeneroMasculinoCandidato1();
        assertEquals( "No registra bien el voto.", 3, urna.darCandidato1().darVotosGeneroMasculino());
        
    }
    
    //Se registra los votos del genero masculino del candidato 2
    public void testRegistrarVotoGeneroMasculino2()
    {
        setupEscenario1();
        urna.registrarVotoGeneroMasculinoCandidato2();
        assertEquals( "No registra bien el voto.", 1, urna.darCandidato2().darVotosGeneroMasculino());
        urna.registrarVotoGeneroMasculinoCandidato2();
        assertEquals( "No registra bien el voto.", 2, urna.darCandidato2().darVotosGeneroMasculino());
        urna.registrarVotoGeneroMasculinoCandidato2();
        assertEquals( "No registra bien el voto.", 3, urna.darCandidato2().darVotosGeneroMasculino());
        
    }
    
    //Se registra los votos del genero masculino del candidato 3
    public void testRegistrarVotoGeneroMasculino3()
    {
        setupEscenario1();
        urna.registrarVotoGeneroMasculinoCandidato3();
        assertEquals( "No registra bien el voto.", 1, urna.darCandidato3().darVotosGeneroMasculino());
        urna.registrarVotoGeneroMasculinoCandidato3();
        assertEquals( "No registra bien el voto.", 2, urna.darCandidato3().darVotosGeneroMasculino());
        urna.registrarVotoGeneroMasculinoCandidato3();
        assertEquals( "No registra bien el voto.", 3, urna.darCandidato3().darVotosGeneroMasculino());
        
    }
    
    //Se registran los votos para el genero femenino del candidato 1
    public void testRegistrarVotoGeneroFemenino1()
    {
        setupEscenario1();
        urna.registrarVotoGeneroFemeninoCandidato1();
        assertEquals( "No registra bien el voto.", 1, urna.darCandidato1().darVotosGeneroFemenino());
        urna.registrarVotoGeneroFemeninoCandidato1();
        assertEquals( "No registra bien el voto.", 2, urna.darCandidato1().darVotosGeneroFemenino());
        urna.registrarVotoGeneroFemeninoCandidato1();
        assertEquals( "No registra bien el voto.", 3, urna.darCandidato1().darVotosGeneroFemenino());
        
    }
    
    //Se registran los votos para el genero femenino del candidato 2
    public void testRegistrarVotoGeneroFemenino2()
    {
        setupEscenario1();
        urna.registrarVotoGeneroFemeninoCandidato2();
        assertEquals( "No registra bien el voto.", 1, urna.darCandidato2().darVotosGeneroFemenino());
        urna.registrarVotoGeneroFemeninoCandidato2();
        assertEquals( "No registra bien el voto.", 2, urna.darCandidato2().darVotosGeneroFemenino());
        urna.registrarVotoGeneroFemeninoCandidato2();
        assertEquals( "No registra bien el voto.", 3, urna.darCandidato2().darVotosGeneroFemenino());
        
    }
    
    //Se registran los votos para el genero femenino del candidato 3
    public void testRegistrarVotoGeneroFemenino3()
    {
        setupEscenario1();
        urna.registrarVotoGeneroFemeninoCandidato3();
        assertEquals( "No registra bien el voto.", 1, urna.darCandidato3().darVotosGeneroFemenino());
        urna.registrarVotoGeneroFemeninoCandidato3();
        assertEquals( "No registra bien el voto.", 2, urna.darCandidato3().darVotosGeneroFemenino());
        urna.registrarVotoGeneroFemeninoCandidato3();
        assertEquals( "No registra bien el voto.", 3, urna.darCandidato3().darVotosGeneroFemenino());
        
    }
    
    //Calcula el promedio de votos influenciados por internet para el candidato 1
    public void testCalcularPorcentajeVotosPorInternet1()
    {
        setupEscenario3();
        assertEquals("El porcentaje del candidato 1 no está bien.", 50, urna.calcularPorcentajeVotosPorInternetCandidato1(), 0.1);
    }
    
    //Calcula el promedio de votos influenciados por internet para el candidato 2
    public void testCalcularPorcentajeVotosPorInternet2()
    {
        setupEscenario3();
        assertEquals("El porcentaje del candidato 2 no está bien.", 30, urna.calcularPorcentajeVotosPorInternetCandidato2(), 0.1);
    }
    
    //Calcula el promedio de votos influenciados por internet para el candidato 3
    public void testCalcularPorcentajeVotosPorInternet3()
    {
        setupEscenario3();
        assertEquals("El porcentaje del candidato 3 no está bien.", 20, urna.calcularPorcentajeVotosPorInternetCandidato3(), 0.1);
    }
}
