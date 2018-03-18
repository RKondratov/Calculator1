import java.util.Scanner;

/**
 * Created by ��������� on 18.03.2018.
 *
 * @author ���������
 * @version 1.0
 * @see #add(double, double)
 * @see #subtract(double, double)
 * @see #multiply(double, double)
 * @see #divide(double, double)
 */
public class Calculator {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first figure: ");
            double i = sc.nextDouble();
            System.out.println("Enter the second figure: ");
            double j = sc.nextDouble();
            System.out.println("Select the operation: +, - , /, *");
            String text = sc.next();
            if (text.equals("+")) {
                System.out.printf("Result is: %.4f", add(i, j));
            } else if (text.equals("-")) {
                System.out.printf("Result is: %.4f", subtract(i, j));
            } else if (text.equals("*")) {
                System.out.printf("Result is: %.4f", multiply(i, j));
            } else if (text.equals("/")) {
                System.out.printf("Result is: %.4f", divide(i, j));
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }
    }

    /**
     * ����� ��� �������� ���� �����
     *
     * @param i ����� ������� ����� ������ (������ ���������)
     * @param j �����, ������� ����� ������ (������ ���������)
     * @return double value
     */
    public static double add(double i, double j) {
        return i + j;
    }

    /**
     * ����� ��� ��������� �� ������ ����� ������
     *
     * @param i ����� ������� ����� ������ (�����������)
     * @param j �����, ������� ����� ������ (���������)
     * @return double value
     */
    public static double subtract(double i, double j) {
        return i - j;
    }

    /**
     * ����� ��� ��������� ���� �����
     *
     * @param i ����� ������� ����� ������ (������ ���������)
     * @param j �����, ������� ����� ������ (������ ���������)
     * @return double value
     */
    public static double multiply(double i, double j) {
        return i * j;
    }

    /**
     * ����� ��� ������� ������ ����� �� ������
     *
     * @param i �����, ������� ����� ������ (�������)
     * @param j �����, ������� ����� ������ (��������)
     * @return double value
     */
    public static double divide(double i, double j) {
        return i / j;
    }
}
