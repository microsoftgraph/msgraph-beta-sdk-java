package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The reason or trigger that caused a credit request to be created.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CreditRequestType implements ValuedEnum {
    /** The request type is not known. */
    Unknown("unknown"),
    /** The requester has no credits and is requesting their first allocation. */
    FirstTimeAccess("firstTimeAccess"),
    /** The requester has already used credits and needs more because they have run out or are about to. */
    AdditionalCredits("additionalCredits"),
    /** A marker value for members added after the release of this API. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CreditRequestType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CreditRequestType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "firstTimeAccess": return FirstTimeAccess;
            case "additionalCredits": return AdditionalCredits;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
