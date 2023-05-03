package com.racloop.mongo.perusal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;
import org.springframework.lang.Nullable;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "loan")

public class LoanEntity {

    @Id
    private String loan_account_no;
    @NotNull
//    @DBRef
    private String branch_id;
    @NotNull
//    @Field("lead_id")
    private String Lead_id;
    @NotNull
//    @Field("cust_ID")
    private String Cust_ID;
//    @DBRef
    @NotNull
    private String Prod_Id;
//    @Conditional()
    private String Loan_Purpose_Code;
    @Nullable
    private String End_Use_Of_Loan_Remarks;
    @NotNull
    private Number Loan_Requested_Amount;
    @NotNull
    private Date Loan_Application_Dt;
    @NotNull
    private Date Sanction_Dt;
    @NotNull
    private Number Sanction_Period;
    @NotNull
    private Number Sanction_Amount;
    @NotNull
    private Number Sanction_Rate_Of_Interest;
    @NotNull
    private String Rate_Of_Interest_Type;
    @NotNull
    private Number Rate_Of_Interest;
    @NotNull
    private Number Margin_Rate_Of_Interest;
    @NotNull
    private Number Base_Rate_Of_Interest;
    @NotNull
    private String Interest_Frequency;
    @NotNull
    private String Repay_Freq;
    @NotNull
//    @Conditional()
    private Number Insurance_Percentage;
//    @Conditional()
    private Number CollateralValue;
//    @Conditional()
    private Number LTV;
    @NotNull
    private Date Loan_Start_Dt;
    @NotNull
    private Date Loan_Agreement_Dt;
    @NotNull
    private Number Installment_Amt;
    @NotNull
    private Date Maturity_Dt;
    @NotNull
    private Number First_Installment_Amount;
//    @Conditional()
    private Integer Advance_EMI_Terms;
//    @Conditional()
    private Number Advance_EMI_Amt;
    @NotNull
    private String Mode_Of_Payment;
    @NotNull
    private Number Penal_Rate;
//    @Conditional()
    private Integer Prepayment_Terms;
//    @Conditional()
    private Integer Full_Prepayment_Terms;
//    @Conditional()
    private Integer Reschedule_Terms;
    @NotNull
    private String Loss_Account;
    @NotNull
    private String Fraud_Account;
    @Nullable
    private Number Insurance_Sumassured;
    @NotNull
    private Number Insurance_Premium;
    @Nullable
    private Number Insurance_Penetration;
//    @Conditional()
    private Number LTV_Excl_Insurance;
//    @Conditional()
    private Number Loan_Sanction_Excl_Insurance;
    @NotNull
    private String Loan_Foreclosed;
    @NotNull
    private Date Grace_Period_End_Dt;
    @NotNull
    private Number Grace_Period_Terms;
    @NotNull
    private String Allow_Grace_Period;
    @NotNull
    private String Allow_Grace_Interest_Review;
    @NotNull
    private String Dedup_Found;
    @NotNull
    private String Skip_Dedup;
    @NotNull
    private String Blacklisted_Customer;
    @NotNull
    private String Loan_Status;
//    @Conditional()
    private String Closing_Status;
//    @Conditional()
    private String Loan_Closure_Date;
    @NotNull
    private String Joint_Account;
    @NotNull
    private String Step_Loan;
    @NotNull
    private String TDS_Applicable;
    @NotNull
    private String Allow_BPI;
    @NotNull
    private String Allow_EMI_Holiday;
    @NotNull
    private String Allow_Multi_Disb;
//    @Conditional()
    private Integer No_Of_Steps;
//    @Conditional()
    private Number Mandate_Referrence_ID;
//    @Conditional()
    private String BPI_Logic;
    @NotNull
    private String Advance_EMI;
    @NotNull
    private String Interest_Cal_Basis;
//    @Conditional()
    private Number BPI_Amount;
//    @Conditional()
    private String BPI_Cal_Basis;
//    @Conditional()
    private Date Closed_Dt;
    @Nullable
    private Number outstanding_principal;
    @Nullable
    private Number outstanding_principal_paid;
    @Nullable
    private Number due_amount;
    @Nullable
    private Number due_amount_principal;
    @Nullable
    private Number due_amount_interest;
    @Nullable
    private Number due_amount_other_charges;
    @Nullable
    private Number due_amount_overdue_penal;
    @Nullable
    private Number due_amount_paid;
    @Nullable
    private Number due_amount_principal_paid;
    @Nullable
    private Number due_amount_interest_paid;
    @Nullable
    private Number due_amount_overdue_penal_paid;
    @Nullable
    private Number due_amount_other_charges_paid;
    @Nullable
    private Number excess_amount;
    @Nullable
    private Number total_outstanding;
    @NotNull
    private String CreatedBy;
    @NotNull
    private Date CreatedDt;
//    @Conditional()
    private String UpdateBy;
//    @Conditional()
    private Date UpdateDt;
}
