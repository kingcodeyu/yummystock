package com.coderli.yummystock.core.service;

import com.coderli.yummystock.core.entity.HistoryStockData;

import java.util.List;

/**
 * @author li.hzh
 * @date 2017-07-26 14:59
 */
public interface HistoryDataService {
    
    void saveHistoryDatas(List<HistoryStockData> historyStockDataList);
    
    /**
     * 清除所有数据
     */
    void removeAll();
    
    
    void saveSingleData(HistoryStockData historyStockData);
    
    List<HistoryStockData> findByStockCode(String stockCode);
}