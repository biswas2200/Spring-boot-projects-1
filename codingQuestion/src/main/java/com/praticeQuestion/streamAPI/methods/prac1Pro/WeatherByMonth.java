package com.praticeQuestion.streamAPI.methods.prac1Pro;

import java.util.Objects;

class WeatherByMonth {
     private String month;
     private int tempratureAtDay;
     private int tempratureAtNight;

     public WeatherByMonth(String month, int tempratureAtDay, int tempratureAtNight) {
         super();
         this.month = month;
         this.tempratureAtDay = tempratureAtDay;
         this.tempratureAtNight = tempratureAtNight;
     }

     public String getMonth() {
         return month;
     }

     public void setMonth(String month) {
         this.month = month;
     }

     public int getTempratureAtDay() {
         return tempratureAtDay;
     }

     public void setTempratureAtDay(int tempratureAtDay) {
         this.tempratureAtDay = tempratureAtDay;
     }

     public int getTempratureAtNight() {
         return tempratureAtNight;
     }

     public void setTempratureAtNight(int tempratureAtNight) {
         this.tempratureAtNight = tempratureAtNight;
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeatherByMonth that = (WeatherByMonth) o;
        return tempratureAtDay == that.tempratureAtDay && tempratureAtNight == that.tempratureAtNight && Objects.equals(month, that.month);
    }

    @Override
    public int hashCode() {
        return Objects.hash(month, tempratureAtDay, tempratureAtNight);
    }

    @Override
    public String toString() {
        return "WeatherByMonth{" +
                "month='" + month + '\'' +
                ", tempratureAtDay=" + tempratureAtDay +
                ", tempratureAtNight=" + tempratureAtNight +
                '}';
    }
}