package com.shabab.firsspringapp.db;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Data
public class StudentDTO {



  @ApiModelProperty(required = false, hidden = true)
   private Long id;

  @NotNull
  @NotEmpty
  @ApiModelProperty(required = true, hidden = false)
  private String fullName;

  @NotNull
  @NotEmpty
  @ApiModelProperty(required = true, hidden = false)
  private Integer age;

  @NotNull
  @NotEmpty
  @ApiModelProperty(required = true, hidden = false)
  private Long birthDate;

}
