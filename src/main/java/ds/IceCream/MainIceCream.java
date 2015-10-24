package ds.IceCream;

import ds.IceCreamStores.MilkIceCreamStore;
import ds.IceCreamStores.WaterIceCreamStore;

public class MainIceCream {
	public static void main(String[] args){
		IceCreamStore milkStore = new MilkIceCreamStore();
		IceCreamStore waterStore = new WaterIceCreamStore();
		IceCream helado = milkStore.orderIceCream("Strawberry");
		
		System.out.println("First cone: " + helado.getName());
        System.out.println();
        
        helado = waterStore.orderIceCream("Mango");
        System.out.println("Second cone: " + helado.getName());
        System.out.println();
	}
}
