package model;

public class Cambiatore {

	public static int[] cambia(int euro) {
		//500,200,100,50,20,10,5,2,1
		int[] cambiati = new int[9];
		
		if (euro >= 500) {  
			while (euro >= 500) {
				cambiati[0]++;
				euro -= 500;
			}
		}
		
		if (euro >= 200) {  
			while (euro >= 200) {
				cambiati[1]++;
				euro -= 200;
			}
		}
		
		if (euro >= 100) {  
			while (euro >= 100) {
				cambiati[2]++;
				euro -= 100;
			}
		}
		
		if (euro >= 50) {  
			while (euro >= 50) {
				cambiati[3]++;
				euro -= 50;
			}
		}
		
		if (euro >= 20) {  
			while (euro >= 20) {
				cambiati[4]++;
				euro -= 20;
			}
		}
		
		if (euro >= 10) {  
			while (euro >= 10) {
				cambiati[5]++;
				euro -= 10;
			}
		}
		
		if (euro >= 5) {  
			while (euro >= 5) {
				cambiati[6]++;
				euro -= 5;
			}
		}
		
		if (euro >= 2) {  
			while (euro >= 2) {
				cambiati[7]++;
				euro -= 2;
			}
		}
		
		if (euro >= 1) {  
			while (euro >= 1) {
				cambiati[8]++;
				euro -= 1;
			}
		}
		
		return cambiati;
	}
	
	
}
