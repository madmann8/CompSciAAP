package ObjectNotes;

/**
 * Created by madmann on 10/4/16.
 */
public class Clock {
    int hours;
    boolean isTicking;
    Integer diff;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public boolean isTicking() {
        return isTicking;
    }

    public void setTicking(boolean ticking) {
        isTicking = ticking;
    }

    public Integer getDiff() {
        return diff;
    }

    public void setDiff(Integer diff) {
        this.diff = diff;
    }
}
