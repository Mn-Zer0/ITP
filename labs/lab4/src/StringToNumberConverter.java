public class StringToNumberConverter {
    public static int convertStringToNumber(String numberStr) throws CustomNumberFormatException {
        try {
            return Integer.parseInt(numberStr);
        } catch (NumberFormatException e) {
            throw new CustomNumberFormatException("Строка не является числом: " + numberStr);
        }
    }

    public static void main(String[] args) {
        try {
            String numberStr = "451adawdd216"; // Пример строки
            int number = convertStringToNumber(numberStr);
            System.out.println("Число: " + number);
        } catch (CustomNumberFormatException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
