package org.dows.app.biz;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.dows.app.api.mini.AppApplyApi;
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
public class AppApplyBiz implements AppApplyApi {

    @Autowired
    private AppApplyService appApplyService;

    @Autowired
    private AppApplyItemService appApplyItemService;

    @Transactional
    @Override
    public Boolean saveApply(AppApplyRequest appApplyRequest) {
        // todo 保存AppApply
        AppApply appApply = BeanUtil.copyProperties(appApplyRequest, AppApply.class);
        appApplyService.save(appApply);
        // todo 保存AppApplyItem
        AppApplyItem appApplyItem = BeanUtil.copyProperties(appApplyRequest, AppApplyItem.class);
        return appApplyItemService.save(appApplyItem);
    }


    @Transactional
    @Override
    public Boolean updateApplyPlatformOrderNo(AppApplyRequest appApplyRequest) {
        // 更新AppApply
        LambdaQueryWrapper<AppApply> queryWrapperAppApply = new LambdaQueryWrapper();
        if(StringUtils.isNotEmpty(appApplyRequest.getPlatform())){
            queryWrapperAppApply.eq(AppApply::getPlatformOrderNo,appApplyRequest.getPlatformOrderNo());
        }
        AppApply appApply = new AppApply();
        appApply.setPlatformOrderNo(appApplyRequest.getPlatformOrderNo());
        appApplyService.update(appApply,queryWrapperAppApply);
        // 更新AppApplyItem
        // 更新AppApply
        LambdaQueryWrapper<AppApplyItem> queryWrapperAppApplyItem = new LambdaQueryWrapper();
        if(StringUtils.isNotEmpty(appApplyRequest.getPlatform())){
            queryWrapperAppApplyItem.eq(AppApplyItem::getPlatformOrderNo,appApplyRequest.getPlatformOrderNo());
        }
        AppApplyItem appApplyItem = new AppApplyItem();
        appApplyItem.setPlatformOrderNo(appApplyRequest.getPlatformOrderNo());
        return  appApplyItemService.update(appApplyItem,queryWrapperAppApplyItem);
    }


    /**
     * 条件查询 AppApply
     * @param appApplyRequest
     * @return
     */
    @Override
    public Response<AppApply> getOneAppApply(AppApplyRequest appApplyRequest) {
       LambdaQueryWrapper<AppApply> appApplyQueryWrapper = new LambdaQueryWrapper<AppApply>();
        if(StringUtils.isNotEmpty(appApplyRequest.getPlatform())){
            appApplyQueryWrapper.eq(AppApply::getPlatform,appApplyRequest.getPlatform());
        }
        if(StringUtils.isNotEmpty(appApplyRequest.getAppName())){
            appApplyQueryWrapper.eq(AppApply::getAppName,appApplyRequest.getAppName());
        }
        AppApply appApply = appApplyService.getOne(appApplyQueryWrapper);
        //未引入MPJ 当引入MPJ可使用join查询  但是要注意多表重名字段
        if(appApply != null) {
            LambdaQueryWrapper<AppApplyItem> appApplyItemQueryWrapper = new LambdaQueryWrapper<AppApplyItem>();
            //applyOrderNo作为两表的关联字段  若不是需更改
            appApplyItemQueryWrapper.eq(AppApplyItem::getApplyOrderNo, appApply.getApplyOrderNo());
            if(StringUtils.isNotEmpty(appApplyRequest.getContactName())){
                appApplyItemQueryWrapper.eq(AppApplyItem::getContactName,appApplyRequest.getContactName());
            }
            if(StringUtils.isNotEmpty(appApplyRequest.getContactPhone())){
                appApplyItemQueryWrapper.eq(AppApplyItem::getContactPhone,appApplyRequest.getContactPhone());
            }
            AppApplyItem appApplyItem = appApplyItemService.getOne(appApplyItemQueryWrapper);
            if (appApplyItem == null) {
                return Response.ok(null);
            }
        }
        //Response.ok(appApply);
        return Response.ok(appApply);
    }

}
