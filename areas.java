import java.util.Scanner;

public class areas {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int opt=0,sid;
        float hei,rad;
        while(opt!=4)
        {
        System.out.println("Enter 1 to Find the Area of Circle");
        System.out.println("Enter 2 to Find the Area of Rectangle");
        System.out.println("Enter 3 to Find the Area of Triangle");
        System.out.println("Enter 4 to Exit");
        opt=scan.nextInt();
        switch(opt)
        {
            case 1:System.out.println("Enter the Radius:");
                   rad=scan.nextFloat();
                   area(rad);
                   break;
            case 2:System.out.println("Enter the Length and Breadth of the Rectangle:");
                   sid=scan.nextInt();
                   hei=scan.nextInt();
                   area(sid,hei);
                   break;
            case 3:System.out.println("Enter the Base and Height of the triangle:");
                   hei=scan.nextInt();
                   sid=scan.nextInt();
                   area(hei,sid);
                   break;
            case 4:break;
            default:System.out.println("Invalid ERROR");
        }                             
        }
        
        scan.close();
    }
    public static void area(float rad){
        
        float are =rad*rad*(float)3.14;
        System.out.println("The Area of the circle is "+are);
    }

    public static void area(int hei,float sid){
        float are =hei*sid;
        System.out.println("The Area of the Rectangle is "+are);
    }
    
    public static void area(float bas,int hei){
        float are =bas*hei*(float)0.5;
        System.out.println("The Area of the Triangle is "+are);
    }
}