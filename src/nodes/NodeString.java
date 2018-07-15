package nodes;

/**
 * class NodeString and etc
 */

public class NodeString {


     NodeString() {
    }


     Node reverseNode(Node list) {
        if (list == null) return null;
        else {
            Node newNodeString = new Node(null, list.getValue());
            while (list.getNext() != null) {
                list = list.getNext();
                newNodeString = new Node(newNodeString, (String) list.getValue());
            }
            return newNodeString;
        }
    }

     Node reverseRecursion(Node list) {
        Node currentNodeString = list.getNext();
        list.setNext(null);
        if (currentNodeString == null)
            return list;

        Node firstEl;

        if (currentNodeString.getNext() != null)
            firstEl = reverseRecursion(currentNodeString);
        else
            firstEl = currentNodeString;

        currentNodeString.setNext(list);
        return firstEl;

    }
//    public static Node revertrecursion(Node tail) {
//
//        NodeString newNodeString = new NodeString(null, (String) tail.getValue());
//        if (tail.next == null) {
//            return newNodeString;
//        } else {
//            newNodeString.next =
//            tail = tail.next;
//            newNodeString = new NodeString(newNodeString,tail.value);
//            return
//                    newNodeString;
//        }
//    }


    public static void main(String[] args) {
        Node list = new Node(new Node<>(new Node<>(null, "0"), "1"), "2");
        System.out.println("Original list : " + list);

        Node reversedList = new Node();
        NodeString app = new NodeString();
        System.out.println("Reversed 1: " + reversedList);

        reversedList = app.reverseNode(list);

        System.out.println("Reversed 2: " + reversedList);

        reversedList = app.reverseRecursion(list);

        System.out.println("Reversed 3: " + reversedList);

    }
}


