import java.util.*;
public class secondmin {
    public static void main(String[] args)
    {
        int n,i,min1=1000,ans=999;
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: ");
            n=scn.nextInt();
            int ar[]=new int[n];

            System.out.println("Enter the array of numbers: ");
            for(i=0;i<n;i=i+1)
            {
                ar[i]=scn.nextInt();
            }
   
            if (ar[0]>ar[1])
            {
                ans=ar[0];
                min1=ar[1];
            }
            else
            {
                ans=ar[1];
                min1=ar[0];
            }
            for(i=2;i<n;i=i+1)
            {   
                if (min1==ans)
                {
                    ans=ar[i];
                }
                if(ar[i]<min1 && ar[i]<ans)
                {
                    ans=min1;
                    min1=ar[i];
                }
                else if(ar[i]<ans && ar[i]>min1)
                {
                    ans=ar[i];
                }
            }
            System.out.println("Second minimum is "+ans);
            
            scn.close();
        }
    }
   
}