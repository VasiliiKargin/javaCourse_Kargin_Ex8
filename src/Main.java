public class Main {
    public static void main(String[] args) {
        Client client = new Client("Каргин Василий Сергеевич", 29,5,500000.62f);
        Employee employee = new Employee("Семенов Семен Семенович", 45, 15,"Директор");

        client.printable();
        employee.printable();
    }
}
