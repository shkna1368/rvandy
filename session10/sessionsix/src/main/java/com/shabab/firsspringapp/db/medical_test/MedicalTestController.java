package com.shabab.firsspringapp.db.medical_test;


import com.shabab.firsspringapp.db.IStudentService;
import com.shabab.firsspringapp.db.StudentDTO;
import com.shabab.firsspringapp.db.StudentMapper;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medical-test")
@AllArgsConstructor
public class MedicalTestController {

  private final IMedicalTestService medicalTestService;
  private final MedicaTestMapper medicaTestMapper;




  @ApiOperation(value = "Add new  Student")
  @ApiResponses(value = {
          @ApiResponse(code = 201, message = "successfully add"),
          @ApiResponse(code = 409, message = "duplicate"),

  })

  @PostMapping("/v1")
  public ResponseEntity save(@RequestBody MedicalTestDTO medicalTestDTO){

     MedicalTest medicalTest= medicaTestMapper.toEntity(medicalTestDTO);
    medicalTestService.addNew(medicalTest);
    return  ResponseEntity.status(HttpStatus.CREATED).build();
  }






  @ApiOperation(value = "get all")
  @ApiResponses(value = {
          @ApiResponse(code = 200, message = "successfully get all"),
  })
 @GetMapping(value="/getAll")
  public ResponseEntity<List<MedicalTestDTO>> getById(){

   List<MedicalTestDTO> studentDTOs= medicaTestMapper.toDTOs(medicalTestService.getAll());

    return  ResponseEntity.ok(studentDTOs);


  }




}
