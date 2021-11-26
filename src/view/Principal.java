package view;
import controller.OrdenarController;

public class Principal {
	
	public static void main(String[] args) {
		int[] vetor = {100,99,98,97,96,95};
		
		OrdenarController oBubbleSort = new OrdenarController();
		
		vetor = oBubbleSort.bubbleSort(vetor);
		
		System.out.println("");
		System.out.println("==========================");
		for (int valor : vetor) {
			System.out.print(valor + " ");
		}
		System.out.println("");
		System.out.println("==========================");

	}
}