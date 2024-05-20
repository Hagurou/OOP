package hus.oop.mylist;

public class BasicStatistic {
    private MyList data;

    /**
     * Khởi tạo dữ liệu cho BasicStatistic.
     */
    public BasicStatistic(MyList data) {
        /* TODO */
        this.data = data;
    }

    /**
     * Lấy giá trị lớn nhất trong list.
     * @return giá trị lớn nhất.
     */
    public double max() {
        /* TODO */
        double max = Double.MIN_VALUE;
        for(int i = 0; i < data.size(); i++){
            double value = (double) data.get(i);
            if(value > max){
                max = value;
            }
        }
        return max;
    }

    /**
     * Lấy giá trị nhỏ nhất trong list.
     * @return giá trị nhỏ nhất.
     */
    public double min() {
        /* TODO */
        double min = Double.MAX_VALUE;
        for(int i = 0; i < data.size(); i++){
            double value = (double) data.get(i);
            if(value < min){
                min = value;
            }
        }
        return min;
    }

    /**
     * Tính kỳ vọng của mẫu lưu trong list.
     * @return kỳ vọng.
     */
    public double mean() {
        /* TODO */
        double sum = 0;
        for(int i = 0; i < data.size(); i++){
            sum += (double) data.get(i);
        }
        return sum / data.size();
    }

    /**
     * Tính phương sai của mẫu lưu trong list.
     * @return phương sai.
     */
    public double variance() {
        /* TODO */
        double sum = 0;
        for(int i = 0; i < data.size(); i++){
            sum += ((double)data.get(i) - mean())*((double)data.get(i) - mean());
        }
        return sum / data.size();
    }
}
