package figures;

import java.awt.Color;
import java.util.Random;


public class Trapeze implements Figures
{
    private Color color;

    // За основу возьмем равнобокую трапецию
    private int a; // нижнее основание
    private int b; // верхнее основание
    private int c; // боковая сторона
    private Random random;
    public Trapeze()
    {
    random = new Random();
    color = new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256),random.nextInt(256));
        a = random.nextInt(1000);
        b = random.nextInt(500);
        c = random.nextInt();
    }

    // длинна стороны
    public int getC() {
        return c;
    }

    @Override
    public Color get_color() {
        return color;
    }

    // нахождение площади трапеции через 4 стороны
    // (http://www-formula.ru/index.php?option=com_content&view=article&id=74&Itemid=68)
    @Override
    public double get_area() {
        return ((a+b)/2)*Math.sin((Math.pow(c,2)-Math.pow((Math.pow((a-b),2)/(2*(a-b))),2)));
        //double x = Math.sin(a5);
    }
}
