package IceCreamFlavors;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;

import ds.Flavors.WaterMango;
import ds.IceCream.IceCream;

public class WaterMangoTest {
	  IceCream iceCream;

	    @Before
	    public void SetUp() {
	        iceCream = mock(IceCream.class);
	    }

	    @Test
	    public void NameTest() {
	        iceCream = new WaterMango();
	        assertEquals(iceCream.getName(), "Mango");
	        assertEquals(iceCream.base, "Water IceCream");
	    }
}
