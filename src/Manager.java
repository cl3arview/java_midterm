import java.util.ArrayList;

class Manager extends Person {
    private int respBonus;
    private ArrayList<Employee> employees;


    public Manager(String firstName, String lastName, float baseSalary, String entreprise,int respBonus, ArrayList<Employee> employees) {
        super(firstName, lastName, baseSalary, entreprise);
        this.respBonus = respBonus;
        this.employees = employees;
    }

    public int getRespBonus() {
        return respBonus;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }


    public void setRespBonus(int bonus) throws ManagerException {
        if (bonus < getBaseSalary() * 0.1) {
            throw new ManagerException("Responsibility bonus must be at least 10% of base salary.");
        }
        this.respBonus = bonus;
    }
    @Override
    public double calculateSalary() {


        return getBaseSalary() + respBonus;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Responsability Bonus: "+ respBonus);
        System.out.println("Managed Employees: ");
        displayEmployees();
    }

    public void addEmployee (Employee e ) {
        employees.add(e);
    }

    public void displayEmployees() {
        for (Employee e : employees) {
            e.display();
        }
    }

    public Employee bestEmployee() {
        if (employees.isEmpty()) {
            return null;
        }
        Employee best = employees.get(0);

        for (Employee e : employees) {
            boolean b = e.getPerformance() > best.getPerformance();
            if (b) {
                best = e;
            }
        }
        return best;
    }

    public Employee worstEmployee() {
        if (employees.isEmpty()) {
            return null;
        }

        Employee worst = employees.get(0);

        for (Employee e : employees) {
            boolean w = e.getPerformance() < worst.getPerformance();

            if(w) {
                worst = e;
            }
        }

        return worst;
    }

    public Employee meilleurEmploye() {

        Employee  best = employees.get(0);

        for (Employee e : employees) {
            if(e.isBetterThan(best)) {
                best = e;
            }
        }

        return best;
    }

    public ArrayList<Employee> worstList() {

        ArrayList<Employee> worst_list = new ArrayList<>();

        for (Employee e : employees) {
            boolean perf = e.getPerformance() < e.getObjective();
            if(perf) {

                worst_list.add(e);
            }
        }
        return worst_list;
    }



}