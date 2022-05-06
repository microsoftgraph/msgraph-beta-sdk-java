package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to call the createDeviceLogCollectionRequest method.  */
public enum DeviceLogCollectionTemplateType implements ValuedEnum {
    Predefined("predefined");
    public final String value;
    DeviceLogCollectionTemplateType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceLogCollectionTemplateType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "predefined": return Predefined;
            default: return null;
        }
    }
}
