public class HomeWorkApp2 {

    public static void main(String[] args) {
        int a = 5;
        int b = 25;
        System.out.println(CheckSum(a,b));

        int c = -7;
        System.out.println(CheckNumber(c));
        System.out.println(CheckNumber2(c));

        String str = "Hello world";
        int d = 5;
        PrintString(str,d,1);

        int f = 2022;
        System.out.println(CheckYear(f));
    }

    public static String CheckSum (int a, int b) {
        if ((a+b)>10 && (a+b)<=20) {
            return "true";
        } else {
            return "false";
        }
    }

    public static String CheckNumber (int c) {
        if (c>=0) {
            return "Число положительное";
        } else {
            return "Число отрицательное";
        }
    }

    public static boolean CheckNumber2 (int c) {
        return c<0;
    }

    public static void PrintString (String str, int d, int e) {
        e = 1;
        while (e<=d) {
            System.out.println(str);
            e++;
        }
    }

    public static boolean CheckYear (int f) {
        boolean a = ((f %4 == 0) && (f %100 != 0));
        if (f %400 != 0) {
            return a;
        } else return true;
    }
}
