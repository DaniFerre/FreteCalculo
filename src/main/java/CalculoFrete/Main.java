package CalculoFrete;

public class Main {

	public static void main(String[] args) {
		CalcularFrete calcularFrete = new CalcularFrete();
		FreteFracionado freteFracionado = new FreteFracionado();
		calcularFrete.setFrete(freteFracionado);
		System.out.println("Valor do frete fracionado: R$" + calcularFrete.valorFrete());
		
		FreteLotacao freteLotacao = new FreteLotacao();
		calcularFrete.setFrete(freteLotacao);
		System.out.println("Valor do frete lota��o: R$" + calcularFrete.valorFrete());
	}
}