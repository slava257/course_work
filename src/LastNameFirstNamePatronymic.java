public class LastNameFirstNamePatronymic {
    private String name;
    private String surname;
    private String patronymic;

    public LastNameFirstNamePatronymic(String surname, String name, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }

    public String getPatronymic() {
        return this.patronymic;
    }

    public String toString() {
        return surname+" "+name+" "+patronymic;
    }
}
