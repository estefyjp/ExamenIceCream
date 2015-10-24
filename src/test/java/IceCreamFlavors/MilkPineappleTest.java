package IceCreamFlavors;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;

import ds.Flavors.MilkPineapple;
import ds.IceCream.IceCream;

public class MilkPineappleTest {
    IceCream iceCream;

    @Before
    public void SetUp() {
        iceCream = mock(IceCream.class);
    }

    @Test
    public void NameTest() {
        iceCream = new MilkPineapple();
        assertEquals(iceCream.getName(), "Pineapple");
        assertEquals(iceCream.base, "Milk IceCream");
    }
}
