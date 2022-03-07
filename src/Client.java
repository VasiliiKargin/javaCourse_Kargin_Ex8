import java.math.BigDecimal;

public class Client extends Person implements  Printable, SeasonHandler{
    public int timeOnFirstPay;
    public BigDecimal sumPay;
    public Season seasonPay;



    Client(String name, int age,int timeOnFirstPay, BigDecimal sumPay, Season seasonPay) {
        super(name, age);
        this.timeOnFirstPay=timeOnFirstPay;
        this.sumPay=sumPay;
        this.seasonPay=seasonPay;
    }

    @Override
    public void printable() {
        System.out.println("ФИО Клиента: "+name +"\nВозраст клиента: "+ age +"\nЛет является Клиентом: " + timeOnFirstPay + "\nОбщая сумма покупок(рублей): "+ sumPay);

    }

    @Override
    public void execute() {
        System.out.println("Сейчас " + seasonPay.getNameSeason()+ ", Цвет сезона: " + seasonPay.getColor());

    }
}
