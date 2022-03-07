public class Employee extends Person implements Printable, SeasonHandler {
    public int timeWork;
    public String position;

    Employee(String name, int age, int timeWork, String position) {
        super(name, age);
        this.timeWork=timeWork;
        this.position=position;
    }

    @Override
    public void printable() {
        System.out.println("ФИО Сотрудника: "+name +"\nВозраст сотрудника: "+ age +"\nСтаж работы: " + timeWork + "\nДолжность: "+ position);
    }

    @Override
    public void execute() {

    }
}
