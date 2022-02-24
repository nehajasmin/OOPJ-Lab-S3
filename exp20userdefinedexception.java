class UserError extends Exception {
}

public class exp20userdefinedexception {
    public static void main(String args[]) {
        try {
            throw new UserError();
        } catch (Exception ue) {
            System.out.println("Caught user defined exception from throw:" + ue);
        }

    }
}
