package pe.sunghyun.shape.common;

public interface Shape {
	public void print();
	public void add(Shape o);
	public void remove(Shape o);
	public Shape getChild(int i);
}
