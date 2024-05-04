package src.solvingASimpleQuiz.multipleConstructors;

/*
Below is a class named Phone. It has four fields: ownerName, countryCode, cityCode and number.

Add two constructors to the class:

the first one takes ownerName and number and initializes the corresponding fields;
the second one takes ownerName, countryCode, cityCode, number and initializes all fields.
Do not make the fields and constructors private.
 */
public class Phone {
    String ownerName;
    String countryCode;
    String cityCode;
    String number;

    public Phone(String ownerName, String number) {
        this.ownerName = ownerName;
        this.number = number;
    }

    public Phone(String ownerName, String countryCode, String cityCode, String number) {
        this.ownerName = ownerName;
        this.countryCode = countryCode;
        this.cityCode = cityCode;
        this.number = number;
    }
}
