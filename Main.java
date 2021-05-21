package com.insurance;

import com.insurance.enums.Benefits;
import com.insurance.enums.CorporateInsurances;
import com.insurance.enums.InsuranceType;
import com.insurance.enums.Property;
import com.insurance.enums.SortOrder;
import com.insurance.insurances.CorporateInsurance;
import com.insurance.insurances.LifeInsurance;
import com.insurance.insurances.PropertyInsurance;
import com.insurance.manager.InsuranceManager;

public class Main {
    public static void main(String[] args) {
        InsuranceManager insuranceList = new InsuranceManager();
        insuranceList.addInsurance(new CorporateInsurance(
                "Super mega IT firm", 12, CorporateInsurances.CYBER_CASES,
                InsuranceType.CORPORATE, 23, 34, 23));
        insuranceList.addInsurance(new LifeInsurance(
                "Bob Canter", "Bob Canter J", Benefits.JURIDICAL_HELP,
                InsuranceType.LIFE, 24, 15000, 34));
        insuranceList.addInsurance(new PropertyInsurance(
                Property.CAR, 120000, 30000, InsuranceType.PROPERTY,
                12, 12000, 78));
        System.out.println(insuranceList.searchByType(InsuranceType.LIFE));
        System.out.println(insuranceList.sortByRisk(SortOrder.DESC));
        System.out.println(insuranceList.sortByDuration(SortOrder.ASC));
    }
}
