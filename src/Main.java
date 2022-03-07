import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Каргин Василий Сергеевич", 29,5, new BigDecimal("500000.65"), Season.Autumn);
        Employee employee = new Employee("Семенов Семен Семенович", 45, 15,"Директор",Season.Spring);

        client.printable();
        employee.printable();
        client.execute();
        employee.execute();

    }
}
