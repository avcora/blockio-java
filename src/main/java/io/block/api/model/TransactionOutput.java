package io.block.api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class TransactionOutput
{

    @SerializedName("output_no")
    @Expose
    public Integer outputNo;
    @SerializedName("value")
    @Expose
    public BigDecimal value;
    @SerializedName("address")
    @Expose
    public String address;
    @SerializedName("type")
    @Expose
    public String type;
    @SerializedName("script")
    @Expose
    public String script;

}