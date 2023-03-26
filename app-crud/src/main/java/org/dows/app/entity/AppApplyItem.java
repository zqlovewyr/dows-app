package org.dows.app.entity;

import cn.hutool.core.annotation.Alias;
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
 * @since 2022-10-22 16:49:42
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
    private static final long serialVersionUID = 551379754191338311L;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("主键ID")
    @TableField(value = "id")
    private Long id;

    @ApiModelProperty("应用ID")
    @TableField(value = "app_id")
    private String appId;

    @ApiModelProperty("小程序名称")
    @TableField(value = "app_name")
    private String appName;

    @ApiModelProperty("应用或小程序申请订单编号")
    @TableField(value = "apply_order_no")
    private String applyOrderNo;

    @ApiModelProperty("第三方平台申请单号（第三放平台回填）")
    @TableField(value = "platform_order_no")
    private String platformOrderNo;

    @ApiModelProperty("platform_account")
    @TableField(value = "")
    private String platformAccount;

    @ApiModelProperty("第三方平台关联应用名")
    @TableField(value = "platform_app_name")
    private String platformAppName;

    @ApiModelProperty("营业执照编号")
    @TableField(value = "cert_no")
    private String certNo;

    @ApiModelProperty("法人")
    @TableField(value = "legal_name")
    private String legalName;

    @ApiModelProperty("营业执照名称")
    @TableField(value = "cert_name")
    private String certName;

    @ApiModelProperty("联系人手机")
    @TableField(value = "contact_phone")
    private String contactPhone;

    @ApiModelProperty("联系人")
    @TableField(value = "contact_name")
    private String contactName;

    @JsonIgnore
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty("逻辑删除")
    private Boolean deleted;

}

