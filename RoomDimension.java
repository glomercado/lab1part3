/**
 * Created by gloadelyn.mercado916 on 9/3/14.
 */
public class RoomDimension {

    double length;
    double width;

    public RoomDimension()
    {
        this.length = 0;
        this.width = 0;
    }

    public RoomDimension(double lengthNew, double widthNew)
    {
        this.length = lengthNew;
        this.width = widthNew;
    }

    public double getArea()
    {
        return length*width;
    }

    public String toString()
    {
        return "area: " + length*width;
    }
}
