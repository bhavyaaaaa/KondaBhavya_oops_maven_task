import java.util.*;
import java.lang.ClassCastException;
public class NewYearGifts {
        @SuppressWarnings("unused")
        public static void main(String[] args) throws Exception{
            System.out.println("\n-----NEW YEAR GIFTS CLASS IMPLEMENTATION-----\n\n");
            System.out.println("Sweet Class Implementation:");
            System.out.println("---------------------------");

            //***Creating multiple objects for class Sweets***
            Sweets x=new Sweets();
            Sweets y=new Sweets();
            x.print();
            y.print();
            int x1=x.numofboxes(5);
            double y1=y.weight(200.45);
            double sweetsum=x.totalweight(x1,y1);
            System.out.println("Total weight of Sweets: "+sweetsum);

            //***Creating objects for inherited classes in Sweets class***
            System.out.println("\nCalling Inherited classes in Sweet Class:\n");
            FriedSweets fs=new FriedSweets();
            fs.print();
            DryFruitSweets ds = new DryFruitSweets();
            ds.print();
            MilkSweets ms = new MilkSweets();
            ms.print();

            //**Sorting chocolates in Chocolate class
            System.out.println("\n\nChocolate Class Implementation:");
            System.out.println("-------------------------------\n");
            Map<Integer,String> choc = Map.of(55, "Dairy Milk", 35, "Kit Kat", 10, "Munch",23,"Snickers",40,"Hazel Nut");
            //int[] choc = {55,25,75,100,25,10};*/
            //double chocsum=c.totalweight(choc);
            Chocolates c = new Chocolates();
            System.out.print("Sorting weights of chocolates\n\n");
            c.sort(choc);
            double chocsum=c.totalweight(choc);
            System.out.println("Total Weight of Chocolates: "+chocsum);
            System.out.println();

            //**Finding candies in Candies class
            System.out.println("\n\nCandies Class Implementation:");
            System.out.println("-----------------------------");
            Sweetcandy sc=new Sweetcandy();
            sc.print();
            int[] candyweight = {2,3,2,11,10,15,5};
            String[] color= {"red","blue","pink","red","white","yellow","pink"};
            System.out.println("Finding candy's total weight by color:");
            sc.find("red",candyweight,color);
            sc.find("pink",candyweight,color);
            double candysum=sc.totalweight(candyweight);
            System.out.println("Total Weight of candies: "+candysum+"\n");
            System.out.println("Checking if the number of candies is in range or not\n");
            sc.checkRange(30);
            sc.checkRange(78);


            double total=sweetsum+candysum+chocsum;
            System.out.println("\n\nTotal weight of New Year Gift: "+total);
        }
    }
