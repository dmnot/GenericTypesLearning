package ru.synergy;

import java.util.ArrayList;
import java.util.HashMap;
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
        //--------------------------------------------------------------------------------------------

        Object[] objects = {10,"Hello",3.14}; //Массив с автоупаковкой
        for (Object o : objects){ // Взятие элементов массива
            if (o instanceof  String){ // Проверка является ли элемента массива типом String
                String s = (String) o; // Преобразование Object в строку
                System.out.println(s);
            }
        }
        //--------------------------------------------------------------------------------------------------------------
        //Создание ArrayList
        ArrayList<Integer> numbers = new ArrayList(); //  По умолчанию  принимает Object но так как  указан Integer список
        // принимает только Integer
        for(int i =0;i<10;i++){ // Добавление элементов в список
            numbers.add(i*10);
           // numbers.add(10.4f); // Ошибка  о том что суммировать этот элемент нельзя так как сумма чисел доступна для тех чисел у которых тип Int
            //И невозможно Float преобразовать в Int
        }
        int sum = 0;
        for (Integer o: numbers){ // Взятие элеметов массива для сложения их друг с другом
            sum = sum +  o;
        }
        System.out.println(sum);
        //-----------------------------------------------------------------------------

       //  Объявление GenericType
        // Основной тип<Тип параметр>
        HashMap<Integer,String> map = new HashMap<>(); // Создание словаря принимающее
        // первым число вторым строку
        map.put(7,"Hi");
        map.put(15,"Hello");
        //---------------------------------------------
        ArrayList<String> ListHi = new ArrayList<>(); // Список приветствий
        ListHi.add("Hi");
        ListHi.add("Привет");
        //---------------------------------------------
        ArrayList<String> ListBye = new ArrayList<>(); // Список прощаний
        ListBye.add("Bye");
        ListBye.add("Пока");
        ArrayList<ArrayList<String>> list = new ArrayList<>(); // Создание списка содержащего списки
        list.add(ListHi);
        list.add(ListBye);
        for (ArrayList<String> spisok : list ){ // Взятие списков внутри списка
            for (String s  : spisok){ // Взятие всех приветсвий и прощаний из двух списков
                System.out.println(s);
            }
        }
    }
}
/*
   То что делаем мы в коде                            ||    То во что преобразует компилятор
* ArrayList<Integer> list = new ArrayList<Integer>();   ArrayList list = new ArrayList
  list.add(1);                                        || list.add((Integer) 1);
  int x = list.get(0);                                || int x = (Integer) list.get(0);
  list.set(0,10);                                      || list.set(0,(Integer)10);
* */