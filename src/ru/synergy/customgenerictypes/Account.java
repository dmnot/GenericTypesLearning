package ru.synergy.customgenerictypes;

public class Account implements Accountable<String> { // Объявление класса с типом переменной который принимает класс
    //Объявление переменной
    private String id; // Принимает тот тип переменной который указан в главном файле при объявлении объекта класса
    private int sum;

    public Account(String id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
