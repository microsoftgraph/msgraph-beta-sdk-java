package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcPolicyTimezone implements ValuedEnum {
    Gmt("gmt"),
    Bit("bit"),
    Nut("nut"),
    Hst("hst"),
    Mit("mit"),
    Akst("akst"),
    Pst("pst"),
    Mst("mst"),
    East("east"),
    Est("est"),
    Ast("ast"),
    Nst("nst"),
    Art("art"),
    Gst("gst"),
    Azot("azot"),
    Cet("cet"),
    Cat("cat"),
    Eat("eat"),
    Get("get"),
    Pkt("pkt"),
    Ist("ist"),
    Bst("bst"),
    Tha("tha"),
    Cst("cst"),
    Jst("jst"),
    Acst("acst"),
    Pgt("pgt"),
    Sbt("sbt"),
    Fjt("fjt"),
    Tot("tot"),
    Lint("lint"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcPolicyTimezone(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcPolicyTimezone forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "gmt": return Gmt;
            case "bit": return Bit;
            case "nut": return Nut;
            case "hst": return Hst;
            case "mit": return Mit;
            case "akst": return Akst;
            case "pst": return Pst;
            case "mst": return Mst;
            case "east": return East;
            case "est": return Est;
            case "ast": return Ast;
            case "nst": return Nst;
            case "art": return Art;
            case "gst": return Gst;
            case "azot": return Azot;
            case "cet": return Cet;
            case "cat": return Cat;
            case "eat": return Eat;
            case "get": return Get;
            case "pkt": return Pkt;
            case "ist": return Ist;
            case "bst": return Bst;
            case "tha": return Tha;
            case "cst": return Cst;
            case "jst": return Jst;
            case "acst": return Acst;
            case "pgt": return Pgt;
            case "sbt": return Sbt;
            case "fjt": return Fjt;
            case "tot": return Tot;
            case "lint": return Lint;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
