abstract class Odegda {
    String size;
    int cost;
    String color;

    public Odegda(String size, int cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
