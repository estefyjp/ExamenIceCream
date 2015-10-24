package ds.IceCreamStores;

import ds.Flavors.MilkGuava;
import ds.Flavors.MilkMango;
import ds.Flavors.MilkStrawberry;
import ds.Flavors.MilkPineapple;
import ds.IceCream.IceCream;
import ds.IceCream.IceCreamStore;

public class MilkIceCreamStore extends IceCreamStore {
	@Override
	protected IceCream createIceCream(String flavor) {
		 if (flavor.equals("Strawberry"))
	            return new MilkStrawberry();
	        else if (flavor.equals("Pinneaple") )
	            return new MilkPineapple();
	        else if (flavor.equals("Mango"))
	            return new MilkMango();
	        else if (flavor.equals("Guava") )
	            return new MilkGuava();
	        else return null;	
		 }
}
