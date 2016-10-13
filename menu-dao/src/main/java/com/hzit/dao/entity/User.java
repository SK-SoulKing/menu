package com.hzit.dao.entity;

/**
 * 
 * @author SoulKing
 */
public class User {
	/**
	 *  用户id
	 */
	private Integer userId;
	/**
	 *  用户名
	 */
	private String userName;
	/**
	 *  用户密码
	 */
	private String userPossword;
	/**
	 *  是(1)否(0)删除
	 */
	private Integer isDel;
	/**
	 * 用户id
	 * @param userId
	 */
	public void setUserId(Integer userId){
		this.userId = userId;
	}
	
    /**
     * 用户id
     * @return
     */	
    public Integer getUserId(){
    	return userId;
    }
	/**
	 * 用户名
	 * @param userName
	 */
	public void setUserName(String userName){
		this.userName = userName;
	}
	
    /**
     * 用户名
     * @return
     */	
    public String getUserName(){
    	return userName;
    }
	/**
	 * 用户密码
	 * @param userPossword
	 */
	public void setUserPossword(String userPossword){
		this.userPossword = userPossword;
	}
	
    /**
     * 用户密码
     * @return
     */	
    public String getUserPossword(){
    	return userPossword;
    }
	/**
	 * 是(1)否(0)删除
	 * @param isDel
	 */
	public void setIsDel(Integer isDel){
		this.isDel = isDel;
	}
	
    /**
     * 是(1)否(0)删除
     * @return
     */	
    public Integer getIsDel(){
    	return isDel;
    }
}