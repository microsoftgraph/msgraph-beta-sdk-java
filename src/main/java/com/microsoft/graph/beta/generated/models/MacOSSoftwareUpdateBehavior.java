package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Update behavior options for macOS software updates.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MacOSSoftwareUpdateBehavior implements ValuedEnum {
    /** Not configured. */
    NotConfigured("notConfigured"),
    /** Download and/or install the software update, depending on the current device state. */
    Default("default"),
    /** Download the software update without installing it. */
    DownloadOnly("downloadOnly"),
    /** Install an already downloaded software update. */
    InstallASAP("installASAP"),
    /** Download the software update and notify the user via the App Store. */
    NotifyOnly("notifyOnly"),
    /** Download the software update and install it at a later time. */
    InstallLater("installLater");
    public final String value;
    MacOSSoftwareUpdateBehavior(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MacOSSoftwareUpdateBehavior forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "default": return Default;
            case "downloadOnly": return DownloadOnly;
            case "installASAP": return InstallASAP;
            case "notifyOnly": return NotifyOnly;
            case "installLater": return InstallLater;
            default: return null;
        }
    }
}
