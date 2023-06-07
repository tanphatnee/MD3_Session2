import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 23000;
        System.out.println("Nhập số đô la mỹ: ");
        int usd = scanner.nextInt();
        int vnd = usd * rate;
        System.out.println("Với " + usd + "đô la mỹ , chũng ta sẽ đổi được"+ vnd + "vnd");
    }
}