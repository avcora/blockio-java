package io.block.api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.util.List;

public class TransactionInput
{
    @SerializedName("input_no")
    @Expose
    public Integer inputNo;
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
    @SerializedName("witness")
    @Expose
    public List<String> witness = null;
    @SerializedName("from_output")
    @Expose
    public FromOutput fromOutput;
}
