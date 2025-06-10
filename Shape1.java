class Shape {
    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    @Override
    void display() {
        super.display(); // Calls the display method of Shape
        System.out.println("This is a circle.");
    }
}

class Rectangle extends Shape {
    @Override
    void display() {
        super.display(); // Calls the display method of Shape
        System.out.println("This is a rectangle.");
    }
}

public class MainClass {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.display();
        rectangle.display();
    }
}
