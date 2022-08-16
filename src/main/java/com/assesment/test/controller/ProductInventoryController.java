package com.assesment.test.controller;

import com.assesment.test.dao.AvailabilityRespModel;
import com.assesment.test.dao.ProductInventoryPojo;
import com.assesment.test.service.ProductInventoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

//first question
@RestController
public class ProductInventoryController {

    private static final Logger logger = LoggerFactory.getLogger(ProductInventoryController.class);


    @Autowired
    ProductInventoryService productInventoryService;

    @PostMapping("/getInvPicture")
    public ResponseEntity<AvailabilityRespModel> getInvPicture(@RequestBody ProductInventoryPojo request){

        logger.info("Inside getInvPicture");
       // Date reqDate = new SimpleDateFormat("yyyy-MM-dd").parse(request.getReqDate());


        return null;
    }

}
