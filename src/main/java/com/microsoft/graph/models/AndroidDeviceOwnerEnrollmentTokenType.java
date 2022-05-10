package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
public enum AndroidDeviceOwnerEnrollmentTokenType implements ValuedEnum {
    /** Default token type. */
    Default_escaped("default_escaped"),
    /** Token type for Azure AD shared dedicated device enrollment. It applies to CorporateOwnedDedicatedDevice enrollment mode only. */
    CorporateOwnedDedicatedDeviceWithAzureADSharedMode("corporateOwnedDedicatedDeviceWithAzureADSharedMode");
    public final String value;
    AndroidDeviceOwnerEnrollmentTokenType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AndroidDeviceOwnerEnrollmentTokenType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "default": return Default_escaped;
            case "corporateOwnedDedicatedDeviceWithAzureADSharedMode": return CorporateOwnedDedicatedDeviceWithAzureADSharedMode;
            default: return null;
        }
    }
}
