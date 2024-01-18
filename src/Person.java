
class Person {
    private  String firstName;
    private  String lastName;
    private  Float baseSalary;
    private   String entreprise;

    //Constructor
    public Person(String firstName, String lastName, float baseSalary, String entreprise) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseSalary = baseSalary;
        this.entreprise = entreprise;
    }

    //methods
    public double calculateSalary() {
        return baseSalary;
    }

    public void display() {

        System.out.println("Name : "+ firstName+" "+lastName);
        System.out.println("Salary: "+ baseSalary );
        System.out.println("Entreprise: "+entreprise);

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Float baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(String entreprise) {
        this.entreprise = entreprise;
    }

    //Getters and setters


}
