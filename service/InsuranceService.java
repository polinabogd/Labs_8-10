package com.insurance.service;

import com.insurance.insurances.Insurance;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Service
@ApplicationScope
public class InsuranceService {
    private AtomicInteger id = new AtomicInteger(0);
    private final Map<Integer, Insurance> insuranceMap = new HashMap<Integer, Insurance>();

    public Insurance addInsurance(Insurance insurance){
        int insuranceId = id.incrementAndGet();
        insurance.setId(insuranceId);
        insuranceMap.put(insuranceId, insurance);
        return null;
    }

    public Insurance updateInsurance(Insurance insurance){
        return insuranceMap.put(insurance.getId(), insurance);
    }

    public List<Insurance> getInsurances(){
        return new ArrayList<>(insuranceMap.values());
    }

    public Insurance getInsurance(int id) {
        return insuranceMap.get(id);
    }
}
