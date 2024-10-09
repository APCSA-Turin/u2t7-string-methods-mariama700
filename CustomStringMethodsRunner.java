public class CustomStringMethodsRunner {
    public static void main(String[] args) {

    CustomStringMethods methods = new CustomStringMethods();
    boolean bool = methods.longerThan("apple", 4);
    System.out.println(bool);
    bool = methods.longerThan("apple", 5);
    System.out.println(bool);
    bool = methods.longerThan("apple", 2);
    System.out.println(bool);
    bool = methods.longerThan("apple", 7);
    System.out.println(bool);

    String str = methods.funnyString("computer", 3);
    System.out.println(str);
    str = methods.funnyString("computer", 0);
    System.out.println(str);
    str = methods.funnyString("computer", 7);
    System.out.println(str);
    str = methods.funnyString("apples", 1);
    System.out.println(str);

    String str2 = methods.halvesReversed("computer");  //even # of letters
    System.out.println(str2);
    str2 = methods.halvesReversed("computers");        //odd # of letters
    System.out.println(str2);
    str2 = methods.halvesReversed("sky");
    System.out.println(str2);
    str2 = methods.halvesReversed("weekend");
    System.out.println(str2);
    str2 = methods.halvesReversed("an");
    System.out.println(str2);
    str2 = methods.halvesReversed("I");
    System.out.println(str2);
    str2 = methods.halvesReversed("see you soon");
    System.out.println(str2);
    str2 = methods.halvesReversed("see you later!");
    System.out.println(str2);
    }
}
