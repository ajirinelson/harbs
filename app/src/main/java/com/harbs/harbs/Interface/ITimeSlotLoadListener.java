package com.harbs.harbs.Interface;

import com.harbs.harbs.Model.TimeSlot;

import java.util.List;

public interface ITimeSlotLoadListener {
    void onTimeSlotLoadSuccess(List<TimeSlot> timeSlots);
    void onTimeSlotLoadFailed(String message);
    void onTimeSlotLoadEmpty();
}
