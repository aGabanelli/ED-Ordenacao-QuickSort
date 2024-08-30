package controller;

import java.text.DecimalFormat;

import br.edu.fateczl.QuickSortController;
import br.edu.fateczl.sort.*;

public class OrdencaoController {

	public OrdencaoController() {
		super();
	}
	
	
	public void bubbleSort(int[] vetor) {
		BubbleSort bs = new BubbleSort();
		double tempoInicio = System.currentTimeMillis();
		bs.bubbleSort(vetor);
		double tempoFim = System.currentTimeMillis();
		double tempoTotal = tempoFim - tempoInicio;
		tempoTotal = tempoTotal / Math.pow(10, 3);
		System.out.println("Bubble Sort - Tempo: " + tempoTotal + "s");
	}
	
	public void mergeSort(int[] vetor, int inicio, int fim) {
		MergeSort ms = new MergeSort();
		double tempoInicio = System.currentTimeMillis();
		ms.ordenacaoMergeSort(vetor, inicio, fim);
		double tempoFim = System.currentTimeMillis();
		double tempoTotal = tempoFim - tempoInicio;
		tempoTotal = tempoTotal / Math.pow(10, 3);
		System.out.println("Merge Sort - Tempo: " + tempoTotal + "s");
	}
	
	public void quickSort(int[] vetor, int inicio, int fim) {
		QuickSortController qs = new QuickSortController();
		double tempoInicio = System.currentTimeMillis();
		qs.quickSort(vetor, inicio, fim);
		double tempoFim = System.currentTimeMillis();
		double tempoTotal = tempoFim - tempoInicio;
		tempoTotal = tempoTotal / Math.pow(10, 3);
		System.out.println("Quick Sort - Tempo: " + tempoTotal + "s");
	}
	
}
