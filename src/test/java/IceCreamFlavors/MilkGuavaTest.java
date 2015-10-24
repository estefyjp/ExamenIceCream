package IceCreamFlavors;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;

import ds.Flavors.MilkGuava;
import ds.IceCream.IceCream;

public class MilkGuavaTest {
    IceCream iceCream;

    @Before
    public void SetUp() {
        iceCream = mock(IceCream.class);
    }

    @Test
    public void NameTest() {
        iceCream = new MilkGuava();
        assertEquals(iceCream.getName(), "Guava");
        assertEquals(iceCream.base, "Milk IceCream");
    }
}
