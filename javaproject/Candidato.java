package javaproject;
/**
 * Candidato de la eleccion.
 */
public class Candidato
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------
    /**
     * Nombre del candidato.
     */
    private String nombre;
    /**
     * Apellido del candidato.
     */
    private String apellido;
    /**
     * Partido pol�tico del candidato.
     */
    private String partidoPolitico;
    /**
     * Edad del candidato.
     */
    private int edad;
    /**
     * Costo de campaña del candidato.
     */
    private double costoCampaña;

    /**
     * Numero de votos del candidato.
     */
    private int votos;
    
    /**
     * N�mero de votos influenciados por internet.
     */
    private int votosInfluenciadosPorInternet;
    
    /**
     * N�mero de votos de g�nero femenino.
     */
    private int votosFemeninos;
    
    /**
     * N�mero de votos de g�nero masculino.
     */
    private int votosMasculinos;
    
    /**
     * N�mero de votos de edad joven (18 - 34).
     */
    private int votosJovenes;
    
    /**
     * N�mero de votos de edad media (35 - 54).
     */
    private int votosEdadMedia;
    
    /**
     * N�mero de votos de edad mayor (55 � m�s).
     */
    private int votosMayores;


    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Inicializa los datos del candidato con los valores que vienen por par�metro. <br>
     * <b>post: </b> El costo de campa�a se inicializ� en cero<br>
     * El n�mero de votos se inicializ� en cero. <br>
     * @param nNombre Nombre del candidato
     * @param nApellido Apellido del Candidato
     * @param nPartidoPolitico Partido pol�tico del candidato
     * @param nEdad Edad del candidato
     */

    public Candidato( String nNombre, String nApellido, String nPartidoPolitico, int nEdad )
    {
        nombre = nNombre;
        apellido = nApellido;
        partidoPolitico = nPartidoPolitico;
        edad = nEdad;
        costoCampaña = 0;
        votos = 0;
        votosInfluenciadosPorInternet = 0;
        votosFemeninos = 0;
        votosMasculinos = 0;
        votosJovenes = 0;
        votosEdadMedia = 0;
        votosMayores = 0;
    }

    /**
     * Devuelve el nombre del candidato.
     * @return nombre del candidato.
     */
    public String darNombre( )
    {
        return nombre;
    }

    /**
     * Devuelve el apellido del candidato.
     * @return apellido del candidato.
     */
    public String darApellido( )
    {
        return apellido;
    }

    /**
     * Devuelve el partido politico del candidato.
     * @return partido politico del candidato.
     */
    public String darPartidoPolitico( )
    {
        return partidoPolitico;
    }

    /**
     * Devuelve la edad del candidato.
     * @return edad del candidato.
     */
    public int darEdad( )
    {
        return edad;
    }

    /**
     * Devuelve el costo de campaña del candidato.
     * @return costo de campaña del candidato.
     */
    public double darCostoCampaña( )
    {
        return costoCampaña;
    }

    /**
     * Devuelve el numero de votos del candidato.
     * @return numero de votos obtenidos.
     */
    public int darVotos( )
    {
        return votos;
    }
    
    /**
     * Devuelve el numero de votos influenciados por internet.
     * @return numero de votos influenciados por internet.
     */
    public int darVotosInfluenciaInternet()
    {
        return votosInfluenciadosPorInternet;
    }
    
    /**
     * Devuelve el numero de votos de genero femenino.
     * @return numero de votos de genero femenino.
     */
    public int darVotosGeneroFemenino()
    {
        return votosFemeninos;
    }
    
    /**
     * Devuelve el numero de votos de genero masculino.
     * @return numero de votos de genero masculino.
     */
    public int darVotosGeneroMasculino()
    {
        return votosMasculinos;
    }
    
    /**
     * Devuelve el numero de votos de edad joven.
     * @return nu�mero de votos de edad joven.
     */
    public int darVotosEdadJoven()
    {
        return votosJovenes;
    }
    
    /**
     * Devuelve el numero de votos de edad media.
     * @return numero de votos de edad media.
     */
    public int darVotosEdadMedia()
    {
        return votosEdadMedia;
    }
    
    /**
     * Devuelve el numero de votos de edad mayor.
     * @return numero de votos de edad mayor.
     */
    public int darVotosEdadMayor()
    {
        return votosMayores;
    }

    /**
     * Ingresa un voto al candidato.<br>
     * <b>post: </b> Se modifico el numero de votos aumentandose el existente en 1.
     */
    public void ingresarUnVoto( )
    {
        votos++;
    }

    /**
     * Adiciona un voto influenciado por la television <br<
     * <b>post: </b> Se adiciona al costo de la campaña la suma de $1000 y se incrementa el numero de votos totales en 1.
     */
    public void agregarVotoTelevision( )
    {
        costoCampaña = costoCampaña + 1000;
        votos++;
    }

    /**
     * Adiciona un voto influenciado por la radio <br>
     * <b>post: </b> Se adiciona al costo de la campaña la suma de $500 y se incrementa el numero de votos totales en 1.
     * 
     */
    public void agregarVotoRadio( )
    {
        costoCampaña = costoCampaña + 500;
        votos++;
    }

    /**
     * Adiciona un voto influenciado por Internet <br>
     * <b>post: </b> Se adiciona al costo de la campaña la suma de $100, se incrementa el numero de votos totales en 1. 
     * Se incrementa en 1 el numero de votos influenciados por internet.
     */
    public void agregarVotoInternet( )
    {
        costoCampaña = costoCampaña + 100;
        votos++;
        votosInfluenciadosPorInternet++;
    }
    
    /**
     * Adiciona un voto dado por un votante de genero femenino <br>
     * <b>post: </b> Se incrementa el numero de votos de genero femenino en 1.
     */
    public void agregarVotoGeneroFemenino( )
    {
        votosFemeninos++;
    }
    
    /**
     * Adiciona un voto dado por un votante de genero masculino <br>
     * <b>post: </b> Se incrementa el numero de votos de genero masculino en 1.
     */
    public void agregarVotoGeneroMasculino( )
    {
        votosMasculinos++;
    }
    
    /**
     * Adiciona un voto dado por un votante de edad joven <br>
     * <b>post: </b> Se incrementa el numero de votos de edad joven en 1.
     */
    public void agregarVotoEdadJoven( )
    {
        votosJovenes++;
    }
    
    /**
     * Adiciona un voto dado por un votante de edad media <br>
     * <b>post: </b> Se incrementa el numero de votos de edad media en 1.
     */
    public void agregarVotoEdadMedia( )
    {
        votosEdadMedia++;
    }
    
    /**
     * Adiciona un voto dado por un votante de edad mayor <br>
     * <b>post: </b> Se incrementa el numero de votos de edad mayor en 1.
     */
    public void agregarVotoEdadMayor( )
    {
        votosMayores++;
    }
    
    /**
     * Adiciona un voto dado por un votante de genero masculino <br>
     * <b>post: </b> Se incrementa el numero de votos de genero masculino en 1.
     */
        /**
     * Se reinicia el conteo de votos 
     * <b>post: </b> votos = 0. votosGeneroFemenino = 0. votosGeneroMasculino = 0. votosEdadJoven = 0.
     *     votosEdadMedia = 0. votosEdadMayor = 0. votosInfluenciaInternet=0
     */
    public void reiniciarConteoVotos( )
    {
        
        costoCampaña = 0;
        votos = 0;
        
        votosInfluenciadosPorInternet = 0;
        votosFemeninos = 0;
        votosMasculinos = 0;
        votosJovenes = 0;
        votosEdadMedia = 0;
        votosMayores = 0;
    }

    /**
     * Se reinicia el costo de campaña <b>post: </b> costoCampaña = 0.
     */
    public void reiniciarCostoCampaña( )
    {
        costoCampaña = 0;
    }
}

