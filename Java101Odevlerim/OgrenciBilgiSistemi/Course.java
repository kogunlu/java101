package OgrenciBilgiSistemi;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int noteSinav = 0;
    int noteSozlu = 0;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;

       /*  this.noteSinav = 0;
        this.noteSozlu = 0; */
    }
    void addTeacher(Teacher t){
        if (this.prefix.equals(t.branch)){
    this.courseTeacher = t;
            System.out.println("İşlem başarılı.");
            System.out.println(this.prefix + " dersinin öğretim görevlisi: " + t.name);
            System.out.println("-----------");
        }else {
            System.out.println(t.name + " bu dersi veremez.");
        }
    }

    void printTeacher (){
        System.out.println(this.name + " dersinin akademisyeni: " + courseTeacher.name);
    }

}
