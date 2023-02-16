/**
 * Esta clase contiene los métodos de ordenación.
 * @author Juan Simón
 * @version 1.0
 */

class Ordenacion {

	/**
	 * Método que ordena una matriz con dos bucles "for".
	 * @param array Contiene la matriz.
	 * @see #intercambio(int[], int, int).
	 * @see #matrizmostrar(int[]).
	 */
	public void matriz(int[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			int maxValue = 0;
			for (int j = 0; j < i; j++) {
				if (array[j + 1] > array[maxValue]) {
					maxValue = j + 1;
				}
			}
			intercambio(array, i, maxValue);
			matrizmostrar(array);
		}
	}

	/**
	 * Método que ordena una matriz con dos bucles "for".
	 * @param numbers Contiene la matriz.
	 * @return Devuelve los valores de la matriz.
	 */
	
	public int[] matriz2(int[] numbers) {
		for (int i=0; i < numbers.length - 1;i++) {
			for (int j=i+1;j<numbers.length;j++) {
				if (numbers[i]>numbers[j]) {
					int auxiliar=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=auxiliar;
				}
			}
		}
		return numbers;
	}

	/**
	 * Método que muestra una matriz con un bucle "for".
	 * @param array Contiene la matriz.
	 */

	public void matrizmostrar(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d \t", array[i]);
		}
		System.out.println();
	}

	/**
	 * Método que intercambia valores enteros dentro de una matriz.
	 * @param array Contiene la matriz.
	 * @param a Es un entero que determina la posición del primer valor a intercambiar.
	 * @param b Es un entero que determina la posición del segundo valor a intercambiar.
	 */

	public void intercambio(int[] array, int a, int b) {
		int value = array[b];
		array[b] = array[a];
		array[a] = value;
	}
}





