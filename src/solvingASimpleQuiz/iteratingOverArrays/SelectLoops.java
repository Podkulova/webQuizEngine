package src.solvingASimpleQuiz.iteratingOverArrays;

/*
Select all loops which print each element of an array named nums. The array contains only four numbers.
 */
public class SelectLoops {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.println(nums[i]);
        }

        System.out.println("-----------------------");

        for (int i = 1; i <= 3; i++) {
            System.out.println(nums[i]);
        }

        System.out.println("-----------------------");

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        System.out.println("-----------------------");

        for (int i = 0; i <= 3; i++) {
            System.out.println(nums[i]);
        }

        System.out.println("-----------------------");

        for (int i = 0; i <= 3; i++) {
            System.out.println(nums[0]);
        }
    }
}
