package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum WindowsDefenderProductStatus implements ValuedEnum {
    NoStatus("noStatus"),
    ServiceNotRunning("serviceNotRunning"),
    ServiceStartedWithoutMalwareProtection("serviceStartedWithoutMalwareProtection"),
    PendingFullScanDueToThreatAction("pendingFullScanDueToThreatAction"),
    PendingRebootDueToThreatAction("pendingRebootDueToThreatAction"),
    PendingManualStepsDueToThreatAction("pendingManualStepsDueToThreatAction"),
    AvSignaturesOutOfDate("avSignaturesOutOfDate"),
    AsSignaturesOutOfDate("asSignaturesOutOfDate"),
    NoQuickScanHappenedForSpecifiedPeriod("noQuickScanHappenedForSpecifiedPeriod"),
    NoFullScanHappenedForSpecifiedPeriod("noFullScanHappenedForSpecifiedPeriod"),
    SystemInitiatedScanInProgress("systemInitiatedScanInProgress"),
    SystemInitiatedCleanInProgress("systemInitiatedCleanInProgress"),
    SamplesPendingSubmission("samplesPendingSubmission"),
    ProductRunningInEvaluationMode("productRunningInEvaluationMode"),
    ProductRunningInNonGenuineMode("productRunningInNonGenuineMode"),
    ProductExpired("productExpired"),
    OfflineScanRequired("offlineScanRequired"),
    ServiceShutdownAsPartOfSystemShutdown("serviceShutdownAsPartOfSystemShutdown"),
    ThreatRemediationFailedCritically("threatRemediationFailedCritically"),
    ThreatRemediationFailedNonCritically("threatRemediationFailedNonCritically"),
    NoStatusFlagsSet("noStatusFlagsSet"),
    PlatformOutOfDate("platformOutOfDate"),
    PlatformUpdateInProgress("platformUpdateInProgress"),
    PlatformAboutToBeOutdated("platformAboutToBeOutdated"),
    SignatureOrPlatformEndOfLifeIsPastOrIsImpending("signatureOrPlatformEndOfLifeIsPastOrIsImpending"),
    WindowsSModeSignaturesInUseOnNonWin10SInstall("windowsSModeSignaturesInUseOnNonWin10SInstall");
    public final String value;
    WindowsDefenderProductStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WindowsDefenderProductStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "noStatus": return NoStatus;
            case "serviceNotRunning": return ServiceNotRunning;
            case "serviceStartedWithoutMalwareProtection": return ServiceStartedWithoutMalwareProtection;
            case "pendingFullScanDueToThreatAction": return PendingFullScanDueToThreatAction;
            case "pendingRebootDueToThreatAction": return PendingRebootDueToThreatAction;
            case "pendingManualStepsDueToThreatAction": return PendingManualStepsDueToThreatAction;
            case "avSignaturesOutOfDate": return AvSignaturesOutOfDate;
            case "asSignaturesOutOfDate": return AsSignaturesOutOfDate;
            case "noQuickScanHappenedForSpecifiedPeriod": return NoQuickScanHappenedForSpecifiedPeriod;
            case "noFullScanHappenedForSpecifiedPeriod": return NoFullScanHappenedForSpecifiedPeriod;
            case "systemInitiatedScanInProgress": return SystemInitiatedScanInProgress;
            case "systemInitiatedCleanInProgress": return SystemInitiatedCleanInProgress;
            case "samplesPendingSubmission": return SamplesPendingSubmission;
            case "productRunningInEvaluationMode": return ProductRunningInEvaluationMode;
            case "productRunningInNonGenuineMode": return ProductRunningInNonGenuineMode;
            case "productExpired": return ProductExpired;
            case "offlineScanRequired": return OfflineScanRequired;
            case "serviceShutdownAsPartOfSystemShutdown": return ServiceShutdownAsPartOfSystemShutdown;
            case "threatRemediationFailedCritically": return ThreatRemediationFailedCritically;
            case "threatRemediationFailedNonCritically": return ThreatRemediationFailedNonCritically;
            case "noStatusFlagsSet": return NoStatusFlagsSet;
            case "platformOutOfDate": return PlatformOutOfDate;
            case "platformUpdateInProgress": return PlatformUpdateInProgress;
            case "platformAboutToBeOutdated": return PlatformAboutToBeOutdated;
            case "signatureOrPlatformEndOfLifeIsPastOrIsImpending": return SignatureOrPlatformEndOfLifeIsPastOrIsImpending;
            case "windowsSModeSignaturesInUseOnNonWin10SInstall": return WindowsSModeSignaturesInUseOnNonWin10SInstall;
            default: return null;
        }
    }
}
