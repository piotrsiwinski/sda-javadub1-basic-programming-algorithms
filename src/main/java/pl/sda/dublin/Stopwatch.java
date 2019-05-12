package pl.sda.dublin;

public class Stopwatch {
    private long startTime;
    private long stopTime;
    private long elapsedTime;

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.stopTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        elapsedTime = stopTime - startTime;
        return elapsedTime;
    }
}
