public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<? extends T> list = stream.collect(Collectors.toList());
        Optional<? extends T> min = list.stream().min(order);
        Optional<? extends T> max = list.stream().max(order);
        if (max.isPresent() && min.isPresent()){
            minMaxConsumer.accept(min.get(),max.get());
        } else {
            minMaxConsumer.accept(null,null);
        }
    }
