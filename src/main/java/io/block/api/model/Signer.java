package io.block.api.model;

import com.google.gson.annotations.SerializedName;

public class Signer {
    @SerializedName("signer_address")
    public String signerAddress;

    @SerializedName("signer_public_key")
    public String signerPubKey;

    @SerializedName("signed_data")
    public String signedData;

    @Override
    public String toString() {
        return "Signer{" + "signerAddress=" + signerAddress + ", signerPubKey=" + signerPubKey + ", signedData=" + signedData + '}';
    }

    
}
