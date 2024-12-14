import java.util.ArrayList;
import java.util.List;

public class Main extends Object {
    public static void main(String[] args) { //точка входа
        Student student1 = new Student("Bob", "Smith");
        Student student2 = new Student("John", "Smith");
        Teacher teacher1 = new Teacher("Robert", "Smith", new ArrayList<>());
        Teacher teacher2 = new Teacher("Balls", "Smith", new ArrayList<>());

        teacher1.addCourse("Math");
        teacher1.addCourse("Computer science");

        student1.setTutor(teacher1); //метод для указания нового препода
        student1.setTutor(teacher2, teacher1); //метод для переназначения препода, если здесь написать одного препода - будет ошибка

        System.out.println(teacher1);
        System.out.println(student1);

        List<People> peopleList = new ArrayList<>();
        peopleList.add(student1);
        peopleList.add(student2);
        peopleList.add(teacher1);
        peopleList.add(teacher2);

        for (People p:peopleList){
            if (p instanceof Student){
                student2.setTutor(teacher1);
            }
            System.out.println(p);
        }
    }
}