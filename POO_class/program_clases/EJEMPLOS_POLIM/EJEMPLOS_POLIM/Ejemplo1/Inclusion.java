package Ejemplo1;

//CLASE PRINCIPAL;
public class Inclusion {  
	public static void muevete(Mamifero m) 
	{    
		m.mover();  
	} 

   public static void main(String[] args) {    
	Gato bisho = new Gato();    
	Perro feo = new Perro(); 
	//OBSERVE QUE SE HACE EL MISMO LLAMADO AL MISMO MÉTODO PERO EN CLASES DISTINTAS
	muevete(bisho);    
	muevete(feo);  
	

	}
}
