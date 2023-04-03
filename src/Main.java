public class Main {
    public static void main(String[] args) {
        CustomList<String> list = new CustomList<>();
        list.addLast("abc");
        list.addLast("cdf");
        list.addLast("def");
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
    }
}