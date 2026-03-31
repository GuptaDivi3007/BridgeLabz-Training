public abstract class Employee {

    private final String name;
    private final double salary;
    private final double bonus;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.bonus = calculateBonus(salary);
    }

    protected abstract double calculateBonus(double salary);

    public final double getBonus() {
        return bonus;
    }

    public final double getSalary() {
        return salary;
    }
}
