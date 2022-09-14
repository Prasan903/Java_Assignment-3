import calc.div;
import calc.mul;
import calc.sub;
import calc.sum;

public class calcmain {
    public static void main(String[] args) {
        sum s = new sum();
        System.out.println(s.sum(10, 20));
        mul m = new mul();

        System.out.println(m.mul(10, 20));
        sub k = new sub();
        System.out.println(k.sub(10, 20));
        div d = new div();
        System.out.println(d.div(10, 20));
        System.out.println("21CE121_Prasan");
    }
}
