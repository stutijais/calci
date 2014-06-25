
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTestCase {
    private CalculatorChecker checker;

    @BeforeMethod
    public void initialize() {
        checker = new CalculatorChecker();
    }

    @DataProvider(name = "test1")
    public static Object[][] Numbers()
    {
        return new Object[][] { { 2,2,4 }, { 6,3,9}, { 19,2,20}};
        
    }

    
    @Test(dataProvider = "test1")
    public void testCalculatorChecker(int inputNumber1,int inputNumber2,int expectedResult) {
    	
	System.out.println(inputNumber1 + " " + inputNumber2 + " " +expectedResult);
	Assert.assertEquals(expectedResult,
        	checker.validate(inputNumber1,inputNumber2));
    }
}