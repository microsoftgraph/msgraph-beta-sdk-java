package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Android keyguard feature.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AndroidKeyguardFeature implements ValuedEnum {
    /** Not configured; this value is ignored. */
    NotConfigured("notConfigured"),
    /** Camera usage when on secure keyguard screens. */
    Camera("camera"),
    /** Showing notifications when on secure keyguard screens. */
    Notifications("notifications"),
    /** Showing unredacted notifications when on secure keyguard screens. */
    UnredactedNotifications("unredactedNotifications"),
    /** Trust agent state when on secure keyguard screens. */
    TrustAgents("trustAgents"),
    /** Fingerprint sensor usage when on secure keyguard screens. */
    Fingerprint("fingerprint"),
    /** Notification text entry when on secure keyguard screens. */
    RemoteInput("remoteInput"),
    /** All keyguard features when on secure keyguard screens. */
    AllFeatures("allFeatures"),
    /** Face authentication on secure keyguard screens. */
    Face("face"),
    /** Iris authentication on secure keyguard screens. */
    Iris("iris"),
    /** All biometric authentication on secure keyguard screens. */
    Biometrics("biometrics");
    public final String value;
    AndroidKeyguardFeature(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AndroidKeyguardFeature forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "camera": return Camera;
            case "notifications": return Notifications;
            case "unredactedNotifications": return UnredactedNotifications;
            case "trustAgents": return TrustAgents;
            case "fingerprint": return Fingerprint;
            case "remoteInput": return RemoteInput;
            case "allFeatures": return AllFeatures;
            case "face": return Face;
            case "iris": return Iris;
            case "biometrics": return Biometrics;
            default: return null;
        }
    }
}
