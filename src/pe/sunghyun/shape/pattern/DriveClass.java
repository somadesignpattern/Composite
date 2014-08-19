package pe.sunghyun.shape.pattern;

import pe.sunghyun.shape.common.Circle;
import pe.sunghyun.shape.common.Rectangle;

public class DriveClass {

	public static void main(String[] args) {
		Circle circle_1 = new Circle(3);
		Circle circle_2 = new Circle(5);
		Circle circle_3 = new Circle(10);
		Circle circle_4 = new Circle(7);

		Rectangle rectangle_1 = new Rectangle(4, 5);
		Rectangle rectangle_2 = new Rectangle(2, 3);
		Rectangle rectangle_3 = new Rectangle(7, 8);

		CompositeShape shape_1 = new CompositeShape();
		CompositeShape shape_2 = new CompositeShape();
		CompositeShape shape_3 = new CompositeShape();

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
