package punt4;

public class Vectores {

	public int a_b(int mini [], int mini2[], int j){
		int p=0;
		for(int n=0; n<j; n++){
			int c=mini[n]*mini2[n];
			p=p+c;
		}
		return p;
	}
	
}
