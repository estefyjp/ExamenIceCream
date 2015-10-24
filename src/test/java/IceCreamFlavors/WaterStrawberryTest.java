package IceCreamFlavors;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;

import ds.Flavors.WaterStrawberry;
import ds.IceCream.IceCream;

public class WaterStrawberryTest {
    IceCream iceCream;

    @Before
    public void SetUp() {
        iceCream = mock(IceCream.class);
    }

    @Test
    public void NameTest() {
        iceCream = new WaterStrawberry();
        assertEquals(iceCream.getName(), "Strawberry");
        assertEquals(iceCream.base, "Water IceCream");
    }
}
