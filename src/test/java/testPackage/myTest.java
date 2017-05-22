package testPackage;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.subject.Subject;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

public class myTest {

	Logger log=null;
	//private Subject sub=null;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		log=Logger.getLogger(Logger.class);
		//sub=SecurityUtils.getSubject();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		/*sub.login(new UsernamePasswordToken("fc", "123456"));
		try{
			sub.checkPermission("user:create");
			log.debug("用户权限验证通过");
		}catch(AuthorizationException e){
			log.debug("该用户没有相关权限");
		}*/
		httpurlTest url=new httpurlTest("/twweb/Login/loginValidate");
		url.sendtest("userName=fc&passWord=123456");
		url.read();
	}
	public static void main(String[] args) {
		new myTest().test();
	}

}
