/*Напишите класс AsciiCharSequence, реализующий компактное хранение последовательности ASCII-символов (их коды влезают в один байт) в массиве байт. 
По сравнению с классом String, хранящим каждый символ как char, AsciiCharSequence будет занимать в два раза меньше памяти.
Класс AsciiCharSequence должен:

 1) реализовывать интерфейс java.lang.CharSequence;
 2) иметь конструктор, принимающий массив байт;
 3) определять методы length(), charAt(), subSequence() и toString()
    
Сигнатуры методов и ожидания по их поведению смотрите в описании интерфейса java.lang.CharSequence (JavaDoc или исходники).
В данном задании методам charAt() и subSequence() всегда будут подаваться корректные входные параметры,
поэтому их проверкой и обработкой ошибок заниматься не нужно.
Тем более мы еще не проходили исключения. */

public class AsciiCharSequence implements java.lang.CharSequence  {
    private byte[] array;
    public AsciiCharSequence (byte[] array){
        this.array = array;
    }
    @Override
    public int length() {
        return array.length;
    }

    @Override
    public char charAt(int index) {
        return (char) array[index];
    }

    @Override
    public AsciiCharSequence subSequence(int start, int end) {
        int length = end - start;
        byte[] bytes = new byte[length];
        for (int i = 0, j = start; i < length; i++, j++) {
            bytes[i] = array[j];
        }
        return new AsciiCharSequence(bytes);
    }

    @Override
    public String toString(){
        return new String(array, StandardCharsets.UTF_8);
    }
}
