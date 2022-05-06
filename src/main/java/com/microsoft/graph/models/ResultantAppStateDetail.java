package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceAppManagement singleton.  */
public enum ResultantAppStateDetail implements ValuedEnum {
    ProcessorArchitectureNotApplicable("processorArchitectureNotApplicable"),
    MinimumDiskSpaceNotMet("minimumDiskSpaceNotMet"),
    MinimumOsVersionNotMet("minimumOsVersionNotMet"),
    MinimumPhysicalMemoryNotMet("minimumPhysicalMemoryNotMet"),
    MinimumLogicalProcessorCountNotMet("minimumLogicalProcessorCountNotMet"),
    MinimumCpuSpeedNotMet("minimumCpuSpeedNotMet"),
    PlatformNotApplicable("platformNotApplicable"),
    FileSystemRequirementNotMet("fileSystemRequirementNotMet"),
    RegistryRequirementNotMet("registryRequirementNotMet"),
    PowerShellScriptRequirementNotMet("powerShellScriptRequirementNotMet"),
    SupersedingAppsNotApplicable("supersedingAppsNotApplicable"),
    NoAdditionalDetails("noAdditionalDetails"),
    DependencyFailedToInstall("dependencyFailedToInstall"),
    DependencyWithRequirementsNotMet("dependencyWithRequirementsNotMet"),
    DependencyPendingReboot("dependencyPendingReboot"),
    DependencyWithAutoInstallDisabled("dependencyWithAutoInstallDisabled"),
    SupersededAppUninstallFailed("supersededAppUninstallFailed"),
    SupersededAppUninstallPendingReboot("supersededAppUninstallPendingReboot"),
    RemovingSupersededApps("removingSupersededApps"),
    IosAppStoreUpdateFailedToInstall("iosAppStoreUpdateFailedToInstall"),
    VppAppHasUpdateAvailable("vppAppHasUpdateAvailable"),
    UserRejectedUpdate("userRejectedUpdate"),
    UninstallPendingReboot("uninstallPendingReboot"),
    SupersedingAppsDetected("supersedingAppsDetected"),
    SupersededAppsDetected("supersededAppsDetected"),
    SeeInstallErrorCode("seeInstallErrorCode"),
    AutoInstallDisabled("autoInstallDisabled"),
    ManagedAppNoLongerPresent("managedAppNoLongerPresent"),
    UserRejectedInstall("userRejectedInstall"),
    UserIsNotLoggedIntoAppStore("userIsNotLoggedIntoAppStore"),
    UntargetedSupersedingAppsDetected("untargetedSupersedingAppsDetected"),
    AppRemovedBySupersedence("appRemovedBySupersedence"),
    SeeUninstallErrorCode("seeUninstallErrorCode"),
    PendingReboot("pendingReboot"),
    InstallingDependencies("installingDependencies"),
    ContentDownloaded("contentDownloaded");
    public final String value;
    ResultantAppStateDetail(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ResultantAppStateDetail forValue(@javax.annotation.Nonnull final String searchValue) {
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
