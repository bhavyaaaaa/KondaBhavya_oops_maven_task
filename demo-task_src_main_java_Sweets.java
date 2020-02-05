public class Sweets
{

    public void print()
    {
        System.out.println("Sweets object created");
    }
    public int numofboxes(int x)
    {
        //System.out.print("Enter number of boxes:\n");
        return x;
    }

    public double weight(double y)
    {
        //System.out.print("Enter weight of box:\n");
        return y;
    }

    public double totalweight(int x,double y)
    {
        return x*y;

    }
}
class FriedSweets extends Sweets
{
    public void print()
    {
        System.out.println("Fried Sweets Class object created");

    }
}
class DryFruitSweets extends Sweets
{
    public void print()
    {
        System.out.println("Dry Fruit Sweets Class object created");

    }
}
class MilkSweets extends Sweets
{
    public void print()
    {
        System.out.println("Milk Sweets Class object created");

    }
}