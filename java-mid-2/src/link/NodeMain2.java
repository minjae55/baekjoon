package link;

public class NodeMain2 {

    public static void main(String[] args) {
        //노드 생성하고 연결하기
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println(first);

        Node nodeB = first.next;
        System.out.println("nodeB = " + nodeB);

    }
}
