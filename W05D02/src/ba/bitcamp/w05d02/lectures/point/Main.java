package ba.bitcamp.w05d02.lectures.point;

public class Main {

	public static void main(String[] args) {

		// Creating objects points
		Point pointOne = new Point(5, 3);
		Point pointTwo = new Point(10, 15);

		// Calculating the distance of point one from the origin
		System.out.printf("Distance of point %s from the origin is: %.5f\n\n",
				pointOne, pointOne.getDistanceFromOrigin());

		// Calculating the distance of point one from the origin
		System.out.printf("Distance of point %s from the origin is: %.5f\n\n",
				pointTwo, pointTwo.getDistanceFromOrigin());

		// Calculating the distance of point one from point two
		System.out.printf(
				"Distance between point %s and point %s is: %.5f\n\n",
				pointOne, pointTwo, pointOne.getDistance(pointTwo));

		// Checking if the point one and point two are equal
		System.out.printf("Are point %s and point %s equal? %b\n\n", pointOne,
				pointTwo, pointOne.equals(pointTwo));

		// Creating objects circle
		Circle circleOne = new Circle(pointOne, 2);
		Circle circleTwo = new Circle(pointTwo, 5);

		// Calculating if the circle one intersect with circle two
		System.out.printf("Does two circles intersect? %b",
				circleOne.intersect(circleTwo));

	}

}
