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
    
    public String dimeAutor()
    {
        return autor;
    }
    
    public String dimeTitulo()
    {
        return titulo;
    }
    
    public int dimePaginas()
    {
        return paginas;
    }
    
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
    
    public String dimeNumRef()
    {
        return numeroDeReferencia;
    }
    
    public void prestar()
    {
        prestamos+=1;
    }
    
    public int dimePrestamos()
    {
        return prestamos;
    }
    
    
}
    
    
    