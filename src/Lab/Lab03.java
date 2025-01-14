package Lab;

class BasicCalc {
    public int add(int a,int b) {
        return a + b;
    }
    public int sub(int a, int b) {
        return a-b;
    }
}


class  ScientficCalc extends BasicCalc {

    public  double sin(int deg){
        double rad = deg * 3.14159/180;
        return Math.sin(rad);
    }
}
public class Lab03 {
    public static void main(String[] args){
        BasicCalc bcalc1 =new BasicCalc();



        System.out.println(bcalc1.add(10,20));
        System.out.println(bcalc1.sub(10,20));

        ScientficCalc sCalc = new ScientficCalc();


        System.out.println(sCalc.add(10,20));
        System.out.println(sCalc.sub(10,20));
        System.out.println(sCalc.sin(90));
    }
}
