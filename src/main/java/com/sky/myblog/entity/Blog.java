package com.sky.myblog.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;

/**
 * <p>
 * 
 * </p>
 *
 * @author sky
 * @since 2021-11-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("m_blog")
public class Blog implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long userId;

    @NotBlank(message = "title cannot be empty")
    private String title;

    @NotBlank(message = "description cannot be empty")
    private String description;

    @NotBlank(message = "content cannot be empty")
    private String content;

    //将LocalDateTime字段以指定格式化日期的方式返回给前端
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime created;

    private Integer status;


}
