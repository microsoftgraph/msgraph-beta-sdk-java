package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Android Device Owner Kiosk Mode folder icon type.
 */
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
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AndroidDeviceOwnerKioskModeFolderIcon forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
