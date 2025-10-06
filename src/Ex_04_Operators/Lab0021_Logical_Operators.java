package Ex_04_Operators;

public class Lab0021_Logical_Operators {
    public static void main(String[] args) {
        //refer diagram in atb14x notes

        boolean a = true;
        System.out.println(!a);

        boolean b = true;
        System.out.println(!!b);

//|| is logical OR.
//OR is true if at least one operand is true.
//true || false = true
        boolean c= false || true;
        System.out.println(c);

        //&& is logical AND.
        //AND is true only if both operands are true.
        //false && true = false

        boolean c1= false && true;
        System.out.println(c1);

    }
}
