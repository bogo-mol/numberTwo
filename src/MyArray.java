public class MyArray {

    public void matrix(String[][] matrix) {
        try {
            if (matrix.length != 4 || matrix[0].length != 4) {
                throw new MyArraySizeException();
            }
            System.out.println("All right");
        } catch (MyArraySizeException myArraySizeException) {
            System.out.println("Exception");
        }
        int count = 0;
        for (String[] strings : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                try {
                    if (strings[j] == null) {
                        count = count + 1;
                        throw new MyArrayDataException();
                    } else {
                        Integer number = Integer.valueOf(strings[j]);
                        System.out.println(number);
                    }
                } catch (MyArrayDataException myArrayDataException) {
                    System.out.println("Пусто");
                }

            }
        }
        System.out.println(count + " - количество пустых ячеек");
    }
}

