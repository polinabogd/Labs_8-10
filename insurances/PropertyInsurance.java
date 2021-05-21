package com.insurance.insurances;

import com.insurance.enums.InsuranceType;
import com.insurance.enums.Property;
import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class PropertyInsurance extends Insurance {
    private Property typeOfProperty;
    private int propertyPrice;
    private int maxPayment;
    public PropertyInsurance(final Property typeOfProperty, final
    int propertyPrice, final int maxPayment, final InsuranceType
            type, final int durationInMonths, final int minInsuranceSum,
                             final int riskLevel) {
        super(type, durationInMonths, minInsuranceSum, riskLevel);
        this.typeOfProperty = typeOfProperty;
        this.propertyPrice = propertyPrice;
        this.maxPayment = maxPayment;
    }
}
