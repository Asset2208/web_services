package com.entities;

public class Timezone {
    private String timezone_identifier;
    private String timezone_abbr;
    private int utc_offset_sec;
    private String is_dst;

    public Timezone(){}

    public Timezone(String timezone_identifier, String timezone_abbr, int utc_offset_sec, String is_dst) {
        this.timezone_identifier = timezone_identifier;
        this.timezone_abbr = timezone_abbr;
        this.utc_offset_sec = utc_offset_sec;
        this.is_dst = is_dst;
    }

    public String getTimezone_identifier() {
        return timezone_identifier;
    }

    public void setTimezone_identifier(String timezone_identifier) {
        this.timezone_identifier = timezone_identifier;
    }

    public String getTimezone_abbr() {
        return timezone_abbr;
    }

    public void setTimezone_abbr(String timezone_abbr) {
        this.timezone_abbr = timezone_abbr;
    }

    public int getUtc_offset_sec() {
        return utc_offset_sec;
    }

    public void setUtc_offset_sec(int utc_offset_sec) {
        this.utc_offset_sec = utc_offset_sec;
    }

    public String getIs_dst() {
        return is_dst;
    }

    public void setIs_dst(String is_dst) {
        this.is_dst = is_dst;
    }

    @Override
    public String toString() {
        return "Timezone{" +
                "timezone_identifier='" + timezone_identifier + '\'' +
                ", timezone_abbr='" + timezone_abbr + '\'' +
                ", utc_offset_sec=" + utc_offset_sec +
                ", is_dst='" + is_dst + '\'' +
                '}';
    }
}
