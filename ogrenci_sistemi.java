public class ogrenci_sistemi {
    public static void main(String[]args){
        Course mat =new Course("Matematik","MAT101","MAT");
        Course fizik = new Course("Fizik","FZK101","FZK");
        Course kimya = new Course("Kimya","KMY101","KMY");

        Teacher t1=new Teacher("Mahmut Hoca","345643634","MAT");
        Teacher t2=new Teacher("Fatma","32452345","FZK");
        Teacher t3=new Teacher("Ali","324524","KMY");


                mat.addTeacher(t1);
                fizik.addTeacher(t2);
                kimya.addTeacher(t3);

                Student s1=new Student("Şaban",4,"34324",mat,fizik,kimya);
                s1.addBulkExamNote(50,70,40);
                s1.isPass();

                Student s2=new Student("Koray",4,"3423",mat,fizik,kimya);
                s2.addBulkExamNote(40,80,90);
                s2.isPass();

                Student s3=new Student("Başak",4,"76776",mat,fizik,kimya);
                s3.addBulkExamNote(78,5,2);
                s3.isPass();
    }
}
