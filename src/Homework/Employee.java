package Homework;

public class Employee {

    private String name;
    private int salary;
    private int dayWorkingHours;

    public Employee(String name, int salary, int dayWorkingHours) {
        this.name = name;
        this.salary = salary;
        this.dayWorkingHours = dayWorkingHours;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getDayWorkingHours() {
        return dayWorkingHours;
    }

    public void setSalary(int salary){
        this.salary=salary;
    }
    public void setDayWorkingHours(int dayWorkingHours){
        this.dayWorkingHours=dayWorkingHours;
    }

    //добавляющий 10 евро к зарплате если зарплата сотрудника меньше 500
    public int addSalary(){
        if(salary<500 ){
            this.salary= (salary+10);
        }
        return salary;
    }
    //добавляющий 5 евро к зарплате сотрудника если количество рабочих часов в день больше 6.
    public int addForWork(){
        if(dayWorkingHours>6){
            this.salary= (salary+5);
        }
        return salary;
    }
}
