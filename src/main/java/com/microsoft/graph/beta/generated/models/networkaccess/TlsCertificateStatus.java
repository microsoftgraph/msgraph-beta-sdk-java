package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TlsCertificateStatus implements ValuedEnum {
    CsrGenerated("csrGenerated"),
    Enrolling("enrolling"),
    Active("active"),
    UnknownFutureValue("unknownFutureValue"),
    Expiring("expiring"),
    Expired("expired");
    public final String value;
    TlsCertificateStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TlsCertificateStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "csrGenerated": return CsrGenerated;
            case "enrolling": return Enrolling;
            case "active": return Active;
            case "unknownFutureValue": return UnknownFutureValue;
            case "expiring": return Expiring;
            case "expired": return Expired;
            default: return null;
        }
    }
}
