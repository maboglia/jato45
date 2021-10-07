package array;

public class ArrayBiDimensionale2 {

	public static void main(String[] args) {
		
		//seconda modalità inizializzazione
		int[][]  voti = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		for (int i = 0; i < voti.length; i++) {
			
			for (int j = 0; j < voti.length; j++) {
				System.out.print(voti[i][j] + "\t");
			}
			System.out.println();
			
		}
		
		
	}

}
