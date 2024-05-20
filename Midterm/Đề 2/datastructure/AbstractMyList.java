package hus.oop.datastructure;

public abstract class AbstractMyList implements MyList {
    /**
     * Phương thức kiểm tra xem index có nằm trong đoạn [0 - limit] không.
     * @param index
     * @param limit
     * @return
     */
    public boolean checkBoundaries(int index, int limit) {
        /* TODO */
        if(index < 0 || index > limit){
            throw new IndexOutOfBoundsException();
        }
        return true;
    }

    /**
     * Mô tả tập dữ liệu.
     * @return mô tả tập dữ liệu theo định dạng [a1, a2, a3, ..., an].
     */
    @Override
    public String toString() {
        /* TODO */
        StringBuilder sb = new StringBuilder("[");
        for(int i = 0; i < size(); i++){
            sb.append(get(i) + ", ");
            if(i == size() - 1){
                sb.append("]");
            }
        }
        return sb.toString();
    }
}
