package Task1;

/**
 * Created by Anton_Khmyzov on 3/19/2017.
 */
public class MyLinkedList<T> {
    private Node<T> head;
    private int dim;

    public MyLinkedList(Node<T> head) {
        this.head = head;
        this.dim = 1;
    }

    public boolean add(int index, T nodeValue) {
        if (index < 0 || index > dim)
            return false;

        Node<T> currentNode = head;
        Node<T> newNode = new Node<>(nodeValue);

        if (index == 0) {
            head = newNode;
            head.setNext(currentNode);
        }else {
            for (int i = 0; i < index - 1 && currentNode.getNext() != null; i++) {
                    currentNode = currentNode.getNext();
            }
            if (index > 0 && index !=dim){
                newNode.setNext(currentNode.getNext());
            }
            currentNode.setNext(newNode);
        }
        dim++;
        return true;
    }

    public boolean addFirst(T nodeValue) {
        return add(0, nodeValue);
    }

    public boolean addLast(T nodeValue) {
        return add(dim, nodeValue);
    }

    public boolean remove(int index) {
        if (index < 0 || index > dim)
            return false;

        if (index == 0) {
            head = head.getNext();
            dim--;

        }
        if (index > 0) {
            Node<T> currentNode = head;

            for (int i = 0; i < index - 1; i++) {
                    currentNode = currentNode.getNext();
            }

            Node<T> nextNode = currentNode.getNext();
            if (nextNode != null) {
                currentNode.setNext(nextNode.getNext());
                dim--;
            }
        }

        return true;
    }


    public boolean removeFirst() {
        return remove(0);
    }

    public boolean removeLast() {
        return remove(dim - 1);
    }

    public Node<T> get(int index) {

        Node<T> currentNode = head;
        for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.getNext();

        }
        return currentNode.getNext();
    }

    public int get(T nodeValue) {
        Node<T> currentNode = head;

        for (int i = 0; i < dim; i++) {

            if (currentNode.getNodeValue().equals(nodeValue)) {
                return i;
            }
            currentNode = currentNode.getNext();

        }

        return 0;
    }

    public void show() {
        System.out.println("Size: " + dim + ". ");
        Node<T> currentNode = head;
        for (int i = 0; i < dim; i++) {
            System.out.print(currentNode.getNodeValue().toString() + " ") ;
            currentNode = currentNode.getNext();
        }
        System.out.println();
    }
    public void show(Node<T> node){
        System.out.println(node.getNodeValue().toString());
    }
}
