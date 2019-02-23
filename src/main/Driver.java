package main;

import java.util.Date;

import com.ata.bean.CredentialsBean;
import com.ata.bean.ProfileBean;
import com.ata.dao.UserCredentialsDaoimpl;
import com.ata.dao.UserProfileDaoImpl;
import com.ata.dao.XyzDao;

public class Driver {

	public static void main(String[] args) {
		
		
		
		ProfileBean p = new ProfileBean("k","k","k",new Date(29,9,1994),"m","x","y","z","a","121001","1212121212","k@g.com","karan123");
		CredentialsBean c = new CredentialsBean(p.getUserID(),p.getPassword(),"C",0);
		XyzDao<CredentialsBean> cdao = new UserCredentialsDaoimpl();
		XyzDao<ProfileBean> pdao = new UserProfileDaoImpl();
		System.out.println(cdao.create(c));
		System.out.println(pdao.create(p));
	}

}
