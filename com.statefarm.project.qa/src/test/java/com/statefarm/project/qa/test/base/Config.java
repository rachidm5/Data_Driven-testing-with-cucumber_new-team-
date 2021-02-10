package com.statefarm.project.qa.test.base;

import common.WebAPI;
import org.jsoup.Connection;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.util.Properties;


public class Config extends WebAPI {
    //    public static Connection conect ;
    //com.statefarm.project.qa.pages
    public  Properties loadProperties() throws IOException {
        Properties prop = new Properties();

        //InputStream ism = new FileInputStream("/secret.properties");
        InputStream ism = new FileInputStream("C:/Users/ssbra/IdeaProjects/cucumber.datadriven.qa/com.statefarm.project.qa/Config.properties");
        prop.load(ism);
        //    conect=  DriverManager.getConnection(String url,String os,);
        boolean useCloudEnv = Boolean.parseBoolean(prop.getProperty("statefarm.useCloudEnv "));
        String cloudEnvName = prop.getProperty("statefarm.cloudEnvName");
        String os = prop.getProperty("statefarm.os");
        String os_version = prop.getProperty("statefarm.os_version");
        String browserName = prop.getProperty("statefarm.browserName");
        String browserVersion = prop.getProperty("statefarm.browserVersion");
        String url = prop.getProperty("statefarm.url");
        // System.out.println(useCloudEnv + " and   " + cloudEnvName + " and " + url + " and  " + os + "  and " + os_version + "  " + browserName + " and " + browserVersion);
        setUp(useCloudEnv , cloudEnvName, os, os_version, browserName, browserVersion, url);
        ism.close();
        return prop;
    }


}

