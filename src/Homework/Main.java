package Homework;

public class Main {
    public static void main(String[] args) {
        //Задача1
        //Создать класс MaxElementInArray, содержащий метод, который находит максимальный элемент массива и возвращает его:
        //создать класс MaxElementInArray, содержащую имя массива (private int[] ints)
        //Создать конструктор , принимающий массив public MaxElementInArray( int[] ints ){ this.ints = ints;}
        //Написать метод, находящий максимальный элемент массива
        //В классе Main: создать массив целых чисел, cоздать обьект (экземпляр) класса MaxElementInArray для этого массива
        //и вывести на экран значение максимального элемента этого массива

        MaxElementInArray max = new MaxElementInArray(new int[]{9, 8, 7, 6, 5});
        System.out.println("max element is "+max.maxElement());
        System.out.println();


        //Задача2
        //Создать класс Employee , содержащий следующие поля и методы:
        //поле имя,
        //поле зарплата,
        //поле количество рабочих часов в день,
        //конструктор
        //метод addSalary(), добавляющий 10 евро к зарплате если зарплата сотрудника меньше 500
        //метод addForWork(), добавляющий 5 евро к зарплате сотрудника если количество рабочих часов в день больше 6.
        //Создать несколько экземпляров класса с различными параметрами и вывести на экран результат работы методов
        Employee edgar = new Employee("Edgar",1000,6);
        System.out.println("Employee's name is :"+edgar.getName());
        System.out.println("salary is: "+edgar.getSalary());
        System.out.println("employee working hours: "+edgar.getDayWorkingHours());
        System.out.println();
        edgar.setSalary(400);
        edgar.setDayWorkingHours(8);
        System.out.println("now salary is: "+edgar.getSalary());
        System.out.println("now employee working hours: "+edgar.getDayWorkingHours());
        System.out.println("with method addSalary: "+edgar.addSalary());    //410     salary < 500
        System.out.println("with method addForWork: "+edgar.addForWork());   //415     working hours > 6
    }
}
