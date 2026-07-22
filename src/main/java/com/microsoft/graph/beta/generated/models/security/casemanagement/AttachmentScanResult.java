package com.microsoft.graph.beta.models.security.casemanagement;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AttachmentScanResult implements ValuedEnum {
    Unscanned("unscanned"),
    NoThreatsFound("noThreatsFound"),
    Malicious("malicious"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AttachmentScanResult(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AttachmentScanResult forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unscanned": return Unscanned;
            case "noThreatsFound": return NoThreatsFound;
            case "malicious": return Malicious;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
