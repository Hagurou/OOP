package hus.oop.mylist;

public class MyLinkedList extends MyAbstractList {
    private MyLinkedListNode head;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyLinkedList() {
        /* TODO */
        this.head = null;
    }

    /**
     * Lấy kích thước của list.
     * @return
     */
    @Override
    public int size() {
        /* TODO */
        return size;
    }

    /**
     * Lấy phần tử ở vị trí index trong list.
     * @param index
     * @return
     */
    @Override
    public Object get(int index) {
        /* TODO */
        if(index < 0 || index > size() - 1){
            throw new IndexOutOfBoundsException();
        }
        MyLinkedListNode node = getNodeByIndex(index);
        return node.getPayload();
    }

    /**
     * Xóa phần tử của list ở vị trí index.
     * @param index
     */
    @Override
    public void remove(int index) {
        /* TODO */
        if(index < 0 || index > size() - 1){
            throw new IndexOutOfBoundsException();
        }
        if(index == 0){
            head = head.getNext();
            return;
        }else{
            MyLinkedListNode prev = getNodeByIndex(index - 1);
            MyLinkedListNode curr = prev.getNext();
            prev.setNext(curr.getNext());
        }
        size--;
    }

    /**
     * Thêm vào cuối list phần tử có dữ liệu payload.
     * @param payload
     */
    @Override
    public void append(Object payload) {
        /* TODO */
        insert(payload, size);
    }

    /**
     * Thêm vào list phần tử có dữ liệu payload ở vị trí index.
     * @param payload
     * @param index
     */
    @Override
    public void insert(Object payload, int index) {
        /* TODO */
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }
        MyLinkedListNode newNode = new MyLinkedListNode(payload);

        if(index == 0){
            newNode.setNext(head);
            head = newNode;
        } else {
            MyLinkedListNode prev = getNodeByIndex(index - 1);
            newNode.setNext(prev.getNext());
            prev.setNext(newNode);
        }
        size++;
    }

    /**
     * Tạo iterator để cho phép duyệt qua các phần tử của list.
     * @return
     */
    @Override
    public MyIterator iterator() {
        /* TODO */
        return new MyLinkedListIterator(head);
    }

    /**
     * Lấy node ở vị trí index.
     * @param index
     * @return
     */
    private MyLinkedListNode getNodeByIndex(int index) {
        /* TODO */
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }

        MyLinkedListNode currentNode = head;
        for(int i = 0; i < index; i++){
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }
}
