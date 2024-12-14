public class Student extends People{ //extends используется для наследования, здесь наследуется класс People
    private Teacher tutor;

    public Student(String name, String surname){
        super(name, surname); //конструктор наследования
    }

    public void setTutor(Teacher tutor){
        if (this.tutor != null){
            throw new IllegalStateException("Tutor has already been set");
        } else {
            this.tutor = tutor;
        }
    }

    public void setTutor(Teacher newTutor,Teacher previousTutor){
        if (this.tutor == previousTutor){
            this.tutor = newTutor;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", tutor=" + tutor +
                '}';
    }
}
