
import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {
    HelloWorld1 hw = new HelloWorld1();

    /**
     * Method sayHello() must return "Hello, World!". The trim method will remove any extra spaces or newlines at the end.
     */
    @Test
    public void helloTest(){
        String expected = "Hello, world!";
        String actual = hw.sayHello().trim();
        Assert.assertEquals(expected,actual);
    }
}
