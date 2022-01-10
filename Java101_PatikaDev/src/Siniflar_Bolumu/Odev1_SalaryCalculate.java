package Siniflar_Bolumu;

//TODO Maaş hesaplayıcı

class Employee{
    String name;
    float salary;
    int workHours;
    int hireYear;

    public Employee(String name, float salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    float tax(){
        float taxAmount=0;
        if(salary>1000){
            taxAmount= salary* 0.03f;
           // salary-=taxAmount;
        }
        return taxAmount;
    }
    float bonus(){
        int bonusAmount=0;
        if(workHours>40){
            bonusAmount=(workHours-40)*30;
           // salary+=bonusAmount;
        }
        return bonusAmount;
    }
    float raiseSalary(){
        int yearDifference=2021-hireYear;
        float raiseAmount=0;
        if(yearDifference<10){
            raiseAmount=salary*0.05f;
        }else if(yearDifference>9 && yearDifference<20){
            raiseAmount=salary*0.10f;
        }else if(yearDifference>19){
            raiseAmount=salary*0.15f;
        }
        return raiseAmount;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "  \nAdı='" + name + '\'' +
                ", \nMaaşı=" + salary +
                ", \nÇalışma saati=" + workHours +
                ", \nBaşlangıç yılı=" + hireYear +
                ", \nVergi=" + tax() +
                ", \nBonus=" + bonus() +
                ", \nMaaş artışı=" + raiseSalary() +
                ", \nVergi ve Bonuslar ile birlikte maaş =" + (salary+bonus()-tax()) +
                ", \nToplam maaş =" + (salary+raiseSalary()+bonus()-tax()) +
                '}';
    }
}

public class Odev1_SalaryCalculate {
    public static void main(String[] args) {
        Employee employee=new Employee("kemal",2000,45,1985);
        System.out.println(employee);
        int[][] dizi=new int[52][];
    }
}
