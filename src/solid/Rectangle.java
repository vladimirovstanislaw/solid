package solid;

public class Rectangle implements IShape
{
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	int width;
	int height;


	public Rectangle(int width,int height)
	{
		this.height=height;
		this.width=width;
	}
	
	public Rectangle()
	{
	}
	public int getSquare()
	{
		return height*width;
	}
}