package cl1;


class DemoPwr { 
  public static void main(String args[]) {   
    Pwr x = new Pwr(4.0, 2); 
    Pwr y = new Pwr(2.5, 1); 
    Pwr z = new Pwr(5.7, 0); 
 
    System.out.println(x.b + " ELEVADO A LA " + x.e +  
                       " DA " + x.get_pwr()); 
    System.out.println(y.b + " ELEVADO A LA " + y.e +  
                       " DA " + y.get_pwr()); 
    System.out.println(z.b + " ELEVADO A LA " + z.e +  
                       " DA " + z.get_pwr()); 
  } 
}

//EJEMPLO3
