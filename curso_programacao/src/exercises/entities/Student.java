package exercises.entities;

public class Student {
    public String name;
    public double firstNote;
    public double secondNote;
    public double thirdNote;

    public Boolean approvedStudent() {
        double finalScore = this.sumScore();

        return finalScore >= 60;
    }

    public double sumScore() {
        return this.firstNote + this.secondNote + this.thirdNote;
    }

    public double missingScore() {
        return 60 - this.sumScore();
    }
}
