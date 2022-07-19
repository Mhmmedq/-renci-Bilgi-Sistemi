public class Teacher {
    String name;
    String branch;

    Teacher(String name, String branch) {
        this.name=name;
        this.branch=branch;
    }

    void orgprint(){
        System.out.println("ogretmenin adi: "+name+"   branch: "+branch);

    }

}
