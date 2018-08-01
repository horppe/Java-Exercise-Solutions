public final class MathUtils{
  static void areaAndPerimeterOfCircle(double radius) {
		double perimeter = 2.0 * Math.PI * radius;
		double area = Math.PI * Math.pow(radius, 2);
		System.out.println("The Perimeter is: " + perimeter);
		System.out.println("The Area is: " + area);
	}

	static void areaAndPerimeterOfRectangle(double width, double height) {
		double perimeter = 2.0 * (width + height);
		double area = width * height;
		System.out.println("The Perimeter is: " + perimeter);
		System.out.println("The Area is: " + area);
	}
}
