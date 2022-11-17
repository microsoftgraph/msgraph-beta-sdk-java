package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum AndroidDeviceOwnerEnrollmentMode implements ValuedEnum {
    CorporateOwnedDedicatedDevice("corporateOwnedDedicatedDevice"),
    CorporateOwnedFullyManaged("corporateOwnedFullyManaged"),
    CorporateOwnedWorkProfile("corporateOwnedWorkProfile"),
    /** Corporate owned, userless Android Open Source Project (AOSP) device, without Google Mobile Services. */
    CorporateOwnedAOSPUserlessDevice("corporateOwnedAOSPUserlessDevice"),
    /** Corporate owned, user-associated Android Open Source Project (AOSP) device, without Google Mobile Services. */
    CorporateOwnedAOSPUserAssociatedDevice("corporateOwnedAOSPUserAssociatedDevice");
    public final String value;
    AndroidDeviceOwnerEnrollmentMode(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AndroidDeviceOwnerEnrollmentMode forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "corporateOwnedDedicatedDevice": return CorporateOwnedDedicatedDevice;
            case "corporateOwnedFullyManaged": return CorporateOwnedFullyManaged;
            case "corporateOwnedWorkProfile": return CorporateOwnedWorkProfile;
            case "corporateOwnedAOSPUserlessDevice": return CorporateOwnedAOSPUserlessDevice;
            case "corporateOwnedAOSPUserAssociatedDevice": return CorporateOwnedAOSPUserAssociatedDevice;
            default: return null;
        }
    }
}
