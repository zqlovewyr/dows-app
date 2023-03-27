package org.dows.app.api.mini;

import org.dows.app.api.mini.request.AppApplyRequest;
import org.dows.app.entity.AppApply;
import org.dows.framework.api.Response;

public interface AppApplyApi {

    /**
     * 保存申请
     * @param appApplyRequest
     * @return
     */
    Boolean saveApply(AppApplyRequest appApplyRequest);

    /**
     * 更新申请
     * @param appApplyRequest
     * @return
     */
    Boolean updateApplyPlatformOrderNo(AppApplyRequest appApplyRequest);


    /**
     * 条件查询 AppApply
     *
     * @param appApplyRequest
     * @return
     */
    Response<AppApply> getOneAppApply(AppApplyRequest appApplyRequest);
}
