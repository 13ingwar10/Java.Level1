public class Employee {

    String fio;
    String position;
    String mail;
    String telNumber;
    int salary;
    int age;

    public Employee (String fio, String position, String mail, String telNumber, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.mail = mail;
        this.telNumber = telNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printEmployee (Employee employee) {
        System.out.printf("ФИО: %s, Должность: %s, Почта: %s, Номер телефона: %s, Зарплата: %s, Возраст: %s\n",
                employee.fio, employee.position, employee.mail, employee.telNumber, employee.salary, employee.age);
    }
}
