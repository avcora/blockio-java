package io.block.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WithdrawSignRequest {
    @SerializedName("reference_id")
    public String referenceID;

    @SerializedName("more_signatures_needed")
    public boolean moreSigsNeeded;

    public List<WithdrawSignRequestInput> inputs;

    @SerializedName("encrypted_passphrase")
    public EncryptedPassphrase encryptedPassphrase;

    @Override
    public String toString() {
        return "WithdrawSignRequest{" + "referenceID=" + referenceID + ", moreSigsNeeded=" + moreSigsNeeded + ", inputs=" + inputs + ", encryptedPassphrase=" + encryptedPassphrase + '}';
    }
    
    
}
