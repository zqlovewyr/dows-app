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
 * 应用分类(AppCategory)实体类
 *
 * @author lait.zhang
 * @since 2022-10-10 14:15:33
 */
@SuppressWarnings("serial")
@Data
@ToString
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "AppCategory对象", description = "应用分类")
public class AppCategory implements CrudEntity {
    private static final long serialVersionUID = -64968346508090044L;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("资源类目ID")
    private Long id;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("父节点ID")
    private Long pid;

    @ApiModelProperty("应用分类名称")
    private String categName;

    @ApiModelProperty("应用分类code")
    private String categCode;

    @ApiModelProperty("描述")
    private String descr;

    @JsonIgnore
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty("是否逻辑删除: 0 未删除(false), 1 已删除(true); 默认: 0")
    private Boolean deleted;

}

