public class Employee extends Person implements Printable, SeasonHandler {
    public int timeWork;
    public String position;
    public Season seasonWork;

    Employee(String name, int age, int timeWork, String position, Season seasonWork) {
        super(name, age);
        this.timeWork=timeWork;
        this.position=position;
        this.seasonWork=seasonWork;
    }

    @Override
    public void printable() {
        System.out.println("ФИО Сотрудника: "+name +"\nВозраст сотрудника: "+ age +"\nСтаж работы: " + timeWork + "\nДолжность: "+ position);
    }

    @Override
    public void execute() {
        System.out.println("Сейчас " + seasonWork.getNameSeason()+ ", Цвет сезона: " + seasonWork.getColor());
    }
}
