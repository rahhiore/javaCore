public class LinkedList {
    Node head;
    static class Node {
        String login;
        String password;
        Node next;
        Node(String login, String password) {
            this.login = login;
            this.password = password;
            next = null;
        }
    }
    public static LinkedList insert(LinkedList list,
                                    String login, String password)
    {
        Node new_node = new Node(login, password);
        new_node.next = null;
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }
    public static void printList(LinkedList list)
    {
        Node currNode = list.head;
        int i = 1;
        while (currNode != null) {
            System.out.print(i + ". " + currNode.login + " " + currNode.password);
            currNode = currNode.next;
            i++;
            System.out.println();
        }
    }
    public static LinkedList deleteByKey(LinkedList list, String key)
    {
        Node currNode = list.head, prev = null;
        if (currNode != null && currNode.login.equals(key)) {
            list.head = currNode.next;
            System.out.println(key + " found and deleted");
            return list;
        }
        while (currNode != null && !(currNode.login.equals(key))) {
            prev = currNode;
            currNode = currNode.next;
        }
        if (currNode != null) {
            prev.next = currNode.next;
            System.out.println(key + " found and deleted");
        }
        if (currNode == null) {
            System.out.println(key + " not found");
        }
        return list;
    }

}

