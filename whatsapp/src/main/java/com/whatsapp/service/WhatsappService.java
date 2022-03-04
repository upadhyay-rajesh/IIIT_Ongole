package com.whatsapp.service;

import com.whatsapp.dao.WhatsappDAO;
import com.whatsapp.dao.WhatsappDAOInterface;
import com.whatsapp.entity.WhatsappUser;

public class WhatsappService implements WhatsappServiceInterface {

	public int createProfileService(WhatsappUser wu) {
		WhatsappDAOInterface wd=new WhatsappDAO();
		int i=wd.createProfileDAO(wu);
		return i;
	}

	public WhatsappUser viewProfileService(WhatsappUser wu) {
		WhatsappDAOInterface wd=new WhatsappDAO();
		WhatsappUser u1=wd.viewProfileDAO(wu);
		return u1;
	}

}
