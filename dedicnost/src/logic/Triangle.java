package logic;

public class Triangle extends Shape{
    private float sideA;
    private float sideB;
    private float sideC;
    private float height;

    public Triangle(float sideA, float sideB,float sideC,float height) {
        super(area(sideC,height), perimeter(sideA,sideB,sideC));

    }

    private static float perimeter(float sideA, float sideB, float sideC) {
        return sideA + sideB +sideC;
    }
    public static float area(float sideC,float height){
        return (sideC * height / 2);
    }

    public float getSideB() {
        return sideB;
    }

    public float getSideA() {
        return sideA;
    }

    public float getHeight() {
        return height;
    }

    public float getSideC() {
        return sideC;
    }
}
