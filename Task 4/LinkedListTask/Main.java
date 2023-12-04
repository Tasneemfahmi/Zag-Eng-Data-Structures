public class Main {
    public static void main (String[] args){
        LinkedList list = new LinkedList();
        list.addFirst(20);
        list.addLast(30);
        list.addFirst(10);
        list.printElements();
        System.out.println(list.max());
        System.out.println(list.min());
    }
}
