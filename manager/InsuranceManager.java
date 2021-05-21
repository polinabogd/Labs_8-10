package com.insurance.manager;

import com.insurance.enums.InsuranceType;
import com.insurance.enums.SortOrder;
import com.insurance.insurances.Insurance;
import lombok.Data;
import java.util.ArrayList;
import java.util.Comparator;

@Data
public class InsuranceManager {
    private ArrayList<Insurance> allInsurances;

    public InsuranceManager() {
        this.allInsurances = new ArrayList<Insurance>();
    }

    public final void addInsurance(final Insurance insurance) {
        this.allInsurances.add(insurance);
    }

    public final ArrayList<Insurance> sortByRisk(final SortOrder order) {
        if (order == SortOrder.ASC) {
            allInsurances.sort(Comparator.comparing(Insurance::getRiskLevel));
         } else {
            allInsurances.sort(Comparator.comparing(
                    Insurance::getRiskLevel).reversed());
         }
        return allInsurances;
    }

    public final ArrayList<Insurance> sortByDuration(final SortOrder order) {
        if (order == SortOrder.ASC) {
            allInsurances.sort(Comparator.comparing(
                    Insurance::getDurationInMonths));
        } else {
            allInsurances.sort(Comparator.comparing(
                    Insurance::getDurationInMonths).reversed());
        }
        return allInsurances;
    }

    public final ArrayList<Insurance> searchByType(final InsuranceType type) {
        ArrayList<Insurance> searchedInsurances = new ArrayList<Insurance>();
        for (Insurance allInsurance : allInsurances) {
            if (allInsurance.getType() == type) {
                searchedInsurances.add(allInsurance);
            }
        }
        return searchedInsurances;
    }
}
