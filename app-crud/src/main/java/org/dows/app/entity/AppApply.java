package org.dows.app.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;
import org.dows.framework.crud.mybatis.CrudEntity;

import java.util.Date;

/**
 * 应用申请(AppApply)实体类
 *
 * @author lait.zhang
 * @since 2022-10-22 16:49:41
 */
@SuppressWarnings("serial")
@Data
@ToString
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "AppApply对象", description = "应用申请")
public class AppApply implements CrudEntity {
    private static final long serialVersionUID = -46673334686886733L;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("主键ID")
    @TableField(value = "id")
    private Long id;

    @ApiModelProperty("应用类型")
    @TableField(value = "categ_id")
    private String categId;

    @ApiModelProperty("应用或小程序申请订单编号(全局唯一)")
    @TableField(value = "apply_order_no")
    private String applyOrderNo;

    @ApiModelProperty("应用ID(申请审核通过后回填)")
    @TableField(value = "app_id")
    private String appId;

    @ApiModelProperty("应用名称")
    @TableField(value = "app_name")
    private String appName;

    @ApiModelProperty("平台")
    @TableField(value = "platform")
    private String platform;

    @ApiModelProperty("第三方平台申请单号（第三放平台审核通过后回填）")
    @TableField(value = "platform_order_no")
    private String platformOrderNo;
    @TableField(value = "platform_app_id")
    @ApiModelProperty("第三方平台关联应用ID（第三放平台审核通过后回填）")
    private String platformAppId;

    @ApiModelProperty("第三方平台关联应用名(可以统一用appName)")
    @TableField(value = "platform_app_name")
    private String platformAppName;

    @ApiModelProperty("申请人")
    @TableField(value = "applicant")
    private String applicant;

    @ApiModelProperty("租户名称（付费对象）")
    @TableField(value = "tenant_name")
    private String tenantName;

    @ApiModelProperty("租户ID")
    @TableField(value = "tenant_id")
    private String tenantId;

    @JsonIgnore
    @TableLogic
    @TableField(value = "deleted",fill = FieldFill.INSERT)
    @ApiModelProperty("逻辑删除")
    private Boolean deleted;

}

