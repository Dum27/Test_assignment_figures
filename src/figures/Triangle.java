package figures;

import java.awt.Color;
import java.util.Random;

public class Triangle implements Figures
{
    private Color color;
    private Random random;
    private int a;
    private int b;
    private int c;
    private int gipotinuza;

    // за основу возьмем равносторонний треугольник
    public Triangle()
    {
        random = new Random();
        color = new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256),random.nextInt(256));
        a = random.nextInt(300)+1;
        b = random.nextInt(300)+1;

    }

    public double getGipotinuza() {
        return Math.sqrt(((a*a)+(b*b)));
    }

    @Override
    public Color get_color() {
        return color;
    }

    @Override
    public double get_area() {

        return 0.5*a*b;
    }
}
