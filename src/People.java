public abstract class People { //особенность abstract - нельзя создать новый экземпляр через new
    protected String name; //protected позволяет обращаться наследникам к ??
    protected String surname;

    public People(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
}
