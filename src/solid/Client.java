package solid;

public class Client {
	DAO da=new DataAccess();
	void doJob() {
		da.execute();
	}
}

class DataAccess implements DAO{
	public void execute() {
		System.out.println("execute");
	}
}

interface DAO {
	void execute();//default visibility in interface => public, not private-package like in some class
}