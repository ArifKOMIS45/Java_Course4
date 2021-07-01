package Encapsulation._01_Student_GetSet;

public class mainStudent {
    public static void main(String[] args) {

        Student student1 = new Student();

        //set Student
        student1.setStudentRoll(3);
        student1.setStudentName("Burak");
        student1.setStudentAge(14);

        //print
        System.out.println("Öğrencinin numarası: " + student1.getStudentRoll());
        System.out.println("Öğrencinin adı " + student1.getStudentName());
        System.out.println("Öğrencinin yaşı: " + student1.getStudentAge());

    }
}
