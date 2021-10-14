package array;

public class ProvaArrayInteri {

	public static void main(String[] args) {

		//inizializza 1
		int[] voti = new int[5];
		voti[0] =  3;
	
		//inizializza 2
		int[] voti2 = {10,6,8,4,2};
		
		//ciclo for tradizionale per scorrere array
		for (int i = voti.length-1; i >= 0; i--) {
			voti[i] = 5 + i;
		}
		//ciclo for migliorato: foreach
		for (int v : voti) {
			System.out.println(v);
		}
		
		
		
	}

}
