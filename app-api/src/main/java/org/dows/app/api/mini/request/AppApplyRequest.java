package org.dows.app.api.mini.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Builder
@Data
public class AppApplyRequest implements Serializable {

    private static final long serialVersionUID = 910895302256785608L;
    @JsonIgnore
    private Long id;

    @ApiModelProperty("应用类型")
    private String categId;

    @ApiModelProperty("应用或小程序申请订单编号(全局唯一)")
    private String applyOrderNo;

    @ApiModelProperty("应用ID(申请审核通过后回填)")
    private String appId;

    @ApiModelProperty("应用名称")
    private String appName;

    @ApiModelProperty("")
    private String platform;

    @ApiModelProperty("第三方平台申请单号（第三放平台审核通过后回填）")
    private String platformOrderNo;

    @ApiModelProperty("第三方平台关联应用ID（第三放平台审核通过后回填）")
    private String platformAppId;

    @ApiModelProperty("第三方平台关联应用名(可以统一用appName)")
    private String platformAppName;

    @ApiModelProperty("申请人")
    private String applicant;


    @ApiModelProperty("")
    private String platformAccount;

    @ApiModelProperty("营业执照编号")
    private String certNo;

    @ApiModelProperty("法人")
    private String legalName;

    @ApiModelProperty("营业执照名称")
    private String certName;

    @ApiModelProperty("联系人手机")
    private String contactPhone;

    @ApiModelProperty("联系人")
    private String contactName;

}
