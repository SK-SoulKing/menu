package com.hzit.dao.entity;

/**
 * 
 * @author SoulKing
 */
public class Relate {
	/**
	 *  角色ID
	 */
	private Integer adminId;
	/**
	 *  模块id
	 */
	private Integer moduleId;
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
	 * 模块id
	 * @param moduleId
	 */
	public void setModuleId(Integer moduleId){
		this.moduleId = moduleId;
	}
	
    /**
     * 模块id
     * @return
     */	
    public Integer getModuleId(){
    	return moduleId;
    }
}