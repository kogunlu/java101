package MaasHesaplama;

public class Employee {

    String name;
    int salary;
    int workHoursWeek;
    int hireYear;

    Employee (String name, int salary, int workHoursWeek, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHoursWeek = workHoursWeek;
        this.hireYear = hireYear;
    }

    double tax(){

        if(salary >= 1000){
            return salary * 0.03;
        }else {
            return 0;
        }

    }

    double bonus(){
        if (workHoursWeek > 40){
            int totalBonus = ( workHoursWeek - 40 ) * 30;
            return totalBonus;
        }else
            return 0;
    }

    double raiseSalary (){
        double raise = this.salary;

        if((2021 - hireYear) < 10 && ( 2021 - hireYear) >= 1){
            return raise * 0.05;

        }else if((2021 - hireYear) > 9 && (2021- hireYear) < 20){
            return raise * 0.1;

        }else if ((2021- hireYear) >= 20){
            return raise * 0.15;

        }else if (2021 - hireYear == 0){
            System.out.println("Çalışan 1. yılı dolmadan zam alamaz.");

        }else {
            System.out.println("Hata! Geçersiz yıl girildi.");
        }
        return 0;
    }

    void toMyString(){
        System.out.println("=======Çalışan Bilgisi======");
        System.out.println("Adı: " + name);
        System.out.println("Maaşı: " + salary);
        System.out.println("Çalışma saati: " + workHoursWeek);
        System.out.println("Başlangıç yılı: " + hireYear);
        System.out.println("Vergi: " + tax()+ " TL ");
        System.out.println("Bonus: " + bonus()+ " TL ");
        System.out.println("Maaş artışı: " + raiseSalary()+ " TL ");
        System.out.println("Vergi ve bonuslar ile maaş: " + (this.salary + bonus() - tax()) + " TL ");
        System.out.println("Toplam maaş: "+ (this.salary + raiseSalary()) + " TL") ;




    }



}
