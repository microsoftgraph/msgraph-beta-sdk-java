package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** In macOS 12 and later, this command uses Erase All Content and Settings (EACS) on Mac computers with the Apple M1 chip or the Apple T2 Security Chip. On those devices, if EACS cant run, the device can use obliteration (macOS 11.x behavior). This key has no effect on machines prior to the T2 chip. Upon receiving this command, the device performs preflight checks to determine if the device is in a state that allows EACS. The ObliterationBehavior value defines the device's fallback behavior. */
public enum ObliterationBehavior implements ValuedEnum {
    /** Default. If Erase All Content and Settings (EACS) preflight fails, the device responds to the server with an Error status and then attempts to erase itself. If EACS preflight succeeds but EACS fails, then the device attempts to erase itself. */
    DefaultEscaped("default"),
    /** If Erase All Content and Settings (EACS) preflight fails, the device responds to the server with an Error status and doesnt attempt to erase itself. If EACS preflight succeeds but EACS fails, then the device doesnt attempt to erase itself. */
    DoNotObliterate("doNotObliterate"),
    /** If Erase All Content and Settings (EACS) preflight fails, the device responds with an Acknowledged status and then attempts to erase itself. If EACS preflight succeeds but EACS fails, then the device attempts to erase itself. */
    ObliterateWithWarning("obliterateWithWarning"),
    /** The system doesnt attempt Erase All Content and Settings (EACS). T2 and later devices always obliterate. */
    Always("always"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ObliterationBehavior(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ObliterationBehavior forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "default": return DefaultEscaped;
            case "doNotObliterate": return DoNotObliterate;
            case "obliterateWithWarning": return ObliterateWithWarning;
            case "always": return Always;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
