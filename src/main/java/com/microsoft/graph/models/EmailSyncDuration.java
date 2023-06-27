package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for email sync duration.
 */
public enum EmailSyncDuration implements ValuedEnum {
    /** User Defined, default value, no intent. */
    UserDefined("userDefined"),
    /** Sync one day of email. */
    OneDay("oneDay"),
    /** Sync three days of email. */
    ThreeDays("threeDays"),
    /** Sync one week of email. */
    OneWeek("oneWeek"),
    /** Sync two weeks of email. */
    TwoWeeks("twoWeeks"),
    /** Sync one month of email. */
    OneMonth("oneMonth"),
    /** Sync an unlimited duration of email. */
    Unlimited("unlimited");
    public final String value;
    EmailSyncDuration(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EmailSyncDuration forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userDefined": return UserDefined;
            case "oneDay": return OneDay;
            case "threeDays": return ThreeDays;
            case "oneWeek": return OneWeek;
            case "twoWeeks": return TwoWeeks;
            case "oneMonth": return OneMonth;
            case "unlimited": return Unlimited;
            default: return null;
        }
    }
}
