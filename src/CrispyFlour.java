import java.time.LocalDate;

public class CrispyFlour extends Material{
    int quantiy;


    public CrispyFlour() {
    }

    public CrispyFlour(String id, String name, LocalDate manafaaturingDate, int cost, int quantiy) {
        super(id, name, manafaaturingDate, cost);
        this.quantiy = quantiy;
    }

    public int getQuantiy() {
        return quantiy;
    }

    public void setQuantiy(int quantiy) {
        this.quantiy = quantiy;
    }

    @Override
    public double getAmount() {
        return quantiy*cost;
    }

    @Override
    public LocalDate getExpiryDate() {
        return LocalDate.parse(manafaaturingDate+ "1 năm");
    }
}
