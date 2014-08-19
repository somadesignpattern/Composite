package pe.sunghyun.shape.pattern;

import pe.sunghyun.shape.common.Circle;
import pe.sunghyun.shape.common.Rectangle;
import pe.sunghyun.shape.common.Shape;

public class DriveClass {

	public static void main(String[] args) {
		Shape circle_1 = new Circle(3);
		Shape circle_2 = new Circle(5);
		Shape circle_3 = new Circle(10);
		Shape circle_4 = new Circle(7);

		Shape rectangle_1 = new Rectangle(4, 5);
		Shape rectangle_2 = new Rectangle(2, 3);
		Shape rectangle_3 = new Rectangle(7, 8);

		Shape shape_1 = new CompositeShape();
		Shape shape_2 = new CompositeShape();
		Shape shape_3 = new CompositeShape();

		shape_1.add(circle_1);
		shape_1.add(rectangle_1);

		shape_2.add(circle_2);
		shape_2.add(circle_3);

		shape_3.add(rectangle_2);
		shape_3.add(rectangle_3);
		shape_3.add(circle_4);

		// grouping composite shapes.
		shape_2.add(shape_3);
		shape_1.add(shape_2);

		shape_1.print();
	}

}
