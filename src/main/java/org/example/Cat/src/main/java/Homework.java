public class Homework {

    public static void main(String[] args) {

//        Employee worker = new Employee("Примеров Пример Примерович","Worker", "primer@mail.ru", "555-555", 5000, 82);
//        printEmployee(worker);

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иванов Иван Иванович", "Direktor", "IvanovII@gmail.com", "3(742)859-24-20",90000,48);
        employees[1] = new Employee("Аксенова Елена Анатольевна", "Manager", "AksenovaEA@gmail.com", "3(394)531-72-17",60000,36);
        employees[2] = new Employee("Петров Пётр Николаевич", "Worker", "PetrovPN@gmail.com", "3(437)371-31-12",40000,25);
        employees[3] = new Employee("Бердымура Ашот Паша оглы", "Worker", "BerdymuraAP@gmail.com", "3(582)121-11-21",42000,42);
        employees[4] = new Employee("Олесина Олеся Петровна", "Worker", "OlesinasOP@gmail.com", "3(964)682-41-89",39000,35);

        for (int i = 0; i<employees.length; i++) {
            if (employees[i].age>40) {
                System.out.printf("Сотрудник: %s, Должность: %s, Номер телефона: %s\n", employees[i].fio, employees[i].position,employees[i].telNumber);
            }
        }

    }
}
