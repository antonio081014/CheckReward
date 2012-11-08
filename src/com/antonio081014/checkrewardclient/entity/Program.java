/**
 * Hello Here.
 */
package com.antonio081014.checkrewardclient.entity;

/**
 * @author Antonio081014
 * @date Nov 7, 2012, 10:50:07 AM
 */
public class Program {

	private String _p_description;
	private int _p_discount;
	private long _p_ID;
	// Here it could be the customer could have _p_discount % after check-in
	// _p_total_checkins times;
	private String _p_name;
	private int _p_number_of_offers;
	private int _p_total_checkins;

	public Program(int _p_discount, String _p_name, int _p_total_checkins) {
		this(-1, _p_name, "", _p_discount, _p_total_checkins, 1);
	}

	public Program(long _p_ID, String _p_name, String _p_description,
			int _p_discount, int _p_total_checkins, int _p_number_of_offers) {
		this._p_description = _p_description;
		this._p_discount = _p_discount;
		this._p_ID = _p_ID;
		this._p_name = _p_name;
		this._p_total_checkins = _p_total_checkins;
		this._p_number_of_offers = _p_number_of_offers;
	}

	public String get_p_description() {
		return _p_description;
	}

	public int get_p_discount() {
		return _p_discount;
	}

	public long get_p_ID() {
		return _p_ID;
	}

	public String get_p_name() {
		return _p_name;
	}

	public int get_p_number_of_offers() {
		return _p_number_of_offers;
	}

	public int get_p_total_checkins() {
		return _p_total_checkins;
	}

	public void set_p_description(String _p_description) {
		this._p_description = _p_description;
	}

	public void set_p_discount(int _p_discount) {
		this._p_discount = _p_discount;
	}

	public void set_p_ID(long _p_ID) {
		this._p_ID = _p_ID;
	}

	public void set_p_name(String _p_name) {
		this._p_name = _p_name;
	}

	public void set_p_number_of_offers(int _p_number_of_offers) {
		this._p_number_of_offers = _p_number_of_offers;
	}

	public void set_p_total_checkins(int _p_total_checkins) {
		this._p_total_checkins = _p_total_checkins;
	}
}
