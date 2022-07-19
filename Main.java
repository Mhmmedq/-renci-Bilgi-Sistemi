public class Main {
    public static void main(String[] args) {


      Teacher t1=new Teacher("ali ", "MTK");
      Teacher t2=new Teacher("ahmet ", "FZK");
      Teacher t3=new Teacher("halit ", "KMA");


      Course c1=new Course("matimatik","101", "MTK" );
      Course c2=new Course("fizik","102", "FZK" );
      Course c3=new Course("kimya","103", "KMA" );

      c1.addteacher(t1);
      c2.addteacher(t2);
      c3.addteacher(t3);

      Student s1=new Student("cemil","123","5",c1,c2,c3);
      Student s2=new Student("kamil","3243","9",c1,c2,c3);
      Student s3=new Student("semir","4343","8",c1,c2,c3);

      s1.addBulkExamsozNote(11,85,49);
      s1.addBulkExamsinavNote(21,60,88);
      s1.stuname();
      s1.notprint();

      s2.addBulkExamsozNote(99,54,78);
      s2.addBulkExamsinavNote(88,65,11111);
      s2.stuname();
      s2.notprint();

      s3.addBulkExamsozNote(84,90,48);
      s3.addBulkExamsinavNote(67,94,111111);
      s3.stuname();
      s3.notprint();


      /// s2.notprint();
     // s3.notprint();


    }
}

