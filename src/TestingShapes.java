interface Drawable {
    void draw();
}

abstract class Shape {
    private final String name;
    private final String color;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    // Абстрактний метод для виводу назви
    public abstract void printName();
}

class Circle extends Shape implements Drawable {
    public Circle(String color) {
        super("Circle",color);
    }
    @Override
    public void printName() {
        System.out.println("This is a " + getName());
    }
    @Override
    public void draw() {
        System.out.println("Drawing a " + getColor().toLowerCase() + " " + getName().toLowerCase());
    }
}
class Quad extends Shape implements Drawable {
    public Quad(String color) {
        super("Quad",color);
    }
    @Override
    public void printName() {
        System.out.println("This is a " + getName());
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + getColor().toLowerCase() + " " + getName().toLowerCase());
    }
}
class Triangle extends Shape implements Drawable {
    public Triangle(String color) {
        super("Triangle",color);
    }
    @Override
    public void printName() {
        System.out.println("This is a " + getName());
    }
    @Override
    public void draw() {
        System.out.println("Drawing a " + getColor().toLowerCase() + " " + getName().toLowerCase());
    }
}
class Rhombus extends Shape implements Drawable {
    public Rhombus(String color) {
        super("Rhombus",color);
    }

    @Override
    public void printName() {
        System.out.println("This is a " + getName());
    }
    @Override
    public void draw() {
        System.out.println("Drawing a " + getColor().toLowerCase() + " " + getName().toLowerCase());
    }
}
class Hexagon extends Shape implements Drawable {
    public Hexagon(String color) {
        super("Hexagon",color);
    }
    @Override
    public void printName() {
        System.out.println("This is a " + getName());
    }
    @Override
    public void draw() {
        System.out.println("Drawing a " + getColor().toLowerCase() + " " + getName().toLowerCase());
    }
}


class ShapePrinter {
    public void printShapeName(Shape shape) {
        shape.printName();
    }
}


public class TestingShapes {
    public static void main(String[] args) {
        ShapePrinter printer = new ShapePrinter();

        Shape circle = new Circle("Red");
        Shape quad = new Quad("Blue");
        Shape triangle = new Triangle("Green");
        Shape rhombus = new Rhombus("Yellow");
        Shape hexagon = new Hexagon("Purple");


        printer.printShapeName(circle);
        printer.printShapeName(quad);
        printer.printShapeName(triangle);
        printer.printShapeName(rhombus);
        printer.printShapeName(hexagon);


        Drawable drawableCircle = (Drawable) circle;
        drawableCircle.draw();
        Drawable drawableQuare = (Drawable) quad;
        drawableQuare.draw();
        Drawable drawableTriangle = (Drawable) triangle;
        drawableTriangle.draw();
        Drawable drawableRhombus = (Drawable) rhombus;
        drawableRhombus.draw();
        Drawable drawableHexagon = (Drawable) hexagon;
        drawableHexagon.draw();
    }
}
