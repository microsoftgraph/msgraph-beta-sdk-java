package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Windows privacy data category specifier for privacy data access. */
public enum WindowsPrivacyDataCategory implements ValuedEnum {
    /** No access level specified, no intents. Device may behave either as in UserInControl or ForceAllow. It may depend on the privacy data been accessed, Windows versions and other factors. */
    NotConfigured("notConfigured"),
    /** Let apps access users name, picture and other account information created in Microsoft account. Added in Windows 10, version 1607. */
    AccountInfo("accountInfo"),
    /** Allow apps to receive information, send notifications, and stay up-to-date, even when the user is not using them. Be aware that when disabling communication apps (Email, Voice, etc) from background access these apps may or may not function as they are with the background access. Added in Windows 10, version 1703. */
    AppsRunInBackground("appsRunInBackground"),
    /** Let apps access users calendar. Added in Windows 10, version 1607. */
    Calendar("calendar"),
    /** Let apps access users call history. Added in Windows 10, version 1607. */
    CallHistory("callHistory"),
    /** Let apps access the camera on users device. Added in Windows 10, version 1607. */
    Camera("camera"),
    /** Let apps access users contact information. Added in Windows 10, version 1607. */
    Contacts("contacts"),
    /** Let apps access diagnostic information about other running apps. Added in Windows 10, version 1703. */
    DiagnosticsInfo("diagnosticsInfo"),
    /** Let apps access and send email. Added in Windows 10, version 1607. */
    Email("email"),
    /** Let apps access the precise location data of device user. Added in Windows 10, version 1607. */
    Location("location"),
    /** Let apps read or send messages, text or MMS. Added in Windows 10, version 1607. */
    Messaging("messaging"),
    /** Let apps use microphone on the user device. Added in Windows 10, version 1607. */
    Microphone("microphone"),
    /** Let apps use motion data generated on the device user. Added in Windows 10, version 1607. */
    Motion("motion"),
    /** Let apps access users notifications. Added in Windows 10, version 1607. */
    Notifications("notifications"),
    /** Let apps access phone data and make phone calls. Added in Windows 10, version 1607. */
    Phone("phone"),
    /** Let apps use radios, including Bluetooth, to send and receive data. Added in Windows 10, version 1607. */
    Radios("radios"),
    /** Let apps access Task Scheduler. Added in Windows 10, version 1703. */
    Tasks("tasks"),
    /** Let apps automatically share and sync info with wireless devices that dont explicitly pair with users device. Added in Windows 10, version 1607. */
    SyncWithDevices("syncWithDevices"),
    /** Let apps access trusted devices. Added in Windows 10, version 1607. */
    TrustedDevices("trustedDevices");
    public final String value;
    WindowsPrivacyDataCategory(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WindowsPrivacyDataCategory forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "accountInfo": return AccountInfo;
            case "appsRunInBackground": return AppsRunInBackground;
            case "calendar": return Calendar;
            case "callHistory": return CallHistory;
            case "camera": return Camera;
            case "contacts": return Contacts;
            case "diagnosticsInfo": return DiagnosticsInfo;
            case "email": return Email;
            case "location": return Location;
            case "messaging": return Messaging;
            case "microphone": return Microphone;
            case "motion": return Motion;
            case "notifications": return Notifications;
            case "phone": return Phone;
            case "radios": return Radios;
            case "tasks": return Tasks;
            case "syncWithDevices": return SyncWithDevices;
            case "trustedDevices": return TrustedDevices;
            default: return null;
        }
    }
}
