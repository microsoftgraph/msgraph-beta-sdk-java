package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcPartnerAgentName implements ValuedEnum {
    Citrix("citrix"),
    UnknownFutureValue("unknownFutureValue"),
    VMware("vMware");
    public final String value;
    CloudPcPartnerAgentName(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcPartnerAgentName forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "citrix": return Citrix;
            case "unknownFutureValue": return UnknownFutureValue;
            case "vMware": return VMware;
            default: return null;
        }
    }
}
