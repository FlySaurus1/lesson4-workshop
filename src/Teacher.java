import java.util.ArrayList;
import java.util.List;

public class Teacher extends People{ //extends используется для наследования, здесь наследуется класс People

    private List<String> courses;

    public Teacher(String name, String surname, List<String> courses){
        super(name, surname); //конструктор наследования
        this.courses = new ArrayList<>(courses);
    }

    public void addCourse(String course){
        courses.add(course);
    }

    public void removeCourse(String course){
        courses.remove(course);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }
}
