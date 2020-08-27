package snippets;

import model.IndexedValue;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) throws IllegalAccessException {
        List<String> jdkList = List.of("JDK 1.0", "JDK 8", "JDK 14");
        List<Integer> years = List.of(1995, 2012, 2020);
        zip(jdkList, years, (jdk, year) -> jdk + " was released in: " + year).forEach(System.out::println);
    }

    /**
     * Make the source of list elements along with indices.
     */

    public static <T> Stream<IndexedValue<T>> withIndices(List<T> list) {
        return IntStream.range(0, list.size()).mapToObj(value -> new IndexedValue<>(value, list.get(value)));
    }

    /**
     * Zip two lists together.
     */

    public static <T1, T2, R> Stream<R> zip(List<T1> listOne, List<T2> listTwo, BiFunction<? super T1, ? super T2, ? extends R> mapper) throws IllegalAccessException {
        if (listTwo.size() != listOne.size()) {
            throw new IllegalAccessException("Different list sizes");
        }

        return IntStream.range(0, listOne.size())
                .mapToObj(value -> mapper.apply(listOne.get(value), listTwo.get(value)));
    }

    /**
     * Leave only elements of a given type in the stream.
     */

    public static <T, R> Function<T, Stream<R>> select(Class<R> classParam) {
        return t -> classParam.isInstance(t) ? Stream.of(classParam.cast(t)) : null;
    }

    public static <T> Stream collectionOfClasses(List values, Class filteredClass) {
        return IntStream.range(0, values.size())
                .mapToObj(values::indexOf)
                .flatMap(select(filteredClass));
    }


    /**
     * Leave only values that repeat n times
     */

    public static <T> Predicate<T> distinct(long atLeast) {
        Map<T, Long> map = new ConcurrentHashMap<>();
        return t -> map.merge(t, 1L, Long::sum) == atLeast;
    }

    /**
     * Transform list<Map<K,V> into Map<K, List<V>>
     */

    <T, U> Map<T, List<U>> mapsConverters(List<Map<T, U>> maps) {
        return maps.stream()
                .flatMap(map -> map.entrySet().stream())
                .collect(Collectors.groupingBy(Map.Entry::getKey,
                        Collectors.mapping(Map.Entry::getValue,
                                Collectors.toList())));
    }
}
