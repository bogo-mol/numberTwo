public class Main {
    public static void main(String[] args) {
        String[][] matrix = new String[4][4];
        matrix[0][0] = "1234";
        matrix[3][1] = "3452";
        matrix[3][2] = "1524";
        MyArray myArray = new MyArray();
        myArray.matrix(matrix);
    }
}