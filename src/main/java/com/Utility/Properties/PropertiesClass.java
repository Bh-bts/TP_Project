package com.Utility.Properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClass {

	public static Properties a;

	public static Properties fileConfig() throws IOException {

		String projectPath = System.getProperty("user.dir");
		FileReader reader = new FileReader(projectPath + "/src/main/java/com/Utility/Properties/config.properties");
		Properties props = new Properties();
		props.load(reader);
		return a = props;

	}

	public static String getBrowser() throws IOException {

		fileConfig();
		String browserName = a.getProperty("browser");
		return browserName;

	}

	public static String getUrl() throws IOException {

		fileConfig();
		String url = a.getProperty("Weburl");
		return url;

	}

	public static String getEmpNo() throws IOException {

		fileConfig();
		String empNo = a.getProperty("empNo");
		return empNo;

	}

	public static String getPassword() throws IOException {

		fileConfig();
		String password = a.getProperty("password");
		return password;

	}

}
