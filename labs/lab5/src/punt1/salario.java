package punt1;

public class salario {

	//Atributos
	 private String nombre;
	 private String apellido;
	 private String identi;
	 private double salario;
	
	 //metodos 

	 public void setNombre(String nombre) {
	        this.nombre = nombre; //modificar
	    }
	 
	 public void setapellido(String apellido) {
	        this.apellido = apellido; //modificar
	    }	 

	 public void setidenti(String identi) {
	        this.identi = identi; //modificar
	    }
	 
	 public void setSalario(int salario1) { //mostrar
		 this.salario = salario1; 
	    }
	 public double getSalario() { //mostrar
	        return salario;
	    }
		
		public int subsidio (int salario) {
			int sub;
			if(salario>=50000) {
				sub=salario*25/100;
				System.out.println("el subsidio es: "+ sub);
			return sub;
			}
			else
				sub=salario*1/10;
				System.out.println("el bono es: "+ sub);
			return sub;
		}
		
}
