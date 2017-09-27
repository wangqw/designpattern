package SimpleFactory;

public class LoginManager {
        public static Login factory(String type) {
        	if(type.equals("password")) {
        		return new PasswordLogin();
        	}
        	else if(type.equals("passcode")) {
        		return new DomainLogin();
        	}else {
        		throw new RuntimeException("û���ҵ���¼����");
        	}
        		
        }
}
