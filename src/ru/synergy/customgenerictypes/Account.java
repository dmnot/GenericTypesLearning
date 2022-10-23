package ru.synergy.customgenerictypes;

public class Account<T> { // Объявление класса с типом переменной который принимает класс
    //Объявление переменной
    private T id; // Принимает тот тип переменной который указан в главном файле при объявлении объекта класса
    private int sum;

    public Account(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
