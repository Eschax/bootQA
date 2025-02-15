import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class testng {

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

    @BeforeMethod
    public void setUp() {
    System.out.println("before method");
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

    @AfterMethod
    public void afterUp() {
        System.out.println("after method");
    }

    @AfterClass
    public void setUpAfterClass () {
        System.out.println("ini untuk setup after class");
    }
}
