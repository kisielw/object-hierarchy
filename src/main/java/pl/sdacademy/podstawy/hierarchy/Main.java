package pl.sdacademy.podstawy.hierarchy;

public class Main {
    public static void main(String[] args) {
        Integer value1 = 10;
        Double value2 = 5.5;
        String value3 = "Ala ma kota";

        Number number = value2;
        Double doubleValue = null;

        if (number instanceof Double){
            doubleValue = (Double) number;
        }

        Double value4 = 5.5;
        double value5 = 5.5;

        boolean test1 = (value2 == number);
        boolean test2 = (value2 == doubleValue);
        boolean test3 = (value2 == value4);
        boolean test4 = (value2 == value5);
        boolean test5 = (value2.equals(number));
        boolean test6 = (value2.equals(doubleValue));
        boolean test7 = (value2.equals(value4));
        boolean test8 = (value2.equals(value5));

    }
}
