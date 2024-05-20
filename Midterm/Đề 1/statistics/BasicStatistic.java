package hus.oop.midterm.statistics;

import java.sql.Array;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Map;

public class BasicStatistic implements Statistic {
    private DataSet dataSet;

    /**
     * Hàm dựng khởi tạo tập dữ liệu.
     */
    public BasicStatistic() {
        /* TODO */
        this.dataSet = null;
    }

    public void setDataSet(DataSet dataSet) {
        /* TODO */
        this.dataSet = dataSet;
    }

    @Override
    public int size() {
        /* TODO */
        return dataSet == null ? 0 : dataSet.size();
    }

    @Override
    public double max() {
        if(dataSet == null || dataSet.size() == 0){
            return Double.NaN;
        }
        double max = dataSet.element(0);
        for(int i = 1; i < dataSet.size(); i++){
            if(dataSet.element(i) > max){
                max = dataSet.element(i);
            }
        }
        return max;
    }

    @Override
    public double min() {
        /* TODO */
        if(dataSet == null || dataSet.size() == 0){
            return Double.NaN;
        }
        double min = dataSet.element(0);
        for(int i = 1; i < dataSet.size(); i++){
            if(dataSet.element(i) < min){
                min = dataSet.element(i);
            }
        }
        return min;
    }

    @Override
    public double mean() {
        /* TODO */
        if(dataSet == null || dataSet.size() == 0){
            return Double.NaN;
        }
        double sum = 0;
        for(int i = 1; i <= dataSet.size(); i++){
            sum += dataSet.element(i);
        }
        return sum / dataSet.size();
    }

    @Override
    public double variance() {
        /* TODO */
        if(dataSet == null || dataSet.size() == 0){
            return Double.NaN;
        }
        double sum = 0;
        for(int i = 1; i <= dataSet.size(); i++){
            sum += (dataSet.element(i) - mean())*(dataSet.element(i) - mean());
        }
        return sum / dataSet.size();
    }
    @Override
    public double[] rank() {
        /* TODO */
        int n = dataSet.size();
        Map<Double, List<Integer>> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            double element = dataSet.element(i);
            map.putIfAbsent(element, new ArrayList<>());
            map.get(element).add(i);
        }

        double[] ranks = new double[map.size()];
        int rank = 1;
        int index = 0;
        for (List<Integer> indices : map.values()) {
            double avgRank = (rank + rank + indices.size() - 1) / 2.0;
            ranks[index++] = avgRank;
            rank += indices.size();
        }

        return ranks;
    }

    @Override
    public double median() {
        /* TODO */
        if(dataSet.size() % 2 != 0){
            return dataSet.element(dataSet.size() / 2);
        }
        return (Math.ceil(dataSet.size() / 2) + Math.floor(dataSet.size() / 2)) / 2;
    }
}
