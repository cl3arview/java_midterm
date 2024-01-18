import java.util.ArrayList;

public class TestEntreprise {

    public static void testComp(Employee employee, String skill) {
        boolean hasSkill = employee.hasSkill(skill);
        System.out.println("Employee " + employee.getFirstName() + " has skill " + skill + ": " + hasSkill);
    }
    public static void main(String[] args) throws ManagerException {

        //Create Manager Objects

        Manager managerAhmed  = new Manager("Ahmed","B",18000, "TestEntreprise",3000,new ArrayList<>());
        Manager managerImane  = new Manager("Imane","A",15000,"TestEntrepsise",5000,new ArrayList<>());


        // Create Employee objects
        Employee emp1 = new Employee("Youssef", "A", 11000, "EntrepriseXYZ", 300, 3000, 100, managerAhmed);
        Employee emp2 = new Employee("Mohammed", "A", 10000, "EntrepriseXYZ", 200, 3000, 150, managerImane);
        Employee emp3 = new Employee("Mouna", "A", 11000, "EntrepriseXYZ", 100, 3000, 120, managerAhmed);

        managerAhmed.addEmployee(emp1);
        managerAhmed.addEmployee(emp3);
        managerImane.addEmployee(emp2);


        managerImane.setRespBonus(3000);
        managerAhmed.setRespBonus(5000);


        System.out.println("Employees of Manager Ahmed: ");

        managerAhmed.displayEmployees();
        System.out.println();
        System.out.println();

        Employee maBest = managerAhmed.bestEmployee();

        System.out.println(maBest.getFirstName() + " "+maBest.getLastName()+" is Manager Ahmed's best worker");

        System.out.println();
        System.out.println();

        ArrayList<Employee> ma_worst = new ArrayList<>();

        ma_worst = managerAhmed.worstList();

        System.out.println("Worst employees of Manager Ahmed:");

        if(!ma_worst.isEmpty()) {
            for (Employee e : ma_worst) {
                e.display();
            }
        }



        emp1.setSkills("java");
        emp1.setSkills("python");


        testComp(emp1,"comm");

    }
}
