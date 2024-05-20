package hus.oop.datastructure;

public class LinkedListMyList extends AbstractMyList {
    private Node start;
    private Node end;
    private int size;

    /**
     * Hàm dựng khởi tạo list để chứa dữ liệu.
     */
    public LinkedListMyList() {
        this.start = null;
    }

    @Override
    public int size() {
        /* TODO */
        return size;
    }

    /**
     * Lấy giá trị của phần tử ở vị trí index.
     * @param index
     * @return
     */
    @Override
    public int get(int index) {
        /* TODO */
        checkBoundaries(0, size() - 1);
        Node res = getNodeByIndex(index);
        return res.data;
    }

    /**
     * Sửa dữ liệu ở vị trí index thành data.
     * @param data
     * @param index
     */
    @Override
    public void set(int data, int index) {
        /* TODO */
        checkBoundaries(0, size() - 1);
        Node current = start;
        for(int i = 0; i < index; i++){
            current = current.next;
        }
        current.data = data;
    }

    /**
     * Thêm phần tử dữ liệu vào đầu tập dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void insertAtStart(int value) {
        /* TODO */
        Node newNode = new Node(value);
        newNode.next = start;
        start = newNode;
        size++;
    }

    /**
     * Thêm phần tử dữ liệu vào cuối tập dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void insertAtEnd(int value) {
        /* TODO */
        Node newNode = new Node(value);
        newNode.next = null;
        if(start == null){
            start = newNode;
        }else{
            end.next = newNode;
        }
        end = newNode;
        size++;
    }

    /**
     * Thêm phần tử dữ liệu vào vị trí index của tập dữ liệu.
     * Chỉ thêm được nếu index nằm trong đoạn [0 - size()].
     * @param value
     * @param index
     */
    @Override
    public void insertAtPos(int value, int index) {
        /* TODO */
        checkBoundaries(0, size() - 1);
        if(index == 0){
            insertAtStart(value);
        }else{
            Node newNode = new Node(value);
            Node current = start;
            for(int i = 0; i < index - 1; i++){
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }
    /**
     * Xóa phần tử dữ liệu tại vị trí index.
     * Chỉ xóa được nếu index nằm trong đoạn [0 - (size() - 1)]
     * @param index
     */
    @Override
    public void remove(int index) {
        /* TODO */
        checkBoundaries(0, size() - 1);
        if(index == 0){
            start = start.next;
        }else{
            Node current = start;
            for(int i = 0; i < index - 1; i++){
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    /**
     * Phương thức lấy Node ở vị trí index.
     * @param index
     * @return
     */
    private Node getNodeByIndex(int index) {
        /* TODO */
        checkBoundaries(0, size() - 1);
        Node current = start;
        for(int i = 0; i < index; i++){
            current = current.next;
        }
        return current;
    }

    /**
     * Lấy ra dữ liệu được lưu theo cấu trúc dữ liệu kiểu mảng.
     * @return
     */
    @Override
    public int[] toArray() {
        /* TODO */
        int[] res = new int[size()];
        int index = 0;
        Node current = start;
        while(current != null){
            res[index] = current.data;
            current = current.next;
            index++;
        }
        return res;
    }
}
