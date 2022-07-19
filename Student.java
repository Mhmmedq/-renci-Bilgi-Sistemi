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
        System.out.println("----->>>>>>"+name+"  "+classes+".sinif");
    }
    void addBulkExamsozNote(int note1, int note2, int note3){
        if (note1<100 && note1>0){
            this.c1.soznot=note1;
        }else note1=0;
        if (note2<100 && note2>0){
            this.c2.soznot=note2;;
        }else  note2=0;
        if (note3<100 && note3>0){
            this.c3.soznot=note3;;
        }else note3=0;
    }
    void addBulkExamsinavNote(int note4, int note5, int note6){
        if (note4<100 && note4>0) {
            this.c1.sinavnot=note4;
        }else note4=0;
        if (note5<100 && note5>0) {
            this.c2.sinavnot=note5;
        }else note5=0;
        int i = 100;
        if (note6 >=0 && note6 <=100) {
            this.c3.sinavnot=note6;
        }else note6=0;
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
        avrg=(this.c2.couravg+this.c1.couravg+this.c3.couravg)/3.0;
        if (avrg>55){
            System.out.println("**** tebrikler gectiniz **** ortalamaniz: "+avrg);
        }else
            System.out.println("**** sinifta kaldiniz **** ortalamaniz: "+avrg);



        System.out.println("============================");
    }
}