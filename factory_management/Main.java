package factory_management;
import java.lang.*;
import java.util.*;

public class Main {

    static void main_menu(){
        System.out.println();
        System.out.println("======================= *** WELCOME TO FACTORY MANAGEMENT SYSTEM *** =======================");
        System.out.println();
        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
        System.out.println();
        System.out.println("1].ADD FACTORY \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD MACHINE ");
        System.out.println();
        System.out.println("4].GET FACTORY \t\t\t 5].GET EMPLOYEES \t\t\t 6].GET MACHINE");
        System.out.println();
        System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Factory> factories = new ArrayList<>();
        ArrayList<Employees> employees = new ArrayList<>();
        ArrayList<Machine> machines = new ArrayList<>();
        int choice = 100;

        while(choice != 0){

            main_menu();
            choice = sc.nextInt();

            while(choice != 9 && choice != 0){
                switch (choice) {
                    case 1:
                        Factory factory = new Factory();
                        factory.set_details();
                        factories.add(factory);
                        System.out.println("1].ADD NEW FACTORY");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 2:
                        Employees employee = new Employees();
                        employee.set_details();
                        employees.add(employee);
                        System.out.println("2].ADD NEW EMPLOYEE");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 3:
                        Machine machine = new Machine();
                        machine.set_details();
                        machines.add(machine);
                        System.out.println("3].ADD NEW MACHINE");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 4:
                        System.out.println("============ *** DETAILS ABOUT YOUR FACTORIES *** ============");
                        for (Factory fac : factories) {
                            fac.get_details();
                            System.out.println();
                        }
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 5:
                    System.out.println("============ *** DETAILS ABOUT YOUR EMPLOYEES *** ============");
                        for (Employees emp : employees) {
                            emp.get_details();
                            System.out.println();
                        }
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 6:
                    System.out.println("============ *** DETAILS ABOUT YOUR MACHINES *** ============");
                        for (Machine mach : machines) {
                            mach.get_details();
                            System.out.println();
                        }
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    default:
                        System.out.println("ENTER VALID CHOICE: ");
                        break;
                }
            }
        }
    }
}
