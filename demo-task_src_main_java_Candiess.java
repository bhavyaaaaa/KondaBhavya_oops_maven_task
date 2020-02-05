import java.io.*;
interface Candiess{

    // all are the abstract methods.
    void checkRange(int a);
}

class Sweetcandy implements Candiess{

    String name;
    int a;

    @Override
    public void checkRange(int value)
    {

        if(value<60 && value>0)
            System.out.println("In Range");
        else
            System.out.println("Not in Range");
    }

    public void print()
    {
        System.out.println("Implementing interface for candies class\n");
    }
    double candysum=0;
    public void find(String x,int[] candyweight,String[] color)
    {
        int sum=0;
        for(int i=0;i<color.length;i++)
        {
            if(color[i]==x)
            {
                sum+=candyweight[i];
            }
        }
        System.out.print("The total weight of colcr"+x+":"+sum+"\n");
    }
    public double totalweight(int[] candyweight)
    {
        for(int i=0;i<candyweight.length;i++)
        {
            candysum+=candyweight[i];
        }
        return candysum;
    }
}
