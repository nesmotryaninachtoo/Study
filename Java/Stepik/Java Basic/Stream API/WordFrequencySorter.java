import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in, StandardCharsets.UTF_8 );
        BufferedReader bf = new BufferedReader(isr);
        String input = bf.readLine().replaceAll("-", " ")
                .replaceAll("[^а-яА-ЯёЁa-zA-Z0-9\\s]", ""); 

        List<String> inputList = new ArrayList<>(Arrays.asList(input.split(" ")));
        Map<String, Long> inputMap = inputList.
                stream().
                collect(
                        Collectors.
                                groupingBy(String::toLowerCase, Collectors.counting())
                );
        inputMap.entrySet().stream().sorted((item1, item2) ->
                        !item1.getValue().equals(item2.getValue()) ?
                                -item1.getValue().compareTo(item2.getValue()) :
                                item1.getKey().compareTo(item2.getKey())).limit(10)
                .forEach(n -> System.out.println(n.getKey()));
    }
}
