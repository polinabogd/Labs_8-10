package com.insurance.insurances;

import com.insurance.enums.CorporateInsurances;
import com.insurance.enums.InsuranceType;
import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class CorporateInsurance extends Insurance {
    private String businessField;
    private int employeeAmount;
    private CorporateInsurances insuranceType;
    public CorporateInsurance(final String businessField, final int
            employeeAmount, final CorporateInsurances insuranceType,
                              final InsuranceType type, final int
                                      durationInMonths, final int minInsuranceSum,
                              final int riskLevel) {
        super(type, durationInMonths, minInsuranceSum, riskLevel);
        this.businessField = businessField;
        this.employeeAmount = employeeAmount;
        this.insuranceType = insuranceType;
    }
}
