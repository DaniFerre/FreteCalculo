package CalculoFrete;

public class CalcularFrete {

	private CalculoFrete calculoFrete;
	private String cepOrigem;
	private String cepDestino;
	private NotaFiscal notaFiscal;
	
	public double valorFrete() {
		return calculoFrete.calcular(cepOrigem, cepDestino, notaFiscal);
	}
	
	
	public void setFrete(CalculoFrete calculoFrete) {
		this.calculoFrete = calculoFrete;
	}
}