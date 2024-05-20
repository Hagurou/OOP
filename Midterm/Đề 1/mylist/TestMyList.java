package hus.oop.mylist;

public class TestMyList {
    public static void main(String[] args) {
        /*
         * TODO
         * Chạy demo các hàm test.
         * Lưu kết quả chạy chương trình vào file text có tên <Ten_MaSinhVien_MyList>.txt
         * (ví dụ, NguyenVanA_123456_MyList.txt)
         */
        testMyArrayList();
        testMyLinkedList();
    }

    public static void testMyArrayList() {
        MyArrayList list = new MyArrayList();
        list.append(1.2);
        list.append(2.3);
        list.append(3.4);
        list.append(4.5);
        list.append(5.6);
        System.out.println("Element at index 2: " + list.get(2));
        list.insert(6.7, 2);
        System.out.println("Element at index 2 after insertion: " + list.get(2));
        list.remove(2);
        System.out.println("Element at index 2 after removal: " + list.get(2));
        System.out.println("Final List: ");
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        BasicStatistic stats = new BasicStatistic(list);
        System.out.println("Max: " + stats.max());
        System.out.println("Min: " + stats.min());
        System.out.println("Mean: " + stats.mean());
        System.out.println("Variance: " + stats.variance());
    }


    public static void testMyLinkedList() {

        MyLinkedList list = new MyLinkedList();

        list.append(1.2);
        list.append(2.3);
        list.append(3.4);
        list.append(4.5);
        list.append(5.6);

        System.out.println("List after appending: ");
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("Element at index 2: " + list.get(2));

        list.insert(6.7, 2);
        System.out.println("Element at index 2 after insertion: " + list.get(2));

        System.out.println("List after insertion: ");
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        list.remove(2);
        System.out.println("Element at index 2 after removal: " + list.get(2));

        System.out.println("Final List: ");
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        BasicStatistic stats = new BasicStatistic(list);
        System.out.println("Max: " + stats.max());
        System.out.println("Min: " + stats.min());
        System.out.println("Mean: " + stats.mean());
        System.out.println("Variance: " + stats.variance());
    }

}
