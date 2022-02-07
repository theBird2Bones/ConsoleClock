import java.util.Date;
import java.util.stream.Stream;

public class ConsoleClockImpl implements ConsoleClock {
    @Override
    public void render() {
        var date = new Date();
        Stream.of(date.getHours(),date.getMinutes(), date.getSeconds())
                .forEach(e -> System.out.println(ConsoleNumbers.concatenate(e / 10, e % 10)));
    }
}
