package org.mybatis.jpetstore.action;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;

public class PetActionBean extends AbstractActionBean {

	private static final long serialVersionUID = -1362184612651418339L;

	private static final String HOME_JSP = "/WEB-INF/jsp/home.jsp";
	
	@DefaultHandler
	public Resolution home() {
		return new ForwardResolution(HOME_JSP);
	}
}
