package logic;

public class  Square extends Shape {

private float sideA;

public Square(float a){
    super(area(a),perimeter(a));
    sideA = a;
}

public static float area(float a){
    return a * a;
}
public static float perimeter(float a){
    return a * 4;
}

    public float getSideA() {
        return sideA;
    }

    public void setSideA(float sideA) {
        this.sideA = sideA;
    }
}
