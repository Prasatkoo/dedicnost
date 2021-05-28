package logic;

import presentation.Cli;

import java.util.Scanner;

public class Logic {

    private static Scanner sc = new Scanner(System.in);

    public static void resolver() {
        int input1 = sc.nextInt();
        while (!(input1 <= 2 && input1 > 0)) {
            Cli.err();
            input1 = sc.nextInt();
        }

        if (input1 == 1) {
            Cli.secondmenu();
            menuresolver();
        }
        if (input1 == 2) {
            Cli.endmsg();
            System.exit(0);
        }

    }

    public static void menuresolver() {
        int input1 = sc.nextInt();
        while (!(input1 <= 5 && input1 > 0)) {
            Cli.err();
            input1 = sc.nextInt();
        }

        if (input1 == 1) {
            Cli.squareMenu();
            squareresolver();

        } else if (input1 == 2) {
            Cli.rectangleMenu();
            rectangleResolver();

        } else if (input1 == 3) {
           Cli.triangleMenu();
           triangleResolver();

        } else if (input1 == 4) {
            Cli.circleMenu();
            cricleResolver();
        } else if (input1 == 5) {
            Cli.mainmenu();
            resolver();
        } else {
            Cli.mainmenu();
            resolver();
        }
    }

    public static void squareresolver() {
        float intput = sc.nextFloat();
        Square square = new Square(intput);
        Cli.squareResluts(square.getArea(), square.getPerimeter());
        Cli.secondmenu();
        menuresolver();

    }

    public static void rectangleResolver() {
        float input1 = sc.nextInt();
        float input2 = sc.nextInt();
        Rectangle rectangle = new Rectangle(input1, input2);
        Cli.rectangleResluts(rectangle.getArea(), rectangle.getPerimeter());
        Cli.secondmenu();
        menuresolver();
    }

    public static void cricleResolver() {
        float input1 = sc.nextFloat();
        Circle circle = new Circle(input1);
        Cli.circleResults(circle.getArea(), circle.getPerimeter());
        Cli.secondmenu();
        menuresolver();
    }

    public static void triangleResolver() {
        float input1 = sc.nextFloat();
        float input2 = sc.nextFloat();
        float input3 = sc.nextFloat();
        float height = sc.nextFloat();
        Triangle triangle = new Triangle(input1,input2,input3,height);
        Cli.tirangleResults(triangle.getArea(), triangle.getPerimeter());
        Cli.secondmenu();
        menuresolver();
    }
}
