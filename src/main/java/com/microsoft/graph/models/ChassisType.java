package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum ChassisType implements ValuedEnum {
    Unknown("unknown"),
    Desktop("desktop"),
    Laptop("laptop"),
    WorksWorkstation("worksWorkstation"),
    EnterpriseServer("enterpriseServer"),
    Phone("phone"),
    Tablet("tablet"),
    MobileOther("mobileOther"),
    MobileUnknown("mobileUnknown");
    public final String value;
    ChassisType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ChassisType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "desktop": return Desktop;
            case "laptop": return Laptop;
            case "worksWorkstation": return WorksWorkstation;
            case "enterpriseServer": return EnterpriseServer;
            case "phone": return Phone;
            case "tablet": return Tablet;
            case "mobileOther": return MobileOther;
            case "mobileUnknown": return MobileUnknown;
            default: return null;
        }
    }
}
