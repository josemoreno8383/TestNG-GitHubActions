import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnotacionesTestNG_Tests {


    @BeforeMethod
    public void AntesDeCadaTest() {
        System.out.println("Esto s eejecuta antes de cada test");
    }

    @Test
    public void unTest(){
        System.out.println("Esto es un test**************************");
    }

    @Test
    public void otroTest(){
        System.out.println("Esto es otro test$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    @AfterMethod
    public void DespuesDeCadaTest() {
        System.out.println("Esto se ejecuta despues de cada test");
    }

}
