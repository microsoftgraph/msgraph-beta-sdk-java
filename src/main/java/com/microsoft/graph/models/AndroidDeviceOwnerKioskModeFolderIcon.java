package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum AndroidDeviceOwnerKioskModeFolderIcon implements ValuedEnum {
    /** Not configured; this value is ignored. */
    NotConfigured("notConfigured"),
    /** Folder icon appears as dark square. */
    DarkSquare("darkSquare"),
    /** Folder icon appears as dark circle. */
    DarkCircle("darkCircle"),
    /** Folder icon appears as light square. */
    LightSquare("lightSquare"),
    /** Folder icon appears as light circle  . */
    LightCircle("lightCircle");
    public final String value;
    AndroidDeviceOwnerKioskModeFolderIcon(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AndroidDeviceOwnerKioskModeFolderIcon forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "darkSquare": return DarkSquare;
            case "darkCircle": return DarkCircle;
            case "lightSquare": return LightSquare;
            case "lightCircle": return LightCircle;
            default: return null;
        }
    }
}
