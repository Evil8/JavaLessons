package Task1;

/**
 * Created by Anton_Khmyzov on 3/19/2017.
 */
public class Node<T> {

        private T nodeValue;
        private Node<T> next;

        public Node() {
            this.nodeValue = null;
            this.next = null;
        }

        public Node(T nodeValue) {
            this.nodeValue = nodeValue;
            this.next = null;
        }

        public T getNodeValue() {
            return nodeValue;
        }

        public void setNodeValue(T nodeValue) {
            this.nodeValue = nodeValue;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) return true;
            if (object == null || getClass() != object.getClass()) return false;

            Node<?> node = (Node<?>) object;
            return (nodeValue.equals(node.nodeValue)) && (next != null) ? next.equals(node.next) : node.next == null;
        }

        @Override
        public int hashCode() {
            int result = nodeValue.hashCode();
            result = 97 * result + (next != null ? next.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "nodeValue=" + nodeValue +
                    ", next=" + next +
                    '}';
        }
}
