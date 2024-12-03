package Task2;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        View view = new View();
        Controller controller = new Controller(student, view);
        controller.setStudentName("Syed Ghazi Raza");
        controller.setStudentRollNo("FA22-BSE-082");
        controller.setStudentCourse("Software Enjineering");

        controller.updateView();

        controller.setStudentCourse("Software Design and Architecture");

        controller.updateView();
    }
}
