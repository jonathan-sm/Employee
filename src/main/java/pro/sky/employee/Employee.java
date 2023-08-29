package pro.sky.employee;

public class Employee {
    private int id;
    private String Fullname;
    private String lastName;
    private static int counter = 1;

    public Employee(String fullname, String lastName) {
        this.id = counter++;
        Fullname = fullname;
        lastName = lastName;

    }

    public int getId() {
        return id;
    }

    public String getFullname() {
        return Fullname;
    }

    public String getlastName() {
        return lastName;
    }



    public void setlastName() {
        lastName = lastName;
    }


    @Override
    public String toString() {
        return "Сотрудник " + id +" "+ Fullname + ' ' +
                "Отдел № " + lastName +
                " Зарплата "   + " рублей.";
    }
}

