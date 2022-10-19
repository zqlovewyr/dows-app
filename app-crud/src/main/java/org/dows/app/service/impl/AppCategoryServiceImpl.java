package org.dows.app.service.impl;

import org.dows.framework.crud.mybatis.MybatisCrudServiceImpl;
import org.dows.app.mapper.AppCategoryMapper;
import org.dows.app.entity.AppCategory;
import org.dows.app.service.AppCategoryService;
import org.springframework.stereotype.Service;


/**
 * 应用分类(AppCategory)表服务实现类
 *
 * @author lait.zhang
 * @since 2022-10-19 22:05:41
 */
@Service("appCategoryService")
public class AppCategoryServiceImpl extends MybatisCrudServiceImpl<AppCategoryMapper, AppCategory> implements AppCategoryService {

}

