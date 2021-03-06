package com.jzh.dao;

import com.jzh.model.CommodityTypeLevelThree;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Yunpeng Ma
 * @version 1.0
 */
public interface CommodityTypeLevelThreeDao extends GenericDao<CommodityTypeLevelThree,Long> {

    @Override
    List<CommodityTypeLevelThree> listAll();

    @Override
    CommodityTypeLevelThree get(@Param("typeLevelThreeId")final Long id);

    @Override
    int insert(CommodityTypeLevelThree entity);

    @Override
    int update(CommodityTypeLevelThree entity);

    @Override
    int delete(@Param("typeLevelThreeId")final Long id);
}
