package lop_doituong_trong_java.bai_tap;

public class StopWatch {
    public long starTime = System.currentTimeMillis();
    public long stopTime;

    public StopWatch() {
    }

    public long getStartime() {
        return starTime;
    }

    public long getStoptime() {
        return stopTime;
    }

    public void star() {
        this.starTime = System.currentTimeMillis();
    }

    public void stop() {
        this.stopTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return (this.stopTime - this.starTime);
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        System.out.println("Star time: " + stopWatch.getStartime());
        for (int i = 0; i < 700000; i++) {
            for (int j = 0; j < 700000; j++) {

            }
        }
        stopWatch.stop();
        System.out.println("Stop time: " + stopWatch.getStoptime());
        System.out.println("Elapsed time: " + stopWatch.getElapsedTime());
    }
}
