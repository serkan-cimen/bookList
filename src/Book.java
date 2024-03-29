public class Book {

    private String name;
    private int pageNo;
    private String authorName;
    private int year;

    public Book(String name, int pageNo, String authorName, int year) {
        super();
        this.name = name;
        this.pageNo = pageNo;
        this.authorName = authorName;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
