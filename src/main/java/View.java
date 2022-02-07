public class View {
    private ConsoleClock clock;

    public View(ConsoleClock clock) {
        this.clock = clock;
    }

    public void update(){
        clock.render();
    }
}
