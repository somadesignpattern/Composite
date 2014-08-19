package pe.sunghyun.shape.common;

public class Circle implements Shape {
	private int mRadius;

	public Circle(int radius) {
		super();
		this.mRadius = radius;
	}

	public int getRadius() {
		return this.mRadius;
	}

	public void setRadius(int radius) {
		this.mRadius = radius;
	}

	@Override
	public void print() {
		System.out.println("Circle: " + 2 * this.mRadius + "dm in px");
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
