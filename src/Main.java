import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // viết 1 chương trình cho phép nhập vào 3 cạnh của 1 tam giac , kiểm tra xem tam giác đó thuộc loại nào : ko hợp lệ, tam giác vuông, tam giác cân, tam giác đều,
        // nếu là tam giác thì tính chu vi và diện tích của tam giác đó,  diện tích tính theo công thức heron
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập độ dài cạnh a: ");
        double a = input.nextDouble();
        System.out.println("Nhập độ dài cạnh b: ");
        double b = input.nextDouble();
        System.out.println("Nhập độ dài cạnh c: ");
        double c = input.nextDouble();

        if (isValidTriangle(a, b, c)) {
            String loai = getTriangleType(a, b, c);
            System.out.println("Loại tam giác: " + loai);

            double chuvi = getPerimeter(a, b, c);
            System.out.println("Chu vi tam giác: " + chuvi);

            double dientich = getArea(a, b, c);
            System.out.println("Diện tích tam giác: " + dientich);
        } else {
            System.out.println("Đây không phải là một tam giác hợp lệ!");
        }

        input.close();
    }

    public static boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static String getTriangleType(double a, double b, double c) {
        if (a == b && b == c) {
            return "Tam giác đều";
        } else if (a == b || a == c || b == c) {
            return "Tam giác cân";
        } else if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2) || Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2) || Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)) {
            return "Tam giác vuông";
        } else {
            return "Tam giác thường";
        }
    }

    public static double getPerimeter(double a, double b, double c) {
        return a + b + c;
    }

    public static double getArea(double a, double b, double c) {
        double s = (a + b + c) / 2; // Nửa chu vi
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Công thức Heron
    }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("hãy nhập vào 1 số nguyên dương");
//        int number = Integer.parseInt(sc.nextLine());
//        if (number % 2 == 0) {
//            System.out.printf("\u001B[32mSố %d là số chẵn !", number);
//        } else {
//            System.out.printf("\u001B[32mSố %d là số lẻ !", number);
//        }
//        // switch case
//        switch (number) {
//            case 0:
//                System.out.println("Số không");
//                break;
//            case 1:
//                System.out.println("Số Một");
//                break;
//            case 2:
//                System.out.println("Số Hai");
//                break;
//            case 3:
//                System.out.println("Số Ba");
//                break;
//            case 4:
//                System.out.println("Số Bốn");
//                break;
//            case 5:
//                System.out.println("Số Năm");
//                break;
//            case 6:
//                System.out.println("Số Sáu");
//                break;
//            case 7:
//                System.out.println("Số Bảy");
//                break;
//            case 8:
//                System.out.println("Số Tám");
//                break;
//            case 9:
//                System.out.println("Số Chín");
//                break;
//            default:
//                System.out.println("Không hỗ trợ");
//
//
//        }
//        if (number % 4 == 0) {
//            if (number % 100 == 0) {
//                if (number % 400 == 0) {
//                    System.out.println("là năm nhuận");
//                } else {
//                    System.out.println("không phải năm nhuận");
//                }
//            } else {
//                System.out.println("là  năm nhuận");
//            }
//        } else {
//            System.out.println("không phải năm nhuận");
//        }


    }
