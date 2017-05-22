package testPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class httpurlTest {
	public String url="http://127.0.0.1:8080";
	URL Url;
	HttpURLConnection connect=null;
	OutputStreamWriter out;
	public httpurlTest(String s) {
		url=url+s;
		getconnect();
	}
	public void getconnect(){
		try {
			//创建连接
			Url=new URL(url);
			connect=(HttpURLConnection) Url.openConnection();
			connect.setDoOutput(true);      //标志设置为 true，指示 应用程序要从 URL连接读取数据
			connect.setDoInput(true);
			connect.setRequestMethod("POST");
			connect.setUseCaches(false);
			 //application/x-javascript text/xml->xml数据 application/x-javascript->json对象 application/x-www-form-urlencoded->表单数据
			connect.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
//			connect.setRequestProperty("Content-Type", "application/json");
			connect.connect();
			out=new OutputStreamWriter(connect.getOutputStream());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void sendtest(String s){
		try {
			out.write(s);
			out.flush();
			out.close();
			connect.getInputStream();  //此处才是真正的发送数据
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void read(){
		try {
			BufferedReader reader=new BufferedReader(new InputStreamReader(connect.getInputStream()));
			String str=reader.readLine();
			System.out.println(str);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
