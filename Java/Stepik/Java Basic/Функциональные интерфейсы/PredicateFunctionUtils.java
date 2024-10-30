public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
            Function<T, U> func = t -> condition.test(t) ? ifTrue.apply(t) : ifFalse.apply(t);
            return func;
    }

/*Лямбда-выражения как реализации функциональных интерфейсов
Лямбда-выражения можно рассматривать как краткую реализацию функциональных интерфейсов. 
Когда лямбда-выражение присваивается переменной типа функционального интерфейса, оно обеспечивает реализацию единственного абстрактного метода интерфейса.

Вот пример с учетом SimpleFunctionalInterface:

SimpleFunctionalInterface sfi = () -> System.out.println("Lambda implementation");
sfi.execute(); // Выводы: реализация Lambda

Этот код показывает, как лямбда-выражение используется для реализации метода execute SimpleFunctionalInterface. */
