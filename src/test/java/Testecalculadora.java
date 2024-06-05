import com.mycompany.calculadora.Calculadora;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Testecalculadora {
    
    @Test
    public void testeGetAdicao() {
        Calculadora calcular = new Calculadora(4.0, 2.0);
        double retornoEsperado = 6.0;
        double retornoFeito = calcular.getAdicao();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }
}
