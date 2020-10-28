package teste;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import main.Calculadora;
import main.MyArithmeticException;

public class CalculadoraTeste {
    @Test
    public void addTest() {
        Calculadora cal = new Calculadora();

        cal.setOp1(3);
        cal.setOp2(9);
        double d = cal.add();

        assertEquals(12, d, 0.0001);
    }

    @Test
    public void divideTest() throws MyArithmeticException {
        Calculadora cal = new Calculadora();

        cal.setOp1(3);
        cal.setOp2(9);
        double d = cal.divide();

        assertEquals(0.3333,d,0.0001);
    }
    //Implementado por mim;
    @Test
    public void potenciaTest(){
        Calculadora cal = new Calculadora();

        cal.setOp1(5);
        cal.setOp2(3);
        double d = cal.potencia();

        assertEquals(125,d,0.0001);
    }
    
    @Test
    public void quadradoTest(){
        Calculadora cal = new Calculadora();

        cal.setOp1(3);
        double d = cal.quadrado();

        assertEquals(9,d,0.0001);
    }

    @Test
    public void raizQuadradaTest() throws MyArithmeticException {
        Calculadora cal = new Calculadora();

        cal.setOp1(25);
        double d = cal.raizQuadrada();

        assertEquals(5,d,0.0001);
    }  
}
