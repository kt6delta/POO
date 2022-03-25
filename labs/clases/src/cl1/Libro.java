package cl1;

class Libro
{
    public String titulo;
    public String autor;
    public int paginas;
    public int precio;

    /* -- constructores -- */

    public Libro(String aux_titulo)
    {
        titulo = aux_titulo;    
    }

    public Libro(String titulo , String autor)
    {
        this.titulo = titulo;
        this.autor = autor;     
    }

    public Libro(String titulo , String autor, int paginas , int precio)
    {
        this(titulo , autor);
        this.paginas = paginas;
        this.precio = precio;    
    }

    /* -- metodo que muestra la informacion en forma tabulada -- */

    public static void impLibro(Libro aux)
    {
        System.out.print("\n  " + aux.titulo);
        System.out.print("\t\t");
        if (aux.autor != null)
            System.out.print(aux.autor);
        
        System.out.print("\t\t");
        if (aux.paginas != 0)
            System.out.print(aux.paginas);        
        
        System.out.print("\t\t");
        if (aux.precio != 0)
            System.out.print(aux.precio);
    }
    
    public static void main(String arg[ ])
    {
        
        Libro a = new Libro("Los miserables");
        
        Libro b = new Libro("El contrato social","Rousseau");
        
        Libro c = new Libro("La divina comedia","Dante",320,8900);    
        
        System.out.println("\n\n  Titulo\t\t\tAutor\t\tPaginas\t\tPrecio");
        System.out.println("  ------\t\t\t-----\t\t-------\t\t------");
        
        impLibro(a);
        impLibro(b);
        impLibro(c);
        
        System.out.println("\n");
    }    
}
