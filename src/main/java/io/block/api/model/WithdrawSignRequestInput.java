package io.block.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WithdrawSignRequestInput
{
    @SerializedName("input_no")
    public int inputNo;

    @SerializedName("signatures_needed")
    public int sigsNeeded;

    @SerializedName("data_to_sign")
    public String dataToSign;

    public List<Signer> signers;

    @Override
    public String toString() {
        return "WithdrawSignRequestInput{" + "inputNo=" + inputNo + ", sigsNeeded=" + sigsNeeded + ", dataToSign=" + dataToSign + ", signers=" + signers + '}';
    }
    
    
}
