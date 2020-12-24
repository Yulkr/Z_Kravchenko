public class galstuk extends Odegda implements Woman_od, Men_od {

    public galstuk(String size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public String dresMan() {
        return null;
    }

    @Override
    public String dresWoman() {
        return dresWoman();
    }

    @Override
    public String dresM() {
        return "Model: " + this.getClass().getName() + "\n" +
                "Size: " + size.toString() + "\n" +
                "Color: " + color + "\n" +
                "Cost: " + cost + "\n";
    }

}
