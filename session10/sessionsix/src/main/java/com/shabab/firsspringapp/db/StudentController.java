package com.shabab.firsspringapp.db;


import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/student")
@AllArgsConstructor
public class StudentController {

  private final  IStudentService studentService;
  private final  StudentMapper studentMapper;




  @ApiOperation(value = "Add new  Student")
  @ApiResponses(value = {
          @ApiResponse(code = 201, message = "successfully add"),
          @ApiResponse(code = 409, message = "duplicate"),

  })

  @PostMapping("/v1")
  public ResponseEntity save(@RequestBody StudentDTO studentDTO){


    studentService.addNew(studentMapper.toEntity(studentDTO));
    return  ResponseEntity.status(HttpStatus.CREATED).build();
  }



  @ApiOperation(value = "update carPart")
  @ApiResponses(value = {
          @ApiResponse(code = 200, message = "successfully update"),
          @ApiResponse(code = 404, message = "not found"),
          @ApiResponse(code = 409, message = "duplicate"),

  })
  @PutMapping("/v1")
  public ResponseEntity update(@RequestBody StudentDTO studentDTO){
    studentService.update(studentMapper.toEntity(studentDTO));
    return  ResponseEntity.ok().build();


  }
  @ApiOperation(value = "get student by id")
  @ApiResponses(value = {
          @ApiResponse(code = 200, message = "successfully get car"),
          @ApiResponse(code = 404, message = "not found"),
  })
  @GetMapping(value="/{id}")
  public ResponseEntity<StudentDTO> getById(@PathVariable Long id){

    StudentDTO studentDTO= studentMapper.toDTO(studentService.getById(id));

    return  ResponseEntity.ok(studentDTO);


  }

  @ApiOperation(value = "get all")
  @ApiResponses(value = {
          @ApiResponse(code = 200, message = "successfully get car"),
  })
 @GetMapping(value="/getAll")
  public ResponseEntity<List<StudentDTO>> getById(){

   List<StudentDTO> studentDTOs= studentMapper.toDTOs(studentService.getAll());

    return  ResponseEntity.ok(studentDTOs);


  }


  @ApiOperation(value = "delete student by id")
  @ApiResponses(value = {
          @ApiResponse(code = 200, message = "successfully get car"),
          @ApiResponse(code = 404, message = "not found"),
  })
  @DeleteMapping("/{id}")
  public ResponseEntity delete(@PathVariable Long id){

    studentService.deletById(id);

    return  ResponseEntity.ok().build();


  }


}
