package io.block.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GreenAddresses {
    @SerializedName("green_addresses")
    public List<GreenAddress> greenAddresses;
}
