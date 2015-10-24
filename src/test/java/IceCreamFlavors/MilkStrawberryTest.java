package IceCreamFlavors;

import org.junit.Before;
import org.junit.Test;

import ds.Flavors.MilkStrawberry;
import ds.IceCream.IceCream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class MilkStrawberryTest {
    IceCream iceCream;

    @Before
    public void SetUp() {
        iceCream = mock(IceCream.class);
    }

    @Test
    public void NameTest() {
        iceCream = new MilkStrawberry();
        assertEquals(iceCream.getName(), "Strawberry");
        assertEquals(iceCream.base, "Milk IceCream");
    }
}

