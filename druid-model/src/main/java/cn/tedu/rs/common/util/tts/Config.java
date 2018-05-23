package cn.tedu.rs.common.util.tts;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/*
 * 该类可以在web.xml中添加
 * <listener>
        <listener-class>cn.tedu.rs.common.util.tts.Config</listener-class>
    </listener>
    即可在初始化的时候加载
 */
public class Config {
//	private static Properties props = new Properties();
//	static {
//		//加载配置文件 config.properties
//		ClassLoader loader = Config.class.getClassLoader();
//		//读取配置文件加载位置
//		InputStream ips = loader.getResourceAsStream("ftp.properties");
//		try {
//			props.load(ips);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		init();
//	}
//	//FTP 配置
//	public static String FTP_HOST_NAME;
//	public static int FTP_HOST_PORT;
//	public static String FTP_USER_NAME;
//	public static String FTP_PASSWORD;
//	public static String FTP_FILE_URL;
//	
//	public static String FTP_HOST_NAME_CODE;
//	public static int FTP_HOST_PORT_CODE;
//	public static String FTP_USER_NAME_CODE;
//	public static String FTP_PASSWORD_CODE;
//	public static String FTP_FILE_URL_CODE;
//	public static String FIP_TBS_URL;
//	
//	public static String FTP_TBS_DOMAIN;
//	
//	public static void init(){
//		//FTP 配置
//		FTP_HOST_NAME=props.getProperty("ftp_host_name");
//		FTP_HOST_PORT=Integer.parseInt(props.getProperty("ftp_host_port"));
//		FTP_USER_NAME=props.getProperty("ftp_user_name");
//		FTP_PASSWORD=props.getProperty("ftp_password");
//		FTP_FILE_URL=props.getProperty("ftp_file_url");
//		FIP_TBS_URL = props.getProperty("ftp_tbs_url");
//		
//		FTP_TBS_DOMAIN=props.getProperty("ftp_tbs_domain");
//		System.out.println(FIP_TBS_URL);
//		System.out.println(FTP_TBS_DOMAIN);
//		
////		FTP_HOST_NAME_CODE=props.getProperty("ftp_host_name_code");
////		FTP_HOST_PORT_CODE=Integer.parseInt(props.getProperty("ftp_host_port_code"));
////		FTP_USER_NAME_CODE=props.getProperty("ftp_user_name_code");
////		FTP_PASSWORD_CODE=props.getProperty("ftp_password_code");
////		FTP_FILE_URL_CODE=props.getProperty("ftp_file_url_code");
//		
//	}
	public static void main(String[] args) {
		//Config config=new Config();
		//System.out.println(FTP_TBS_DOMAIN);
		
		
	}
}
