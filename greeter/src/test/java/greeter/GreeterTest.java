package greeter;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class GreeterTest {

	@Test
	public void test() {
		Greeter greeter = new Greeter();
		Assert.assertEquals("hello world", greeter.sayHello("world"));
	}
}
