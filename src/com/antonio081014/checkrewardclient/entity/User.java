/**
 * 
 */
package com.antonio081014.checkrewardclient.entity;

import java.util.List;

/**
 * @author "Dev Perfecular Inc."
 * 
 */
public class User {
	private long _user_ID;
	private String _user_name;
	private String _user_email;
	private String _user_phone;

	public User(long _user_ID, String _user_name, String _user_email,
			String _user_phone, List<Merchant> _merchant_list) {
		super();
		this._user_ID = _user_ID;
		this._user_name = _user_name;
		this._user_email = _user_email;
		this._user_phone = _user_phone;
		this._merchant_list = _merchant_list;
	}

	public User(String _user_name, String _user_email, String _user_phone,
			List<Merchant> _merchant_list) {
		this(-1, _user_name, _user_email, _user_phone, _merchant_list);
	}

	private List<Merchant> _merchant_list;

	public long get_user_ID() {
		return _user_ID;
	}

	public void set_user_ID(long _user_ID) {
		this._user_ID = _user_ID;
	}

	public String get_user_name() {
		return _user_name;
	}

	public void set_user_name(String _user_name) {
		this._user_name = _user_name;
	}

	public String get_user_email() {
		return _user_email;
	}

	public void set_user_email(String _user_email) {
		this._user_email = _user_email;
	}

	public String get_user_phone() {
		return _user_phone;
	}

	public void set_user_phone(String _user_phone) {
		this._user_phone = _user_phone;
	}

	public List<Merchant> get_merchant_list() {
		return _merchant_list;
	}

	public void set_merchant_list(List<Merchant> _merchant_list) {
		this._merchant_list = _merchant_list;
	}

}
