package io.block.api.model;

import java.math.BigDecimal;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RawTransaction {

    @SerializedName("network")
    @Expose
    public String network;
    @SerializedName("txid")
    @Expose
    public String txid;
    @SerializedName("blockhash")
    @Expose
    public String blockhash;
    @SerializedName("confirmations")
    @Expose
    public Integer confirmations;
    @SerializedName("time")
    @Expose
    public Integer time;
    @SerializedName("inputs")
    @Expose
    public List<TransactionInput> inputs = null;
    @SerializedName("outputs")
    @Expose
    public List<TransactionOutput> outputs = null;
    @SerializedName("tx_hex")
    @Expose
    public String txHex;
    @SerializedName("size")
    @Expose
    public Integer size;
    @SerializedName("vsize")
    @Expose
    public Integer vsize;
    @SerializedName("version")
    @Expose
    public Integer version;
    @SerializedName("locktime")
    @Expose
    public Integer locktime;


    public BigDecimal getFee()
    {
        if (inputs == null || inputs.size() == 0)
            return BigDecimal.ZERO;

        BigDecimal in = BigDecimal.ZERO;
        for (TransactionInput i : inputs)
            in = in.add(i.value);

        BigDecimal out = BigDecimal.ZERO;
        if (outputs != null)
            for (TransactionOutput o : outputs)
                out = out.add(o.value);

        if (out.compareTo(in) > 0)
            throw new IllegalStateException("output is greater than input");

        return in.subtract(out);
    }

}