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
        int count = 0;
        float salaryCosts2 = 0f;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                    salaryCosts2 += employees[i].getSalary();
                    count++;
                }
            }
        return salaryCosts2/count;
    }

    //6. Получить Ф. И. О. всех сотрудников (вывести в консоль).
    public static void printEmployee4(Employee [] employees) {
        for (int i = 0; i < employees.length; i++)
            if (employees[i] != null) {
                System.out.println("Получить Ф. И. О. всех сотрудников " + employees[i].getNameEmployee());
            }
    }
    //Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников на величину аргумента в %).
    public static void index(Employee[] employees) {
        int indexing = 13;
        int salaryIndexing = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                salaryIndexing = employees[i].getSalary() / 100 * indexing;
                salaryIndexing = employees[i].getSalary() + salaryIndexing;
                employees[i].setSalary(salaryIndexing);
                System.out.println("Проиндексировать зарплату " + employees[i].getSalary());
            }
        }
    }
    // 2. Получить в качестве параметра номер отдела (1–5) и найти (всего 6 методов):
     //       1. Сотрудника с минимальной зарплатой.
    public static void printMinimumSalaryDepartment(int minimumSalary ) {
        System.out.println("сотрудника с минимальной зарплатой в отделе " + minimumSalary);
    }
    public static int  printTheMinimumSalaryDepartment(Employee[] employees,int department) {
        int minimumSalaryOfAnDepartment = employees[0].getSalary();
        for (int salaryOfEachEmployee = 0; salaryOfEachEmployee < employees.length; salaryOfEachEmployee++) {
            if (employees[salaryOfEachEmployee] != null) {
                if (minimumSalaryOfAnDepartment > employees[salaryOfEachEmployee].getSalary()&&department == employees[salaryOfEachEmployee].getDepartment()) {
                    minimumSalaryOfAnDepartment = employees[salaryOfEachEmployee].getSalary();
                }else if (department == employees[salaryOfEachEmployee].getDepartment()) {
                    minimumSalaryOfAnDepartment = employees[salaryOfEachEmployee].getSalary();
                    return  minimumSalaryOfAnDepartment;
                }
            }
        }
        return minimumSalaryOfAnDepartment;
    }
    //2. Сотрудника с максимальной зарплатой.
    public static void printMaxSalaryDepartment(int MaxSalary ) {
        System.out.println("сотрудника с максимальной зарплатой в отделе " + MaxSalary);
    }
    public static int printTheMaximumSalaryDepartment(Employee[] employees , int department) {
        int maximumSalaryOfAnDepartment = employees[0].getSalary();
        for (int salaryOfEachEmployee = 0; salaryOfEachEmployee < employees.length; salaryOfEachEmployee++) {
            if (employees[salaryOfEachEmployee] != null) {
                if (maximumSalaryOfAnDepartment < employees[salaryOfEachEmployee].getSalary()&&department == employees[salaryOfEachEmployee].getDepartment()) {
                    maximumSalaryOfAnDepartment = employees[salaryOfEachEmployee].getSalary();
                }
            }
        }
        return maximumSalaryOfAnDepartment;
    }
    //Сумму затрат на зарплату по отделу.
    public static void printDepartmentSalaryCosts(int salaryCosts ) {
        System.out.println("Сумму затрат на зарплату по отделу " + salaryCosts);
    }
    public static int departmentSalaryCosts(Employee[] employees,int department) {
        int salaryCosts = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (department == employees[i].getDepartment()) {
                    salaryCosts += employees[i].getSalary();
                }
            }
        }
        return salaryCosts;
    }
    //Среднюю зарплату по отделу (учесть, что количество людей в отделе отличается от employees.length).
    public static void printAverageSalaryOfTheDepartment(int averageSalary ) {
        System.out.println("Среднюю зарплату по отделу " + averageSalary);
    }
    public static int averageSalaryOfTheDepartment(Employee [] employees, int department) {
       int count = 0;
        int salaryCosts = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null&&department == employees[i].getDepartment()) {
                    salaryCosts += employees[i].getSalary();
                   count++;
                }
            }
        return salaryCosts/count;
    }
    //Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра.
    public static void printIndexTheSalaryOfDepartmentEmployees(Employee [] employees,int department ) {
        int indexing1 = 13;
        int salaryIndexing = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && department == employees[i].getDepartment()) {
                salaryIndexing = employees[i].getSalary() / 100 * indexing1;
                salaryIndexing = employees[i].getSalary() + salaryIndexing;
                System.out.println("Проиндексировать зарплату всех сотрудников отдела на процент " + salaryIndexing);
            }
        }
    }
    //6. Напечатать всех сотрудников отдела (все данные, кроме отдела).
    public static void printDataEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getId()+ " "+employees[i].getNameEmployee()+" "+employees[i].getSalary());
            }
        }
    }
    //3. Получить в качестве параметра число и найти:
    //    1. Всех сотрудников с зарплатой меньше числа (вывести id, Ф. И. О. и зарплатой в консоль).
    public static void printDataEmployeesWithASalaryLessThanSum(Employee [] employees,int number) {

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null &&  employees[i].getSalary()<number ) {
                System.out.println("Всех сотрудников с зарплатой меньше числа "+employees[i].getId()+" "+employees[i].getNameEmployee()+" "+employees[i].getSalary());

            }
        }
    }
    //Всех сотрудников с зарплатой больше (или равно) числа (вывести id, Ф. И. О. зарплатой в консоль).
    public static void printDataEmployeesWithASalaryGreaterThanSum(Employee [] employees,int number) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null &&employees[i].getSalary() >=number) {
                System.out.println("Всех сотрудников с зарплатой больше "+employees[i].getId()+" "+employees[i].getNameEmployee()+" "+employees[i].getSalary());
            }
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
        //Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников на величину аргумента в %).
        index(employees);
        int department = 1;
        // 2. Получить в качестве параметра номер отдела (1–5) и найти (всего 6 методов):
        //       1. Сотрудника с минимальной зарплатой.
        int MinimumSalaryDepartment = printTheMinimumSalaryDepartment(employees,department);
        printMinimumSalaryDepartment(MinimumSalaryDepartment);
        //2. Сотрудника с максимальной зарплатой.
        int MaximumSalaryDepartment = printTheMaximumSalaryDepartment(employees,department);
        printMaxSalaryDepartment(MaximumSalaryDepartment);
        //Сумму затрат на зарплату по отделу.
        int departmentCosts =departmentSalaryCosts(employees,department);
        printDepartmentSalaryCosts(departmentCosts);
        //Среднюю зарплату по отделу (учесть, что количество людей в отделе отличается от employees.length).
        int averageSalaryDepartment=averageSalaryOfTheDepartment(employees,department);
        printAverageSalaryOfTheDepartment(averageSalaryDepartment);
        //Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра.
        printIndexTheSalaryOfDepartmentEmployees(employees,department);
        //6. Напечатать всех сотрудников отдела (все данные, кроме отдела).
        printDataEmployees(employees);
                System.out.println();
        int number = 55000;
        //3. Получить в качестве параметра число и найти:
        //    1. Всех сотрудников с зарплатой меньше числа (вывести id, Ф. И. О. и зарплатой в консоль).
                printDataEmployeesWithASalaryLessThanSum(employees,number);
        //Всех сотрудников с зарплатой больше (или равно) числа (вывести id, Ф. И. О. и зарплатой в консоль).
        printDataEmployeesWithASalaryGreaterThanSum(employees,number);

    }
}