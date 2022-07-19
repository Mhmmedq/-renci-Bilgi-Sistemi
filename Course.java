public class Course {
    String name;
    String code;
    Teacher cogr;
    String prfx;
    double soznot =0;
    double sinavnot =0;
    double couravg;



    /*void couravrg(){
        double crv=(sinavnot)*0.80 + (soznot)*0.20;
        System.out.println(crv);
    }*/


    Course(String name , String code , String prfx){
        this.code=code;
        this.name=name;
        this.prfx=prfx;

    }
    void addteacher(Teacher cogr){
        if (cogr.branch.equals(prfx)) {
            this.cogr = cogr;
        }else {
            System.out.println("atama yapilamiyor !!!!!!");
        }
    }
}
