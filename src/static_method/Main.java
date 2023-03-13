package static_method;

public class Main {
    public static void main(String[] args) {
        Student.chage();
        Student st1 = new Student(1,"quan la nhan vien cua");
        Student st2 = new Student(2,"khoa la nhan vien cua");
        Student st3 = new Student(3,"tan la nhan vien cua");
        st1.display();
        st2.display();
        st3.display();
    }

}
