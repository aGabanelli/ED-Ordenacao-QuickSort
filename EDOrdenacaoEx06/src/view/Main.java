package view;

import controller.OrdencaoController;

public class Main {

	public static void main(String[] args) {
		
		OrdencaoController oc = new OrdencaoController();
		
		int vetor[] = new int[1500];
		int j = 0;
		
		for(int i = 1499; i >= 0; i--) {
			vetor[j] = i;
			j++;
		}
		
		oc.bubbleSort(vetor);
		oc.mergeSort(vetor, 0, 1499);
		oc.quickSort(vetor, 0, 1499);
		
	}
	
}
