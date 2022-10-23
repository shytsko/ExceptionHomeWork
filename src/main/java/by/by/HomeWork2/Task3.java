//Дан следующий код, исправьте его там, где требуется

package by.by.HomeWork2;

public class Task3 {
    public static void main(String[] args) throws Exception {
        int a = 90;
        int b = 3;
        try {
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (ArithmeticException ex) {
            System.out.println("Деление на 0!");
        }
        catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
        catch (Exception ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) throws NullPointerException {
        System.out.println(a + b);
    }

}
