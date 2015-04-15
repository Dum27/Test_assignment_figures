package figures;

import java.awt.Color;
import java.util.Random;

public class Square implements Figures
{
    private Color color;
    private int side_size;

    private Random random;

    public Square()
    {
        random=new Random();
        color = new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256),random.nextInt(256));
        side_size = random.nextInt();
    }

    public int getSide_size() {
        return side_size;
    }

    @Override
    public Color get_color() {
        return color;
    }

    @Override
    public double get_area() {
        return Math.pow(side_size, 2);
    }
}
