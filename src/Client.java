public class Client extends Person implements  Printable, SeasonHandler{
    public int timeOnFirstPay;
    public float sumPay;


    Client(String name, int age,int timeOnFirstPay, float sumPay) {
        super(name, age);
        this.timeOnFirstPay=timeOnFirstPay;
        this.sumPay=sumPay;
    }

    @Override
    public void printable() {
        System.out.println("ФИО Клиента: "+name +"\nВозраст клиента: "+ age +"\nЛет является Клиентом: " + timeOnFirstPay + "\nОбщая сумма покупок(рублей): "+ sumPay);

    }

    @Override
    public void execute() {
       // System.out.println(Season.getColor());
    }
}
