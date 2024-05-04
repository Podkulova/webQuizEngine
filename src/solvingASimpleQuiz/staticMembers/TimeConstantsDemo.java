package src.solvingASimpleQuiz.staticMembers;

/*
There are special types of classes called Constants or Utility which have only static fields and/or methods.
Usually, such classes cannot be instantiated directly and they are only needed to group related static
 members to be used by other classes.

In this exercise, you will work with the TimeConstants class that stores several time constants for seconds.
 You need to add two static fields SECONDS_IN_DAY and SECONDS_IN_WEEK and print them in this order, each of
  them on a new line.
 */
public class TimeConstantsDemo {
    public static void main(String[] args) {
        // print SECONDS_IN_DAY
        System.out.println(TimeConstants.SECONDS_IN_HOUR * 24);
        // print SECONDS_IN_WEEK
        System.out.println(TimeConstants.SECONDS_IN_HOUR * 24 * 7);
    }
}

final class TimeConstants {
    public static final int SECOND = 1;
    public static final int SECONDS_IN_MINUTE = 60 * SECOND;
    public static final int SECONDS_IN_HOUR = 60 * SECONDS_IN_MINUTE;
    // write your code here

    private TimeConstants() { }
}
