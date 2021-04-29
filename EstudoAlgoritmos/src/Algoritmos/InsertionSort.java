package Algoritmos;

import java.util.Arrays;

/*
Complexidade do pior caso = O(n�) -> Todos os itens desordenados
Complexidade do caso m�dio = O(n�)
Complexidade do melhor caso = o(n) -> Todos os itens ordenados

**Evitar os casos em que o n� aparece, a redu��o de velocidade nesses casos � exponencial**
*/


public class InsertionSort {

	public static void main(String[] args) {
		int quantidade = 5;
		int[] vetor = new int[quantidade];
		double tempo;
		
		for(int i =0; i < vetor.length; i++) {
			vetor[i] = (int)(Math.random()*quantidade);
		}
		
		long tempoInicial = System.currentTimeMillis();
		System.out.println("Vetor desordenado = " + Arrays.toString(vetor));
		
		insertionSort(vetor);
		
		long tempoFinal = System.currentTimeMillis();
		
		tempo = (tempoFinal - tempoInicial)/1000.0;
		
		System.out.println("-> Tempo de execu��o: " + tempo);
	}
	
	public static void insertionSort(int[] vetor) {
		int i;
		int j;
		int key;
		
		// O algoritmo ir� percorrer todo o vetor iniciando do segundo elemento, por isso o j recebe 1
		for(j = 1; j < vetor.length; j++) {
			
			// O key guarda o valor da posi��o j
			key = vetor[j];
			System.out.println(Arrays.toString(vetor));
			System.out.println("Key = " + key);
			System.out.println("J = " + j);
			
			// No segundo la�o iteramos sobre os valores antes de key (Vetor ordenado)
			// Na condi��o do vetor[i] > key, cada vez que o valor de vetor[i] for menor que o valor de key, ele � empurrado uma posi��o para o come�o
			for(i = j - 1;(i >= 0) && (vetor[i] > key); i--) {
				vetor[i + 1] = vetor[i];
			}			
			vetor[i + 1] = key;
			
			System.out.println(Arrays.toString(vetor));
			System.out.println("--------------------------------");
		}
	}

}
