package solid;

public class Main {
	
	static Rectangle getRectangle(int width,int height)
	{
		return new Rectangle(width,height);
	}
	static Square_3 getRectangle()
	{
		return new Square_3();
	}
	public static void main(String[] args) {
		System.out.println("Solid project");
		System.out.println("S - single resposibility || the class must be changed only for one reason");
		Employee cook = new Cook("someData");
		System.out.println(cook.toString());
		System.out.println(cook.equals(new Cook("someData")));
		System.out.println(new megaCook("megaData"));
		System.out.println("------------------------------------");
		System.out.println("O - Open Close principle || class must be open for extend but close for modificate");
		ICar celica= new Celica();
		ICar toyotka= new Toyota();
		OpenClose_2.workInTaksi(celica);
		OpenClose_2.workInTaksi(toyotka);
		System.out.println("------------------------------------");
		System.out.println("L -  Liskov principle || we musn't change the behavior of our parent");		
		Rectangle rect=getRectangle(5,10);
		Square_3 rect2=getRectangle();
		rect2.setHeight(10);
		rect2.setHeight(5);
		System.out.println(rect.getSquare());
		System.out.println(rect2.getSquare());
		System.out.println("------------------------------------");
		System.out.println("I -  Interface Sugregation || we must not depend on interfaces which we not use(just do some more interfaces, extends interfaces by interfaces)");
		IWorker WORKER=new Cook4();
		WORKER.eat();
		WORKER.work();
		System.out.println("------------------------------------");
		System.out.println("D -  Dependency Inversion || it's just a layer between high-level and low-level objects");
		Client client=new Client();
		client.doJob();				
	}
}

interface Employee {
	public int getSalary();

}

class Cook implements Employee {
	private String someData;

	public Cook(String someData) {
		this.setSomeData(someData);
	}

	public int getSalary() {
		return 0;
	}

	int getRandom() {
		return 4;
	}

	@Override
	public String toString() {
		return "If a class has no modifier (the default, also known as package-private), it is visible only within its own package.";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(this.getClass() == obj.getClass())) {
			return false;
		} else {
			if (this.getSomeData() == ((Cook) obj).getSomeData()) {
				return true;
			} else {
				return false;
			}
		}

	}

	public String getSomeData() {
		return someData;
	}

	public void setSomeData(String someData) {
		this.someData = someData;
	}
}

class megaCook extends Cook {
	public megaCook(String data) {
		super(data);

	}

	public String toString() {
		return super.getSomeData();
	}
}