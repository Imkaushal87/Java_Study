package Function_Method;

public class Greeting {
    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);
    }
    static String greet(){
        String grt = "How are you?";
        return  grt;
    }
}
