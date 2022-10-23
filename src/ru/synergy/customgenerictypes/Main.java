package ru.synergy.customgenerictypes;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account(1,5000);
        System.out.println(acc1.getId());

        Account acc2 = new Account("sid3123412",5000);
        System.out.println(acc2.getId());

        int a = ((Integer) acc2.getId()) + 10;
        System.out.println(a);
    }
}
