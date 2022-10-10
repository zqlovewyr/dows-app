package org.dows.app.rest;


import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.dows.framework.crud.mybatis.MybatisCrudRest;
import org.dows.app.entity.AppApplyItem;
import org.dows.app.form.AppApplyItemForm;
import org.dows.app.service.AppApplyItemService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 申请资料条目(AppApplyItem)表控制层
 *
 * @author lait.zhang
 * @since 2022-10-10 14:17:51
 */
@Api(tags = "申请资料条目")
@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("appApplyItem")
public class AppApplyItemRest implements MybatisCrudRest<AppApplyItemForm, AppApplyItem, AppApplyItemService> {

    //private final AppApplyItemBiz appApplyItemBiz;

}

