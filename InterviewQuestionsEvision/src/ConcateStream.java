import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcateStream {
    public static void main(String[] args) {

        Stream<Integer> stream1 = Stream.of(1, 2, 3);
        Stream<Integer> stream2 = Stream.of(4, 5, 6);

        Stream<Integer> concatenatedStream = Stream.concat(stream1, stream2);

        List<Integer> result = concatenatedStream.collect(Collectors.toList());
        System.out.println(result);
    }
}
