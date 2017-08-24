public class Libro
{
    private String titulo;
    private String autor;
    private int paginas;
    
    public Libro(String iniTitulo, String iniAutor, int numPaginas)
    {
        titulo=iniTitulo;
        autor=iniAutor;
        paginas=numPaginas;
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
        return cadResultado;
    }
    
    
}
    
    
    