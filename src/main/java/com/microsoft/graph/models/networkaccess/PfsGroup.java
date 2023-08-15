package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum PfsGroup implements ValuedEnum {
    None("none"),
    Pfs1("pfs1"),
    Pfs2("pfs2"),
    Pfs14("pfs14"),
    Pfs24("pfs24"),
    Pfs2048("pfs2048"),
    Pfsmm("pfsmm"),
    Ecp256("ecp256"),
    Ecp384("ecp384"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PfsGroup(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PfsGroup forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "pfs1": return Pfs1;
            case "pfs2": return Pfs2;
            case "pfs14": return Pfs14;
            case "pfs24": return Pfs24;
            case "pfs2048": return Pfs2048;
            case "pfsmm": return Pfsmm;
            case "ecp256": return Ecp256;
            case "ecp384": return Ecp384;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
