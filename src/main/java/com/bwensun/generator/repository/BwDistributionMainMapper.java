package com.bwensun.generator.repository;

import com.bwensun.generator.domain.BwDistributionMain;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 * 经销主信息表
 *
 * @author bwensun
 * @date 2022-02-22
 */
@Repository
public interface BwDistributionMainMapper {
    /**
     * 根据主键删除经销主信息表记录
     *
     * @param id 主键
     * @return 受影响的记录数
     */
    int deleteByPrimaryKey(Short id);

    /**
     * 新增记录至经销主信息表
     *
     * @param record 记录
     * @return 受影响的记录数
     */
    int insert(BwDistributionMain record);

    /**
     * 根据主键查询经销主信息表记录
     *
     * @param id 主键
     * @return 经销主信息表记录
     */
    BwDistributionMain selectByPrimaryKey(Short id);

    /**
     * 查询经销主信息表所有记录
     *
     * @return 经销主信息表记录
     */
    List<BwDistributionMain> selectAll();

    /**
     * 根据主键更新经销主信息表记录
     *
     * @param record 记录
     * @return 受影响的记录数
     */
    int updateByPrimaryKey(BwDistributionMain record);
}