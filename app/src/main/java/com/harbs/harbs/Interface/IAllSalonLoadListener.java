package com.harbs.harbs.Interface;

import java.util.List;

public interface IAllSalonLoadListener {

    void onAllSalonLoadSuccess(List<String> areaName);
    void onAllSalonLoadFailed(String message);
}
