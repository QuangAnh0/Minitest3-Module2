import java.time.LocalDate;

public class Meat extends Material{
    public double weight;

    @Override
    public double getAmount() {
        return cost*weight;
    }

    @Override
    public LocalDate getExpiryDate() {
        return LocalDate.parse(manafaaturingDate + "7 ngày");
    }
   public Meat(){

   }

    public Meat(String id, String name, LocalDate manafaaturingDate, int cost, double weight) {
        super(id, name, manafaaturingDate, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
