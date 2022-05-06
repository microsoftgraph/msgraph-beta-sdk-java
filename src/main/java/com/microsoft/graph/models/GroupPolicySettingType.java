package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum GroupPolicySettingType implements ValuedEnum {
    Unknown("unknown"),
    Policy("policy"),
    Account("account"),
    SecurityOptions("securityOptions"),
    UserRightsAssignment("userRightsAssignment"),
    AuditSetting("auditSetting"),
    WindowsFirewallSettings("windowsFirewallSettings"),
    AppLockerRuleCollection("appLockerRuleCollection"),
    DataSourcesSettings("dataSourcesSettings"),
    DevicesSettings("devicesSettings"),
    DriveMapSettings("driveMapSettings"),
    EnvironmentVariables("environmentVariables"),
    FilesSettings("filesSettings"),
    FolderOptions("folderOptions"),
    Folders("folders"),
    IniFiles("iniFiles"),
    InternetOptions("internetOptions"),
    LocalUsersAndGroups("localUsersAndGroups"),
    NetworkOptions("networkOptions"),
    NetworkShares("networkShares"),
    NtServices("ntServices"),
    PowerOptions("powerOptions"),
    Printers("printers"),
    RegionalOptionsSettings("regionalOptionsSettings"),
    RegistrySettings("registrySettings"),
    ScheduledTasks("scheduledTasks"),
    ShortcutSettings("shortcutSettings"),
    StartMenuSettings("startMenuSettings");
    public final String value;
    GroupPolicySettingType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static GroupPolicySettingType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "policy": return Policy;
            case "account": return Account;
            case "securityOptions": return SecurityOptions;
            case "userRightsAssignment": return UserRightsAssignment;
            case "auditSetting": return AuditSetting;
            case "windowsFirewallSettings": return WindowsFirewallSettings;
            case "appLockerRuleCollection": return AppLockerRuleCollection;
            case "dataSourcesSettings": return DataSourcesSettings;
            case "devicesSettings": return DevicesSettings;
            case "driveMapSettings": return DriveMapSettings;
            case "environmentVariables": return EnvironmentVariables;
            case "filesSettings": return FilesSettings;
            case "folderOptions": return FolderOptions;
            case "folders": return Folders;
            case "iniFiles": return IniFiles;
            case "internetOptions": return InternetOptions;
            case "localUsersAndGroups": return LocalUsersAndGroups;
            case "networkOptions": return NetworkOptions;
            case "networkShares": return NetworkShares;
            case "ntServices": return NtServices;
            case "powerOptions": return PowerOptions;
            case "printers": return Printers;
            case "regionalOptionsSettings": return RegionalOptionsSettings;
            case "registrySettings": return RegistrySettings;
            case "scheduledTasks": return ScheduledTasks;
            case "shortcutSettings": return ShortcutSettings;
            case "startMenuSettings": return StartMenuSettings;
            default: return null;
        }
    }
}
