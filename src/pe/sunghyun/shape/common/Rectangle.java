package pe.sunghyun.shape.common;

public class Rectangle implements Shape {
	private int mWidth, mHeight;

	public Rectangle(int width, int height) {
		super();
		this.mWidth = width;
		this.mHeight = height;
	}

	public int getWidth() {
		return this.mWidth;
	}

	public void setWidth(int width) {
		this.mWidth = width;
	}

	public int getHeight() {
		return this.mHeight;
	}

	public void setHeight(int height) {
		this.mHeight = height;
	}

	@Override
	public void print() {
		System.out.println("Rectangle: " + this.mWidth + "px, " + this.mHeight + "px");
	}

	@Override
	public void add(Shape o) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void remove(Shape o) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Shape getChild(int i) {
		throw new UnsupportedOperationException();
	}
}
