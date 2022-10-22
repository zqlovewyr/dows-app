package org.dows.app.service.impl;

import org.dows.framework.crud.mybatis.MybatisCrudServiceImpl;
import org.dows.app.mapper.AppApplyMapper;
import org.dows.app.entity.AppApply;
import org.dows.app.service.AppApplyService;
import org.springframework.stereotype.Service;


/**
 * 应用申请(AppApply)表服务实现类
 *
 * @author lait.zhang
 * @since 2022-10-22 16:49:42
 */
@Service("appApplyService")
public class AppApplyServiceImpl extends MybatisCrudServiceImpl<AppApplyMapper, AppApply> implements AppApplyService {

}

