package OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {

    Course mat = new Course("Matematik", "MAT", "MAT101");
    Course fiz = new Course("Fizik", "FIZ", "FIZ101");
    Course kim = new Course("Kimya", "KIM", "KIM101");

    Teacher t1 = new Teacher("Mahmut Hoca", "555", "MAT101");
    Teacher t2 = new Teacher("Hakan Hoca", "556", "FIZ101");
    Teacher t3 = new Teacher("Betül Hoca", "557", "KIM101");

    mat.addTeacher(t1);
    fiz.addTeacher(t2);
    kim.addTeacher(t3);

    Student s1 = new Student("Kuday Öğünlü", "2014434046", fiz, mat, kim);
       s1.addBulkExamNoteSozlu(80,90, 100);
       s1.addBulkExamNoteSinav(100, 100, 60);
        s1.printNote();
        s1.isPass();

    Student s2 = new Student("Mert Girgin", "2014434044", fiz,kim,mat);
        s2.addBulkExamNoteSinav(75,65, 50);
        s2.addBulkExamNoteSozlu(80,30, 100);
        s2.printNote();
        s2.isPass();

    Student s3 = new Student("Sermin Çağlar", "2013434123", fiz, mat, kim);
        s3.addBulkExamNoteSinav(70,30,45);
        s3.addBulkExamNoteSozlu(80, 90,60);
        s3.printNote();
        s3.isPass();

    }
}
