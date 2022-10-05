public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.teacher=teacher;
        int note=0;
    }
    public void addTeacher(Teacher t){
        if (this.prefix.equals(t.branch)){
            this.teacher=t;
            System.out.println("İşlem Başarılı.");
        }else {
            System.out.println(t.name+"Akedemisyeni Bu Derse Veremez.");
        }
    }
    public void printTeacher(){
        if (this.teacher != null){
            System.out.println(this.name + "dersinin Akademisyeni:" + this.teacher.name);
        }else {
            System.out.println(this.name + "dersine akademisyen olarak atanmıştır.");
        }
    }
}
