package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceAppManagement singleton.  */
public enum AndroidManagedAppSafetyNetDeviceAttestationType implements ValuedEnum {
    None("none"),
    BasicIntegrity("basicIntegrity"),
    BasicIntegrityAndDeviceCertification("basicIntegrityAndDeviceCertification");
    public final String value;
    AndroidManagedAppSafetyNetDeviceAttestationType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AndroidManagedAppSafetyNetDeviceAttestationType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "basicIntegrity": return BasicIntegrity;
            case "basicIntegrityAndDeviceCertification": return BasicIntegrityAndDeviceCertification;
            default: return null;
        }
    }
}
