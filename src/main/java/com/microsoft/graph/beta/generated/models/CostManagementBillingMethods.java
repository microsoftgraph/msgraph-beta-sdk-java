package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * How Copilot consumption is billed when more than one method may apply. This is a flags enum,so combined values such as prepaidCredits,payAsYouGo are valid.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CostManagementBillingMethods implements ValuedEnum {
    /** No billing method is known or was specified. */
    NotSpecified("notSpecified"),
    /** Prepaid Copilot Credits, purchased through the P3 pre-purchase plan. */
    PrepaidCredits("prepaidCredits"),
    /** Consumption billed on demand, with no prepaid pool. */
    PayAsYouGo("payAsYouGo"),
    /** A marker value for members added after the release of this API. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CostManagementBillingMethods(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CostManagementBillingMethods forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notSpecified": return NotSpecified;
            case "prepaidCredits": return PrepaidCredits;
            case "payAsYouGo": return PayAsYouGo;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
