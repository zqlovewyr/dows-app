package org.dows.app.biz;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.dows.app.api.mini.request.AppApplyRequest;
import org.dows.app.entity.AppApply;
import org.dows.app.entity.AppApplyItem;
import org.dows.app.service.AppApplyItemService;
import org.dows.app.service.AppApplyService;
import org.dows.framework.api.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@RequiredArgsConstructor
@Service
public class AppApplyBiz {

    @Autowired
    private AppApplyService appApplyService;

    @Autowired
    private AppApplyItemService appApplyItemService;

    @Transactional
    public Response saveApply(AppApplyRequest appApplyRequest) {
        // todo 保存AppApply
        AppApply appApply = BeanUtil.copyProperties(appApplyRequest, AppApply.class);
        appApplyService.save(appApply);
        // todo 保存AppApplyItem
        AppApplyItem appApplyItem = BeanUtil.copyProperties(appApplyRequest, AppApplyItem.class);
        appApplyItemService.save(appApplyItem);
        return Response.ok();
    }


    @Transactional
    public Response updateApplyPlatformOrderNo(AppApplyRequest appApplyRequest) {
        // 更新AppApply
        QueryWrapper<AppApply> queryWrapperAppApply = new QueryWrapper();
        if(StringUtils.isNotEmpty(appApplyRequest.getPlatform())){
            queryWrapperAppApply.eq("platform_order_no",appApplyRequest.getPlatformOrderNo());
        }
        AppApply appApply = new AppApply();
        appApply.setPlatformOrderNo(appApplyRequest.getPlatformOrderNo());
        appApplyService.update(appApply,queryWrapperAppApply);
        // 更新AppApplyItem
        // 更新AppApply
        QueryWrapper<AppApplyItem> queryWrapperAppApplyItem = new QueryWrapper();
        if(StringUtils.isNotEmpty(appApplyRequest.getPlatform())){
            queryWrapperAppApplyItem.eq("platform_order_no",appApplyRequest.getPlatformOrderNo());
        }
        AppApplyItem appApplyItem = new AppApplyItem();
        appApplyItem.setPlatformOrderNo(appApplyRequest.getPlatformOrderNo());
        appApplyItemService.update(appApplyItem,queryWrapperAppApplyItem);
        return Response.ok();
    }


    /**
     * 条件查询 AppApply
     * @param appApplyRequest
     * @return
     */
    public Response getOneAppApply(AppApplyRequest appApplyRequest) {
        QueryWrapper<AppApply> queryWrapper = new QueryWrapper();
        if(StringUtils.isNotEmpty(appApplyRequest.getPlatform())){
            queryWrapper.eq("platform",appApplyRequest.getPlatform());
        }
        if(StringUtils.isNotEmpty(appApplyRequest.getAppName())){
            queryWrapper.eq("app_name",appApplyRequest.getAppName());
        }
        if(StringUtils.isNotEmpty(appApplyRequest.getContactName())){
            queryWrapper.eq("contact_name",appApplyRequest.getContactName());
        }
        if(StringUtils.isNotEmpty(appApplyRequest.getContactPhone())){
            queryWrapper.eq("contact_phone",appApplyRequest.getContactPhone());
        }
        AppApply appApply = appApplyService.getOne(queryWrapper);
        return Response.ok(appApply);
    }

}
