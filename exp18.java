public class exp18 {
    public void finalize(){
        System.out.println("Garbage Collected");
    }

    public static void main(String[] args){
        exp18 a = new exp18();
        exp18 b = new exp18();

        a = null;
        b = null;

        System.gc();
    }
}
