/*
 * *******************************************************************************
 * COPYRIGHT
 *               PAX TECHNOLOGY, Inc. PROPRIETARY INFORMATION
 *   This software is supplied under the terms of a license agreement or
 *   nondisclosure agreement with PAX  Technology, Inc. and may not be copied
 *   or disclosed except in accordance with the terms in that agreement.
 *
 *      Copyright (C) 2017 PAX Technology, Inc. All rights reserved.
 * *******************************************************************************
 */
package com.pax.market.api.sdk.java.api.constant;

/**
 * Created by fanjun on 2016/11/9.
 */
public class Constants {

    public static final String DEVELOPER_KEY = "devKey";
    /**
     * The constant TIMESTAMP.
     */
    public static final String TIMESTAMP = "timestamp";
    /**
     * The constant SIGNATURE.
     */
    public static final String SIGNATURE = "signature";


    /**
     * TOP默认时间格式
     */
    public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    /**
     * UTF-8字符集
     */
    public static final String CHARSET_UTF8 = "UTF-8";
    /**
     * The constant CONTENT_ENCODING_GZIP.
     */
    public static final String CONTENT_ENCODING_GZIP = "gzip";

    /**
     * The constant ACCESS_LANGUAGE.
     */
    public static final String ACCESS_LANGUAGE = "Accept-Language";

    /**
     * HMAC签名方式
     */
    public static final String SIGN_METHOD_HMAC = "hmac";

    /**
     * The constant CONTENT_TYPE.
     */
    public static final String CONTENT_TYPE = "Content-Type";
    /**
     * The constant CONTENT_TYPE_JSON.
     */
    public static final String CONTENT_TYPE_JSON = "application/json;charset=utf-8";
    
    public static final int DEFAULT_PAGE_SIZE = 10;
    
    public static final String THIRD_PARTY_API_SDK_LANGUAGE = "Java";
    public static final String THIRD_PARTY_API_SDK_VERSION = "1.2.1";
    public static final String REQ_HEADER_SDK_LANG = "SDK-Language";
    public static final String REQ_HEADER_SDK_VERSION = "SDK-Version";

    /**
     * normal app
     * */
    public static final String APP_TYPE_NORMAL="N";

    /**
     * parameter app(不要删除，US客户要求申明)
     * */
    public static final String APP_TYPE_PARAMETER="P";

    public static final int MIN_PAGE_NO = 1;
    public static final int MIN_PAGE_SIZE = 1;
    public static final int MAX_PAGE_SIZE = 100;
}
