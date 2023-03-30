public class Shapes {
  public static class Triangle {
    private double base;
    private double height;

    Triangle(double base, double height) {
      this.base = base;
      this.height = height;
    }

    double getBase() {
      return base;
    }

    void setBase(double base) {
      this.base = base;
    }

    double getHeight() {
      return height;
    }

    void setHeight(double height) {
      this.height = height;
    }

   double calculateArea() {
      return 0.5 * base * height;
    }
  }

  public static class Square {
    private double side;

    Square(double side) {
      this.side = side;
    }

    double getSide() {
      return side;
    }

     void setSide(double side) {
      this.side = side;
    }

   double calculateArea() {
      return side * side;
    }
  }

 static class Circle {
    private double radius;
     Circle(double radius) {
      this.radius = radius;
    }
    double getRadius() {
      return radius;
    }
   void setRadius(double radius) {
      this.radius = radius;
    }
  double calculateArea() {
      return Math.PI * radius * radius;
    }
  }

  public static void main(String[] args) {
    Triangle triangle = new Triangle(5, 10);
    System.out.println("Area of triangle: " + triangle.calculateArea());

    Square square = new Square(7);
    System.out.println("Area of square: " + square.calculateArea());

    Circle circle = new Circle(3);
    System.out.println("Area of circle: " + circle.calculateArea());
  }
}
