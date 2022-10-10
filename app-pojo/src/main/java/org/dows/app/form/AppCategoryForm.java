package org.dows.app.form;


import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * 应用分类(AppCategory)表单
 *
 * @author lait.zhang
 * @since 2022-10-10 14:17:18
 */
@SuppressWarnings("serial")
@Data
@ToString
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "AppCategoryForm 表单对象", description = "应用分类")
public class AppCategoryForm implements Serializable {
    private static final long serialVersionUID = -77224024858307285L;
    @JsonIgnore
    private Long id;

    @ApiModelProperty("父节点ID")
    private Long pid;

    @ApiModelProperty("应用分类名称")
    private String categName;

    @ApiModelProperty("应用分类code")
    private String categCode;

    @ApiModelProperty("描述")
    private String descr;

    @JsonIgnore
    private Boolean deleted;


}

