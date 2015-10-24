package ds.IceCream;


public abstract class IceCream {
	public String base;
	public String flavor;
	
	 public void serve() {
	        System.out.println("Serving cone..." );
	    }
	 public void prepare() {
	        System.out.println("Preparing " + flavor + " " + base);
	 }
	 public String getName(){
	        return flavor+ " " + base;
	    }
}