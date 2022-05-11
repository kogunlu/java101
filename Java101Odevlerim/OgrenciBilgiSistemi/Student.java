package OgrenciBilgiSistemi;

public class Student {
    String name, stuNo;
    int classes;
    double avarage;
    boolean isPass;
    Course mat;
    Course kimya;
    Course fizik;

    Student(String name, String stuNo, Course fizik, Course mat, Course kimya){
        this.name = name;
        this.stuNo = stuNo;
        this.mat = mat;
        this.kimya = kimya;
        this.fizik = fizik;
        this.isPass = false;
        calculateLessons();
    }


   void addBulkExamNoteSinav(int mat, int fizik, int kimya){

        if(mat >= 0 && mat <= 100) {
            this.mat.noteSinav = mat;
        }

        if(kimya >= 0 && kimya <=100){
            this.kimya.noteSinav = kimya;
        }

        if (fizik >= 0 && fizik <= 100){
            this.fizik.noteSinav = fizik;
        }
    }

    void addBulkExamNoteSozlu (int mat, int fizik, int kimya){

        if(mat >= 0 && mat <= 100) {
            this.mat.noteSozlu = mat;
        }

        if(kimya >= 0 && kimya <=100){
            this.kimya.noteSozlu = kimya;
        }

        if (fizik >= 0 && fizik <= 100){
            this.fizik.noteSozlu = fizik;
        }
    }

    void calculateLessons (){
        double matOrtalama = (this.mat.noteSinav * 0.8) + (this.mat.noteSozlu * 0.2);
        double fizikOrtalama = (this.fizik.noteSinav * 0.8) + (this.fizik.noteSozlu * 0.2);
        double kimyaOrtalama = (this.kimya.noteSinav * 0.8) + (this.kimya.noteSozlu * 0.2);

        this.avarage = ( matOrtalama + kimyaOrtalama + fizikOrtalama ) / 3.0 ;
    }


    void isPass(){
        if (this.avarage >= 55){
            System.out.println("Ortalama: " + this.avarage);
            System.out.println("Başarılı.");
            System.out.println("----------");
        }else {
            System.out.println("Ortalama: " + this.avarage);
            System.out.println("Başarısız.");
        }
    }

    void printNote(){
        System.out.println("=======");
        System.out.println("Öğrenci: " + this.name);
        System.out.println("Fizik Sınav notu: " + this.fizik.noteSinav);
        System.out.println("Fizik Sözlü notu: " + this.fizik.noteSozlu);
        System.out.println("-----");
        System.out.println("Kimya Sınav notu: " + this.kimya.noteSinav);
        System.out.println("Kimya Sözlü notu: " + this.kimya.noteSozlu);
        System.out.println("-----");
        System.out.println("Matematik Sınav notu: " + this.mat.noteSinav);
        System.out.println("Matematik Sözlü notu: " + this.mat.noteSozlu);

    }

}
