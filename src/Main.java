import java.util.Arrays;


public class Main {


    //Посчитать сумму затрат на зарплаты в месяц.

    public static void printTheSalaryAmount(int salaryCosts) {
        System.out.println("сумму затрат на зарплаты в месяц "+salaryCosts);
    }
    public static int monthlySalaryCosts(Employee[] employees) {

        int salaryCosts = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                salaryCosts += employees[i].getSalary();
            }
        }
        return salaryCosts;
    }
    //Найти сотрудника с минимальной зарплатой
    public static void printMinimumSalary(int minimumSalary ) {
        System.out.println("сотрудника с минимальной зарплатой " + minimumSalary);
    }
    public static int printTheMinimumSalary(Employee[] employees) {
        int minimumSalaryOfAnEmployee = employees[0].getSalary();
        for (int salaryOfEachEmployee = 0; salaryOfEachEmployee < employees.length; salaryOfEachEmployee++) {
            if (employees[salaryOfEachEmployee] != null && minimumSalaryOfAnEmployee > employees[salaryOfEachEmployee].getSalary()) {
                    minimumSalaryOfAnEmployee = employees[salaryOfEachEmployee].getSalary();
                }
            }
        return minimumSalaryOfAnEmployee;
    }
    //Найти сотрудника с максимальной зарплатой.
    public static void  printMaxSalary(int maxSalary ) {
        System.out.println("сотрудника с максимальной зарплатой " +maxSalary);
    }
    public static int printTheMaximumSalary(Employee[] employees) {
        int maximumSalaryOfAnEmployee = employees[0].getSalary();
        for (int salaryOfEachEmployee = 0; salaryOfEachEmployee < employees.length; salaryOfEachEmployee++) {
            if (employees[salaryOfEachEmployee] != null&&maximumSalaryOfAnEmployee < employees[salaryOfEachEmployee].getSalary()) {
                maximumSalaryOfAnEmployee = employees[salaryOfEachEmployee].getSalary();
            }
        }
        return maximumSalaryOfAnEmployee;
    }
    //5. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
    public static void printEmployee3(float averageSalary ) {
        System.out.println("среднее значение зарплат " + averageSalary);
    }
    public static float pintTheAverageValueSalary(Employee [] employees) {
        Employee.count=0;
        float salaryCosts2 = 0f;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                    salaryCosts2 += employees[i].getSalary();
                    Employee.count++;
                }
            }
        return salaryCosts2/Employee.count;
    }
    //6. Получить Ф. И. О. всех сотрудников (вывести в консоль).
    public static void printEmployee4(Employee [] employees) {
        for (int i =0; i <employees.length;i++)
            if(employees[i] != null){
        System.out.println("Получить Ф. И. О. всех сотрудников "+employees[i].getNameEmployee());
    }
    }
    public static void main(String[] args) {
        //1. Создать класс Employee, который содержит информацию о Ф.И.О., отделе и зарплате сотрудника. Отделы для простоты должны быть названы от 1 до 5.
        //2. Добавить статическую переменную-счетчик, которая будет отвечать за id.
        //3. Добавить в класс Employee поле id, которое проставляется из счетчика, а затем счетчик увеличивает свое значение.
        //4. Добавить возможность получать значения полей из Employee (геттеры) для всех полей.
        //5. Добавить возможность устанавливать значения полей отдела и зарплаты (сеттеры).
        //6. По умолчанию все поля должны передавать через конструктор (кроме id) изаполняться в нем (включая id, который нужно получить из счетчика).
        //7. Создать внутри класса с методом main поле типа Employee[10], которое будет выполнять роль «хранилища» для записей о сотрудниках.
        //8. Создать статические методы, которые будут взаимодействовать с массивом ипредоставлять результат:
        LastNameFirstNamePatronymic nameEmployee = new LastNameFirstNamePatronymic("Berdnikov", "Alexandr", "Alexandrovich");
        LastNameFirstNamePatronymic nameEmployee1 = new LastNameFirstNamePatronymic("Mashnin", "Alexandr", "Sergeevich");
        LastNameFirstNamePatronymic nameEmployee2 = new LastNameFirstNamePatronymic("Fateev", "Stepan", "Alexandrovich");
        LastNameFirstNamePatronymic nameEmployee3 = new LastNameFirstNamePatronymic("Ivanov", "Ivan", "Ivanovich");
        LastNameFirstNamePatronymic nameEmployee4 = new LastNameFirstNamePatronymic("Berdnikov", "Stepan", "Ivanovich");
        Employee[] employees = new Employee[10];
        employees[0] = new Employee(Employee.count, nameEmployee, 65000, 1);
        employees[1] = new Employee(Employee.count, nameEmployee1, 103459, 3);
        employees[2] = new Employee(Employee.count, nameEmployee2, 95896, 1);
        employees[3] = new Employee(Employee.count, nameEmployee3, 59656, 1);
        employees[4] = new Employee(Employee.count, nameEmployee4, 26645, 5);
        //Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
        System.out.println(Arrays.toString(employees).replace(",",""));
        //Посчитать сумму затрат на зарплаты в месяц.
        int salaryAll = monthlySalaryCosts(employees);
        printTheSalaryAmount(salaryAll);
        //Найти сотрудника с минимальной зарплатой
        int minimumSalary = printTheMinimumSalary(employees);
        printMinimumSalary(minimumSalary);
        //Найти сотрудника с максимальной зарплатой
        int maximumSalary = printTheMaximumSalary(employees);
        printMaxSalary(maximumSalary);
        //одсчитать среднее значение зарплат
        float averageValue = pintTheAverageValueSalary(employees);
        printEmployee3(averageValue);
        //Получить Ф. И. О. всех сотрудников (вывести в консоль).
        printEmployee4(employees);
    }
}