package aula02;

import java.util.ArrayList;
import java.util.List;

public class EstouroHeap {
	
	public static class Node {
		int[] vetor = new int[200000];
		Node proximo;
		public Node() {
			
		}
	}

	public static void main(String[] args) {
		System.out.println("Tentando estourar a memoria Heap");
		List<Node> nos = new ArrayList<>();
		Node raiz = new Node();
		Node n1 = raiz;
		while (true) {
			n1.proximo = new Node();
			nos.add(n1);
		}

	}

}
