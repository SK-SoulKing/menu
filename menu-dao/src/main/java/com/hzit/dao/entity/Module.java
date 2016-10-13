package com.hzit.dao.entity;

/**
 * 
 * @author SoulKing
 */
public class Module {
	/**
	 *  模块ID
	 */
	private Integer moduleId;
	/**
	 *  模块名
	 */
	private String moduleName;
	/**
	 *  模块级别
	 */
	private Integer moduleLevel;
	/**
	 *  父级模块id
	 */
	private Integer moduleFatherId;
	/**
	 *  模块跳转地址
	 */
	private String moduleAdd;
	/**
	 *  模块描述
	 */
	private String moduleDepict;
	/**
	 *  是(1)否(0)有子模块
	 */
	private Integer moduleIsSon;
	/**
	 *  模块排序号码
	 */
	private Integer moduleOrder;
	/**
	 * 模块ID
	 * @param moduleId
	 */
	public void setModuleId(Integer moduleId){
		this.moduleId = moduleId;
	}
	
    /**
     * 模块ID
     * @return
     */	
    public Integer getModuleId(){
    	return moduleId;
    }
	/**
	 * 模块名
	 * @param moduleName
	 */
	public void setModuleName(String moduleName){
		this.moduleName = moduleName;
	}
	
    /**
     * 模块名
     * @return
     */	
    public String getModuleName(){
    	return moduleName;
    }
	/**
	 * 模块级别
	 * @param moduleLevel
	 */
	public void setModuleLevel(Integer moduleLevel){
		this.moduleLevel = moduleLevel;
	}
	
    /**
     * 模块级别
     * @return
     */	
    public Integer getModuleLevel(){
    	return moduleLevel;
    }
	/**
	 * 父级模块id
	 * @param moduleFatherId
	 */
	public void setModuleFatherId(Integer moduleFatherId){
		this.moduleFatherId = moduleFatherId;
	}
	
    /**
     * 父级模块id
     * @return
     */	
    public Integer getModuleFatherId(){
    	return moduleFatherId;
    }
	/**
	 * 模块跳转地址
	 * @param moduleAdd
	 */
	public void setModuleAdd(String moduleAdd){
		this.moduleAdd = moduleAdd;
	}
	
    /**
     * 模块跳转地址
     * @return
     */	
    public String getModuleAdd(){
    	return moduleAdd;
    }
	/**
	 * 模块描述
	 * @param moduleDepict
	 */
	public void setModuleDepict(String moduleDepict){
		this.moduleDepict = moduleDepict;
	}
	
    /**
     * 模块描述
     * @return
     */	
    public String getModuleDepict(){
    	return moduleDepict;
    }
	/**
	 * 是(1)否(0)有子模块
	 * @param moduleIsSon
	 */
	public void setModuleIsSon(Integer moduleIsSon){
		this.moduleIsSon = moduleIsSon;
	}
	
    /**
     * 是(1)否(0)有子模块
     * @return
     */	
    public Integer getModuleIsSon(){
    	return moduleIsSon;
    }
	/**
	 * 模块排序号码
	 * @param moduleOrder
	 */
	public void setModuleOrder(Integer moduleOrder){
		this.moduleOrder = moduleOrder;
	}
	
    /**
     * 模块排序号码
     * @return
     */	
    public Integer getModuleOrder(){
    	return moduleOrder;
    }
}