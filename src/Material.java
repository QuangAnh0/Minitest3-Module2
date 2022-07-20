import java.time.LocalDate;

public abstract class  Material {
    private String id;
    private String name;
    LocalDate manafaaturingDate;
    int cost;

    public Material() {
    }

    public Material(String id, String name, LocalDate manafaaturingDate, int cost) {
        this.id = id;
        this.name = name;
        this.manafaaturingDate = manafaaturingDate;
        this.cost = cost;
    }
    public abstract double getAmount();
    public abstract LocalDate getExpiryDate();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getManafaaturingDate() {
        return manafaaturingDate;
    }

    public void setManafaaturingDate(LocalDate manafaaturingDate) {
        this.manafaaturingDate = manafaaturingDate;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Material{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", manafaaturingDate=" + manafaaturingDate +
                ", cost=" + cost +
                '}';
    }
}
