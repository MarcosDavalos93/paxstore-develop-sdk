package com.pax.market.api.sdk.java.api.util;

import com.pax.market.api.sdk.java.api.base.dto.Config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {

    private static final String FILE_NAME = "pax-uploader.properties";

    public static Config loadConfig() {
        Properties properties = new Properties();
        File configFile = new File(FILE_NAME);
        try (FileInputStream input = new FileInputStream(configFile)) {
            properties.load(input);

            String packageName = properties.getProperty("packageName");
            String appName = properties.getProperty("appName");
            String apkPath = properties.getProperty("apkPath");
            String description = properties.getProperty("description");
            String shortDescription = properties.getProperty("shortDescription");
            String releaseNotes = properties.getProperty("releaseNotes");
            String baseType = properties.getProperty("baseType");
            String[] categories = properties.getProperty("categoriesArray").split(",");
            String[] models = properties.getProperty("modelsArray").split(",");
            String[] templates = properties.getProperty("templatesPathArray").split(",");
            return new Config(packageName, appName, apkPath, description, shortDescription, releaseNotes, baseType, categories, models, templates);

        } catch (IOException e) {
            System.out.println("Error loading configuration file: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}