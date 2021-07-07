/**
 * 
 */
package mvnCleanerCodeDemo;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Cleaner Code Project Team
 *@version 1.0
 */
public class HelloApp_Test {

	/**
	 * Test method for {@link mvnCleanerCodeDemo.HelloApp#main(java.lang.String[])}.
	 */
	@Test
	public void testMain() {
		String testStr="Hello from Cleaner Code Project Team..!";
		assertEquals("Hello from Cleaner Code Project Team..!",testStr);
	}

}
