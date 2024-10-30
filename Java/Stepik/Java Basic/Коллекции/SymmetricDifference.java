public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> firstSet = new HashSet<>(set1);
        Set<T> secondSet = new HashSet<>(set2);
        Set<T> thirdSet = new HashSet<>(set1);
        firstSet.removeAll(secondSet);
        secondSet.removeAll(thirdSet);
        firstSet.addAll(secondSet);

        return firstSet;
    }
