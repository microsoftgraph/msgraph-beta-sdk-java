package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Lifecycle status of a spending policy.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SpendingPolicyStatus implements ValuedEnum {
    /** The policy is active and enforced. */
    Enabled("enabled"),
    /** The policy is not enforced. This is the initial state of a newly created policy. A policyis also disabled when every group assigned to it has been deleted, or when the servicedisables it in response to a change in the tenant&apos;s subscription. */
    Disabled("disabled"),
    /** The policy is being created or transitioned; group links and validation are in progress. */
    Provisioning("provisioning"),
    /** The most recent provisioning attempt failed; the policy is not enforced. */
    ProvisioningFailed("provisioningFailed"),
    /** A marker value for members added after the release of this API. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SpendingPolicyStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SpendingPolicyStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "enabled": return Enabled;
            case "disabled": return Disabled;
            case "provisioning": return Provisioning;
            case "provisioningFailed": return ProvisioningFailed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
