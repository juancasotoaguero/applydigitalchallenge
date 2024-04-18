package com.challengeApply.retriveArticlesApi.utils;

import java.time.Month;
import java.util.Locale;

public class Utils {

    public static Integer getMonthNumber(String monthName) {
        try {
            Month month = Month.valueOf(monthName.toUpperCase(Locale.ENGLISH));
            return month.getValue();
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}
