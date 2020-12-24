public class main {
    public static void main(String [] args){
        ArrayList<Size> sizes = new ArrayList<>();
        for (int i = 0; i < 10; i+=2) {
            Size size = new Size(i + 32);
            if (i + 32 == 32) size.setDescription("Детский размер");
            sizes.add(size);
        }
    }


    Atele.OdetyM();
    Atele.OdetyW();



}
