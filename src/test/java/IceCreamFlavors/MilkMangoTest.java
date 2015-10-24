package IceCreamFlavors;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;

import ds.Flavors.MilkMango;
import ds.IceCream.IceCream;

public class MilkMangoTest {
    IceCream iceCream;

    @Before
    public void SetUp() {
        iceCream = mock(IceCream.class);
    }

    @Test
    public void NameTest() {
        iceCream = new MilkMango();
        assertEquals(iceCream.getName(), "Mango");
        assertEquals(iceCream.base, "Milk IceCream");
    }
}
