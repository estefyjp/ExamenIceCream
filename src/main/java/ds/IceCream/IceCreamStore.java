package ds.IceCream;


public abstract class IceCreamStore {
	public IceCream orderIceCream(String flavor){
		IceCream iceCream;
		
		iceCream = createIceCream(flavor);
		iceCream.serve();
		iceCream.prepare();
		return iceCream;
	}
	protected abstract IceCream createIceCream(String flavor);
}