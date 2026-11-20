package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The funding classification of reported consumption, including unbilled consumption.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CostManagementFundingClass implements ValuedEnum {
    /** Drawn from a prepaid Copilot Credits pool. */
    Prepaid("prepaid"),
    /** Billed on demand, with no prepaid pool. */
    PayAsYouGo("payAsYouGo"),
    /** Consumed above the purchased pool. Unbilled, not an invoiced excess charge. */
    Overage("overage"),
    /** Consumed but not billed. */
    NonBillable("nonBillable"),
    /** A marker value for members added after the release of this API. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CostManagementFundingClass(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CostManagementFundingClass forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "prepaid": return Prepaid;
            case "payAsYouGo": return PayAsYouGo;
            case "overage": return Overage;
            case "nonBillable": return NonBillable;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
