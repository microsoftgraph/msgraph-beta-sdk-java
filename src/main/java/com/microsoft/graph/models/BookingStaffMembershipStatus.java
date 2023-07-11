package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum BookingStaffMembershipStatus implements ValuedEnum {
    Active("active"),
    PendingAcceptance("pendingAcceptance"),
    RejectedByStaff("rejectedByStaff"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    BookingStaffMembershipStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static BookingStaffMembershipStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "active": return Active;
            case "pendingAcceptance": return PendingAcceptance;
            case "rejectedByStaff": return RejectedByStaff;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
