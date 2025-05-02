public class Main{
    public static void main(String[] args){
        LightBoard L1 = new LightBoard(7, 5);
        System.out.println(L1.toString());
        boolean[][] lights = {
            {true, true, false, true, true},
            {true, false, false, true, false},
            {true, false, false, true, true},
            {true, false, false, false, true},
            {true, false, false, false, true},
            {true, true, false, true, true},
            {false, false, false, false, false}
        };
        LightBoard L2 = new LightBoard(lights);
        System.out.println(L2.evaluateLight(0, 3));
        System.out.println(L2.evaluateLight(6, 0));
        System.out.println(L2.evaluateLight(4, 1));
        System.out.println(L2.evaluateLight(5, 4));
    }
}