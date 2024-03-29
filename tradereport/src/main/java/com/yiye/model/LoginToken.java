package com.yiye.model;

import com.alibaba.fastjson.JSON;

/**
 * 获得的令牌信息
 * 
 * @author tony
 * 
 */
public class LoginToken {

	private int r1_expires_in;
	private int r2_expires_in;
	private int w1_expires_in;
	private int w2_expires_in;
	private int expires_in;
	private String taobao_user_id;
	private String taobao_user_nick;
	private String token_type;
	private String access_token;
	private String refresh_token;

	public int getR1_expires_in() {
		return r1_expires_in;
	}

	public void setR1_expires_in(int r1_expires_in) {
		this.r1_expires_in = r1_expires_in;
	}

	public int getR2_expires_in() {
		return r2_expires_in;
	}

	public void setR2_expires_in(int r2_expires_in) {
		this.r2_expires_in = r2_expires_in;
	}

	public int getW1_expires_in() {
		return w1_expires_in;
	}

	public void setW1_expires_in(int w1_expires_in) {
		this.w1_expires_in = w1_expires_in;
	}

	public int getW2_expires_in() {
		return w2_expires_in;
	}

	public void setW2_expires_in(int w2_expires_in) {
		this.w2_expires_in = w2_expires_in;
	}

	public int getExpires_in() {
		return expires_in;
	}

	public void setExpires_in(int expires_in) {
		this.expires_in = expires_in;
	}

	public String getTaobao_user_id() {
		return taobao_user_id;
	}

	public void setTaobao_user_id(String taobao_user_id) {
		this.taobao_user_id = taobao_user_id;
	}

	public String getTaobao_user_nick() {
		return taobao_user_nick;
	}

	public void setTaobao_user_nick(String taobao_user_nick) {
		this.taobao_user_nick = taobao_user_nick;
	}

	public String getToken_type() {
		return token_type;
	}

	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public String getRefresh_token() {
		return refresh_token;
	}

	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}
	
	public String toString() {
		return JSON.toJSONString(this);
	}

}
