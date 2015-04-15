import figures.Circle;
import figures.Square;
import figures.Trapeze;
import figures.Triangle;

import java.util.ArrayList;

import java.util.Random;

public class Start
{
    public static void main(String [] args)
    {
        ArrayList list_of_figures = new ArrayList();
        Random random = new Random();

        // количество фигур
        int count_figures = random.nextInt(100);

        int b=0;
        for(int i=0;i<count_figures;i++)
        {
            // тип фигуры
            int type_figure = random.nextInt(4);
            switch (type_figure)
            {
                case 0:list_of_figures.add(new Square()); break;
                case 1:list_of_figures.add(new Circle()); break;
                case 2:list_of_figures.add(new Trapeze()); break;
                case 3:list_of_figures.add(new Triangle()); break;
                default: break;
            }
        }


        // отображаем фигуры
        for(int i =0; i<list_of_figures.size();i++)
        {
            //  System.out.println(list_of_figures.get(i).getClass().getName());
            if(list_of_figures.get(i).getClass().getSimpleName().equals("Square"))
            {
                Square sq = new Square();
                sq = (Square)list_of_figures.get(i);
                System.out.println("Figure: "+sq.getClass().getSimpleName()+" , Area is: "+sq.get_area()+" , Side size: "+sq.getSide_size()+" , Color: "+sq.get_color());
            }
            if(list_of_figures.get(i).getClass().getSimpleName().equals("Circle"))
            {
                Circle cr = new Circle();
                cr = (Circle)list_of_figures.get(i);
                System.out.println("Figure: " + cr.getClass().getSimpleName() + " , Area is: " + cr.get_area() + " , Radius: " + cr.getRadius() + " , Color: " + cr.get_color());
            }
            if(list_of_figures.get(i).getClass().getSimpleName().equals("Trapeze"))
            {
                Trapeze tr = new Trapeze();
                tr = (Trapeze)list_of_figures.get(i);
                System.out.println("Figure: " + tr.getClass().getSimpleName() + " , Area is: " + tr.get_area() + " , Side size: " + tr.getC() + " , Color: " + tr.get_color());

            }
            if(list_of_figures.get(i).getClass().getSimpleName().equals("Triangle"))
            {
                Triangle triangle = new Triangle();
                triangle = (Triangle)list_of_figures.get(i);
                System.out.println("Figure: " + triangle.getClass().getSimpleName() + " , Area is: " + triangle.get_area() + " , Gipotinuza size: " + triangle.getGipotinuza() + " , Color: " + triangle.get_color());
            }
        }
    }
}
