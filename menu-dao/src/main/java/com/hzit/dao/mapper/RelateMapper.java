package com.hzit.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.hzit.dao.entity.Relate;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface RelateMapper {

	void insertRelate(Relate relate);

	void deleteRelateBy${table.pkColumn.variableSpellSqlName}(${table.pkColumn.javaType} ${table.pkColumn.variableName});

	void updateRelate(Relate relate);

	Page<Relate> searchRelateByParams(@Param("map")Map<String, String> map , Pageable pageable);

	List<Relate> searchRelateByParams(@Param("map")Map<String, String> map);

} 
