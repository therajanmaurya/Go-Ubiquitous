package com.example.android.sunshine.wear;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;

public class Utility {
    public static Drawable getIconResourceForWeatherCondition(Context context, int weatherId) {
        // Based on weather code data found at:
        // http://openweathermap.org/weather-conditions
        if (weatherId >= 200 && weatherId <= 232) {
            return ContextCompat.getDrawable(context,R.drawable.ic_storm);
        } else if (weatherId >= 300 && weatherId <= 321) {
            return ContextCompat.getDrawable(context,R.drawable.ic_light_rain);
        } else if (weatherId >= 500 && weatherId <= 504) {
            return ContextCompat.getDrawable(context,R.drawable.ic_rain);
        } else if (weatherId == 511) {
            return ContextCompat.getDrawable(context,R.drawable.ic_snow);
        } else if (weatherId >= 520 && weatherId <= 531) {
            return ContextCompat.getDrawable(context,R.drawable.ic_rain);
        } else if (weatherId >= 600 && weatherId <= 622) {
            return ContextCompat.getDrawable(context,R.drawable.ic_snow);
        } else if (weatherId >= 701 && weatherId <= 761) {
            return ContextCompat.getDrawable(context,R.drawable.ic_fog);
        } else if (weatherId == 761 || weatherId == 781) {
            return ContextCompat.getDrawable(context,R.drawable.ic_storm);
        } else if (weatherId == 800) {
            return ContextCompat.getDrawable(context,R.drawable.ic_clear);
        } else if (weatherId == 801) {
            return ContextCompat.getDrawable(context,R.drawable.ic_light_clouds);
        } else if (weatherId >= 802 && weatherId <= 804) {
            return ContextCompat.getDrawable(context,R.drawable.ic_cloudy);
        }
        return ContextCompat.getDrawable(context,R.mipmap.ic_launcher);
    }

}