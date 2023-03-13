package static_method;

public class Student {
    private int roolNo;
    private String name;
    private static String colege = "BBDIT";
    Student(int r, String n){
        roolNo = r;
        name = n ;
    }
    static void chage(){
        colege = "NGUYEN MINH QUAN";
    }
    void display(){
        System.out.println(roolNo +" "+ name +" "+ colege);
    }
}
