package com.example.spring_poc_curd;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Details {
    public int[] customer = {10000  , 20000, 34000, 31000, 14000, 50000, 78000, 98000, 56000, 65000, 43000, 32000, 87000, 45000, 51000, 100000, 24000, 84000, 8000, 9500};

    @GetMapping("/Customer")
    public int[] getcustomers() {
        return customer;
    }

    @GetMapping("/getOne/{index}")
    public int getOneAmount(@PathVariable("index") int index) {
        return customer[index];
    }

    @PutMapping("/update")
    public void updatebalance() {
        for (int i = 0; i < customer.length; i++) {
            if (customer[i] >= 5000 && customer[i] <= 9999) {
                customer[i] = (int) (customer[i] - (customer[i] * 0.03));
            } else if (customer[i] >= 1000 && customer[i] <= 4999) {
                customer[i] = (int) (customer[i] - (customer[i] * 0.05));
            }

        }
    }
}

