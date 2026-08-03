package Methods;

public class CopyCounter {

	    public static void main(String[] args) {

	    	Counter.incrementStatic();
	    	Counter.incrementStatic();

	    	Counter c1 = new Counter();
	    	Counter c2 = new Counter();

	    	c1.incrementNonstatic();
	    	c1.incrementNonstatic();

	    	c2.incrementNonstatic();
	    }
	
	}


