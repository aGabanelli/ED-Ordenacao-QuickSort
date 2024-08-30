package view;

import controller.SortController;

public class Principal {
	
	public static void main(String[] args) {
		
		SortController qs = new SortController();
		
		int[] vetorEx01 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		int[] vetorEx02 = {44, 43, 42, 41, 40, 39, 38};
		int[] vetorEx03 = {31, 32, 33, 34, 99, 98, 97, 96};
		
		int tamanhoEx01 = vetorEx01.length;
		int tamanhoEx02 = vetorEx02.length;
		int tamanhoEx03 = vetorEx03.length;
		
		qs.quickSort(vetorEx01, 0, tamanhoEx01-1);
		qs.quickSort(vetorEx02, 0, tamanhoEx02-1);
		qs.quickSort(vetorEx03, 0, tamanhoEx03-1);
		
		
		System.out.println("Vetor ex 1: ");
		for(int i : vetorEx01) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n==========================================");

		System.out.println("Vetor ex 2: ");
		for(int i : vetorEx02) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n==========================================");
		
		System.out.println("Vetor ex 3: ");
		for(int i : vetorEx03) {
			System.out.print(i + " ");
		}
	}
}
