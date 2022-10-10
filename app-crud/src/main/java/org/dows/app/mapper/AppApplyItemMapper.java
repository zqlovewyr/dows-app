package org.dows.app.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.dows.framework.crud.mybatis.MybatisCrudMapper;
import org.dows.app.entity.AppApplyItem;

/**
 * 申请资料条目(AppApplyItem)表数据库访问层
 *
 * @author lait.zhang
 * @since 2022-10-10 14:15:33
 */
@Mapper
public interface AppApplyItemMapper extends MybatisCrudMapper<AppApplyItem> {

}

