package com.hzit.dao.vo;

/**
 * 
 * @author SoulKing
 */
public class RelateVo {
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
     * @return Integer
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
     * @return Integer
     */	
    public Integer getModuleId(){
    	return moduleId;
    }
}