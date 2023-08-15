package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Enum indicating additional details regarding why an application has a particular install state.
 */
public enum ResultantAppStateDetail implements ValuedEnum {
    /** Device architecture (e.g. x86/amd64) is not applicable for the application. */
    ProcessorArchitectureNotApplicable("processorArchitectureNotApplicable"),
    /** Available disk space on the target device is less than the configured minimum. */
    MinimumDiskSpaceNotMet("minimumDiskSpaceNotMet"),
    /** OS version on the target device is less than the configured minimum. */
    MinimumOsVersionNotMet("minimumOsVersionNotMet"),
    /** Amount of RAM on the target device is less than the configured minimum. */
    MinimumPhysicalMemoryNotMet("minimumPhysicalMemoryNotMet"),
    /** Count of logical processors on the target device is less than the configured minimum. */
    MinimumLogicalProcessorCountNotMet("minimumLogicalProcessorCountNotMet"),
    /** CPU speed on the target device is less than the configured minimum. */
    MinimumCpuSpeedNotMet("minimumCpuSpeedNotMet"),
    /** Application is not applicable to this platform. (e.g. Android app targeted to IOS) */
    PlatformNotApplicable("platformNotApplicable"),
    /** File system requirement rule is not met */
    FileSystemRequirementNotMet("fileSystemRequirementNotMet"),
    /** Registry requirement rule is not met */
    RegistryRequirementNotMet("registryRequirementNotMet"),
    /** PowerShell script requirement rule is not met */
    PowerShellScriptRequirementNotMet("powerShellScriptRequirementNotMet"),
    /** All targeted, superseding apps are not applicable. */
    SupersedingAppsNotApplicable("supersedingAppsNotApplicable"),
    /** No additional details are available. */
    NoAdditionalDetails("noAdditionalDetails"),
    /** One or more of the application's dependencies failed to install. */
    DependencyFailedToInstall("dependencyFailedToInstall"),
    /** One or more of the application's dependencies have requirements which are not met. */
    DependencyWithRequirementsNotMet("dependencyWithRequirementsNotMet"),
    /** One or more of the application's dependencies require a device reboot to complete installation. */
    DependencyPendingReboot("dependencyPendingReboot"),
    /** One or more of the application's dependencies are configured to not automatically install. */
    DependencyWithAutoInstallDisabled("dependencyWithAutoInstallDisabled"),
    /** A superseded app failed to uninstall. */
    SupersededAppUninstallFailed("supersededAppUninstallFailed"),
    /** A superseded app requires a reboot to complete uninstall. */
    SupersededAppUninstallPendingReboot("supersededAppUninstallPendingReboot"),
    /** Superseded apps are being removed. */
    RemovingSupersededApps("removingSupersededApps"),
    /** The latest version of the app failed to update from an earlier version. */
    IosAppStoreUpdateFailedToInstall("iosAppStoreUpdateFailedToInstall"),
    /** An update is available. */
    VppAppHasUpdateAvailable("vppAppHasUpdateAvailable"),
    /** The user rejected the app update. */
    UserRejectedUpdate("userRejectedUpdate"),
    /** To complete the removal of the app, the device must be rebooted. */
    UninstallPendingReboot("uninstallPendingReboot"),
    /** Superseding applications are detected. */
    SupersedingAppsDetected("supersedingAppsDetected"),
    /** Superseded applications are detected. */
    SupersededAppsDetected("supersededAppsDetected"),
    /** Application failed to install. See error code property for more details. */
    SeeInstallErrorCode("seeInstallErrorCode"),
    /** Application is configured to not be automatically installed. */
    AutoInstallDisabled("autoInstallDisabled"),
    /** The app is managed but no longer installed. */
    ManagedAppNoLongerPresent("managedAppNoLongerPresent"),
    /** The user rejected the app install. */
    UserRejectedInstall("userRejectedInstall"),
    /** The user must log into the App Store to install app. */
    UserIsNotLoggedIntoAppStore("userIsNotLoggedIntoAppStore"),
    /** App cannot be installed. An untargeted, superseding app was detected, which created a conflict. */
    UntargetedSupersedingAppsDetected("untargetedSupersedingAppsDetected"),
    /** App was removed in order to install a superseding app. */
    AppRemovedBySupersedence("appRemovedBySupersedence"),
    /** Application failed to uninstall. See error code property for more details. */
    SeeUninstallErrorCode("seeUninstallErrorCode"),
    /** Device must be rebooted to complete installation of the application. */
    PendingReboot("pendingReboot"),
    /** One or more of the application's dependencies are installing. */
    InstallingDependencies("installingDependencies"),
    /** Application content was downloaded to the device. */
    ContentDownloaded("contentDownloaded");
    public final String value;
    ResultantAppStateDetail(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ResultantAppStateDetail forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "processorArchitectureNotApplicable": return ProcessorArchitectureNotApplicable;
            case "minimumDiskSpaceNotMet": return MinimumDiskSpaceNotMet;
            case "minimumOsVersionNotMet": return MinimumOsVersionNotMet;
            case "minimumPhysicalMemoryNotMet": return MinimumPhysicalMemoryNotMet;
            case "minimumLogicalProcessorCountNotMet": return MinimumLogicalProcessorCountNotMet;
            case "minimumCpuSpeedNotMet": return MinimumCpuSpeedNotMet;
            case "platformNotApplicable": return PlatformNotApplicable;
            case "fileSystemRequirementNotMet": return FileSystemRequirementNotMet;
            case "registryRequirementNotMet": return RegistryRequirementNotMet;
            case "powerShellScriptRequirementNotMet": return PowerShellScriptRequirementNotMet;
            case "supersedingAppsNotApplicable": return SupersedingAppsNotApplicable;
            case "noAdditionalDetails": return NoAdditionalDetails;
            case "dependencyFailedToInstall": return DependencyFailedToInstall;
            case "dependencyWithRequirementsNotMet": return DependencyWithRequirementsNotMet;
            case "dependencyPendingReboot": return DependencyPendingReboot;
            case "dependencyWithAutoInstallDisabled": return DependencyWithAutoInstallDisabled;
            case "supersededAppUninstallFailed": return SupersededAppUninstallFailed;
            case "supersededAppUninstallPendingReboot": return SupersededAppUninstallPendingReboot;
            case "removingSupersededApps": return RemovingSupersededApps;
            case "iosAppStoreUpdateFailedToInstall": return IosAppStoreUpdateFailedToInstall;
            case "vppAppHasUpdateAvailable": return VppAppHasUpdateAvailable;
            case "userRejectedUpdate": return UserRejectedUpdate;
            case "uninstallPendingReboot": return UninstallPendingReboot;
            case "supersedingAppsDetected": return SupersedingAppsDetected;
            case "supersededAppsDetected": return SupersededAppsDetected;
            case "seeInstallErrorCode": return SeeInstallErrorCode;
            case "autoInstallDisabled": return AutoInstallDisabled;
            case "managedAppNoLongerPresent": return ManagedAppNoLongerPresent;
            case "userRejectedInstall": return UserRejectedInstall;
            case "userIsNotLoggedIntoAppStore": return UserIsNotLoggedIntoAppStore;
            case "untargetedSupersedingAppsDetected": return UntargetedSupersedingAppsDetected;
            case "appRemovedBySupersedence": return AppRemovedBySupersedence;
            case "seeUninstallErrorCode": return SeeUninstallErrorCode;
            case "pendingReboot": return PendingReboot;
            case "installingDependencies": return InstallingDependencies;
            case "contentDownloaded": return ContentDownloaded;
            default: return null;
        }
    }
}
