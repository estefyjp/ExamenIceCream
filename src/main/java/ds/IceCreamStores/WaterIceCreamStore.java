package ds.IceCreamStores;

import ds.Flavors.WaterGuava;
import ds.Flavors.WaterMango;
import ds.Flavors.WaterPineapple;
import ds.Flavors.WaterStrawberry;
import ds.IceCream.IceCream;
import ds.IceCream.IceCreamStore;

public class WaterIceCreamStore extends IceCreamStore {

	@Override
	protected IceCream createIceCream(String flavor) {
		 if (flavor.equals("Strawberry"))
	            return new WaterStrawberry();
	        else if (flavor.equals("Pinneaple") )
	            return new WaterPineapple();
	        else if (flavor.equals("Mango"))
	            return new WaterMango();
	        else if (flavor.equals("Guava") )
	            return new WaterGuava();
	        else return null;	}

}
