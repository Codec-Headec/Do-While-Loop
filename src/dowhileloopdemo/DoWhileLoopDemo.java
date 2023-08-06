package dowhileloopdemo;

public class DoWhileLoopDemo {
    public static void main(String[] args) {
        int r = 1;

        do {
            System.out.println(r++);
        } while (r <= 3);
    }
}