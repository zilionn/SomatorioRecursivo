package controller;

public class SomatorioController {

	public SomatorioController() {
		super();
	}
	
	public int somatorio(int n) {
		// condição de parada - quando N for <= a 0; começará de um número X e irá parar quando chegar em 0.
		if (n <= 0) {
			return 0;
		}
		// relação de chamada dos passos - somar um elemento N com a função do anterior.
		return n + somatorio(n - 1);
	}

}