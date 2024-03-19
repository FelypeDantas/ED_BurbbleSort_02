package view;

import controller.BurbbleSortController;

public class Principal {

	public static void main(String[] args) {
		BurbbleSortController burbble = new BurbbleSortController();
		int[] vetor = {44, 43, 42, 41, 40, 39, 38};
		
		burbble.ordena(vetor);

	}

}
