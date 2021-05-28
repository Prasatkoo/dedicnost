package presentation;

public class Cli {

    public static void cli() {
        System.out.println("Welcome to shapes:");

    }

    public static void mainmenu() {
        System.out.println("----Menu----");
        System.out.println("1) Enter app");
        System.out.println("2) Exit");
        System.out.println("Choose:");

    }

    public static void err() {
        System.out.println("Invalid input! Enter new number!");
    }

    public static void endmsg() {
        System.out.println("Bye bye!");
    }

    public static void secondmenu() {
        System.out.println("--Count Menu--");
        System.out.println("1) Square");
        System.out.println("2) Rectandle");
        System.out.println("3) Triangle");
        System.out.println("4) Circle");
        System.out.println("5) Go Back to : --Menu-- ");


    }
    public static void squareMenu(){
        System.out.println("Type in square side in : CM");
    }
    public static void squareResluts(float area, float perimeter){
        System.out.println("Your square:");
        System.out.println("Area of your square is " + area + "cm2");
        System.out.println("Perimeter of your squeare is " + perimeter + "cm");
    }
    public static void rectangleMenu(){
        System.out.println("Type in your height and lenght of your rectangle:");
    }
    public static void rectangleResluts( float a, float b){
        System.out.println("Your Rectangle:");
        System.out.println("Area of your rectangle is " + a + "cm2");
        System.out.println("Perimeter of your rectangle is " + b + "cm");
    }
    public static void circleMenu(){
        System.out.println("Type in diameter of your circle:");
    }
    public static void circleResults(float a, float b){
        System.out.println("Your Circle:");
        System.out.println("Area of your circle is "+ a + "cm2" );
        System.out.println("Perimeter of your circle is "+ b + "cm" );
    }

    public static void  triangleMenu(){
        System.out.println("First Type in side A then side B then side C and then height of your Triangle!:");

    }
    public static void tirangleResults(float a, float b){
        System.out.println("Your Triangle:");
        System.out.println("Area of your triangle is " + a + "cm2");
        System.out.println("Perimeter of your triangle is " + b + "cm");
    }
    public static void inputResults(float a, float b){
        System.out.println("Average Area is: " + a + "cm2");
        System.out.println("Average Perimeter is: " + b + "cm");
    }

}
