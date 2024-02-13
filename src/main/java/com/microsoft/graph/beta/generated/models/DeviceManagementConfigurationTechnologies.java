package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Describes which technology this setting can be deployed with
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceManagementConfigurationTechnologies implements ValuedEnum {
    /** Default. Setting cannot be deployed through any channel. */
    None("none"),
    /** Setting can be deployed through the MDM channel. */
    Mdm("mdm"),
    /** Setting can be deployed through the Windows10XManagement channel */
    Windows10XManagement("windows10XManagement"),
    /** Setting can be deployed through the ConfigManager channel. */
    ConfigManager("configManager"),
    /** Setting can be deployed through the AppleRemoteManagement channel. */
    AppleRemoteManagement("appleRemoteManagement"),
    /** Setting can be deployed through the SENSE agent channel. */
    MicrosoftSense("microsoftSense"),
    /** Setting can be deployed through the Exchange Online agent channel. */
    ExchangeOnline("exchangeOnline"),
    /** Setting can be deployed through the Mobile Application Management (MAM) channel */
    MobileApplicationManagement("mobileApplicationManagement"),
    /** Setting can be deployed through the Linux Mdm channel. */
    LinuxMdm("linuxMdm"),
    /** Setting can be deployed through device enrollment. */
    Enrollment("enrollment"),
    /** Setting can be deployed using the Endpoint privilege management channel */
    EndpointPrivilegeManagement("endpointPrivilegeManagement"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue"),
    /** Setting can be deployed using the Operating System Recovery channel */
    WindowsOsRecovery("windowsOsRecovery");
    public final String value;
    DeviceManagementConfigurationTechnologies(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceManagementConfigurationTechnologies forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "mdm": return Mdm;
            case "windows10XManagement": return Windows10XManagement;
            case "configManager": return ConfigManager;
            case "appleRemoteManagement": return AppleRemoteManagement;
            case "microsoftSense": return MicrosoftSense;
            case "exchangeOnline": return ExchangeOnline;
            case "mobileApplicationManagement": return MobileApplicationManagement;
            case "linuxMdm": return LinuxMdm;
            case "enrollment": return Enrollment;
            case "endpointPrivilegeManagement": return EndpointPrivilegeManagement;
            case "unknownFutureValue": return UnknownFutureValue;
            case "windowsOsRecovery": return WindowsOsRecovery;
            default: return null;
        }
    }
}
