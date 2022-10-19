package org.dows.app.service.impl;

import org.dows.framework.crud.mybatis.MybatisCrudServiceImpl;
import org.dows.app.mapper.AppApplyItemMapper;
import org.dows.app.entity.AppApplyItem;
import org.dows.app.service.AppApplyItemService;
import org.springframework.stereotype.Service;


/**
 * 申请资料条目(AppApplyItem)表服务实现类
 *
 * @author lait.zhang
 * @since 2022-10-19 22:05:41
 */
@Service("appApplyItemService")
public class AppApplyItemServiceImpl extends MybatisCrudServiceImpl<AppApplyItemMapper, AppApplyItem> implements AppApplyItemService {

}

