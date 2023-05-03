package com.racloop.mongo.perusal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.Nullable;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "accounting")

public class AccountingEntity {

    @Id
    @NotNull
    private Number accounting_id;
//    @DBRef
    @NotNull
    private String loan_account_no;
    @NotNull
    private Number linked_transaction_id;
    @NotNull
    private String accounting_event;
    @NotNull
    private Date accounting_Date;
    @NotNull
    private Date value_Date;
    @NotNull
    private String transaction_type;
    @NotNull
    private String transaction_desc;
    @NotNull
    private String ledger_code;
    @NotNull
    private String user_branch;
    @NotNull
    private String accounting_branch;
    @NotNull
    private String accounting_code;
    @NotNull
    private Number amount;
    @Nullable
    private Number old_link_transaction_id;
    @NotNull
    private String CreatedBy;
    @NotNull
    private Date CreatedDt;
    @Nullable
    private String UpdateBy;
    @Nullable
    private Date UpDateDt;


}
