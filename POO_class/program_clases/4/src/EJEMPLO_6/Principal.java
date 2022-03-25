package EJEMPLO_6;

//EJEMPLO 6 "OPERACIONES CON MATRICES"

//CLASE PRINCIPAL.

public class Principal {

	public static void main(String[] args) {
		
		Matriz matrizResultado=new Matriz(); 
		
		Matriz matrizA=new Matriz(); 
		System.out.println(" Matriz A ");
		matrizA.llenar();
		System.out.println("La Primera Matriz Es: ");
		matrizA.mostrar();
		
		Matriz matrizB=new Matriz(); 
		System.out.println(" Matriz B ");
		matrizB.llenar();
		System.out.println("La Segunda Matriz Es: ");
		matrizB.mostrar();
		
		matrizResultado.copiar(matrizA.retornarMatriz());
		matrizResultado.sumar(matrizB.retornarMatriz());
		System.out.println("Al Sumar Las Matrices A+B La Matriz Resultante Es: ");
		matrizResultado.mostrar();
			 
		matrizResultado.copiar(matrizA.retornarMatriz());
		matrizResultado.restar(matrizB.retornarMatriz());
		System.out.println("Al Restar Las Matrices A-B La Matriz Resultante Es: ");
		matrizResultado.mostrar();
			 
		matrizResultado.copiar(matrizA.retornarMatriz());
		matrizResultado.copiar(matrizResultado.multiplicacion(matrizB.retornarMatriz()));
		System.out.println("Al Multiplicar Las Matrices A*B La Matriz Resultante Es: ");
		matrizResultado.mostrar();
		}

	}