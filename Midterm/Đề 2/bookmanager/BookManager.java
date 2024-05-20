package hus.oop.bookmanager;

import java.util.*;

public class BookManager {
    private List<Book> bookList;

    public BookManager() {
        bookList = new LinkedList<>();
    }

    public List<Book> getBookList() {
        /* TODO */
        return new LinkedList<>(bookList);
    }

    /**
     * Phương thức kiểm tra xem chỉ số index có nằm trong đoạn [0 - limit] hay không.
     * @param index
     * @param limit
     * @return
     */
    private boolean checkBoundaries(int index, int limit) {
        /* TODO */
        if(index < 0 || index > limit){
            throw new IndexOutOfBoundsException();
        }
        return true;
    }

    /**
     * Thêm book vào cuối danh sách.
     * @param book
     */
    public void append(Book book) {
        /* TODO */
        bookList.add(book);
    }

    /**
     * Thêm book vào danh sách ở vị trí index.
     * @param book
     * @param index
     */
    public void add(Book book, int index) {
        /* TODO */
        bookList.add(index, book);
    }

    /**
     * Xóa book ở vị trí index.
     * @param index
     */
    public void remove(int index) {
        /* TODO */
        bookList.remove(index);
    }

    /**
     * Bỏ book như tham số truyền vào.
     * @param book
     */
    public void remove(Book book) {
        /* TODO */
        bookList.remove(book);
    }

    /**
     * Lấy ra book ở vị trí index
     * @param index
     * @return
     */
    public Book bookAt(int index) {
        /* TODO */
        return bookList.get(index);
    }

    /**
     * Sắp xếp danh sách book theo thứ tự tăng dần theo genre và sau đó đến title.
     * @return
     */
    public List<Book> sortIncreasingByGenreAndTitle() {
        /* TODO */
        Collections.sort(bookList, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                int genreComp = o1.getGenre().compareTo(o2.getGenre());
                if(genreComp != 0){
                    return genreComp;
                }else{
                    return o1.getTitle().compareTo(o2.getTitle());
                }
            }
        });
        return new LinkedList<>(bookList);
    }

    /**
     * Sắp xếp sách theo tiêu chí, đầu tiên theo genre tăng dần, nếu genre như nhau thì theo thứ tự giá giảm dần.
     * Sử dụng giao diện MyBookComparator để thực hiện tiêu chí sắp xếp.
     * @return
     */
    public List<Book> sortIncreasingGenreAndPrice() {
        /* TODO */
        Collections.sort(bookList, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                int genreComp = o1.getGenre().compareTo(o2.getGenre());
                if(genreComp != 0){
                    return genreComp;
                }else{
                    return Double.compare(o2.getPrice(), o1.getPrice());
                }
            }
        });
        return new LinkedList<>(bookList);
    }

    /**
     * Sắp xếp sách theo tiêu chí, đầu tiên theo genre giảm dần, nếu genre như nhau thì theo thứ tự giá giảm dần.
     * Sử dụng giao diện MyBookComparator để thực hiện tiêu chí sắp xếp.
     * @return
     */
    public List<Book> sortDecreasingGenreAndPrice() {
        /* TODO */
        Collections.sort(bookList, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                int genreComp = o2.getGenre().compareTo(o1.getGenre());
                if(genreComp != 0){
                    return genreComp;
                }else{
                    return Double.compare(o2.getPrice(), o1.getPrice());
                }
            }
        });
        return new LinkedList<>(bookList);
    }

    /**
     * Sắp xếp sách theo giá tăng dần.
     * @return
     */
    public List<Book> sortIncreasingPrice() {
        /* TODO */
        Collections.sort(bookList, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });
        return new LinkedList<>(bookList);
    }

    /**
     * Sắp xếp sách theo giá giảm dần.
     * @return
     */
    public List<Book> sortDecreasingPrice() {
        /* TODO */
        Collections.sort(bookList, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Double.compare(o2.getPrice(), o1.getPrice());
            }
        });
        return new LinkedList<>(bookList);
    }

    /**
     * Sắp xếp sách theo số trang tăng dần.
     * @return
     */
    public List<Book> sortIncreasingPages() {
        /* TODO */
        Collections.sort(bookList, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Integer.compare(o1.getPages(), o2.getPages());
            }
        });
        return new LinkedList<>(bookList);
    }

    /**
     * Sắp xếp sách theo số trang giảm dần.
     * @return
     */
    public List<Book> sortDecreasingPages() {
        /* TODO */
        Collections.sort(bookList, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Integer.compare(o2.getPages(), o1.getPages());
            }
        });
        return new LinkedList<>(bookList);
    }

    /**
     * Lọc ra howMany sách có số trang lớn nhất.
     * @param howMany
     * @return
     */
    public List<Book> filterHighestPages(int howMany) {
        /* TODO */
        List<Book> sortedBook = sortIncreasingPages();
        int start = Math.max(0, sortedBook.size() - howMany);
        return sortedBook.subList(start, sortedBook.size());
    }

    /**
     * Lọc ra những sách có số trang cao hơn lowerBound.
     * @param lowerBound
     * @return
     */
    public List<Book> filterBooksPagesHigherThan(double lowerBound) {
        /* TODO */
        List<Book> res = new ArrayList<>();
        for(Book book : bookList){
            if(book.getPages() > lowerBound){
                res.add(book);
            }
        }
        return res;
    }

    /**
     * Lọc ra howMany sách có số trang nhỏ nhất.
     * @param howMany
     * @return
     */
    public List<Book> filterBookLowestPages(int howMany) {
        /* TODO */
        List<Book> sortedBook = sortDecreasingPages();
        int start = Math.max(0, sortedBook.size() - howMany);
        return sortedBook.subList(start, sortedBook.size());
    }
    //nếu sort sử dụng Increasing thì return sortedBook.subList(0, Math.min(howMany, sortedBook.size())) và không cần start;

    /**
     * Lọc ra howMany sách có số trang nhỏ hơn upperBound.
     * @param upperBound
     * @return
     */
    public List<Book> filterBooksPagesLowerThan(double upperBound) {
        /* TODO */
        List<Book> res = new ArrayList<>();
        for(Book book : bookList){
            if(book.getPages() < upperBound){
                res.add(book);
            }
        }
        return res;
    }

    /**
     * Lọc ra những sách theo nhà xuất bản.
     * @param publisher
     * @return
     */
    public List<Book> filterBooksOfPublisher(String publisher) {
        /* TODO */
        List<Book> res = new ArrayList<>();
        for(Book book : bookList){
            if(book.getPublisher().equals(publisher)){
                res.add(book);
            }
        }
        return res;
    }

    /**
     * Lọc ra những sách theo thể loại.
     * @param genre
     * @return
     */
    public List<Book> filterBooksOfGenre(String genre) {
        /* TODO */
        List<Book> res = new ArrayList<>();
        for(Book book : bookList){
            if(book.getGenre().equals(genre)){
                res.add(book);
            }
        }
        return res;
    }

    /**
     * Lọc ra những sách theo tác giả.
     * @param author
     * @return
     */
    public List<Book> filterBooksOfAuthor(String author) {
        /* TODO */
        List<Book> res = new ArrayList<>();
        for(Book book : bookList){
            if(book.getAuthor().equals(author)){
                res.add(book);
            }
        }
        return res;
    }

    public static String titleOfBooksToString(List<Book> bookList) {
        StringBuilder titleOfBooks = new StringBuilder();
        titleOfBooks.append("[\n");
        for (Book book : bookList) {
            titleOfBooks.append(book.getTitle()).append("\n");
        }
        return titleOfBooks.toString().trim() + "\n]";
    }

    public static void print(List<Book> bookList) {
        StringBuilder booksString = new StringBuilder();
        booksString.append("[\n");
        for (Book book : bookList) {
            booksString.append(book.toString()).append("\n");
        }
        System.out.print(booksString.toString().trim() + "\n]");
    }
}
