package figures;

import java.awt.Color;
import java.util.Random;

public class Circle implements Figures
{
    private int radius;
    private Random random;
    private Color color;

    public Circle()
    {
        random=new Random();
        color = new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256),random.nextInt(256));
        radius=random.nextInt(300);
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public Color get_color() {
        return color;
    }

    @Override
    public double get_area() {
        return 3.14*(Math.pow(radius,2));
    }
}
