package com.insurance.insurances;

import com.insurance.enums.InsuranceType;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Insurance {
    private int id;
    private InsuranceType type;
    private int durationInMonths;
    private int minInsuranceSum;
    private int riskLevel;
}
