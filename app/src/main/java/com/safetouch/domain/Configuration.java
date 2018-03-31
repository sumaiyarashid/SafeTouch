package com.safetouch.domain;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.sql.Time;

/**
 * Created by mktay on 3/5/2018.
 */

@Entity(tableName = "configuration")
public class Configuration {

    // ConfigurationID Column Definition
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ConfigurationID")
    private int ConfigurationID;

    // ConfigurationID Methods
    public int getConfigurationID() { return ConfigurationID; }
    public void setConfigurationID(int configID) { this.ConfigurationID = configID; }

    // Emergency Text Column Definition
    @ColumnInfo(name = "EmergencyText")
    private String EmergencyText;

    // Emergency Text Methods
    public String getEmergencyText() { return EmergencyText; }
    public void setEmergencyText(String emergencyText) { this.EmergencyText = emergencyText; }

    // Sound Alarm Column Definition
    @ColumnInfo(name = "SoundAlarm")
    private boolean SoundAlarm;

    // Sound Alarm Methods
    public boolean getSoundAlarm() { return SoundAlarm; }
    public void setSoundAlarm(boolean soundAlarm) { this.SoundAlarm = soundAlarm; }

    // Current Mode Column Definition
    @ColumnInfo(name = "AppMode")
    private Mode AppMode;

    // Current Mode Methods
    public Mode getAppMode() { return AppMode; }
    public void setAppMode(Mode mode) { this.AppMode = mode; }

    // Check In Interval Column Definition
    @ColumnInfo(name = "CheckInInterval")
    private int CheckInInterval;

    // Check In Interval Methods
    public int getCheckInInterval() { return CheckInInterval; }
    public void setCheckInInterval(int checkInInterval) { this.CheckInInterval = checkInInterval; }

    // Check In Start Column Definition
    @ColumnInfo(name = "CheckInStart")
    private Time CheckInStart;

    // Check In Start Methods
    public Time getCheckInStart() { return CheckInStart; }
    public void setCheckInStart(Time checkInStart) { this.CheckInStart = checkInStart; }

    // Check In End Column Definition
    @ColumnInfo(name = "CheckInEnd")
    private Time CheckInEnd;

    // Check In End Methods
    public Time getCheckInEnd() { return CheckInEnd; }
    public void setCheckInEnd(Time checkInEnd) { this.CheckInStart = checkInEnd; }

    // PatternOne Column Definition
    @ColumnInfo(name = "PatternOne")
    private int PatternOne;

    // PatternOne Methods
    public int getPatternOne() { return PatternOne; }
    public void setPatternOne(int patternOne) { this.PatternOne = patternOne; }

    // PatternTwo Column Definition
    @ColumnInfo(name = "PatternTwo")
    private int PatternTwo;

    // PatternTwo Methods
    public int getPatternTwo() { return PatternTwo; }
    public void setPatternTwo(int patternTwo) { this.PatternTwo = patternTwo; }


    // Override Methods
    @Override
    public String toString() { return String.valueOf(AppMode); }
}