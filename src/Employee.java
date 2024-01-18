import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Employee extends Person implements Comparable {
    private int performance;
    private int perfBonus;

    private int objective;
    private Manager manager;

    // private Set<String> skills;
    private List<String> skills;


    public void setSkills(String skill) {
        skills.add(skill);
    }

    public boolean hasSkill(String skill) {
        for (String currentSkill : skills) {
            if (currentSkill.equals(skill)) {
                return true;
            }
        }
        return  false;
    }

    public void addSkill(String skill) {
        ListIterator<String> iterator = skills.listIterator();
        while(iterator.hasNext()) {
            int comparison = iterator.next().compareTo(skill);
            if(comparison == 0) {
                return;
            } else if (comparison > 0) {
                iterator.previous();
                iterator.add(skill);
                return;
            }
        }
        iterator.add(skill);
    }

    public int getPerformance() {
        return performance;
    }

    public void setPerformance(int performance) {
        this.performance = performance;
    }

    public int getPerfBonus() {
        return perfBonus;
    }

    public void setPerfBonus(int perfBonus) {
        this.perfBonus = perfBonus;
    }

    public int getObjective() {
        return objective;
    }

    public void setObjective(int objective) {
        this.objective = objective;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Employee(String firstName, String lastName, float baseSalary, String entreprise, int performance, int perfBonus, int objective, Manager manager) {
        super(firstName, lastName, baseSalary, entreprise);
        this.performance = performance;
        this.perfBonus = perfBonus;
        this.objective = objective;
        this.manager = manager;

        // this.skills = new HashSet<>();
        this.skills = new LinkedList<>();

    }
    @Override
    public boolean isBetterThan(Employee e) {
        return performance >= e.performance;
    }

    @Override
    public double calculateSalary() {
        return (performance>1) ? (getBaseSalary() +perfBonus) : getBaseSalary();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Performance: "+ performance);
        System.out.println("Objective:"+ objective);
        System.out.println("Performance bonus: "+perfBonus);
        System.out.println("Manager: "+ manager.getLastName() +" "+ manager.getFirstName());

    }



}
