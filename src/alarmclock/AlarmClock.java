/*
Alarm Clock
 */
package alarmclock;

/**
 *
 * @author Matt
 */

import java.text.DecimalFormat;

public class AlarmClock {

    /**
     * @param args the command line arguments
     */
    
    private int currentHour;
    private int currentMin;
    private int currentSec;
    private int alarmHour;
    private int alarmMin;
    private boolean alarmOn;
    private boolean displayIn24;
    
    public AlarmClock(){
        currentHour=alarmHour=currentMin=currentSec=alarmMin=0;
        alarmOn=false;
        displayIn24=false;
    }
    public void setTime(int hour, int min, int sec){
        currentHour=hour;
        currentMin=min;
        currentSec=sec;
    }
    
    public void tick(){
        currentSec++;
        if(currentSec==60){
            currentSec=0;
            currentMin++;
        }
        if(currentMin==60){
            currentMin=0;
            currentHour++;
        }
        if(currentHour==24){
            currentHour=0;
        }
        checkAlarm();
    }
    public void checkAlarm(){
        if(alarmOn&&currentHour==alarmHour&&currentMin==alarmMin){
            System.out.println("Woooo!");
        }
    }
    public void displayTime(){
        DecimalFormat fmt=new DecimalFormat("00");
        System.out.println(fmt.format(currentHour)+":"+fmt.format(currentMin)+":"+fmt.format(currentSec));
    }
    @Override
    public String toString(){
        return "AlarmClock [currentHour="+currentHour+", currentMin="+currentMin+", currentSec="+currentSec+", alarmHour="+
                alarmHour+", alarmMin="+alarmMin+", alarmOn="+alarmOn+"displayIn24="+displayIn24+"]";
    }
    public int getCurrentHour(){
        return currentHour;
    }
    public void setCurrentHour(int currentHour){
        this.currentHour=currentHour;
    }
    public int getCurrentMin(){
        return currentMin;
    }
    public void setCurrentMin(int currentMin){
        this.currentMin=currentMin;
    }
    public int getCurentSec(){
        return currentSec;
    }
    public void setCurrentSec(int currentSec){
        this.currentSec=currentSec;
    }
    public int getAlarmHour(){
        return alarmHour;
    }
    public void setAlarmHour(int alarmHour){
        this.alarmHour=alarmHour;
    }
    public int getAlarmMin(){
        return alarmMin;
    }
    public void setAlarmMin(int alarmMin){
        this.alarmMin=alarmMin;
    }
    public boolean isAlarmOn(){
        return alarmOn;
    }
    public void setAlarmOn(boolean alarmOn){
        this.alarmOn=alarmOn;
    }
    public boolean isDisplayIn24(){
        return displayIn24;
    }
    public void setDisplayIn24(boolean displayIn24){
        this.displayIn24=displayIn24;
    }
    public static void main(String[] args) {
        AlarmClock clock=new AlarmClock();
        AlarmClock.tick();
    }
}
