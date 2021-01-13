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
        this.age = (byte) ((byte)(Math.random()*47)+18); //здесь задал рандом, чтобы не определять возраст самому. Но, когда задавал массив, все равно пришлось написать на метсе age '0'. Этого можно как-то избежать, чтобы ничего не писать на месте, где должен стоять age?
        printEmployeeFor();

    }

    public void printEmployeeWhile () { //Вывод через цикл while
        int arrayCellCount = 1;
        while (age > 40 && arrayCellCount > 0) {
            System.out.println("ФИО: " + fullName + "\n" + "Должность: " + position + "\n" + "email: " + email + "\n" + "Телефонный номер: " + phoneNum + "\n" + "Заработная плата: " + wage + "\n" + "Возраст: " + age);
            System.out.println();
            arrayCellCount--;
        }
    }

    public void printEmployeeFor () { // Вывод через цикл for
        if (age > 40) {
            for (int i = 0; i < 1; i++) {
                System.out.println("ФИО: " + fullName);
                System.out.println("Должность: " + position);
                System.out.println("email: " + email);
                System.out.println("Заработная плата: " + wage);
                System.out.println("Возраст: " + age);
            }
            System.out.println();
        }
    }
    //Хотел сделать ещё вывод через foreach, но пока что не получается.
}
