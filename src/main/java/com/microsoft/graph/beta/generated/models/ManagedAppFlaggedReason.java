package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The reason for which a user has been flagged
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ManagedAppFlaggedReason implements ValuedEnum {
    /** No issue. */
    None("none"),
    /** The app registration is running on a rooted/unlocked device. */
    RootedDevice("rootedDevice"),
    /** The app registration is running on an Android device on which the bootloader is unlocked. */
    AndroidBootloaderUnlocked("androidBootloaderUnlocked"),
    /** The app registration is running on an Android device on which the factory ROM has been modified. */
    AndroidFactoryRomModified("androidFactoryRomModified");
    public final String value;
    ManagedAppFlaggedReason(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ManagedAppFlaggedReason forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "rootedDevice": return RootedDevice;
            case "androidBootloaderUnlocked": return AndroidBootloaderUnlocked;
            case "androidFactoryRomModified": return AndroidFactoryRomModified;
            default: return null;
        }
    }
}
