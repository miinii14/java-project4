public class Main {
    public static void main(String[] args) {
        CustomList<String> list = new CustomList<>();
        list.addLast("abc");
        list.addLast("cdf");
        list.addLast("def");
        System.out.println(list.getFirst());
        list.removeFirst();
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
}