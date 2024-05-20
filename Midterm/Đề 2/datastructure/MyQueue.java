package hus.oop.datastructure;

import java.util.NoSuchElementException;

public class MyQueue {
    private MyList queueData;

    public MyQueue() {
        this.queueData = new LinkedListMyList();
    }

    /**
     * Thêm giá trị vào cuối của queue.
     * @param value
     */
    public void add(int value) {
        /* TODO */
        queueData.insertAtEnd(value);
    }

    /**
     * Xóa và trả lại giá trị ở đầu của queue.
     * @return
     */
    public int remove() {
        /* TODO */
        if(queueData.size() == 0){
            throw new NoSuchElementException();
        }
        int res = queueData.get(0);
        queueData.remove(0);
        return res;
    }

    /**
     * Kiểm tra xem queue có rỗng hay không.
     * @return true nếu queue không chứa giá trị nào, false nếu queue đã chứa giá trị.
     */
    public boolean isEmpty() {
        /* TODO */
        return queueData.size() == 0;
    }

    /**
     * Trả lại giá trị ở đầu của queue mà không xóa phần tử.
     * @return giá trị ở vị trí đầu của queue.
     */
    public int peek() {
        /* TODO */
        return queueData.get(0);
    }

    /**
     * Lấy kích thước của queue.
     * @return
     */
    public int size() {
        /* TODO */
        return queueData.size();
    }
    public int[] toArray(){
        return queueData.toArray();
    }
    public void removeWithoutReturn(){
        queueData.remove(0);
    }
}
