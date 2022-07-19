public class Student {
    String name;
    String stuNo;
    String classes;
    Course c1;
    Course c2;
    Course c3;
    double avrg;
    boolean ispass;
    Student(String name, String stuNo,String classes , Course c1 ,Course c2 ,Course c3){
        this.name=name;
        this.classes= classes;
        this.avrg=0.0;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.ispass= false;
    }
    void stuname(){
        System.out.println(name+"  "+classes+".sinif");
    }
    void addBulkExamsozNote(double note1, double note2, double note3){
        c1.soznot=note1;
        c2.soznot=note2;
        c3.soznot=note3;
    }
    void addBulkExamsinavNote(double note1, double note2, double note3){
        this.c1.sinavnot=note1;
        this.c2.sinavnot=note2;
        this.c3.sinavnot=note3;
    }


    void notprint() {
        this.c1.couravg=(this.c1.sinavnot)*0.80 + (this.c1.soznot)*0.20;
        System.out.println(c1.name + ":\n sozlu not: " + this.c1.soznot+"\n sinav notu: "+this.c1.sinavnot +"\n ortalama:  "+ this.c1.couravg);
        System.out.println("-----");
        this.c2.couravg=(this.c2.sinavnot)*0.80 + (this.c2.soznot)*0.20;
        System.out.println(c2.name + ":\n sozlu not: " + this.c2.soznot+"\n sinav notu: "+this.c2.sinavnot +"\n ortalama:  "+ this.c2.couravg);
        System.out.println("---------------");
        this.c3.couravg=(this.c3.sinavnot)*0.80 + (this.c3.soznot)*0.20;
        System.out.println(c3.name + ":\n sozlu not: " + this.c3.soznot+"\n sinav notu: "+this.c3.sinavnot +"\n ortalama:  "+ this.c3.couravg);
        System.out.println("------------------");
        System.out.println("============================");
        //System.out.println(c2.name + ": " + c2.not);
       // System.out.println(c3.name + ": " + c3.not);

    }
}