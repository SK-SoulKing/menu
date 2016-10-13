package com.hzit.dao.mapper;

import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;
import com.hzit.dao.entity.Relate;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface RelateMapper {

	void insertRelate(Relate relate);

	void deleteByRelateId(Integer relateId);

	void updateRelate(Relate relate);

	Page<Relate> searchRelateByParams(@Param("map")Map<String, String> map , Pageable pageable);

	List<Relate> searchRelateByParams(@Param("map")Map<String, String> map);

} 