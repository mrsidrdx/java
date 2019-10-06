import java.util.Calendar;
class Employee {
        String name;
        String dob;
        String address;
        double salary;
        String designation;
        Employee(String n, String d, String a, double sal, String des) {
                name = n;
                dob = d;
                address = a;
                salary = sal;
                designation = des;
        } 
        void reportForDuty() {
                Calendar cal = Calendar.getInstance();
                System.out.println(cal.getTime());
                System.out.println("Welcome");
        }
}

class Doctor extends Employee {
        String expertise;
        int yearsOfExperience;
        Doctor(String n, String d, String a, double sal, String des, String exp, int y) {
                super(n, d, a, sal, des);
                expertise = exp;
                yearsOfExperience = y;
        }
        void performDuty() {
                if(expertise.equals("Surgeon")) {
                        if(yearsOfExperience > 10)
                                System.out.println("Perform Heart Operation");
                        else
                                System.out.println("Perform Minor Surgery");
                }
                else if(expertise.equals("Orthopedic")) {
                        if(yearsOfExperience > 5)
                                System.out.println("Perform Surgery And Plastering");
                        else
                                System.out.println("Perform Plastering");
                }
        }
}
class Nurse extends Employee {
        String expertise;
        int yearsOfExperience;
        Nurse(String n, String d, String a, double sal, String des, String exp, int y) {
                super(n, d, a, sal, des);
                expertise = exp;
                yearsOfExperience = y;
        }
        void performDuty() {
                if(yearsOfExperience > 3)
                        System.out.println("Check BP, Sugar And Administer Medicine");
                else
                        System.out.println("Look After The Patient");
        }
}

class Hospital {
        static void getHeader() {
                System.out.println("Name\t\tDOB\t\tAddress\t\tSalary\t\tDesignation");
        }
        static void generateReport(Employee e) {
                System.out.println(e.name + "\t\t" + e.dob + "\t\t" + e.address + "\t\t" + e.salary + "\t\t" + e.designation);
        }
        public static void main(String args[]) {
                Doctor d = new Doctor("Sid", "06/11/1999", "Dubai", 2000000, "Surgeon", "Surgeon", 16);
                Nurse n = new Nurse("Tasha", "22/08/1999", "Bangladesh", 1600000, "Nurse", "Nurse", 6);
                Employee e = d;
                e.reportForDuty();
                d.performDuty();
                n.performDuty();
                getHeader();
                generateReport(e);
        }
}

