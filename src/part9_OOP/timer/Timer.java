package part9_OOP.timer;

//https://www.brianheinold.net/java/java_book.html#sec_varloopifexercises
//8.9.187 タイマー：開始、期間確認
//8.9.189 タイマー：停止、続く
public class Timer {
    private long initialTime;
    private long tempDuration;
    private boolean isPaused = false;

    //Constructor
    public Timer() {}

    public void starts() {
        this.setInitialTime(System.currentTimeMillis());
    }

    public void togglePause() {
        if ( this.getIsPaused() ){
            long adjustedInitialTime = System.currentTimeMillis() - this.getTempDuration();
            this.setInitialTime(adjustedInitialTime);
            this.setIsPaused(false);
        } else {
            long temp = System.currentTimeMillis() - this.getInitialTime();  //elapsed duration (millis) before paused
            this.setTempDuration(temp);
            this.setIsPaused(true);
        }
    }

    //Getter
    public long getInitialTime() {
        return initialTime;
    }
    public boolean getIsPaused() {
        return this.isPaused;                   //true = running, false = paused
    }
    public long getTempDuration() {
        return tempDuration;
    }

    //Setter
    public void setInitialTime(long initialTime) {
        this.initialTime = initialTime;
    }
    public void setIsPaused(boolean isPaused){
        this.isPaused = isPaused;
    }
    public void setTempDuration(long tempDuration) {
        this.tempDuration = tempDuration;
    }

    public double elapsedSeconds() {
        if( !this.getIsPaused() ){
            double duration = System.currentTimeMillis() - this.getInitialTime();
            return duration / 1000;             //convert millis -> sec
        } else{
            return this.getTempDuration();
        }
    }

    public static String formattedTime(double duration) {
        int min = (int) duration / 60;
        int sec = (int) duration % 60;

        return String.format("%02d:%02d",min, sec);
    }

    public static void main(String[] args) throws InterruptedException {
        Timer t = new Timer();
        t.starts();
        Thread.sleep(13630);
        double duration = t.elapsedSeconds();
        System.out.println(duration);

        String formatedDuration = Timer.formattedTime(duration);
        System.out.println(formatedDuration);
    }
}
