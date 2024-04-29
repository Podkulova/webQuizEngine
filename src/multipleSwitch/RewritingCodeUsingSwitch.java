package src.multipleSwitch;

/*Here is a piece of code that uses the conditional statement if-else-if.

        if (val == 1) {
        System.out.println("ONE");
} else if (val == 2) {
        System.out.println("TWO");
} else if (val == 3){
        System.out.println("THREE");
} else {
        System.out.println("UNKNOWN NUMBER");
}

How this code can be rewritten using a switch statement?*/
public class RewritingCodeUsingSwitch {
    public static void main(String[] args) {

        int val = 10;

        switch (val) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Unknown number");
        }
    }
}
