package utils;

/**
 * Created by lizx on 2015/9/4.
 */
public class LinkListNode<T> {
    T data;
    LinkListNode<T> next;

    public LinkListNode(T data){
        this.data = data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void toStrings() {
        System.out.println(data);
    }
}
