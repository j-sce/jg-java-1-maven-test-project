package student_julija_scerbicka.lesson_8;

class Calculator {
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int difference(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int product(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int ratio(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        return Math.max(firstNumber, secondNumber);
    }

    public int maxOfThreeNumbers(int a, int b, int c) {
        if (a == b && a == c) {
            return a;
        } else if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else if (c > a && c > b) {
            return c;
        } else if (a == b) {
            return a;
        } else if (a == c) {
            return a;
        } else if (b == c && b < a) {
            return a;
        } else if (b == c) {
            return b;
        }
        return a;
    }

}
