package org.dows.app.biz;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.dows.app.api.AppApplyRequest;
import org.dows.framework.api.Response;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@RequiredArgsConstructor
@Service
public class AppApplyBiz {


    @Transactional
    Response saveApply(AppApplyRequest appApplyRequest) {
        // todo 保存 AppApply

        // todo  保存AppApplyItem


        return Response.ok();

    }

}
