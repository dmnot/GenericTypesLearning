package ru.synergy.customgenerictypes;

public class Main {
    public static void main(String[] args) {

        Account<Integer> acc1 = new Account(1,5000); //Принятие только Int Значений а так любой тип по необходимости
        System.out.println(acc1.getId());

        Account<String> acc2 = new Account("sid3123412",5000); //Принятие только Строковых значений а так любой тип по необходимости
        // Account<String> Имя класса <Тип переменной который будет принимать класс>
        System.out.println(acc2.getId());

        int a = acc1.getId() + 10; // Опасное преобразование типов
        System.out.println(a);

        Account<Integer> acc3 = new Account(1300000,100,"Something");
    }
}
