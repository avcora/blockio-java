package io.block.api.model;

import com.google.gson.annotations.SerializedName;

public class Withdrawal {
    public String network;
    public String txid;

    @SerializedName("amount_withdrawn")
    public String amountWithdrawn;

    @SerializedName("amount_sent")
    public String amountSent;

    @SerializedName("network_fee")
    public String networkFee;

    @SerializedName("blockio_fee")
    public String blockIOFee;

    @Override
    public String toString() {
        return "Withdrawal{" + "network=" + network + ", txid=" + txid + ", amountWithdrawn=" + amountWithdrawn + ", amountSent=" + amountSent + ", networkFee=" + networkFee + ", blockIOFee=" + blockIOFee + '}';
    }   
    
}
