package com.jzh.service;

import com.jzh.model.CommodityTypeLevelThree;

import java.util.List;

/**
 * @author Yunpeng Ma
 * @version 1.0
 */
public interface CommodityTypeLevelThreeService extends GenericService<CommodityTypeLevelThree,Long> {

    @Override
    List<CommodityTypeLevelThree> listAll();

    @Override
    CommodityTypeLevelThree get(final Long id);

    @Override
    int insert(CommodityTypeLevelThree entity);

    @Override
    int update(CommodityTypeLevelThree entity);

    @Override
    int delete(final Long id);
}
