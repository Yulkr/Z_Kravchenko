public class Qytbolka extends Odegda implements Woman_od, Men_od {
    public Qytbolka(String size, int cost, String color) {
        super(size, cost, color);
    }
    @Override
    public String dresWoman() {
        return dresWoman();
    }

    @Override
    public String dresWoman() {
        return "Model: " + this.getClass().getName() + "\n" +
                "Size: " + size.toString() + "\n" +
                "Color: " + color + "\n" +
                "Cost: " + cost + "\n";
    }

}
