package com.hzit.dao.entity;

/**
 * 
 * @author SoulKing
 */
public class Admin {
	/**
	 *  角色ID
	 */
	private Integer adminId;
	/**
	 *  角色名称
	 */
	private String adminName;
	/**
	 *  角色描述
	 */
	private String adminDepict;
	/**
	 * 角色ID
	 * @param adminId
	 */
	public void setAdminId(Integer adminId){
		this.adminId = adminId;
	}
	
    /**
     * 角色ID
     * @return
     */	
    public Integer getAdminId(){
    	return adminId;
    }
	/**
	 * 角色名称
	 * @param adminName
	 */
	public void setAdminName(String adminName){
		this.adminName = adminName;
	}
	
    /**
     * 角色名称
     * @return
     */	
    public String getAdminName(){
    	return adminName;
    }
	/**
	 * 角色描述
	 * @param adminDepict
	 */
	public void setAdminDepict(String adminDepict){
		this.adminDepict = adminDepict;
	}
	
    /**
     * 角色描述
     * @return
     */	
    public String getAdminDepict(){
    	return adminDepict;
    }
}