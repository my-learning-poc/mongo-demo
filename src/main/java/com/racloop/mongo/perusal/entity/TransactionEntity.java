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
@Document(collection = "transaction")

public class TransactionEntity {

    @Id
    @NotNull
    private	String	transaction_id	;
    @NotNull
    private	String	loan_account_no	;
    @NotNull
    private	String	transaction_type	;
    @NotNull
    private	String	transaction_desc	;
    @NotNull
    private	String	transaction_ref_id	;
    @NotNull
    private	Date	transaction_Date	;
    @NotNull
    private	Date	transaction_value_Date	;
    @NotNull
    private	Number	transaction_amount	;
    @NotNull
    private	Number	transaction_code	;
    @NotNull
    private	String	transaction_remarks	;
    @NotNull
    private	String	transaction_status	;
    @Nullable
    private	Number	outstanding_principal	;
    @NotNull
    private	Number	outstanding_principal_paid	;
    @NotNull
    private	Number	due_amount	;
    @Nullable
    private	Number	due_amount_principal	;
    @Nullable
    private	Number	due_amount_interest	;
    @Nullable
    private	Number	due_amount_other_charges	;
    @Nullable
    private	Number	due_amount_overdue_penal	;
    @Nullable
    private	Number	due_amount_paid	;
    @Nullable
    private	Number	due_amount_principal_paid	;
    @Nullable
    private	Number	due_amount_interest_paid	;
    @Nullable
    private	Number	due_amount_overdue_penal_paid	;
    @Nullable
    private	Number	due_amount_other_charges_paid	;
    @Nullable
    private	Number	excess_amount	;
    @Nullable
    private	Number	total_outstanding	;
    @Nullable
    private	Number	old_link_transaction_id	;
    @NotNull
    private	String	CreatedBy	;
    @NotNull
    private Date CreatedDt	;
    @Nullable
    private	String	UpDateBy	;
    @Nullable
    private	Date	UpDateDt	;

}
