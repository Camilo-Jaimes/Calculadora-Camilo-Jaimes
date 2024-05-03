
import Paquete.Operaciones;

import org.junit.jupiter.api.Test;

/**
 *
 * @author CAMILO JAIMES
 */
public class OperacionesTest {
    private Operaciones operaciones;
    
    @Test
    public void testAgregarNum() {
        operaciones.agregarNum(5);
        assertEquals("El dígito debería ser 5", 5, operaciones.getDigito());
    }

    @Test
    public void testSuma() {
        operaciones.suma("10");
        operaciones.igual("5");
        assertEquals("El resultado debería ser 15", 15, operaciones.getResultado(), 0.001);
    }

    @Test
    public void testResta() {
        operaciones.resta("10");
        operaciones.igual("5");
        assertEquals("El resultado debería ser 5", 5, operaciones.getResultado(), 0.001);
    }

    @Test
    public void testMultiplicacion() {
        operaciones.multiplicacion("10");
        operaciones.igual("5");
        assertEquals("El resultado debería ser 50", 50, operaciones.getResultado(), 0.001);
    }

    @Test
    public void testDivision() {
        operaciones.division("10");
        operaciones.igual("5");
        assertEquals("El resultado debería ser 2", 2, operaciones.getResultado(), 0.001);
    }

    private void assertEquals(String el_resultado_debería_ser_15, int i, double resultado, double d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void assertEquals(String el_dígito_debería_ser_5, int i, String digito) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   }
  


