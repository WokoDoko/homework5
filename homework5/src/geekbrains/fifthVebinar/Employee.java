package geekbrains.fifthVebinar;

public class Employee {

    private final String fullName;
    private final String position;
    private final String email;
    private final String phoneNum;
    private final int wage;
    private final byte age;

    public Employee (String fullName, String position,String email,String phoneNum,int wage,byte age){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNum = phoneNum;
        this.wage = wage;
        this.age = age;
        printEmployeeInfo();

    }

    public void printEmployeeInfo () {
        int arrayCellCount = 1;
        while (age > 40 && arrayCellCount > 0) {
            System.out.println("ФИО: " + fullName + "\n" + "Должность: " + position + "\n" + "email: " + email + "\n" + "Телефонный номер: " + phoneNum + "\n" + "Заработная плата: " + wage + "\n" + "Возраст: " + age);
            System.out.println();
            arrayCellCount--;
        }
    }
    //буду пробовать с помощью других циклов попозже

}
