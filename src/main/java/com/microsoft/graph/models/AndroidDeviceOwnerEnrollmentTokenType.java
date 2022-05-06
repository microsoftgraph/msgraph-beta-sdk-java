package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum AndroidDeviceOwnerEnrollmentTokenType implements ValuedEnum {
    Default_escaped("default_escaped"),
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
            case "default_escaped": return Default_escaped;
            case "corporateOwnedDedicatedDeviceWithAzureADSharedMode": return CorporateOwnedDedicatedDeviceWithAzureADSharedMode;
            default: return null;
        }
    }
}
