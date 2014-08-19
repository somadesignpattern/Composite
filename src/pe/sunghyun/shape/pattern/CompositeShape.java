package pe.sunghyun.shape.pattern;

import java.util.ArrayList;
import java.util.List;

import pe.sunghyun.shape.common.Shape;

public class CompositeShape implements Shape {

	private List<Shape> mChildShapes = new ArrayList<Shape>();

	@Override
	public void print() {
		for (Shape shape: this.mChildShapes) {
			shape.print();
		}
	}

	public void add(Shape shape) {
		this.mChildShapes.add(shape);
	}

	public void remove(Shape shape) {
		this.mChildShapes.remove(shape);
	}

}
