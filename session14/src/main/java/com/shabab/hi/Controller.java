package com.shabab.hi;



import io.swagger.annotations.Api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "Tag1")
@Tag(name = "Controller", description = "My Custom Description")
public class Controller {

    @Operation(summary = "Say Hi")

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success|OK"),
            @ApiResponse(responseCode = "201", description = "create"),
            @ApiResponse(responseCode = "409", description = "not found"),})

    @GetMapping("/hi")
    public String hi(){
        return "Hi kuber";
    }
}

