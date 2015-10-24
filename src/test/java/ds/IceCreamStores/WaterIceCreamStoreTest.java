package ds.IceCreamStores;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;

import ds.Flavors.MilkMango;
import ds.Flavors.WaterGuava;
import ds.Flavors.WaterMango;
import ds.Flavors.WaterPineapple;
import ds.Flavors.WaterStrawberry;
import ds.IceCream.IceCream;
import ds.IceCream.IceCreamStore;

public class WaterIceCreamStoreTest {
	private IceCreamStore tienda;
	
	@Before
	public void setUp(){
		tienda = mock(IceCreamStore.class);
	}
	
	@Test
	public void createTest(){
		IceCream mango = new WaterMango();
		tienda = new  WaterIceCreamStore();
		IceCream helado = tienda.orderIceCream("Mango");
		assertSame(mango.getName(), helado.getName());
		
		IceCream fresa = new WaterStrawberry();
		tienda = new WaterIceCreamStore();
		IceCream helado1 = tienda.orderIceCream("Strawberry");
		assertEquals(fresa.getName(), helado1.getName());
		
		IceCream guava = new WaterGuava();
		tienda = new WaterIceCreamStore();
		IceCream helado2 = tienda.orderIceCream("Guava");
		assertEquals(guava.getName(), helado2.getName());
		
		IceCream piña = new WaterPineapple();
		tienda = new WaterIceCreamStore();
		IceCream helado3 = tienda.orderIceCream("Pineapple");
		assertEquals(piña.getName(), helado3.getName());
	}

}
