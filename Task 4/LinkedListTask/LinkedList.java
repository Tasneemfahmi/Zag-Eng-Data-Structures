public class LinkedList {
    class Node {
        public Node(int v) {
            value = v;
        }

        int value;
        Node nextNode;
    }

    Node first;
    Node last;
    int size = 0;

    public void addFirst(int item) {
        Node node = new Node(item);
        if (first == null) {
            first = last = node;
            return;
        }
        node.nextNode = first;
        first = node;
        size++;
    } //O(1)

    public void addLast(int item) {
        Node node = new Node(item);
        if (first == null) {
            first = last = node;
            return;
        }
        last.nextNode = node;
        last = node;
        size++;
    } //O(1)

    public void removeFirst() {
        if (first == null) {
            first = last = null;
            return;
        } else {
            Node temp = first;
            first = first.nextNode;
            temp.nextNode = null;
        }
        size--;
    } //O(1)

    public int indexOf(int item) {
        Node current = first;
        int index = 0;
        while (current != null) {
            if (current.value == item) {
                return index;
            }
            index++;
            current = current.nextNode;
        }
        return -1;
    } //O(n)

    public boolean contains(int value) {
        int index = indexOf(value);
        if (index != -1) {
            return true;
        } else {
            return false;
        }
    } //O(1)

    public int size() {
        return size;
    } //O(1)

    public void printElements() {
        Node node = first;
        while (node != last) {
            System.out.print(node.value + " ");
            node = node.nextNode;
        }
        System.out.println(last.value);
    } // O(n)

    public int max() {
        Node node = first;
        int max = node.value;
        while (node != last) {
            if (node.value >= max) {
                max = node.value;
            }
            node = node.nextNode;
        }
        if (last.value>=max)
            return last.value;
        return max;
    } //O(n)
    public int min() {
        Node node = first;
        int min = node.value;
        while (node != last) {
            if (node.value <= min) {
                min = node.value;
            }
            node = node.nextNode;
        }
        if (last.value<=min)
            return last.value;
        return min;
    } //O(n)
}
