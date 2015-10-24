package IceCreamFlavors;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;

import ds.Flavors.WaterPineapple;
import ds.IceCream.IceCream;

public class WaterPineappleTest {
	  IceCream iceCream;

	    @Before
	    public void SetUp() {
	        iceCream = mock(IceCream.class);
	    }

	    @Test
	    public void NameTest() {
	        iceCream = new WaterPineapple();
	        assertEquals(iceCream.getName(), "Pineapple");
	        assertEquals(iceCream.base, "Water IceCream");
	    }
}
