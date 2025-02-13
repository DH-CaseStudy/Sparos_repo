package day9.tree.binarySearchTree;

//양방향 링크드 리스트
//문제 아래 코드를 분석하여 데이터를 임의 노드 앞에 노드를 추가하는 메서드 추가하세요
// method name : insertToFront(frontNode , insertNode);
public class DoubleLinkedList<T> {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> MyLinkedList = new DoubleLinkedList<Integer>();

        MyLinkedList.addNode(3);
        MyLinkedList.addNode(6);
        MyLinkedList.addNode(8);
        MyLinkedList.addNode(11);
        MyLinkedList.printAll();
        System.out.println("----------------");

        MyLinkedList.insertToFront(8, 7);
        MyLinkedList.insertToFront(3, 2);
        MyLinkedList.printAll();
//        System.out.println("----------------");
//
//        MyLinkedList.insertToFront(6, 2);
//        MyLinkedList.insertToFront(1, 0);
//        MyLinkedList.printAll();
//        System.out.println("----------------");
//
//        MyLinkedList.addNode(6);
//        MyLinkedList.printAll();
    }

    public Node<T> head = null;
    public Node<T> tail = null;

    public class Node<T> {
        T data;
        Node<T> prev = null;
        Node<T> next = null;

        public Node(T data) {
            this.data = data;
        }
    }

    public void insertToFront(T frontNode, T insertNode) {
        if (this.head == null) {
            System.out.println("head가 없다 => 리스트가 비어있다.");
            return;
        }

        Node<T> current = this.head; //노드를 만들고 헤드값을 넣어줌. => 헤드부터 순회하겠다.

        while (current != null) { //헤드를 순회
            if (current.data.equals(frontNode)) { //찾았다면 9를 찾았다면
                Node<T> newNode = new Node<>(insertNode); // 넣을 새로운 노드를 만들어라 여기서는 7

                newNode.next = current; //7의 next에 9를 연결
                newNode.prev = current.prev; //7의 prev에 6을 연결

                if (current.prev != null) { //9의 prev null이 아니라면, 즉 헤드가 아니라면
                    current.prev.next = newNode; //9의 prev 즉 6의 next를 7과 연결해라
                } else {
                    this.head = newNode; //prev가 null이라는건 맨 앞자리에 끼운다는 뜻
                }

                current.prev = newNode; // 9의 prev를 7과 연결
            }
            current = current.next; // 순회
        }
    }

    public void insertToFront2(T frontData, T insertData) {
        if (this.head == null) {
            System.out.println("헤드가 없다 -> 리스트가 비어있다");
            return;
        }

        Node<T> current = this.head;

        while (current != null) {
            if (current.data.equals(frontData)) {
                Node<T> newNode = new Node<>(insertData);

                newNode.next = current;

                if (current.prev != null) {
                    newNode.prev = current.prev;
                    current.prev.next = newNode;
                }
            }
        }
    }


    //새로운 노드 추가 기능
    public void addNode(T data) {
        if (this.head == null) {
            this.head = new Node<>(data);
            this.tail = this.head;
        } else {
            Node<T> node = this.head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node<T>(data);
            node.next.prev = node;
            this.tail = node.next;
        }
    }

    //전체 노드 정보 출력
    public void printAll() {
        if (this.head != null) {
            Node<T> node = this.head;
            System.out.println(node.data);
            while (node.next != null) {
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    //head 로 부터 특정 노드를 찾는 메서드
    public T searchFromHead(T isData) {
        if (this.head == null) {
            return null;
        } else {
            Node<T> node = this.head;
            while (node != null) {
                if (node.data == isData) {
                    return node.data;
                } else {
                    node = node.next;
                }
            }
            return null;
        }
    }

    //tail 로부터 특정 노드를 찾는 메서드
    public T searchFromTail(T isData) {
        if (this.head == null) {
            return null;
        } else {
            Node<T> node = this.tail;
            while (node != null) {
                if (node.data == isData) {
                    return node.data;
                } else {
                    node = node.prev;
                }
            }
            return null;
        }
    }
}
