package data;



import logic.Circle;
import logic.Logic;
import logic.Rectangle;
import logic.Square;
import presentation.Cli;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Data  {

    public void read() throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
       arrayList.add(br.readLine());
        while (br.readLine() != null) {
            arrayList.add(br.readLine());

        }
        average(arrayList);


    }
    public static void average(ArrayList<String> avg){
        float area = 0;
        float perimeter = 0;
        float averageArea;
        float averagePerimeter;
        for (String data : avg) {
            String[] array = data.split(" ");
            if (array[0].equals("R")){
                Rectangle rectangle = new Rectangle(Float.parseFloat(array[1]), Float.parseFloat(array[2]));
                area += rectangle.getArea();
                perimeter += rectangle.getPerimeter();
            }
            if (array[0].equals("S")){
                Square square = new Square(Float.parseFloat(array[1]));
                area += square.getArea();
                perimeter += square.getPerimeter();
            }
            if (array[0].equals("C")){
                Circle circle = new Circle(Float.parseFloat(array[1]) * 2);
                area += circle.getArea();
                perimeter += circle.getPerimeter();
            }
        }
         averageArea = area / avg.size();
         averagePerimeter = perimeter / avg.size();

        Cli.inputResults(averageArea,averagePerimeter);

    }



}
