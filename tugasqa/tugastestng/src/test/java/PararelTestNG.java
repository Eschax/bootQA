import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class PararelTestNG {

    String name = "AfterOffice12";

    @BeforeClass
    public void setUpClass() {
        System.out.println("ini untuk setup class");

        // scenario login
        //set API, credentials
        // set URL website

    }

    @Test
    public void checkoutBarang(){
        //checkout barang

        /*
         * login
         * checkout barang
         */
    }

    @Test
    public void scenariotest1() {
        Assert.assertEquals(name, "AfterOffice12");
        System.out.println("scenario 1");
    }

    @Test
    public void scenariotest2() {
        Assert.assertEquals(name, "AfterOffice12");
        System.out.println("scenario 2");
    }

    @Test
    public void scenariotest3() {
        Assert.assertEquals(name, "AfterOffice12");
        System.out.println("scenario 3");
    }

}
