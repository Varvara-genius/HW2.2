public class Main {

    static int sum = 0;
    static String[][] arr = new String[][]{{"5", "6", "7", "8"}, {"1", "2", "3", "4"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
    static String[][] checkSize = new String[][]{{"5", "6", "7", "8"}, {"1", "2", "3", "4"}};
    static String[][] checkData = new String[][]{{"5", "6", "7", "8"}, {"1", "2", "f", "4"}, {"9", "10", "11", "12"}, {"13", "a", "15", "16"}};
    static String[][] checkSizeData = new String[][]{{"5", "f", "7", "8"}, {"1", "2", "3", "4"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}, {"1", "2", "3", "a"}};

    public static void main(String[] args) {

        try {
            check(arr);
        } catch (MyArraySizeException e) {
            System.out.println(" Введен не верный размер массива ");
        }
        try {
            check2(arr);
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

    }


    public static void check(String[][] arr) throws MyArraySizeException {
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }

        }


    }

    public static void check2(String[][] arr) throws MyArrayDataException {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(" Не верное значение в ячейке: " + i + "x" + j);
                }
            }
        }
        if (arr.length == 4) {
            System.out.println(" Сумма элементов массива: " + sum);
        }
    }
}









