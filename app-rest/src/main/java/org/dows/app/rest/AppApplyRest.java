package org.dows.app.rest;


import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.dows.app.api.mini.AppApplyApi;
import org.dows.framework.crud.mybatis.MybatisCrudRest;
import org.dows.app.entity.AppApply;
import org.dows.app.form.AppApplyForm;
import org.dows.app.service.AppApplyService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 应用申请(AppApply)表控制层
 *
 * @author lait.zhang
 * @since 2022-10-10 14:17:50
 */
@Api(tags = "应用申请")
@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("appApply")
public class AppApplyRest implements MybatisCrudRest<AppApplyForm, AppApply, AppApplyService> {

    //private final AppApplyBiz appApplyBiz;

}

