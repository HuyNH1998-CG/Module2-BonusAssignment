import java.util.Scanner;

public class Manager {
    public static Students[] create(Students[] arr) {
        Scanner input = new Scanner(System.in);
        System.out.println("Adding new employee");
        System.out.println("Name?");
        String name = input.nextLine();
        System.out.println("ID?");
        int ID = input.nextInt();
        input.nextLine();
        System.out.println("Age?");
        int age = input.nextInt();
        System.out.println("Gender?");
        input.nextLine();
        String gender = input.nextLine();
        Students student = new Students(ID, name, gender, age);
        Students[] arrNew = new Students[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i];
        }
        arrNew[arrNew.length - 1] = student;
        return arrNew;
    }

    public static String searchByID(int id, Students[] arr) {
        String outcome = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getId() == id) {
                outcome = arr[i].toString();
                break;
            }
        }
        return outcome;
    }
}
