import LibreriaESC.Operacion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import javax.naming.NameNotFoundException;

import static java.lang.Float.NaN;
import static java.lang.Float.POSITIVE_INFINITY;

public class OperacionTest {
    @Test
    public void pruebaSumaDistintos(){
        Assertions.assertEquals(5, Operacion.operar(2f,3f,Operacion.SUMA));
    }
    @Test
    public void pruebaSumaCeros(){
        Assertions.assertEquals(0, Operacion.operar(0f,0f,Operacion.SUMA));
    }
    @Test
    public void pruebaRestaDistintos(){
        Assertions.assertEquals(5, Operacion.operar(10f,5f,Operacion.RESTA));
    }
    @Test
    public void pruebaRestaCeros(){
        Assertions.assertEquals(0, Operacion.operar(5f,5f,Operacion.RESTA));
    }
    @Test
    public void pruebaMultiplicaDistintos(){
        Assertions.assertEquals(10, Operacion.operar(5f,2f,Operacion.MULTIPLICACION));
    }
    @Test
    public void pruebaMultiplicarPorCero(){
        Assertions.assertEquals(0, Operacion.operar(15f,0f,Operacion.MULTIPLICACION));
    }
    @Test
    public void pruebaCeroPorCero(){
        Assertions.assertEquals(0, Operacion.operar(0f,0f,Operacion.MULTIPLICACION));
    }
    @Test
    public void divisionNormal(){
        Assertions.assertEquals(2, Operacion.operar(4f,2f,Operacion.DIVISION));
    }
    @Test
    public void divisionCeroEntreCero(){
        Assertions.assertEquals(NaN, Operacion.operar(0f,0f,Operacion.DIVISION));
    }
    @Test
    public void divisionNumeroEntreCero(){
        Assertions.assertEquals(POSITIVE_INFINITY, Operacion.operar(5f,0f,Operacion.DIVISION));
    }
    @Test
    public void raizCuadrada(){
        Assertions.assertEquals(3, Operacion.operar(9f,2f,Operacion.RAIZ));
    }
    @Test
    public void raizCubica(){
        Assertions.assertEquals(2.2894285f , Operacion.operar(12f,3f,Operacion.RAIZ));
    }
    @Test
    public void raizCero(){
        Assertions.assertEquals(POSITIVE_INFINITY , Operacion.operar(12f,0f,Operacion.RAIZ));
    }
    @Test
    public void raizUno(){
        Assertions.assertEquals(12.0f , Operacion.operar(12f,1f,Operacion.RAIZ));
    }


}
