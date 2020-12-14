package concepts;
import java.util.stream.Stream;

public class JavaStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream.of("Zen", "Alan", "Mary", "Daniel").filter(s -> s.contains("a")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
	}
}
