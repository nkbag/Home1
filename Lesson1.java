public class Lesson1 {
    public static int[] Array(int[] m1, int[] m2) throws Exception {
        int[] m3 = new int[m1.length];
        if (m1.length != m2.length)
            throw new Exception("Длины массивов не равны");
        for (int i = 0; i < m1.length; i++) {
            m3[i] = m1[i] - m2[i];
            System.out.print(m3[i] + " ");
        }
        return m3;
    };

    public static int[] Array2(int[] m1, int[] m2) throws Exception {
        int[] m3 = new int[m1.length];
        if (m1.length != m2.length)
            throw new Exception("Длины массивов не равны");
        for (int i = 0; i < m1.length; i++) {
            m3[i] = m1[i] / m2[i];
            System.out.print(m3[i] + " ");
        }
        return m3;
    };

    public static void main(String[] args) {
        int[] Arr = new int[3];
        try {
            Arr[0] = 1;
            Arr[1] = 0;
            Arr[2] = Arr[0] / Arr[1];
            Arr[3] = Integer.parseInt("hello");
            Arr[4] = 3;
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        } catch (NumberFormatException e) {
            System.out.println("Нельзя преобразовать строку в число!");
        }

        try {
            Lesson1.Array(new int[] { 2, 4, 6 }, new int[] { 9, 7, 3 });
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        try {
            Lesson1.Array2(new int[] { 2, 4, 6 }, new int[] { 9, 7, 3 });
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}