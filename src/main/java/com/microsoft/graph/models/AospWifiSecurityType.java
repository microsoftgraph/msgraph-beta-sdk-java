package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum AospWifiSecurityType implements ValuedEnum {
    /** No security type. */
    None("none"),
    /** WPA-Pre-shared-key */
    Wpa("wpa"),
    /** WEP-Pre-shared-key */
    Wep("wep");
    public final String value;
    AospWifiSecurityType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AospWifiSecurityType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "wpa": return Wpa;
            case "wep": return Wep;
            default: return null;
        }
    }
}
