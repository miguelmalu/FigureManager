import figures.*;

import java.util.Arrays;

public class FigureManager {

    public static double sum(Figure[] vec) {
        double res = 0;
        for(Figure f: vec){
            res += f.area();
        }
        return res;
    }

    public static void sort(Figure[] vec) {
        Arrays.sort(vec);
    }


    public static void main(String[] args) {

        Figure[] fig = new Figure[4];

        fig[0] = new Circle(7);
        fig[1] = new Rectangle(7,3);
        fig[2] = new Square(5);
        fig[3] = new Triangle(5,2);

        double res = FigureManager.sum(fig);
        System.out.println(res);

        System.out.println(Arrays.asList(fig));
        FigureManager.sort(fig);
        System.out.println(Arrays.asList(fig));

    }
}