package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Setting type of the group policy. */
public enum GroupPolicySettingType implements ValuedEnum {
    /** GroupPolicySettingType unknown */
    Unknown("unknown"),
    /** Policy setting type */
    Policy("policy"),
    /** Account setting type */
    Account("account"),
    /** SecurityOptions setting type */
    SecurityOptions("securityOptions"),
    /** UserRightsAssignment setting type */
    UserRightsAssignment("userRightsAssignment"),
    /** AuditSetting setting type */
    AuditSetting("auditSetting"),
    /** WindowsFirewallSettings setting type */
    WindowsFirewallSettings("windowsFirewallSettings"),
    /** AppLockerRuleCollection setting type */
    AppLockerRuleCollection("appLockerRuleCollection"),
    /** DataSourcesSettings setting type */
    DataSourcesSettings("dataSourcesSettings"),
    /** DevicesSettings setting type */
    DevicesSettings("devicesSettings"),
    /** DriveMapSettings setting type */
    DriveMapSettings("driveMapSettings"),
    /** EnvironmentVariables setting type */
    EnvironmentVariables("environmentVariables"),
    /** FilesSettings setting type */
    FilesSettings("filesSettings"),
    /** FolderOptions setting type */
    FolderOptions("folderOptions"),
    /** Folders setting type */
    Folders("folders"),
    /** IniFiles setting type */
    IniFiles("iniFiles"),
    /** InternetOptions setting type */
    InternetOptions("internetOptions"),
    /** LocalUsersAndGroups setting type */
    LocalUsersAndGroups("localUsersAndGroups"),
    /** NetworkOptions setting type */
    NetworkOptions("networkOptions"),
    /** NetworkShares setting type */
    NetworkShares("networkShares"),
    /** NTServices setting type */
    NtServices("ntServices"),
    /** PowerOptions setting type */
    PowerOptions("powerOptions"),
    /** Printers setting type */
    Printers("printers"),
    /** RegionalOptionsSettings setting type */
    RegionalOptionsSettings("regionalOptionsSettings"),
    /** RegistrySettings setting type */
    RegistrySettings("registrySettings"),
    /** ScheduledTasks setting type */
    ScheduledTasks("scheduledTasks"),
    /** ShortcutSettings setting type */
    ShortcutSettings("shortcutSettings"),
    /** StartMenuSettings setting type */
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
