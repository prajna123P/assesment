package com.assesment.test.service;

import com.assesment.test.dao.ProductInventoryPojo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//first question
@Component
public class ProductInventoryService {

    private static final Logger logger = LoggerFactory.getLogger(ProductInventoryService.class);
    private static List<ProductInventoryPojo> productInventoryList = new ArrayList<>();

    static {
        try {
            productInventoryList.add(new ProductInventoryPojo("Prod1", "Shirt", "EACH", 10.0, new SimpleDateFormat("yyyy-MM-dd").parse("2021-03-20")));
            productInventoryList.add(new ProductInventoryPojo("Prod1", "Shirt", "EACH", 20.0, new SimpleDateFormat("yyyy-MM-dd").parse("2021-03-21")));
            productInventoryList.add(new ProductInventoryPojo("Prod1", "Shirt", "EACH", 20.0, new SimpleDateFormat("yyyy-MM-dd").parse("2021-03-28")));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }



    }
}
