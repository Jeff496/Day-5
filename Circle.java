class Circle {
  // 3 things for creating a class
  // 1. instance variables - describing the class (attributes)/ represents the class (public and private)
  // 2. constructors - 2 constructors: empty/ parameterized
  // ex.Circle() and Circle(int radius)
  // 3. getters and setters (accessors and mutators) - getters get the instance variable (returns it); setters ets the instance variable to a new value 
  // 4. optional - methods: actions that your object can do

  private double radius;

  public Circle() {
    this.radius = 5.0;
  }

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius(){
    return this.radius;
  }

  public void setRadius(double radius) {
    this.radius = radius; // this.radius refers to the instance variable
  }

  // Make a method to find the area of the circle 
  // pi is 3.14

  public double area() {
    double area = this.radius * this.radius * 3.14;
    return area;
  }

  // make the circumference method

  public double circumference() {
    double circumference = 2 * this.radius * 3.14;
    return circumference;
  }
}