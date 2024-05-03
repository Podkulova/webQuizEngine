package src.solvingASimpleQuiz.overloading.multipleSwitch;

/*What is a value of var2 after executing the following code?*/
public class RemovingBreaks {
    public static void main(String[] args) {

        int var1 = 100;
        int var2 = 0;

        switch (var1) {
            case 100:
                var2 += var1;
            case 200:
                System.out.println(var2 += var1 / 4);
                break;
            case 300:
                System.out.println(var2 += var1 / 10);
                break;
        }

    }
}
