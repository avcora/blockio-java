package io.block.api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FromOutput {

    @SerializedName("txid")
    @Expose
    public String txid;
    @SerializedName("output_no")
    @Expose
    public Integer outputNo;

}
