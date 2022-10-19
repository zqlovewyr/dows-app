package org.dows.app.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.dows.framework.crud.mybatis.MybatisCrudMapper;
import org.dows.app.entity.AppApply;

/**
 * 应用申请(AppApply)表数据库访问层
 *
 * @author lait.zhang
 * @since 2022-10-19 22:05:40
 */
@Mapper
public interface AppApplyMapper extends MybatisCrudMapper<AppApply> {

}

