
import java.util.Scanner;

class Book {

    private int pageNum;

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        if (pageNum > 0) {
            this.pageNum = pageNum;
        }
    }

}

class Practice1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pageNum = sc.nextInt();

        Book b1 = new Book();
        b1.setPageNum(pageNum);

        System.out.println(b1.getPageNum());
    }
}
