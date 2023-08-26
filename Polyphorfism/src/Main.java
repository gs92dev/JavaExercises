import Polymorphins.Polymorphism;
import Polymorphins.SBI;
import Student.Student;

public class Main {
    public static void main(String[] args) {
    Polymorphism Bank =  new SBI();
        Bank.getRateOfInterest();
        Student guilherme = new Student(1,"Guilherme","Cruzeiro do Sul","150 N something");
        System.out.println(guilherme.getStudentName());
    }

}
