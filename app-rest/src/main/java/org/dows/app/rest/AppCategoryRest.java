package org.dows.app.rest;


import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.dows.framework.crud.mybatis.MybatisCrudRest;
import org.dows.app.entity.AppCategory;
import org.dows.app.form.AppCategoryForm;
import org.dows.app.service.AppCategoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 应用分类(AppCategory)表控制层
 *
 * @author lait.zhang
 * @since 2022-10-10 14:17:51
 */
@Api(tags = "应用分类")
@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("appCategory")
public class AppCategoryRest implements MybatisCrudRest<AppCategoryForm, AppCategory, AppCategoryService> {

    //private final AppCategoryBiz appCategoryBiz;

}

