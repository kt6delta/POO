
package CLASE2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class ejemplo2
{
    public static void main(String arg[ ]) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int a,b,opcion;
        
        System.out.println("Calculadora");
        System.out.println("-----------");
        
        System.out.println("\nEste programa realiza operaciones \naritmeticas sobre a y b \n");
        
        System.out.print("Ingrese a : ");
        a = Integer.parseInt(in.readLine( ));
        System.out.print("Ingrese b : ");
        b = Integer.parseInt(in.readLine( ));
        
        System.out.println("\nOpciones : ");
        System.out.println("\t1.- suma");
        System.out.println("\t2.- resta");
        System.out.println("\t3.- multiplicacion");
        System.out.println("\t4.- division entera ");
        System.out.println("\t5.- division real");
            
        System.out.print("\nIngrese opcion : ");
        opcion = Integer.parseInt(in.readLine( ));
        
        System.out.println( );
        
        switch (opcion)
        {
            case 1 : System.out.println("resultado de a + b : " + (a + b) ); break;     
            case 2 : System.out.println("resultado de a - b : " + (a - b) ); break;
            case 3 : System.out.println("resultado de a * b : " + (a * b) ); break;
            case 4 : if (b != 0) 
                           System.out.println("resultado de a / b : " + (a / b)); 
                        else 
                           System.out.println("Error : division por cero");   
                     
                        break;
            
            case 5 : if (b != 0) 
                     {                              
                       /* para obtener resultado real, uno de los operandos debe 
                          ser real, por lo tanto se realiza un conversion explicita 
                          del primer operando. */
                            
                         double r = (double) a / b;
                         System.out.println("resultado de a / b : " + r);
                     } 
                     else 
                         System.out.println("Error : division por cero"); break; 
                     
           default : System.out.println("La opcion no corresponde");
        }
    }    
}

