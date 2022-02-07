import java.io.*;

public class TestOoutput {
    public static void main(String[] args) throws InterruptedException {
        var view = new View(new ConsoleClockImpl());

        while(true){
            view.update();
            Thread.sleep(1000);
        }
    }
}
