package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AppInfoDataRetentionPolicy implements ValuedEnum {
    DataRetained("dataRetained"),
    DeletedImmediately("deletedImmediately"),
    DeletedWithinTwoWeeks("deletedWithinTwoWeeks"),
    DeletedWithinOneMonth("deletedWithinOneMonth"),
    DeletedWithinThreeMonths("deletedWithinThreeMonths"),
    DeletedWithinMoreThanThreeMonths("deletedWithinMoreThanThreeMonths"),
    Unknown("unknown"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AppInfoDataRetentionPolicy(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AppInfoDataRetentionPolicy forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "dataRetained": return DataRetained;
            case "deletedImmediately": return DeletedImmediately;
            case "deletedWithinTwoWeeks": return DeletedWithinTwoWeeks;
            case "deletedWithinOneMonth": return DeletedWithinOneMonth;
            case "deletedWithinThreeMonths": return DeletedWithinThreeMonths;
            case "deletedWithinMoreThanThreeMonths": return DeletedWithinMoreThanThreeMonths;
            case "unknown": return Unknown;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
