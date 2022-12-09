public class Employee {
    static int count = 1;

    private LastNameFirstNamePatronymic nameEmployee;
    private int salary;
    private int department;
    private int id;

    public Employee(int id, LastNameFirstNamePatronymic nameEmployee, int salary, int department) {
        this.nameEmployee = nameEmployee;
        this.salary = salary;
        this.department = department;
        this.id = id;
        id= count++;

    }

    public LastNameFirstNamePatronymic getNameEmployee() {
        return nameEmployee;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public void setSalaryChange(int salary) {
        this.salary = salary;
    }

    public void setDepartmentChange(int department) {
        this.department = department;
    }

    public String toString() {

        return "Сотрудник :" + id + "; ФИО :" +nameEmployee + "; зарплата :" + salary + "; отдел :" + department+"\n";

    }
}
