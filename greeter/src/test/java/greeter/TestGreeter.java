package greeter;

import org.junit.Assert;
import org.junit.Test;
public class TestGreeter {

@Test
public void test(){
	Greeter greeter = new Greeter();
	Assert.assertEquals("Hello word",greeter.sayHello("world"));
}
}
