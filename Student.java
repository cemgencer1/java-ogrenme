public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;
    int calcAvarage;

    Student (String name,int classes, String stuNo, Course mat, Course fizik, Course kimya){
        this.name=name;
        this.classes=classes;
        this.stuNo=stuNo;
        this.mat=mat;
        this.fizik=fizik;
        this.kimya=kimya;
        calcAvarage=0;
        this.isPass=false;
        boolean isCheckPass=false;
    }
    public void addBulkExamNote(int mat, int fizik, int kimya){
        if (mat >=0 && mat <= 100){
            this.mat.note=mat;
        }
        if (fizik >=0 && fizik <= 100){
            this.fizik.note=fizik;
        }
        if (kimya >=0 && kimya <= 100){
            this.kimya.note=kimya;
        }
    }
    public void isPass(){
        if (this.mat.note==0 || this.fizik.note==0 || this.kimya.note==0){
            System.out.println("notlar tam olarak girilmemiş");
        }else{
            System.out.println("Ortalama :" + this.avarage);
        if (this.isPass){
            System.out.println("sınıfı geçti");
        }else{
            System.out.println("sınıfta kaldı");
        }
    }
        void calcAvarage(){
            this.avarage=(this.fizik.note+this.mat.note+this.kimya.note)/3.0;
        }

        void printNote(){
            System.out.println("==============================");
            System.out.println("Öğrenci:"+this.name);
            System.out.println("Matematik Notu :"+this.mat.note );
            System.out.println("Fizik Notu :"+ this.fizik.note);
            System.out.println("Kimya Notu :" + this.kimya.note);
        }
}
