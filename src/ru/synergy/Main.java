package ru.synergy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
      /*  Object o = new Scanner(System.in); // Object Это класс всех классов который может преобразовываться в любой класс
        //((Scanner) o).nextInt();//Преобразование объекта класса Object в класс Integer
        Scanner scanner = null; // Инициализация сканера
        System.out.println(o instanceof Scanner); // Проверка является ли Object сканером
        if(o instanceof Scanner){scanner = (Scanner) o;} // Проверка на то что Object является сканером и если равно истине
        //то Object будет равен сканеру
        if(scanner != null){
            scanner.nextInt();
        }

        //((String) o).length(); Выдает ошибку то что Object  является сканером и не может являтся строкой
        Object o1 = new String();
        Object o2 = new Integer(1);*/


        Object[] objects = {10,"Hello",3.14}; //Массив с автоупаковкой
        for (Object o : objects){ // Взятие элементов массива
            if (o instanceof  String){ // Проверка является ли элемента массива типом String
                String s = (String) o; // Преобразование Object в строку
                System.out.println(s);
            }
        }


    }
}
