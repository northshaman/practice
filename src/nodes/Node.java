package nodes;

/**
 * class Node and etc
 */

public class Node {
    public Node next;
    public String value;

    public Node(Node next, String value) {
        this.next = next;

    }


    @Override
    public String toString() {
        if (next == null) {
            return value + " -> null";
        } else
            return value + " -> " + next.toString();
    }

    public static Node reverseNode(Node list) {
        if (list == null) return null;
        else {
            Node newNode = new Node(null, list.value);
            while (list.next != null) {
                list = list.next;
                newNode = new Node(newNode, list.value);
            }
            return newNode;
        }
    }

    public static Node revertrecursion(Node tail) {

        Node newNode = new Node(null, tail.value);
        if (tail.next == null) {
            return newNode;
        } else {
            newNode.next =
            tail = tail.next;
            newNode = new Node(newNode,tail.value);
            return
                    newNode;
        }
    }

    public static Node reverse(Node list) {
        Node currentNode = list.next;
        list.next=null;
        if (currentNode == null)
            return list;

        Node firstEl;

        if (currentNode.next != null)
            firstEl = reverse(currentNode);
        else
            firstEl = currentNode;

        currentNode.next = list;
        return firstEl;

    }


    public static void main(String[] args) {
        Node list = new Node(new Node(new Node(null, "0"), "1"), "2");
        System.out.println("Original list : " + list);

        Node reversedList = reverseNode(list);

        System.out.println("Reversed 1: " + reversedList);

        reversedList = revertrecursion(list);

        System.out.println("Reversed 2: " + reversedList);

        reversedList = reverse(list);

        System.out.println("Reversed 2: " + reversedList);

    }
}


