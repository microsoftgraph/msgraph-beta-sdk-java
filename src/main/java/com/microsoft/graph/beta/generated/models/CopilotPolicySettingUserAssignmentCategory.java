package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The category that determines which users are assigned by a Copilot policy setting.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CopilotPolicySettingUserAssignmentCategory implements ValuedEnum {
    /** All users are assigned. */
    Everyone("everyone"),
    /** No users are assigned. */
    NoOne("noOne"),
    /** Only explicitly selected users are assigned. */
    SpecificUsers("specificUsers"),
    /** A marker value for members added after the release of this API. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CopilotPolicySettingUserAssignmentCategory(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CopilotPolicySettingUserAssignmentCategory forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "everyone": return Everyone;
            case "noOne": return NoOne;
            case "specificUsers": return SpecificUsers;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
