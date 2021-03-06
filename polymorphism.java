/*
parent
*/
public class Phone {
	private String brand; 
	private float cost;
	
	public Phone(String brand, float cost) {
		this.brand = brand;
		this.cost = cost;
	}
}

/*
child 1
*/
public class iPhone6 extends Phone{
	public iPhone6(String model, float price) {
		super(model, price);
	}
}

/*
child 2
*/
public class HTCM8 extends Phone {
	public HTCM8(String brand, float cost) {
		super(brand, cost);
	}		
}

/*
demo
*/
public class Main {
	public static void main(String[] args) {
		// 'Phone' dtype but 'iPhone6' instantiated
		Phone usediPhone =  new Main().phone(1); 
	}
	private Phone phone(int type) {
		switch(type) {
		case 1: return new iPhone6("Apple", 300);
		case 2: return new HTCM8("HTC", 300);
		}
		return null;
	}
}