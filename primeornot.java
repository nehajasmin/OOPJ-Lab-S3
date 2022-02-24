import java.util.*; 
public class primeornot
{
    
    public static void main(String args[])
    {
        System.out.println("Enter a natural number: "); 
        int i;
        Scanner scan= new Scanner(System.in);
        i=scan.nextInt();
        scan.close();

        int flag=1; 
       
        if (i==1 || i==0)
        System.out.println("not prime nor composite");

        else{

        for(int j=2;j<=i/2;j++)

        if(i%j==0)
        {
            flag=0;    
        }

        if(flag==0)
        {
            System.out.print("not prime");

        }

        else
        System.out.println("prime");
    }

}

}
