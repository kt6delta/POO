package punt1;

import java.util.ArrayList;

public class Letras {
	private int num_le;
	private char word2;
	//get and set
	public int getNum_le() {
		return num_le;
	}
	public void setNum_le(int num_le) {
		this.num_le = num_le;
	}
	public char getWord2() {
		return word2;
	}
	public void setWord2(char word2) {
		this.word2 = word2;
	}
	
	void cifrar(int num_le, char word2){
				ArrayList<String> letter = new ArrayList<String>();
				letter.add("A");
				letter.add("B");
				letter.add("C");
				letter.add("D");
				letter.add("E");
				letter.add("F");
				letter.add("G");
				letter.add("H");
				letter.add("I");
				letter.add("J");
				letter.add("K");
				letter.add("L");
				letter.add("M");
				letter.add("N");
				letter.add("Ñ");
				letter.add("O");
				letter.add("P");
				letter.add("Q");
				letter.add("R");
				letter.add("S");
				letter.add("T");
				letter.add("U");
				letter.add("V");
				letter.add("W");
				letter.add("X");
				letter.add("Y");
				letter.add("Z");
		
				int num = 0;
				// estoy recorriendo word
					switch (word2) {
					case 'a':
						num= 3;// posicion de la letra A
						break;
					case 'b':
						num = 4;
						break;
					case 'c':
						num = 5;
						break;
					case 'd':
						num = 6;
						break;
					case 'e':
						num = 7;
						break;
					case 'f':
						num= 8;
						break;
					case 'g':
						num= 9;
						break;
					case 'h':
						num= 10;
						break;
					case 'i':
						num= 11;
						break;
					case 'j':
						num = 12;
						break;
					case 'k':
						num= 13;
						break;
					case 'l':
						num= 14;
						break;
					case 'm':
						num= 15;
						break;
					case 'n':
						num = 16;
						break;
					case 'ñ':
						num= 17;
						break;
					case 'o':
						num= 18;
						break;
					case 'p':
						num= 19;
						break;
					case 'q':
						num = 20;
						break;
					case 'r':
						num = 21;
						break;
					case 's':
						num= 22;
						break;
					case 't':
						num = 23;
						break;
					case 'u':
						num = 24;
						break;
					case 'v':
						num= 25;
						break;
					case 'w':
						num= 26;
						break;
					case 'x':
						num= 0;
						break;
					case 'y':
						num= 1;
						break;
					case 'z':
						num= 2;
						break;
					}
					System.out.print(letter.get(num));			
	}
}
