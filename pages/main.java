import java.util.Scanner;

import login.Admin;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Admin admin = new Admin("admin", "password");
        while (true) {
            System.out.println("--- car Rental system ---");
            System.out.println("1. Admin Login ");
            System.out.println("2. customer ");
            System.out.println("0. exit ");
            System.out.println("Choose : ");
            int choice = input.nextInt();

        }
    }
}
