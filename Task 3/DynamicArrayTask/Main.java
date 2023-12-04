public class Main {
    public static void main (String[] args){
        DynamicArray array1 = new DynamicArray();
        DynamicArray array2 = new DynamicArray(2);
        array2.insert(1);
        array2.insert(2);
        array2.insert(3);
        array2.printArray();
        array2.removeAt(1);
        array2.printArray();
        System.out.println(array2.indexAt(3));
        System.out.println(array2.indexAt(1));
        System.out.println(array2.indexAt(2));
        System.out.println(array2.at(0));
        array2.insert(5);
        array2.insert(7);
        array2.insert(9);
        System.out.println(array2.max());
        System.out.println(array2.min());
        array2.remove(5);
        array2.printArray();
    }
}
