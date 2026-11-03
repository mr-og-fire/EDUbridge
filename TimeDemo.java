class Time {
    int totalSeconds;
    Time(int seconds) { totalSeconds = seconds; }
    Time(int minutes, int seconds) {
        totalSeconds = minutes * 60 + seconds;
    }
    Time(int hours, int minutes, int seconds) {
        totalSeconds = hours * 3600 + minutes * 60 + seconds;
    }
    void display() {
        int h = totalSeconds / 3600;
        int m = (totalSeconds % 3600) / 60;
        int s = totalSeconds % 60;
        System.out.println("Total seconds: " + totalSeconds);
        System.out.println(h + " hours, " + m + " minutes, " + s + " seconds");
    }
}

public class TimeDemo {
    public static void main(String[] args) {
        new Time(90).display();
        new Time(2, 30).display();
        new Time(1, 2, 30).display();
    }
}
