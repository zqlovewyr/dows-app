package org.dows.app.api.mini;

import org.dows.app.api.mini.request.AppApplyRequest;
import org.dows.app.api.mini.response.AppApplyResponse;
import org.dows.framework.api.Response;

public interface AppApplyApi {

    /**
     * 保存申请
     * @param appApplyRequest
     * @return
     */
    AppApplyResponse saveApply(AppApplyRequest appApplyRequest);

    /**
     * 更新申请
     * @param appApplyRequest
     * @return
     */
    AppApplyResponse updateApplyPlatformOrderNo(AppApplyRequest appApplyRequest);


    /**
     * 条件查询 AppApply
     *
     * @param appApplyRequest
     * @return
     */
    AppApplyResponse getOneAppApply(AppApplyRequest appApplyRequest);
}
