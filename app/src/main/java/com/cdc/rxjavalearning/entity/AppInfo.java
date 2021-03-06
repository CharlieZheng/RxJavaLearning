package com.cdc.rxjavalearning.entity;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppInfo {
    public AppInfo() {
    }

    public AppInfo(String name) {
        this.name = name;
    }

    public AppInfo(String name, String string) {
        this.name = name;
        moduleList.addAll(Arrays.asList(string.split("")));
    }

    private String name;

    private String installTime;

    private int versionCode;

    private String versionName;

    private Drawable icon;

    public List<String> moduleList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstallTime() {
        return installTime;
    }

    public void setInstallTime(String installTime) {
        this.installTime = installTime;
    }

    public int getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(int versionCode) {
        this.versionCode = versionCode;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public Drawable getIcon() {
        return icon;
    }

    public void setIcon(Drawable icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "AppInfo{" +
                "name='" + name + '\'' +
                ", installTime='" + installTime + '\'' +
                ", versionCode='" + versionCode + '\'' +
                ", versionName='" + versionName + '\'' +
                ", icon=" + icon +
                '}';
    }
}