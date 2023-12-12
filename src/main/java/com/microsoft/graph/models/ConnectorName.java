package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Connectors name for connector status
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ConnectorName implements ValuedEnum {
    /** Indicates the expiration date/time for the Apple MDM Push Certificate. */
    ApplePushNotificationServiceExpirationDateTime("applePushNotificationServiceExpirationDateTime"),
    /** Indicates the expiration date/time for Vpp Token. */
    VppTokenExpirationDateTime("vppTokenExpirationDateTime"),
    /** Indicate the last sync data/time that the Vpp Token performed a sync. */
    VppTokenLastSyncDateTime("vppTokenLastSyncDateTime"),
    /** Indicate the last sync date/time that the Windows Autopilot performed a sync. */
    WindowsAutopilotLastSyncDateTime("windowsAutopilotLastSyncDateTime"),
    /** Indicates the last sync date/time that the Windows Store for Business performed a sync. */
    WindowsStoreForBusinessLastSyncDateTime("windowsStoreForBusinessLastSyncDateTime"),
    /** Indicates the last sync date/time that the JAMF connector performed a sync. */
    JamfLastSyncDateTime("jamfLastSyncDateTime"),
    /** Indicates the last sync date/time that the NDES connector performed a sync. */
    NdesConnectorLastConnectionDateTime("ndesConnectorLastConnectionDateTime"),
    /** Indicates the expiration date/time for the Apple Enrollment Program token. */
    AppleDepExpirationDateTime("appleDepExpirationDateTime"),
    /** Indicates the last sync date/time that the Apple Enrollment Program token performed a sync. */
    AppleDepLastSyncDateTime("appleDepLastSyncDateTime"),
    /** Indicates the last sync date/time that the Exchange ActiveSync connector performed a sync. */
    OnPremConnectorLastSyncDateTime("onPremConnectorLastSyncDateTime"),
    /** Indicates the last sync date/time that the Google Play App performed a sync. */
    GooglePlayAppLastSyncDateTime("googlePlayAppLastSyncDateTime"),
    /** Indicates the last modified date / time that the Google Play connector was updated. */
    GooglePlayConnectorLastModifiedDateTime("googlePlayConnectorLastModifiedDateTime"),
    /** Indicates the last heartbeat date/time that the Windows Defender ATP connector was contacted. */
    WindowsDefenderATPConnectorLastHeartbeatDateTime("windowsDefenderATPConnectorLastHeartbeatDateTime"),
    /** Indicates the last heartbeat date/time that the Mobile Threat Defence connector was contacted. */
    MobileThreatDefenceConnectorLastHeartbeatDateTime("mobileThreatDefenceConnectorLastHeartbeatDateTime"),
    /** Indicates the last sync date/time that the Chrombook Last Directory performed a sync. */
    ChromebookLastDirectorySyncDateTime("chromebookLastDirectorySyncDateTime"),
    /** Future use */
    FutureValue("futureValue");
    public final String value;
    ConnectorName(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ConnectorName forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "applePushNotificationServiceExpirationDateTime": return ApplePushNotificationServiceExpirationDateTime;
            case "vppTokenExpirationDateTime": return VppTokenExpirationDateTime;
            case "vppTokenLastSyncDateTime": return VppTokenLastSyncDateTime;
            case "windowsAutopilotLastSyncDateTime": return WindowsAutopilotLastSyncDateTime;
            case "windowsStoreForBusinessLastSyncDateTime": return WindowsStoreForBusinessLastSyncDateTime;
            case "jamfLastSyncDateTime": return JamfLastSyncDateTime;
            case "ndesConnectorLastConnectionDateTime": return NdesConnectorLastConnectionDateTime;
            case "appleDepExpirationDateTime": return AppleDepExpirationDateTime;
            case "appleDepLastSyncDateTime": return AppleDepLastSyncDateTime;
            case "onPremConnectorLastSyncDateTime": return OnPremConnectorLastSyncDateTime;
            case "googlePlayAppLastSyncDateTime": return GooglePlayAppLastSyncDateTime;
            case "googlePlayConnectorLastModifiedDateTime": return GooglePlayConnectorLastModifiedDateTime;
            case "windowsDefenderATPConnectorLastHeartbeatDateTime": return WindowsDefenderATPConnectorLastHeartbeatDateTime;
            case "mobileThreatDefenceConnectorLastHeartbeatDateTime": return MobileThreatDefenceConnectorLastHeartbeatDateTime;
            case "chromebookLastDirectorySyncDateTime": return ChromebookLastDirectorySyncDateTime;
            case "futureValue": return FutureValue;
            default: return null;
        }
    }
}
