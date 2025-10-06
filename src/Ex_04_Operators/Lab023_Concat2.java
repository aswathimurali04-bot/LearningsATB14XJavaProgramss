package Ex_04_Operators;

public class Lab023_Concat2 {
    public static void main(String[] args) {
        String first_name = "Lucky";
        String last_name = "Dutta";

        int a = 100;
        int b = 90;
//Note: Once a String appears, + becomes String concatenation, not addition.
        System.out.println(first_name + last_name + a + b);

        //Key point: Java evaluates left to right, and numbers are added until it sees a String, then it switches to concatenation.
        System.out.println(a + b + first_name + last_name);

        //Why brackets matter: They force addition before concatenation, following BODMAS rules.
        System.out.println(first_name + last_name + (a + b));
    }
}
