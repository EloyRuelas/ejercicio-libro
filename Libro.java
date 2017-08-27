public class Libro
{
    private String titulo;
    private String autor;
    private int paginas;
    private String numeroDeReferencia;
    
    public Libro(String iniTitulo, String iniAutor, int numPaginas)
    {
        titulo=iniTitulo;
        autor=iniAutor;
        paginas=numPaginas;
        numeroDeReferencia="";
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
    
}
    
    
    