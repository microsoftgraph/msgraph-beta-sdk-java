package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum DeviceManagementConfigurationTechnologies implements ValuedEnum {
    None("none"),
    Mdm("mdm"),
    Windows10XManagement("windows10XManagement"),
    ConfigManager("configManager"),
    AppleRemoteManagement("appleRemoteManagement"),
    MicrosoftSense("microsoftSense"),
    ExchangeOnline("exchangeOnline"),
    LinuxMdm("linuxMdm"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceManagementConfigurationTechnologies(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManagementConfigurationTechnologies forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "mdm": return Mdm;
            case "windows10XManagement": return Windows10XManagement;
            case "configManager": return ConfigManager;
            case "appleRemoteManagement": return AppleRemoteManagement;
            case "microsoftSense": return MicrosoftSense;
            case "exchangeOnline": return ExchangeOnline;
            case "linuxMdm": return LinuxMdm;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
