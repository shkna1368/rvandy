package com.shabab.firsspringapp.db.medical_test;


import com.shabab.firsspringapp.db.StudentDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Data
public class MedicalTestDTO {



  @ApiModelProperty(required = false, hidden = true)
   private Long id;

  @NotNull
  @NotEmpty
  @ApiModelProperty(required = true, hidden = false)
  private String type;



  @NotNull
  @NotEmpty
  @ApiModelProperty(required = true, hidden = false)
  private Long createDate;


  @ApiModelProperty(required = false, hidden = true)
  private StudentDTO student;

}
