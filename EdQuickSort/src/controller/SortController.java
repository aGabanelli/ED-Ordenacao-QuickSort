package controller;

import br.edu.fateczl.sort.QuickSortController;

public class SortController {

	public SortController() {
		super();
	}
	
	
	public void quickSort(int[] vetor, int inicio, int fim) {
		
		QuickSortController qs = new QuickSortController();
		qs.quickSort(vetor, inicio, fim);
		
	}
	
}
