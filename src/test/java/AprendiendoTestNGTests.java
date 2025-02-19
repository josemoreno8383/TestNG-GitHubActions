import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;


public class AprendiendoTestNGTests {
    @BeforeMethod
    public void antesDeCadaTest(){
        System.out.println("Esto se ejecuta antes de cada test");
    }

    @AfterMethod
    public void despuesDeCadaTest(){
        System.out.println("Esto se ejecuta despues de cada test");
    }


    @Test
    public void testSuma(){
        int resultado = 2 + 2;
        System.out.println("testSuma");
        Assert.assertEquals(resultado,5,"La suma debe ser 5");

    }


    @Test
    @Parameters("MaxResponseSec")
    public void testConParametro(@Optional("2")int MaxResponseSec){
        System.out.println("El tiempo esperado es: " + MaxResponseSec);

    }


    @Test
    @Parameters("MinResponseSec")
    public void testConParametro2(@Optional("30") int MinResponseSec){
        System.out.println("El tiempo esperado es: " + MinResponseSec);

    }

    @Test
    public void testMultiplicacion(){
        System.out.println("testMultiplicacion");
        int resultado = 2 * 3;
        Assert.assertEquals(resultado,6,"El resultado tiene que ser 6");
    }



    @Test
    public void testDivision(){
        System.out.println("testDivision");
        int resultado = 12 / 3;
        Assert.assertEquals(resultado,4,"El resultado tiene que ser 4");
    }
}
