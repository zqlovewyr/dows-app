package org.dows.app.form;


import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * 申请资料条目(AppApplyItem)表单
 *
 * @author lait.zhang
 * @since 2022-10-22 16:50:11
 */
@SuppressWarnings("serial")
@Data
@ToString
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "AppApplyItemForm 表单对象", description = "申请资料条目")
public class AppApplyItemForm implements Serializable {
    private static final long serialVersionUID = 212935482638739153L;
    @JsonIgnore
    private Long id;

    @ApiModelProperty("应用ID")
    private String appId;

    @ApiModelProperty("小程序名称")
    private String appName;

    @ApiModelProperty("应用或小程序申请订单编号")
    private String applyOrderNo;

    @ApiModelProperty("第三方平台申请单号（第三放平台回填）")
    private String platformOrderNo;

    @ApiModelProperty("")
    private String platformAccount;

    @ApiModelProperty("第三方平台关联应用名")
    private String platformAppName;

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

    @JsonIgnore
    private Boolean deleted;


}

