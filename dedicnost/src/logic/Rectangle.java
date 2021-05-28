package logic;

public class Rectangle extends Shape{

    private float sideA;
    private float sideB;

    public Rectangle(float a, float b) {
        super(area(a,b),perimeter(a,b));
    }

    public static float area(float sideA, float sideB){
        return sideA * sideB;
    }
    public static float perimeter(float sideA,float sideB){
        return (2 * (sideA + sideB));
    }

    public float getSideA() {
        return sideA;
    }

    public float getSideB() {
        return sideB;
    }
}
