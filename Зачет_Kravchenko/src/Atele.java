public class Atele {
    public ArrayList<Odegda> clothes;

    public Atele(ArrayList<Odegda> clothes){this.clothes = clothes;;
    }

    public void OdetyM() {
        System.out.println("Man clothes: \n");
        for (Size cloth: clothes) {
            String str = cloth.dressMan();
            if (str != null) System.out.println(str);
        }
    }

    public void OdetyW() {
        System.out.println("Woman clothes: \n");
        for (Size cloth: clothes) {
            String str = cloth.dressWoman();
            if (str != null) System.out.println(str);
        }
    }
}




