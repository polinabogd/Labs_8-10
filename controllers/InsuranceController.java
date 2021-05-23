package com.insurance.controllers;

import com.insurance.service.InsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.insurance.insurances.Insurance;

import java.util.List;

@RestController
@RequestMapping(path = "/insurance")
public class InsuranceController {

    @Autowired
    private InsuranceService insuranceService;

    @GetMapping(path = "{id}")
    public Insurance getInsurance(@PathVariable int id) {
        return insuranceService.getInsurance(id);
    }

    @GetMapping
    public List<Insurance> getInsurances(){
        return insuranceService.getInsurances();
    };

    @PostMapping
    public Insurance updateInsurance(@RequestBody Insurance insurance){
        return insuranceService.addInsurance(insurance);
    }

    @PutMapping
    public ResponseEntity<Insurance> createInsurance(@RequestBody Insurance insurance){
        if(insuranceService.getInsurance(insurance.getId()) != null) {
            return new ResponseEntity<Insurance>(insuranceService.updateInsurance(insurance), HttpStatus.OK);
        } else {
            return new ResponseEntity<Insurance>(HttpStatus.NOT_FOUND);
        }
    }
}
