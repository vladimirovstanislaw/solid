package solid;

public class OpenClose_2 {
	
	static void workInTaksi(ICar car)
	{
		car.workInTaxi();
	}

}

class Toyota implements ICar{
	void getPassangers() {
		System.out.println("get some passangers");
	}

	@Override
	public void workInTaxi() {
		// TODO Auto-generated method stub
		getPassangers();
	}
	 
}
interface ICar{
	void workInTaxi();
}

class Celica extends Toyota {
	void getPassanger() {
		System.out.println("get one passanger");
	}
	@Override 
	public void workInTaxi()
	{
		getPassanger();
	}
}
