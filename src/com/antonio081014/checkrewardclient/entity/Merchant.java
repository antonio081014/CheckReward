/**
 * 
 */
package com.antonio081014.checkrewardclient.entity;

import java.net.URI;
import java.util.List;

/**
 * @author Antonio081014
 * @date Nov 7, 2012, 9:55:14 AM
 */
public class Merchant {
	private long _m_ID;
	private String _m_name;
	private String _m_email;
	private String _m_phone;
	// Here is the URI for the image of logo, which could be a url or file path;
	private URI _m_logo;
	private List<Program> _m_Program_List;

}
