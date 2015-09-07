package utils;

/**
 * Created by lizx on 2015/9/4.
 */
public class LinkList<T> {
    private LinkListNode<T> head;

    public LinkList() {
        head = new LinkListNode(-1);
    }

    public void addNode(T data) {
        LinkListNode node = new LinkListNode(data);
        node.next = head.next;
        head.next = node;
    }

    public void toStrings() {
        LinkListNode<T> tmp = head.next;
        while (tmp != null) {
            tmp.toStrings();
            tmp = tmp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkList l = new LinkList();
        for(int i = 1; i < 5; i++) {
            l.addNode(i);
        }
        l.toStrings();
    }
}