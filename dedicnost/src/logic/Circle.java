package logic;

public class Circle extends Shape {
    private float diameter;


    public Circle(float diameter) {
        super(area(diameter / 2), perimeter(diameter / 2));
    }


    public static float area(float r) {
    float pi = (float) 3.1415;
    return (pi * r * r);
    }

    public static float perimeter(float r) {
        float pi = (float) 3.1415;
        return (2 * pi * r);
    }
}
