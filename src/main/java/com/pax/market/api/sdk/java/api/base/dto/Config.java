package com.pax.market.api.sdk.java.api.base.dto;

public class Config {
    private String packageName;
    private String appName;
    private String apkPath;
    private String description;
    private String shortDescription;
    private String releaseNotes;
    private String baseType;
    private String[] categories;
    private String[] models;
    private String[] templates;

    public Config(String packageName, String appName, String apkPath, String description, String shortDescription, String releaseNotes, String baseType, String[] categories, String[] models, String[] templates) {
        this.packageName = packageName;
        this.appName = appName;
        this.apkPath = apkPath;
        this.description = description;
        this.shortDescription = shortDescription;
        this.releaseNotes = releaseNotes;
        this.baseType = baseType;
        this.categories = categories;
        this.models = models;
        this.templates = templates;
    }

    public String getPackageName() {
        return packageName;
    }

    public String getAppName() {
        return appName;
    }

    public String getApkPath() {
        return apkPath;
    }

    public String getDescription() {
        return description;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getReleaseNotes() {
        return releaseNotes;
    }

    public String getBaseType() {
        return baseType;
    }

    public String[] getCategories() {
        return categories;
    }

    public String[] getModels() {
        return models;
    }

    public String[] getTemplates() {
        return templates;
    }
}