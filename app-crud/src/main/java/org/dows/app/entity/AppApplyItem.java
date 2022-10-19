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
 * 申请资料条目(AppApplyItem)实体类
 *
 * @author lait.zhang
 * @since 2022-10-19 22:05:40
 */
@SuppressWarnings("serial")
@Data
@ToString
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "AppApplyItem对象", description = "申请资料条目")
public class AppApplyItem implements CrudEntity {
    private static final long serialVersionUID = 224964162206659339L;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("主键ID")
    private Long id;

    @ApiModelProperty("应用ID")
    private String appId;

    @ApiModelProperty("小程序名称")
    private String appName;

    @ApiModelProperty("应用或小程序申请订单编号")
    private String applyOrderNo;

    @ApiModelProperty("第三方平台申请单号（第三放平台审核通过后回填）")
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
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty("逻辑删除")
    private Boolean deleted;

}

