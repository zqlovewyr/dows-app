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

    @ApiModelProperty("租户名称（付费对象）")
    private String tenantName;

    @ApiModelProperty("租户ID")
    private String tenantId;

    @JsonIgnore
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty("逻辑删除")
    private Boolean deleted;

}

