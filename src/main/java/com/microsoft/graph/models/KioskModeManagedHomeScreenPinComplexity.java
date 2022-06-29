package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
public enum KioskModeManagedHomeScreenPinComplexity implements ValuedEnum {
    /** Not configured. */
    NotConfigured("notConfigured"),
    /** Numeric values only. */
    Simple("simple"),
    /** Alphanumerical value. */
    Complex("complex");
    public final String value;
    KioskModeManagedHomeScreenPinComplexity(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static KioskModeManagedHomeScreenPinComplexity forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "simple": return Simple;
            case "complex": return Complex;
            default: return null;
        }
    }
}
