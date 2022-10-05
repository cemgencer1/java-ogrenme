public class Calisan {
    String name;
    int salary;
    int workHours;
    int hireYear;
    double vergi;
    double zam;
    int fazla;
    double maas;


    Calisan(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void bilgi() {
        System.out.println("Ad Soyad :" + this.name);
        System.out.println("Maaş :" + this.salary);
        System.out.println("Çalışma Saati :" + workHours);
    }

    void calisilan() {
        bilgi();
        tax();
        int zaman = 2022 - hireYear;
        System.out.println("Çalışılan Yıl :" + zaman);
        if (zaman < 10) {
            zam = (this.salary * 5) / 100.0;
        } else if (zaman < 20) {
            zam = (this.salary * 10) / 100.0;
        } else {
            zam = (this.salary * 15) / 100.0;
        }
        System.out.println("Yapılacak Zam :" + zam);
        fazla();
        toplam();
    }

    void tax() {
        if (this.salary > 1000) {
            vergi = (this.salary * 3) / 100.0;
            System.out.println("Gelir Vergisi :" + vergi);
        }
    }

    void fazla() {
        if (this.workHours > 40) {
            fazla= (this.workHours - 40) * 30;
            System.out.println("Fazla Mesai ücreti :" + fazla);
        }else{
            System.out.println("Fazla Mesai Yapılmamıştır.");
        }
    }

    void toplam(){
        maas =salary-vergi+fazla+zam;
        System.out.println("Vergiler ve Fazla Mesai Dahil Alınacak Ücret :" + maas);
    }
}


