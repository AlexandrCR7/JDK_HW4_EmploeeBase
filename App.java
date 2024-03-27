package Hw4_ContactList;

/*
Создать справочник сотрудников
Необходимо:
Создать класс справочник сотрудников, который содержит внутри
коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
Табельный номер
Номер телефона
Имя
Стаж
Добавить метод, который ищет сотрудника по стажу (может быть список)
Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
Добавить метод, который ищет сотрудника по табельному номеру
Добавить метод добавления нового сотрудника в справочник
 */
public class App {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();

        Employee employee1 = new Employee("Alex", 1, 11111, 7);
        Employee employee2 = new Employee("Marina", 2, 22222, 3);
        Employee employee3 = new Employee("Maksim", 3, 33333, 6);
        Employee employee4 = new Employee("Olga", 4, 44444, 9);

        employeeService.addInList(employee1);
        employeeService.addInList(employee2);
        employeeService.addInList(employee3);
        employeeService.addInList(employee4);

        employeeService.searchExperience(9);
        employeeService.searchName("Alex");
        employeeService.searchTabel(1);





    }
}
