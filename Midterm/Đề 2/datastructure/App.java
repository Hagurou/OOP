package hus.oop.datastructure;

import java.util.Arrays;
import java.util.Random;
public class App {
    public static void main(String[] args) {
        testStack();
        testQueue();
        /*
        Yêu cầu:

        - Hoàn thiện code chương trình theo mẫu đã cho.

        - Sinh ra một số tự nhiên ngẫu nhiên nằm trong đoạn [15 - 30], gọi là n.
        - Sinh ra n số nguyên ngẫu nhiên, cho vào stack.
            + In ra các phần tử trong stack.
            + Lần lượt xóa các phần tử trong stack. Sau mỗi lần xóa, in ra các phần tử còn lại trong stack.

        - Sinh ra n số nguyên ngẫu nhiên, cho vào queue.
            + In ra các phần tử trong queue.
            + Lần lượt xóa các phần tử trong queue. Sau mỗi lần xóa, in ra các phần tử còn lại trong queue.
        */

    }

    public static void testStack() {
        /* TODO */
        MyStack stack = new MyStack();
        Random rand = new Random();
        int n = rand.nextInt(16) + 15;
        for(int i = 0; i < n; i++){
            stack.push(rand.nextInt());
        }
        System.out.println("Stack elements: " + Arrays.toString(stack.toArray()));
        while(!stack.isEmpty()){
            stack.remove();
            System.out.println("Elements left: " + Arrays.toString(stack.toArray()));
        }
    }

    public static void testQueue() {
        /* TODO */
        MyQueue queue = new MyQueue();
        Random rand = new Random();
        int n = rand.nextInt(16) + 15;
        for(int i = 0; i < n; i++){
            queue.add(rand.nextInt());
        }
        System.out.println("Queue elements: " + Arrays.toString(queue.toArray()));
        while(!queue.isEmpty()){
            queue.removeWithoutReturn();
            System.out.println("Elements left: " + Arrays.toString(queue.toArray()));
        }
    }
}
