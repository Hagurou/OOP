package hus.oop.midterm.statistics;

import java.util.Arrays;
public class TestStatistics {
    public static void main(String[] args) {
            ArrayDataSet dataSet = new ArrayDataSet();
            for (int i = 0; i < 10; i++) {
                dataSet.append(i);
            }
            dataSet.insert(10, 0);
            BasicStatistic statistic = new BasicStatistic();
            statistic.setDataSet(dataSet);
            printStatistics(statistic);
            dataSet.remove(0);
            dataSet.remove(dataSet.size() - 1);
            printStatistics(statistic);
        }

        public static void testListDataSet() {
            ListDataSet dataSet = new ListDataSet();
            for (int i = 0; i < 10; i++) {
                dataSet.append(i);
            }
            dataSet.insert(10, 0);
            BasicStatistic statistic = new BasicStatistic();
            statistic.setDataSet(dataSet);
            printStatistics(statistic);
            dataSet.remove(0);
            dataSet.remove(dataSet.size() - 1);
            printStatistics(statistic);
        }
        public static void printStatistics(BasicStatistic statistic) {
            System.out.println("Size: " + statistic.size());
            System.out.println("Max: " + statistic.max());
            System.out.println("Min: " + statistic.min());
            System.out.println("Mean: " + statistic.mean());
            System.out.println("Variance: " + statistic.variance());
            System.out.println("Rank: " + Arrays.toString(statistic.rank()));
            System.out.println("Median: " + statistic.median());
            System.out.println();
        }
        /*
        TODO
        I. Viết các chức năng test cho chương trình.
        Viết hàm test cho ArrayDataSet:
            1. Tạo một tập dữ liệu ít nhất 10 phần tử. Trong đó có test các chức năng:
                + Thêm phần tử vào cuối tập dữ liệu.
                + Thêm phần tử vào đầu tập dữ liệu.
            2. In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).
            3. Xóa một phần tử ở đầu tập dữ liệu và một phần tử ở cuối tập dữ liệu.
            4. In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).

         Viết hàm test cho ListDataSet:
            1. Tạo một tập dữ liệu ít nhất 10 phần tử. Trong đó có test các chức năng:
                + Thêm phần tử vào cuối tập dữ liệu.
                + Thêm phần tử vào đầu tập dữ liệu.
            2. In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).
            3. Xóa một phần tử ở đầu tập dữ liệu và một phần tử ở cuối tập dữ liệu.
            4. In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).

         II. Chạy các hàm test để test chương trình.
         Copy kết quả chạy chương trình và lưu vào file text có tên <Ten_MaSinhVien_Statistics>.txt
         (ví dụ, NguyenVanA_123456S_Statistics.txt).
         Nén các file source code và file text kết quả chạy chương trình theo định dạng .zip,
         đặt tên là <Ten_MaSinhVien_Statistics>.zip (ví dụ, NguyenVanA_123456_Statistics.zip) và nộp lên classroom.
         */
}
