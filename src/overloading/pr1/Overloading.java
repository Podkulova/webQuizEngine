package src.overloading.pr1;

import static java.lang.Integer.MAX_VALUE;

public class Overloading {
    public static long getMaxMinusCurrent(long val) {
        return Long.MAX_VALUE - val;
    }

    public static int getMaxMinusCurrent(int val) {
        return MAX_VALUE - val;
    }

}
