class Pair <T,V> {
    private final T value;
    private final V secondValue;

    private Pair(T value, V secondValue) {
        this.value = value;
        this.secondValue = secondValue;
    }

    public static <T,V> Pair<T,V> of(T value,V secondValue) {
        return new Pair<>(value,secondValue);
    }

    public T getFirst() {
        return value;
    }

    public V getSecond() {
        return secondValue;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj instanceof Pair<?, ?> && Objects.equals(value, ((Pair<?, ?>) obj).value) &&
                Objects.equals(secondValue, ((Pair<?, ?>) obj).secondValue);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value) + Objects.hashCode(secondValue);
    }
}

