package io.block.api.model;


import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

public class NetworkFeeEstimate {
    public String network;
    
    @SerializedName("estimated_network_fee")
    public BigDecimal estimatedNetworkFee;
    
    @SerializedName("estimated_tx_size")
    public int estimatedTxSize;

    @SerializedName("estimated_min_custom_network_fee")
    public BigDecimal estimatedMinCustomNetworkFee;

    @SerializedName("estimated_max_custom_network_fee")
    public BigDecimal estimatedMaxCustomNetworkFee;
}
