package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to call the windowsPrivacyAccessControls method.  */
public enum WindowsPrivacyDataCategory implements ValuedEnum {
    NotConfigured("notConfigured"),
    AccountInfo("accountInfo"),
    AppsRunInBackground("appsRunInBackground"),
    Calendar("calendar"),
    CallHistory("callHistory"),
    Camera("camera"),
    Contacts("contacts"),
    DiagnosticsInfo("diagnosticsInfo"),
    Email("email"),
    Location("location"),
    Messaging("messaging"),
    Microphone("microphone"),
    Motion("motion"),
    Notifications("notifications"),
    Phone("phone"),
    Radios("radios"),
    Tasks("tasks"),
    SyncWithDevices("syncWithDevices"),
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
