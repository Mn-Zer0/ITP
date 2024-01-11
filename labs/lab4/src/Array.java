public class Array {
    public static double calculateAverage(Object[] array) throws IllegalArgumentException {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Массив NULL или пуст");
        }
        double sum = 0;
        int count = 0;
        for (Object element : array) {
            if (element instanceof Number) {
                sum += ((Number) element).doubleValue();
                count++;
            } else {
                throw new IllegalArgumentException("Массив содержит нечисловой объект");
            }
        }
        if (count == 0) {
            throw new IllegalArgumentException("Массив не содержит элементов, являющихся числами");
        }
        return sum / count;
    }
    public static void main(String[] args) {
        try {
            Object[] numbers = {1, 2, 3, 53, 9, 6}; // Пример массива с неверными данными
            double average = calculateAverage(numbers);
            System.out.println("Среднее арифметическое: " + average);
        } catch (IllegalArgumentException e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}