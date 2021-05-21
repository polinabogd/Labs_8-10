package com.insurance.insurances;

import com.insurance.enums.InsuranceType;
import com.insurance.enums.Benefits;
import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class LifeInsurance extends Insurance {
    private String personName;
    private String inheritorName;
    private Benefits guaranteedBenefit;
    public LifeInsurance(final String personName, final String inheritorName,
                         final Benefits guaranteedBenefit, final InsuranceType
                                 type, final int durationInMonths, final int
                                 minInsuranceSum, final int riskLevel) {
        super(type, durationInMonths, minInsuranceSum, riskLevel);
        this.personName = personName;
        this.inheritorName = inheritorName;
        this.guaranteedBenefit = guaranteedBenefit;
    }
}
