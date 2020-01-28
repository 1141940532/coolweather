package com.coolweather.android.db;

import org.litepal.crud.LitePalSupport;

public class City extends LitePalSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provincedId;

    public int getId() {
        return id;
    }

    public String getCityName() {
        return cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public int getProvincedId() {
        return provincedId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setProvincedId(int provincedId) {
        this.provincedId = provincedId;
    }
}
