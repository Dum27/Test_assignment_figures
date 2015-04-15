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

    // за основу возьмем равносторонний треугольник, в нем большая сторона и будет гипотинузой
    public Triangle()
    {
        random = new Random();
        color = new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256),random.nextInt(256));
        a = random.nextInt();
        b = random.nextInt();
        c = random.nextInt();
    }

    public int getGipotinuza() {
        if (a>b){
            if (a>c){
                gipotinuza = a;
            }
            else{
                if(c>b){
                    gipotinuza = c;
                }
                else{
                    gipotinuza = b;
                }
            }
        }
        else{
            if (b>c){
                gipotinuza = b;
            }
        }
        return gipotinuza;
    }

    @Override
    public Color get_color() {
        return color;
    }

    @Override
    public double get_area() {
        double area = 0;
        if(gipotinuza == a){area=(1/2)*b*c;}
        if(gipotinuza == b){area = (1/2)*a*c;}
        if(gipotinuza == c){area = (1/2)*a*b;}
        return area;
    }
}
