package solid;

public class Square_3 implements IShape {
	private int storona;

	public void setHeight(int storona) {
		this.storona = storona;
	}

	@Override
	public int getSquare() {
		// TODO Auto-generated method stub
		return storona*storona;
	}

}
