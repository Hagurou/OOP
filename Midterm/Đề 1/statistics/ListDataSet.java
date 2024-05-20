package hus.oop.midterm.statistics;

import java.util.ArrayList;
import java.util.List;

public class ListDataSet extends AbstractDataSet {
    private List<Double> data;

    /**
     * Hàm dựng khởi tạo list để chứa dữ liệu.
     */
    public ListDataSet() {
        /* TODO */
        data = new ArrayList<>();
    }

    @Override
    public int size() {
        /* TODO */
        return data.size();
    }

    @Override
    public double element(int index) {
        /* TODO */
        return data.get(index);
    }

    @Override
    public double[] elements(int from, int to) {
        /* TODO */
        List<Double> subList = data.subList(from, to);
        double[] res = new double[subList.size()];
        for(int i = 0; i < subList.size(); i++){
            res[i] = subList.get(i);
        }
        return res;
    }

    /**
     * Thêm phần tử dữ liệu vào cuối tập dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void append(double value) {
        /* TODO */
        data.add(value);
    }

    /**
     * Thêm phần tử dữ liệu vào vị trí index của tập dữ liệu.
     * @param value
     * @param index
     */
    @Override
    public void insert(double value, int index) {
        /* TODO */
        data.add(index, value);
    }

    /**
     * Xóa phần tử dữ liệu tại vị trí index.
     * @param index
     */
    @Override
    public void remove(int index) {
        /* TODO */
        data.remove(index);
    }

    /**
     * Xóa tất cả các phần tử dữ liệu có giá trị bằng value.
     * @param value
     */
    @Override
    public void remove(double value) {
        /* TODO */
        data.removeIf(n -> n == value);
    }
}
