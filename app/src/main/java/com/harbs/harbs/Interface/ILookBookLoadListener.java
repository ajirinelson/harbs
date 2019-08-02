package com.harbs.harbs.Interface;

import com.harbs.harbs.Model.Banner;

import java.util.List;

public interface ILookBookLoadListener {
    void onLookbookLoadSuccess(List<Banner> banners);
    void onLookbookLoadFailed(String message);
}
