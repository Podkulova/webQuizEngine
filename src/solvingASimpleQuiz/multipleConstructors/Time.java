package src.solvingASimpleQuiz.multipleConstructors;

/*
Here's a class named Time with three fields: hours, minutes and seconds.

Add three constructors to the class:

The first one takes only hours and initializes this field;
The second one takes hours and minutes and initializes the corresponding fields;
The third one takes hours, minutes and seconds and initializes all fields.
Do not make the fields and constructors private.
 */
public class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(int hours) {
        this.hours = hours;
    }

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
}
