import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        String result;

        do {
            System.out.print("Nhập số (nhập 0 để thoát): ");
            number = scanner.nextInt();
            result = "";

            if (number == 0) {
                result = "zero";
            } else if (number < 0 || number > 9999) {
                result = "Lỗi: Số nhập vào không hợp lệ!";
            } else {
                int hangTramNghin = number / 100000;
                int hangChucNghin = (number % 100000) / 10000;
                int hangNghin = (number % 10000) / 1000;
                int hangTram = (number % 1000) / 100;
                int hangChuc = (number % 100) / 10;
                int hangDonVi = number % 10;

                if (hangTramNghin > 0) {
                    result += convertToWord(hangTramNghin) + " hundred ";
                }

                if (hangChucNghin > 0) {
                    if (hangChucNghin == 1) {
                        result += "ten ";
                    } else {
                        result += convertToWord(hangChucNghin) + "ty ";
                    }
                } else if (hangNghin > 0) {
                    result += convertToWord(hangNghin) + " thousand ";
                }

                if (hangTram > 0) {
                    result += convertToWord(hangTram) + " hundred ";
                }

                if (hangChuc > 0) {
                    if (hangChuc == 1) {
                        result += convertToWord(hangChuc * 10 + hangDonVi);
                    } else {
                        result += convertToWord(hangChuc * 10) + " ";
                        if (hangDonVi > 0) {
                            result += convertToWord(hangDonVi);
                        }
                    }
                } else if (hangDonVi > 0) {
                    result += convertToWord(hangDonVi);
                }
            }

            System.out.println(result);
        } while (number != 0);

        scanner.close();
    }

    public static String convertToWord(int number) {
        String word = "";
        switch (number) {
            case 1:
                word = "one";
                break;
            case 2:
                word = "two";
                break;
            case 3:
                word = "three";
                break;
            case 4:
                word = "four";
                break;
            case 5:
                word = "five";
                break;
            case 6:
                word = "six";
                break;
            case 7:
                word = "seven";
                break;
            case 8:
                word = "eight";
                break;
            case 9:
                word = "nine";
                break;
            case 10:
                word = "ten";
                break;
            case 11:
                word = "eleven";
                break;
            case 12:
                word = "twelve";
                break;
            case 13:
                word = "thirteen";
                break;
            case 14:
                word = "fourteen";
                break;
            case 15:
                word = "fifteen";
                break;
            case 16:
                word = "sixteen";
                break;
            case 17:
                word = "seventeen";
                break;
            case 18:
                word = "eighteen";
                break;
            case 19:
                word = "nineteen";
                break;
            case 20:
                word = "twenty";
                break;
            case 30:
                word = "thirty";
                break;
            case 40:
                word = "forty";
                break;
            case 50:
                word = "fifty";
                break;
            case 60:
                word = "sixty";
                break;
            case 70:
                word = "seventy";
                break;
            case 80:
                word = "eighty";
                break;
            case 90:
                word = "ninety";
                break;
        }
        return word;
    }
}
