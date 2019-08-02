package com.harbs.harbs.Common;

import com.google.firebase.Timestamp;
import com.harbs.harbs.Model.Barber;
import com.harbs.harbs.Model.BookingInformation;
import com.harbs.harbs.Model.Salon;
import com.harbs.harbs.Model.User;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Common {

    public static final String KEY_ENABLE_BUTTON_NEXT = "ENABLE_BUTTON_NEXT";
    public static final String KEY_SALON_STORE = "SALON_SAVE";
    public static final String KEY_BARBER_LOAD_DONE = "BARBER_LOAD_DONE";
    public static final String KEY_DISPLAY_TIME_SLOT = "DISPLAY_TIME_SLOT";
    public static final String KEY_STEP = "STEP";
    public static final String KEY_BARBER_SELECTED = "BARBER_SELECTED";
    public static final int TIME_SLOT_TOTAL = 10;
    public static final Object DISABLE_TAG = "DISABLE";
    public static final String KEY_TIME_SLOT = "TIME_SLOT";
    public static final String KEY_CONFIRM_BOOKING = "CONFIRM_BOOKING";
    public static final String EVENT_URI_CACHE = "URI_EVENT_SAVE";
    public static String IS_LOGIN = "isLogin";
    public static User currentUser;
    public static Salon currentSalon;
    public static int step = 0;
    public static String city = "";
    public static Barber currentBarber;
    public static int currentTimeSlot = -1;
    public static Calendar bookingDate = Calendar.getInstance();
    public static SimpleDateFormat simpleFormatDate = new SimpleDateFormat("dd_MM_yyyy");
    public static BookingInformation currentBooking;
    public static String currentBookingId = "";

    public static String convertTimeSlotToString(int slot) {
        switch (slot){
            case 0:
                return "9:00 - 10:00";
            case 1:
                return "10:00 - 11:00";
            case 2:
                return "11:00 - 12:00";
            case 3:
                return "12:00 - 13:00";
            case 4:
                return "13:00 - 14:00";
            case 5:
                return "14:00 - 15:00";
            case 6:
                return "15:00 - 16:00";
            case 7:
                return "16:00 - 17:00";
            case 8:
                return "17:00 - 18:00";
            case 9:
                return "18:00 - 19:00";
            default:
                return "Closed";
        }
    }

    public static String convertTimeStampToStringKey(Timestamp timestamp) {
        Date date = timestamp.toDate();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd_MM_yyyy");
        return simpleDateFormat.format(date);
    }
}
