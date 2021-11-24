import java.util.ArrayList;
import java.util.Scanner;

public class studentdatabase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user = sc.next();

        ArrayList<students> Students = new ArrayList<students>();
        Students.add(new students("ABC", 1));
        Students.add(new students("XYZ", 2));
        if (user.equalsIgnoreCase("non-teaching")) {
            System.out.println("Sorry you can not do any changes! ,New Students of Al Yasmin are:");

            for (students it : Students) {
                it.printinfo();

            }

        } else {
            System.out.println("New Students of Al Yasmin are:");
            for (students it : Students) {
                it.printinfo();

            }
            System.out.println("Please enter the action you want to perform:");
            String action = sc.next();
            if (action.equalsIgnoreCase("update")) {
                int old_id = sc.nextInt();
                int new_id = sc.nextInt();
                String new_name = sc.next();
                Students.set(old_id, new students(new_name, new_id));
                for (students it : Students) {
                    it.printinfo();

                }
            } else if (action.equalsIgnoreCase("delete")) {
                int old_id = sc.nextInt();
                Students.remove(old_id);
                for (students it : Students) {
                    it.printinfo();

                }
            } else if (action.equalsIgnoreCase("add")) {
                int new_id = sc.nextInt();
                String new_name = sc.next();
                Students.add(new students(new_name, new_id));
                for (students it : Students) {
                    it.printinfo();

                }
            }
        }


    }
}

class students {
    public String name;
    public int id;

    public students(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void printinfo() {
        System.out.println(id + " " + name);
    }

}

