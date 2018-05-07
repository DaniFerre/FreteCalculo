import CalculoFrete.*;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class TestCalculoFrete {
	@Test
	public void testCalculoFreteFracionado() {
		NotaFiscal notaFiscal = mock(NotaFiscal.class);
		CalcularFrete calcularFrete = mock(CalcularFrete.class);
		
		FreteFracionado freteFracionado = mock(FreteFracionado.class);
		calcularFrete.setFrete(freteFracionado);
		when(calcularFrete.valorFrete()).thenReturn(100.0);
		
		double valorEsperado = 100.0;
		double valorRetornado = calcularFrete.valorFrete();
		Assert.assertEquals(valorEsperado,valorRetornado,0);
	}
	
	@Test
	public void testCalculoFreteLotacao() {
		 NotaFiscal notaFiscal = mock(NotaFiscal.class);
         CalcularFrete calcularFrete = mock(CalcularFrete.class);
         
         FreteLotacao freteLotacao = mock(FreteLotacao.class);
         when(calcularFrete.valorFrete()).thenReturn(250.0);

         double valorEsperado = 250.0;
         double valorRetornado = calcularFrete.valorFrete();
         Assert.assertEquals(valorEsperado,valorRetornado,0);
	}
}
