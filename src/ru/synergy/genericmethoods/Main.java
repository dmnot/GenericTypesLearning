package ru.synergy.genericmethoods;

public class Main {
    public static void main(String[] args) {
            //------------------------------------------------
            Printer printer = new Printer();
            //------------------------------------------------

            String[] strings = {"Tom","Alice","Sam","Kate","Bob","Helen"};
            Integer[] integers = {23,1,3455,72312,45432};

            //------------------------------------------------

            printer.<String>print(strings); // Выводит только список со строками
            printer.<Integer>print(integers); // выводит только список с числами
    }
}
