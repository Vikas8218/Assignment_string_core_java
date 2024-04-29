package com.coding;

public class Enum_convert_to_String_9 {

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Day day = Day.TUESDAY;
        String dayString = day.name();
        System.out.println("Enum to string: " + dayString);
    }
}
