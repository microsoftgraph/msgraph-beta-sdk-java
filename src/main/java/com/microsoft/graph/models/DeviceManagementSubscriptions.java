package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum DeviceManagementSubscriptions implements ValuedEnum {
    None("none"),
    Intune("intune"),
    Office365("office365"),
    IntunePremium("intunePremium"),
    Intune_EDU("intune_EDU"),
    Intune_SMB("intune_SMB");
    public final String value;
    DeviceManagementSubscriptions(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManagementSubscriptions forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "intune": return Intune;
            case "office365": return Office365;
            case "intunePremium": return IntunePremium;
            case "intune_EDU": return Intune_EDU;
            case "intune_SMB": return Intune_SMB;
            default: return null;
        }
    }
}
