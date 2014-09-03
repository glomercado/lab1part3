/**
 * Created by gloadelyn.mercado916 on 9/3/14.
 */
public class RoomCarpet {

    RoomDimension size;
    double carpetCost;

    public RoomCarpet()
    {
        this.size = new RoomDimension();
        this.carpetCost = 0;
    }

    public RoomCarpet(RoomDimension dim, double cost) {
        this.size = dim;
        this.carpetCost = cost;
    }

    public double getTotalCost()
    {
        return this.size.getArea()*carpetCost;
    }

    public String toString()
    {
        return "Cost of the carpet is $" + getTotalCost();
    }


}
