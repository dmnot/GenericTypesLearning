package ru.synergy.genericmethoods;

public class Printer {
    // Объявление метода который печатает тот тп который указан при использовании метода
    public  <T> void print(T[] items){
        for (T item : items){
            System.out.println(item);
        }
    }
}
