package ds.IceCreamStores;

import org.junit.Before;
import org.junit.Test;

import ds.Flavors.MilkGuava;
import ds.Flavors.MilkMango;
import ds.Flavors.MilkPineapple;
import ds.Flavors.MilkStrawberry;
import ds.IceCream.IceCream;
import ds.IceCream.IceCreamStore;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;


public class MilkIceCreamStoreTest {
	private IceCreamStore tienda;
	
	@Before
	public void setUp(){
		tienda = mock(IceCreamStore.class);
	}
	
	@Test
	public void createTest(){
		IceCream mango = new MilkMango();
		tienda = new MilkIceCreamStore();
		IceCream helado = tienda.orderIceCream("Mango");
		assertEquals(mango.getName(), helado.getName());
		
		IceCream fresa = new MilkStrawberry();
		tienda = new MilkIceCreamStore();
		IceCream helado1 = tienda.orderIceCream("Strawberry");
		assertEquals(fresa.getName(), helado1.getName());
		
		IceCream guava = new MilkGuava();
		tienda = new MilkIceCreamStore();
		IceCream helado2 = tienda.orderIceCream("Guava");
		assertEquals(guava.getName(), helado2.getName());
		
		IceCream piña = new MilkPineapple();
		tienda = new MilkIceCreamStore();
		IceCream helado3 = tienda.orderIceCream("Pineapple");
		assertEquals(piña.getName(), helado3.getName());
	}
}
