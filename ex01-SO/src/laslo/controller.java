package laslo;
public class controller {

	public void vetor(int tamanho) {

		int[] vetor = new int[1000];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = 0;
		}

		double inicio = System.nanoTime();
		double total = 0.0;
		for (int i = 0; i < vetor.length; i++) {
			int valor = vetor[i];
			double fim = System.nanoTime();
			total = fim - inicio;
			total /= Math.pow(10, 9);
		}
		System.out.println("O tempo de " + vetor.length + " é: " + total);
	}
}
