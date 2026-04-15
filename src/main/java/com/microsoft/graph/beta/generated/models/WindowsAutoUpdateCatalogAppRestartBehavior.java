package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates how the device handles restarts after the app installer finishes executing. This setting, configured on the app&apos;s installExperience, determines whether the Intune management extension initiates, suppresses, or forces a restart based on the installer&apos;s exit code.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsAutoUpdateCatalogAppRestartBehavior implements ValuedEnum {
    /** Indicates that the Intune management extension restarts the device only if the app installer returns an exit code that signals a reboot is required (e.g., exit code 3010). */
    BasedOnReturnCode("basedOnReturnCode"),
    /** Indicates that the Intune management extension does not take any specific action to control restarts. If the app installer initiates a restart (e.g., an MSI with ForceReboot action), it is allowed to proceed. */
    Allow("allow"),
    /** Indicates that the Intune management extension attempts to suppress restarts initiated by the installer. For MSI-based installations, this passes the REBOOT=ReallySuppress property to msiexec. Not all installers honor suppression. */
    Suppress("suppress"),
    /** Indicates that the Intune management extension forces an immediate device restart after the app installation completes, regardless of the installer&apos;s exit code. */
    Force("force"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WindowsAutoUpdateCatalogAppRestartBehavior(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsAutoUpdateCatalogAppRestartBehavior forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "basedOnReturnCode": return BasedOnReturnCode;
            case "allow": return Allow;
            case "suppress": return Suppress;
            case "force": return Force;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
