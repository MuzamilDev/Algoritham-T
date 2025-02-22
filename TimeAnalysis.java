import java.io.*;
class Algorithm{
    public static void main(String args[])
    {
        int n, sum;
        n = 5000;
        sum =0;

        long start = System.currentTimeMillis();

        int i,j;
        for(i=0; i<n; i++)
            for (j=0;j<i;j++)
                sum++;
        long end = System.currentTimeMillis();
        long time = end -start;
        System.out.println("the start time is " +start);
        System.out.println("the end time is "+end);
        System.out.println("the time taken is: "+time);

    }
}
