package punt4;

public class CopyVerificar {

	public boolean espalindromo(String cadena) {
		boolean valor = false;
		int indice;
		String cadena2 = "";
		// quitar espacio
		for (int i = 0; i < cadena.length(); i++) {// length te ubica en la
													// ultima posicion
			if (cadena.charAt(i) != ' ') // charAt() de vuelve carater en la
											// posicion x
				cadena2 += cadena.charAt(i);
		}
		cadena = cadena2;
		// asignar el valor de la posicion max
		indice = cadena.length();
		// comparamos cadenas
		int num=-1;
		for (int i = 0; i < indice; i++) {
			System.out.println(cadena.charAt(indice - 1) + "=="+ cadena2.charAt(i));
			if (cadena.charAt(indice - 1) == cadena2.charAt(i)) { // si son iguales las letras valor=true
				num++;
			}
			indice--;
		}
		if(num==indice){
			valor = true;
		}
		return valor;
	}

}
