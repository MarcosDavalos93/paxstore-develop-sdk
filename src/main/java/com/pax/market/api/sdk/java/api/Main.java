package com.pax.market.api.sdk.java.api;

import com.pax.market.api.sdk.java.api.base.dto.AppDetailDTO;
import com.pax.market.api.sdk.java.api.base.dto.Config;
import com.pax.market.api.sdk.java.api.base.dto.Result;
import com.pax.market.api.sdk.java.api.developer.DeveloperApi;
import com.pax.market.api.sdk.java.api.developer.dto.CreateApkRequest;
import com.pax.market.api.sdk.java.api.io.UploadedFileContent;
import com.pax.market.api.sdk.java.api.util.ConfigLoader;
import com.pax.market.api.sdk.java.api.util.FileUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static final String BASE_URL = "https://api.whatspos.com/p-market-api";
    private static final String API_KEY = "";
    private static final String API_SECRET = "";

    public static void main(String[] args) {

        Config config = ConfigLoader.loadConfig();
        if (config == null) {
            System.out.println("There's no config");
           return;
        }
        DeveloperApi developerApi = new DeveloperApi(BASE_URL, API_KEY, API_SECRET);
        Result<AppDetailDTO> app = developerApi.getAppInfoByName(config.getPackageName(), config.getAppName());

        System.out.println(app.getData().getId());
        System.out.println(app.getData().getName());
        System.out.println(app.getData().getOsType());
        System.out.println(app.getData().getStatus());
        System.out.println(app.getData().getPackageName());
        System.out.println(app.getData().getType());

        CreateApkRequest createApkRequest = new CreateApkRequest();
        createApkRequest.setAppFile(FileUtils.createUploadFile(config.getApkPath()));
        createApkRequest.setAppName(app.getData().getName());
        createApkRequest.setBaseType(config.getBaseType());
        createApkRequest.setShortDesc(config.getShortDescription());
        createApkRequest.setDescription(config.getDescription());
        createApkRequest.setReleaseNotes(config.getReleaseNotes());
        createApkRequest.setChargeType(0);

        createApkRequest.setCategoryList(Arrays.asList(config.getCategories()));

        createApkRequest.setModelNameList(Arrays.asList(config.getModels()));

        List<UploadedFileContent> paramList = new ArrayList<>();
        for (String path : config.getTemplates()) {
            paramList.add(FileUtils.createUploadFile(path));
        }
        createApkRequest.setParamTemplateFileList(paramList);

        Result<String> uploadResult = developerApi.uploadApk(createApkRequest);
        System.out.println(uploadResult.getMessage());
        System.out.println(uploadResult.getBusinessCode());
    }
}
