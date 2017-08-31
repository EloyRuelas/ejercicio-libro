public class Libro
{
    private String titulo;
    private String autor;
    private int paginas;
    private String numeroDeReferencia;
    private int prestamos;
    
    public Libro(String iniTitulo, String iniAutor, int numPaginas)
    {
        titulo=iniTitulo;
        autor=iniAutor;
        paginas=numPaginas;
        numeroDeReferencia="";
        prestamos=0;
    }
    
    /**
     * Nos permite Saber el Autor del Libro.
     * @return Nos devuelve una cadena con el nombre del autor.
     */    
    public String dimeAutor()
    {
        return autor;
    }
    
    /**
     * Nos permite saber el titulo del libro.
     * @return Nos devuelve una cadena con el nombre del libro.
     */
    public String dimeTitulo()
    {
        return titulo;
    }
    
    /**
     * Nos permite saber cuantas paginas contiene el libro.
     * @return Nos devuelve un entero que son la cantidad de paginas que tiene el libro.
     */
    public int dimePaginas()
    {
        return paginas;
    }
    
    /**
     * Nos permite saber todos los detalles del libro, titulo,autor,paginas, numero de referencia
     *  y numero de prestamos.
     *  @return Nos devuelve una cadena con todos los detalles en ella.
     */
    public String dimeDetalles()
    {
        String cadResultado="";
        cadResultado+="Titulo: ";
        cadResultado+=titulo;
        cadResultado+=", ";
        cadResultado+="Autor: ";
        cadResultado+=autor;
        cadResultado+=", ";
        cadResultado+="Paginas: ";
        cadResultado+=paginas;
        if(numeroDeReferencia.length()!=0)
        {
            cadResultado+=",";
            cadResultado+="Numero de Referencia: ";
            cadResultado+=numeroDeReferencia;
        }
        else
        {
            cadResultado+=",";
            cadResultado+="ZZZ";
        }
        cadResultado+=", ";
        cadResultado+="Numero de prestamos: ";
        cadResultado+=prestamos;
        return cadResultado;
    }
    
    /**
     * Nos permite cambiar el numero de referencia del libro.
     * @param numRef Es un cadena que nos permite ingresar un numero de referencia y saber si es de 3 o mas caracteres.
     */
    public void cambiaNumRef(String numRef)
    {
        if(numRef.length()>2)
        {
            numeroDeReferencia=numRef;
        }
        else
        {
            numeroDeReferencia=numeroDeReferencia;
        }
    }
    
    /**
     * Nos permite saber el numero de referencia del libro.
     * @return nos devuelve el numero de referencia que es una cadena.
     */
    public String dimeNumRef()
    {
        return numeroDeReferencia;
    }
    
    /**
     * Nos permite aumentar la cantidad de prestamos en 1.
     */
    public void prestar()
    {
        prestamos+=1;
    }
    
    /**
     * Nos permite saber cuantos prestamos tiene el libro.
     * @return devuelve una cantidad entera que son los prestamos del libro.
     */
    public int dimePrestamos()
    {
        return prestamos;
    }
    
    
}
    
    
    