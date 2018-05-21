import java.util.Arrays;

public class Main_Product_File{

    public static void main(String[] args) {
        
        Product1 p = new Product1("shashi ",43);
        Product1 p1 = new Product1("shashiKumar ", 43);
        //String Shashi = p.toString();
        //System.out.println("========" + Shashi);
        Product1[] pp = {p, p1};
        System.out.println(Arrays.toString(pp));
    }
}