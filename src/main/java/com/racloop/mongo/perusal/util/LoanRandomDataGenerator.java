package com.racloop.mongo.perusal.util;

import com.racloop.mongo.perusal.entity.LoanEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class LoanRandomDataGenerator {
    private static final Random random = new Random();

    public static List<LoanEntity> generateData(int count) {
        List<LoanEntity> entities = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            LoanEntity entity = new LoanEntity();
            entity.setLoan_account_no(getRandomString(20));
            entity.setBranch_id(getRandomString(10));
            entity.setLead_id(getRandomString(10));
            entity.setBranch_id(getRandomString(10));
            entity.setCust_ID(getRandomString(10));
            entity.setProd_Id(getRandomString(10));
            entity.setLoan_Purpose_Code(getRandomString(10));
            entity.setEnd_Use_Of_Loan_Remarks(getRandomString(30));
            entity.setLoan_Requested_Amount(random.nextInt(100));
            entity.setLoan_Application_Dt(new Date());
            entity.setSanction_Dt(new Date());
            entity.setSanction_Period(random.nextInt());
            entity.setSanction_Amount(random.nextInt(100));
            entity.setSanction_Rate_Of_Interest(random.nextInt(100));
            entity.setRate_Of_Interest(random.nextFloat());
            entity.setRate_Of_Interest(random.nextDouble());
            entity.setMargin_Rate_Of_Interest(random.nextFloat());
            entity.setBase_Rate_Of_Interest(random.nextDouble());
            entity.setInterest_Frequency(getRandomString(10));
            entity.setRepay_Freq(getRandomString(10));
            entity.setInsurance_Percentage(random.nextInt(100));
            entity.setCollateralValue(random.nextInt(100));
            entity.setLTV(random.nextInt(100));
            entity.setLoan_Start_Dt(new Date());
            entity.setLoan_Agreement_Dt(new Date());
            entity.setInstallment_Amt(random.nextInt(100));
            entity.setMaturity_Dt(new Date());
            entity.setFirst_Installment_Amount(random.nextInt(1000));
            entity.setAdvance_EMI_Terms(random.nextInt());
            entity.setAdvance_EMI_Amt(random.nextDouble());
            entity.setMode_Of_Payment(getRandomString(10));
            entity.setPenal_Rate(random.nextFloat());
            entity.setPrepayment_Terms(random.nextInt(100));
            entity.setFull_Prepayment_Terms(random.nextInt());
            entity.setReschedule_Terms(random.nextInt(10));
            entity.setLoss_Account(getRandomString(15));
            entity.setFraud_Account(getRandomString(15));
            entity.setInsurance_Sumassured(random.nextDouble());
            entity.setInsurance_Premium(random.nextInt(1000));
            entity.setInsurance_Penetration(random.nextDouble());
            entity.setLTV_Excl_Insurance(random.nextDouble());
            entity.setLoan_Sanction_Excl_Insurance(random.nextDouble());
            entity.setLoan_Foreclosed(getRandomString(30));
            entity.setGrace_Period_End_Dt(new Date());
            entity.setGrace_Period_Terms(random.nextDouble());
            entity.setAllow_Grace_Period(getRandomString(15));
            entity.setAllow_Grace_Interest_Review(getRandomString(10));
            entity.setDedup_Found(getRandomString(15));
            entity.setSkip_Dedup(getRandomString(10));
            entity.setBlacklisted_Customer(getRandomString(10));
            entity.setLoan_Status(getRandomString(20));
            entity.setClosing_Status(getRandomString(20));
            entity.setLoan_Closure_Date(getRandomString(11));
            entity.setJoint_Account(getRandomString(15));
            entity.setStep_Loan(getRandomString(50));
            entity.setTDS_Applicable(getRandomString(20));
            entity.setAllow_BPI(getRandomString(20));
            entity.setAllow_EMI_Holiday(getRandomString(20));
            entity.setAllow_Multi_Disb(getRandomString(20));
            entity.setNo_Of_Steps(random.nextInt());
            entity.setMandate_Referrence_ID(random.nextDouble());
            entity.setBPI_Logic(getRandomString(20));
            entity.setAdvance_EMI(getRandomString(15));
            entity.setInterest_Cal_Basis(getRandomString(15));
            entity.setBPI_Amount(random.nextDouble());
            entity.setBPI_Cal_Basis(getRandomString(25));
            entity.setClosed_Dt(new Date());
            entity.setOutstanding_principal(random.nextDouble());
            entity.setOutstanding_principal_paid(random.nextInt(100));
            entity.setDue_amount(random.nextDouble());
            entity.setDue_amount_principal(random.nextDouble());
            entity.setDue_amount_interest(random.nextDouble());
            entity.setDue_amount_other_charges(random.nextDouble());
            entity.setDue_amount_overdue_penal(random.nextDouble());
            entity.setDue_amount_paid(random.nextDouble());
            entity.setDue_amount_interest_paid(random.nextDouble());
            entity.setDue_amount_overdue_penal_paid(random.nextDouble());
            entity.setDue_amount_other_charges_paid(random.nextDouble());
            entity.setExcess_amount(random.nextDouble());
            entity.setTotal_outstanding(random.nextDouble());
            entity.setCreatedBy(getRandomString(30));
            entity.setCreatedDt(new Date());
            entity.setUpdateBy(getRandomString(30));
            entity.setUpdateDt(new Date());




            entities.add(entity);
        }

        return entities;
    }

    private static String getRandomString(int targetStringLength) {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
//        int targetStringLength = 10;
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }
}
