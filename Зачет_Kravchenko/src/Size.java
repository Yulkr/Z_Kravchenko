import java.util.ArrayList;

public class Size {
    String XXS;
    String XS;
    String S;
    String M;
    String L;

    public Size(String XXS, String XS, String s, String m, String l) {
        this.XXS = XXS;
        this.XS = XS;
        this.S = s;
        this.M = m;
        this.L = l;
    }
    public static String getDescription(String XXS){
        return("Детский размер");

    }
    public static String getDescription(String XS,String S, String M, String L){
        return("Взрослый размер");
    }

    @Override
    public String toString() {
        return "Size{" +
                "XXS='" + XXS + '\'' +
                ", XS='" + XS + '\'' +
                ", S='" + S + '\'' +
                ", M='" + M + '\'' +
                ", L='" + L + '\'' +
                '}';
    }





}
