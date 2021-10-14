package array;

public class ArrayBiDimensionale {

	public static void main(String[] args) {
		
		//prima modalità inizializzazione
		int[][]  voti = new int[3][3];
		voti[0][0] = 1;
		voti[0][1] = 2;
		voti[0][2] = 3;
		
		voti[1][0] = 4;
		voti[1][1] = 5;
		voti[1][2] = 6;

		voti[2][0] = 7;
		voti[2][1] = 8;
		voti[2][2] = 9;
		
		for (int i = 0; i < voti.length; i++) {
			
			for (int j = 0; j < voti.length; j++) {
				System.out.print(voti[i][j] + "\t");
			}
			System.out.println();
			
		}
		
		
	}

}
