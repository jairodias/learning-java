package exercises.entities;

public class Employee {
    public int id;
    public String name;
    public double grossSalary;
    public double tax;

    public Employee() {
    }

    public Employee(Integer id, String name, Double grossSalary) {
        this.id = id;
        this.name = name;
        this.grossSalary = grossSalary;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public Double getGrossSalaray() {
        return this.grossSalary;
    }

    public double netSalary() {
        if (this.tax < this.grossSalary)
            return this.grossSalary - tax;
        else
            return 0;
    }

    public double increaseSalary(double percentage) {
        return this.grossSalary += (this.grossSalary * (percentage / 100));
    }

    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", grossSalary);
    }
}
