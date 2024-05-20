package hus.oop.midterm.statistics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayDataSet extends AbstractDataSet {
    private static final int DEFAULT_CAPACITY = 2;
    private double[] data;
    private int size;

    /**
     * Hàm dựng để khởi tạo dữ liệu.
     */
    public ArrayDataSet() {
        /* TODO */
        data = new double[DEFAULT_CAPACITY];
    }

    @Override
    public int size() {
        /* TODO */
        return size;
    }

    @Override
    public double element(int index) {
        /* TODO */
        return data[index];
    }

    @Override
    public double[] elements(int from, int to) {
        /* TODO */
        double[] res = new double[to - from];
        System.arraycopy(data, from, res, 0, to - from);
        return res;
    }

    /**
     * Thêm phần tử dữ liệu vào cuối mảng dữ liệu.
     * Nếu mảng không còn chỗ, mở rộng mảng để có thể chứa thêm dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void append(double value) {
        /* TODO */
        enlarge();
        data[size] = value;
        size++;
    }

    /**
     * Thêm phần tử dữ liệu vào vị trí index của mảng dữ liệu.
     * Nếu mảng không còn chỗ, mở rộng mảng để có thể chứa thêm dữ liệu.
     * @param value
     * @param index
     */
    @Override
    public void insert(double value, int index) {
        /* TODO */
        enlarge();
        for(int i = size() - 1; i >= index; i--){
            data[i + 1] = data[i];
        }
        data[index] = value;
        size++;
    }

    /**
     * Xóa phần tử dữ liệu tại vị trí index.
     * @param index
     */
    @Override
    public void remove(int index) {
        /* TODO */
        for(int i = index; i < size() - 1; i++){
            data[i] = data[i + 1];
        }
        size--;
    }

    /**
     * Xóa tất cả các phần tử dữ liệu có giá trị bằng value.
     * @param value
     */
    @Override
    public void remove(double value) {
        /* TODO */
        List<Double> list = new ArrayList<>();
        for(int i = 0; i < size(); i++){
            if(data[i] != value){
                list.add(data[i]);
            }
        }
        data = new double[size];
        for(int i = 0; i < list.size(); i++){
            data[i] = list.get(i);
        }
    }

    /**
     * Mở rộng gấp đôi kích thước mảng nếu hết chỗ để chứa dữ liệu.
     */
    private void enlarge() {
        /* TODO */
        if(size == data.length){
            data = Arrays.copyOf(data, size*2);
        }
    }
}
