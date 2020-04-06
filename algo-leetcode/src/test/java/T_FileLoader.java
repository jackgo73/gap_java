import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class T_FileLoader {
    public static int[] loadCommaSepArrayToInts(String path) throws IOException {
        Stream<String> str = Files
                .lines(Paths.get(path))
                .flatMap(word -> Arrays.stream(word.split(",")));
//        return str.mapToInt(s -> Integer.valueOf(s)).boxed().collect(toList());
        return str.mapToInt(s -> Integer.valueOf(s)).toArray();
    }

    public static List<Integer> loadCommaSepArrayToList(String path) throws IOException {
        Stream<String> str = Files
                .lines(Paths.get(path))
                .flatMap(word -> Arrays.stream(word.split(",")));
        return str.mapToInt(s -> Integer.valueOf(s)).boxed().collect(toList());
    }

    @Test
    public void testCase() throws IOException {
        String path = this.getClass().getResource("L_00042_TrapTest_TestCase2").getFile();
        T_FileLoader.loadCommaSepArrayToInts(path);
    }
}
