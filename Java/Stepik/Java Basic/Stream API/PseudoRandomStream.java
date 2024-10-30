public static IntStream pseudoRandomStream(int seed) {
    return IntStream.iterate(seed, el -> ((el*el) % 10000 / 10));
}
