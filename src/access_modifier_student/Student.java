package access_modifier_student;

public class Student {
    private String name = "John";
    public String classes = "CO2";
    public Student(){

    }
    public void setName() {
        this.name = name;
    }

    public void setClasses() {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student: "+ name +"\n" + "class: "+ classes ;
    }
}
