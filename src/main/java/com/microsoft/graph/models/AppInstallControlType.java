package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum AppInstallControlType implements ValuedEnum {
    /** Not configured */
    NotConfigured("notConfigured"),
    /** Turn off app recommendations */
    Anywhere("anywhere"),
    /** Allow apps from Store only */
    StoreOnly("storeOnly"),
    /** Show me app recommendations */
    Recommendations("recommendations"),
    /** Warn me before installing apps from outside the Store */
    PreferStore("preferStore");
    public final String value;
    AppInstallControlType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AppInstallControlType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "anywhere": return Anywhere;
            case "storeOnly": return StoreOnly;
            case "recommendations": return Recommendations;
            case "preferStore": return PreferStore;
            default: return null;
        }
    }
}
