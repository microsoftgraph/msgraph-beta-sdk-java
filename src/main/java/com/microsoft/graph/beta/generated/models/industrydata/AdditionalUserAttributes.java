package com.microsoft.graph.beta.models.industrydata;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AdditionalUserAttributes implements ValuedEnum {
    UserGradeLevel("userGradeLevel"),
    UserNumber("userNumber"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AdditionalUserAttributes(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AdditionalUserAttributes forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userGradeLevel": return UserGradeLevel;
            case "userNumber": return UserNumber;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
