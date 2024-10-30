/*Реализуйте метод, позволяющий другим методам узнать, откуда их вызвали.
Метод getCallerClassAndMethodName() должен возвращать имя класса и метода, откуда вызван метод, вызвавший данный утилитный метод.
Или null (нулевую ссылку, а не строку "null"), если метод, вызвавший getCallerClassAndMethodName() является точкой входа в программу, т.е. его никто не вызывал. */

public static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTraceElements = new Throwable().getStackTrace();
        if (stackTraceElements.length <= 2) {
            return null;
        }
        String[] result = String.valueOf(stackTraceElements[2]).split("\\.");
        String[] second = result[1].split("\\(");
        return result[0] + "#" + second[0];
    }
