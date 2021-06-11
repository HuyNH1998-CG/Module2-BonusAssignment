import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Students[] nhanVien = new Students[0];
        int choice;
        while (true) {
            System.out.println("Menu");
            System.out.println("1.Add");
            System.out.println("2.Changes");
            System.out.println("3.Delete");
            System.out.println("4.Display");
            System.out.println("5.Search By ID");
            System.out.println("0.Exit");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1 -> nhanVien = Manager.create(nhanVien);
                case 2 -> {
                    System.out.println("Change to who?");
                    int index = input.nextInt();
                    System.out.println("What to Change");
                    System.out.println("1.Name");
                    System.out.println("2.ID");
                    System.out.println("3.Gender");
                    System.out.println("4.Age");
                    int selection = input.nextInt();
                    input.nextLine();
                    switch (selection) {
                        case 1 -> {
                            System.out.println("Input new Name");
                            String name = input.nextLine();
                            nhanVien[index].setName(name);
                        }
                        case 2 -> {
                            System.out.println("Input new ID");
                            int ID = input.nextInt();
                            nhanVien[index].setId(ID);
                        }
                        case 3 -> {
                            System.out.println("Input new gender");
                            String gender = input.nextLine();
                            nhanVien[index].setGender(gender);
                        }
                        case 4 -> {
                            System.out.println("Input new Age");
                            int age = input.nextInt();
                            nhanVien[index].setAge(age);
                        }
                    }
                }
                case 3 -> {
                    System.out.println("Who to delete?");
                    int index = input.nextInt();
                    nhanVien[index] = null;
                }
                case 4 -> {
                    System.out.println("Employees");
                    for (Students s : nhanVien) {
                        System.out.println(s);
                    }
                }
                case 5 -> {
                    System.out.println("Input ID to find");
                    int id = input.nextInt();
                    System.out.println(Manager.searchByID(id,nhanVien));
                }

                case 0 -> System.exit(0);
            }
        }
    }
}
