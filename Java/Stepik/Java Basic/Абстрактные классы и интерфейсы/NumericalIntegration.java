/*Реализуйте метод, выполняющий численное интегрирование заданной функции на заданном интервале по формуле левых прямоугольников.
Функция задана объектом, реализующим интерфейс java.util.function.DoubleUnaryOperator. 
Его метод applyAsDouble() принимает значение аргумента и возвращает значение функции в заданной точке.*/

public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double n = 10000000;
        double result = 0;
        double h = (b - a) / n;
        for(int i = 0; i < n; i++) {
            result += f.applyAsDouble(a+h/2+i*h);
        }
        result *= h;
        return result;
    }
