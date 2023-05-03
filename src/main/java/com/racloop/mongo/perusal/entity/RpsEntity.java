package com.racloop.mongo.perusal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.Nullable;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "rps")

public class RpsEntity {

    @Id
//    @NotNull
    private Number rps_id;
    @NotNull
    private String loan_account_no;
    @NotNull
    private Number installment_Number;
    @NotNull
    private String schedule_events;
    @NotNull
    private Date schedule_Date;
    @NotNull
    private Number days_between_installments;
    @NotNull
    private Number opening_principal;
    @NotNull
    private double interest_rate;
    @NotNull
    private Number installment_amount;
    @NotNull
    private Number installment_amount_rounded;
    @NotNull
    private Number interest_amount_scheduled;
    @NotNull
    private Number interest_amount_rounded;
    @NotNull
    private Number interest_amount_calculated;
    @Nullable
    private Number interest_amount_received;
    @Nullable
    private Number interest_amount_waived;
    @NotNull
    private Number principal_amount_scheduled;
    @Nullable
    private Number principal_amount_received;
    @Nullable
    private Number principal_amount_writenoff;
    @Nullable
    private Date installment_received_Date;
    @Nullable
    private Number prepayment_amount;
    @Nullable
    private Date prepayment_Date;
    @NotNull
    private Number closing_principal;
    @Nullable
    private Number interest_amount_due_unpaid;
    @Nullable
    private Number principal_amount_due_unpaid;
    //    private	Number	closing_principal	;
    @Nullable
    private Number installment_amount_diff;
    @Nullable
    private Number interest_amount_diff;
    @Nullable
    private Number interest_amount_diff_cumm;
    @Nullable
    private Boolean due_generated;
    @NotNull
    private String CreatedBy;
    @NotNull
    private Date CreatedDt;
    @Nullable
    private String UpDateBy;
    @Nullable
    private Date UpDateDt;

}
