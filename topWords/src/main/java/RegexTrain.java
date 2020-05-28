public class RegexTrain {

    public static void main(String[] args) {

        String a = "a          //b";
        String b = "e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e";

        String c = a.replaceAll("//", "").replaceAll(",", "");
        String d = b.replaceAll("//", "").replaceAll(",", "");
        System.out.println(c);
        System.out.println("=====");
        System.out.println(d);
    }
}
