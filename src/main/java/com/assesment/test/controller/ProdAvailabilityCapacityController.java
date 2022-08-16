package com.assesment.test.controller;

import com.assesment.test.dao.AvailabilityCapacityModel;
import com.assesment.test.service.AvailabilityDaoService;
import com.assesment.test.service.CapacityDaoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@RestController
public class ProdAvailabilityCapacityController {

    private static final Logger logger = LoggerFactory.getLogger(ProdAvailabilityCapacityController.class);

    @PostMapping("/getProdAvailability")
    public ResponseEntity<AvailabilityCapacityModel> getProdAvailability(@RequestBody AvailabilityCapacityModel request)
            throws InterruptedException, ExecutionException {

        ResponseEntity<AvailabilityCapacityModel> responseEntity = null;
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> availabilityFuture = executorService.submit(new AvailabilityDaoService(request));
        Future<Integer> capacityFuture = executorService.submit(new CapacityDaoService(request));


        logger.info("availabilityFuture & capacityFuture calls starts");

        /*Basis size of this list which is being returned form DAO layer, controller is preparing the value of status field */

        if (availabilityFuture.get() == 1 && capacityFuture.get() == 0) {
            request.setStatus("No Capacity");
            responseEntity = new ResponseEntity<AvailabilityCapacityModel>(request, HttpStatus.OK);
        }
        if (availabilityFuture.get() == 1 && capacityFuture.get() == 1) {
            request.setStatus("Available");
            responseEntity = new ResponseEntity<AvailabilityCapacityModel>(request, HttpStatus.OK);
        }
        if (availabilityFuture.get() == 0 && capacityFuture.get() == 1) {
            responseEntity = new ResponseEntity<AvailabilityCapacityModel>(HttpStatus.NO_CONTENT);
        }
        return responseEntity;

    }
}
