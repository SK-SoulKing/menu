package com.hzit.dao.vo;

import com.hzit.dao.entity.Module;

import java.util.List;

/**
 * 
 * @author SoulKing
 */
public class UserVo {
	/**
	 *  用户id
	 */
	private String userId;
	/**
	 *  用户名
	 */
	private String userName;
	/**
	 *  用户密码
	 */
	private String userPassword;
	/**
	 *  是(1)否(0)删除
	 */
	private Integer isDel;
	/**
	 *  角色ID
	 */
	private Integer adminId;

	/**
	 *
	 */
	private List<Module> moduleList;

	public List<Module> getModuleList() {
		return moduleList;
	}

	public void setModuleList(List<Module> moduleList) {
		this.moduleList = moduleList;
	}

	/**
	 * 用户id
	 * @param userId
	 */
	public void setUserId(String userId){
		this.userId = userId;
	}
	
    /**
     * 用户id
     * @return Integer
     */	
    public String getUserId(){
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
     * @return String
     */	
    public String getUserName(){
    	return userName;
    }
	/**
	 * 用户密码
	 * @param userPassword
	 */
	public void setUserPassword(String userPassword){
		this.userPassword = userPassword;
	}
	
    /**
     * 用户密码
     * @return String
     */	
    public String getUserPassword(){
    	return userPassword;
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
     * @return Integer
     */	
    public Integer getIsDel(){
    	return isDel;
    }
	/**
	 * 角色ID
	 * @param adminId
	 */
	public void setAdminId(Integer adminId){
		this.adminId = adminId;
	}
	
    /**
     * 角色ID
     * @return Integer
     */	
    public Integer getAdminId(){
    	return adminId;
    }

	@Override
	public String toString() {
		return "UserVo{" +
				"userId=" + userId +
				", userName='" + userName + '\'' +
				", userPassword='" + userPassword + '\'' +
				", isDel=" + isDel +
				", adminId=" + adminId +
				", moduleList=" + moduleList +
				'}';
	}
}