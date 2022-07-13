package microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the admin singleton. */
public enum AzureADDeviceRegistrationErrorReason implements ValuedEnum {
    InvalidGlobalDeviceId("invalidGlobalDeviceId"),
    InvalidAzureADDeviceId("invalidAzureADDeviceId"),
    MissingTrustType("missingTrustType"),
    InvalidAzureADJoin("invalidAzureADJoin"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AzureADDeviceRegistrationErrorReason(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AzureADDeviceRegistrationErrorReason forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "invalidGlobalDeviceId": return InvalidGlobalDeviceId;
            case "invalidAzureADDeviceId": return InvalidAzureADDeviceId;
            case "missingTrustType": return MissingTrustType;
            case "invalidAzureADJoin": return InvalidAzureADJoin;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
