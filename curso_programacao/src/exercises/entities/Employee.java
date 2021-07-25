package exercises.entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        if (this.tax < this.grossSalary)
            return this.grossSalary - tax;
        else
            return 0;
    }

    public double increaseSalary(double percentage) {
        return this.grossSalary + (this.grossSalary * (percentage / 100));
    }
}
