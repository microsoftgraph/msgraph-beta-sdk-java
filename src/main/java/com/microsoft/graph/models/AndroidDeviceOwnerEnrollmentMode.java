package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum AndroidDeviceOwnerEnrollmentMode implements ValuedEnum {
    CorporateOwnedDedicatedDevice("corporateOwnedDedicatedDevice"),
    CorporateOwnedFullyManaged("corporateOwnedFullyManaged"),
    CorporateOwnedWorkProfile("corporateOwnedWorkProfile"),
    CorporateOwnedAOSPUserlessDevice("corporateOwnedAOSPUserlessDevice"),
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
