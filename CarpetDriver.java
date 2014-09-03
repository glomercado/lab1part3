/**
 * Created by gloadelyn.mercado916 on 9/3/14.
 */
import java.util.*;

public class CarpetDriver {

    public static void main(String args[])
    {
        RoomDimension rD = new RoomDimension();
        RoomCarpet rC = new RoomCarpet();

        Scanner scan = new Scanner(System.in);

        System.out.printf("enter width: ");
        rD.width  = scan.nextDouble();

        System.out.printf("enter length: ");
        rD.length  = scan.nextDouble();

        rC.size = rD;

        System.out.printf("enter cost of carpet: ");
        rC.carpetCost = scan.nextDouble();

        System.out.print(rC.toString());
    }
}
