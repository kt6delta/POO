package Ejemplo4;

class Punto
{
    int x, y, z;
    
    /* constructor de 3 parametros */
    
    public Punto(int x, int y, int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;    
    }    
    
    /* contructor de 1 parametro*/
    
    public Punto(int c)
    {
        x = y = z = c;    
    }
    
    /* constructor sin parametros llama al contructor de un parametro */
    
    public Punto()
    {
        this(0);    
    }    
    
    public void imprimir()
    {
        System.out.println ("( " + x + " , " + y + " , " + z + " )");     
    }
    
    // ESTE ES EL METODO VOID
    public static void main(String arg[])
    {
        Punto p = new Punto(2,3,6);
        
        p.imprimir();
        
        p = new Punto(10);
        
        p.imprimir();
        
        p = new Punto(0);
        
        p.imprimir();    
    }    
}

