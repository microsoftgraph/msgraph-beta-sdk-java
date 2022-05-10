package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Describes the installation status details of the child app in the context of UPN and device id. */
public class MobileAppRelationshipState implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The corresponding device id. */
    private String _deviceId;
    /** The error code for install or uninstall failures of target app. */
    private Integer _errorCode;
    /** The install state of the app of target app. Possible values are: installed, failed, notInstalled, uninstallFailed, pendingInstall, unknown, notApplicable. */
    private ResultantAppState _installState;
    /** The install state detail of the app. Possible values are: noAdditionalDetails, dependencyFailedToInstall, dependencyWithRequirementsNotMet, dependencyPendingReboot, dependencyWithAutoInstallDisabled, supersededAppUninstallFailed, supersededAppUninstallPendingReboot, removingSupersededApps, iosAppStoreUpdateFailedToInstall, vppAppHasUpdateAvailable, userRejectedUpdate, uninstallPendingReboot, supersedingAppsDetected, supersededAppsDetected, seeInstallErrorCode, autoInstallDisabled, managedAppNoLongerPresent, userRejectedInstall, userIsNotLoggedIntoAppStore, untargetedSupersedingAppsDetected, appRemovedBySupersedence, seeUninstallErrorCode, pendingReboot, installingDependencies, contentDownloaded, supersedingAppsNotApplicable, powerShellScriptRequirementNotMet, registryRequirementNotMet, fileSystemRequirementNotMet, platformNotApplicable, minimumCpuSpeedNotMet, minimumLogicalProcessorCountNotMet, minimumPhysicalMemoryNotMet, minimumOsVersionNotMet, minimumDiskSpaceNotMet, processorArchitectureNotApplicable. */
    private ResultantAppStateDetail _installStateDetail;
    /** The collection of source mobile app's ids. */
    private java.util.List<String> _sourceIds;
    /** The related target app's display name. */
    private String _targetDisplayName;
    /** The related target app's id. */
    private String _targetId;
    /** The last sync time of the target app. */
    private OffsetDateTime _targetLastSyncDateTime;
    /**
     * Instantiates a new mobileAppRelationshipState and sets the default values.
     * @return a void
     */
    public MobileAppRelationshipState() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mobileAppRelationshipState
     */
    @javax.annotation.Nonnull
    public static MobileAppRelationshipState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppRelationshipState();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the deviceId property value. The corresponding device id.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this._deviceId;
    }
    /**
     * Gets the errorCode property value. The error code for install or uninstall failures of target app.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getErrorCode() {
        return this._errorCode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MobileAppRelationshipState currentObject = this;
        return new HashMap<>(8) {{
            this.put("deviceId", (n) -> { currentObject.setDeviceId(n.getStringValue()); });
            this.put("errorCode", (n) -> { currentObject.setErrorCode(n.getIntegerValue()); });
            this.put("installState", (n) -> { currentObject.setInstallState(n.getEnumValue(ResultantAppState.class)); });
            this.put("installStateDetail", (n) -> { currentObject.setInstallStateDetail(n.getEnumValue(ResultantAppStateDetail.class)); });
            this.put("sourceIds", (n) -> { currentObject.setSourceIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("targetDisplayName", (n) -> { currentObject.setTargetDisplayName(n.getStringValue()); });
            this.put("targetId", (n) -> { currentObject.setTargetId(n.getStringValue()); });
            this.put("targetLastSyncDateTime", (n) -> { currentObject.setTargetLastSyncDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the installState property value. The install state of the app of target app. Possible values are: installed, failed, notInstalled, uninstallFailed, pendingInstall, unknown, notApplicable.
     * @return a resultantAppState
     */
    @javax.annotation.Nullable
    public ResultantAppState getInstallState() {
        return this._installState;
    }
    /**
     * Gets the installStateDetail property value. The install state detail of the app. Possible values are: noAdditionalDetails, dependencyFailedToInstall, dependencyWithRequirementsNotMet, dependencyPendingReboot, dependencyWithAutoInstallDisabled, supersededAppUninstallFailed, supersededAppUninstallPendingReboot, removingSupersededApps, iosAppStoreUpdateFailedToInstall, vppAppHasUpdateAvailable, userRejectedUpdate, uninstallPendingReboot, supersedingAppsDetected, supersededAppsDetected, seeInstallErrorCode, autoInstallDisabled, managedAppNoLongerPresent, userRejectedInstall, userIsNotLoggedIntoAppStore, untargetedSupersedingAppsDetected, appRemovedBySupersedence, seeUninstallErrorCode, pendingReboot, installingDependencies, contentDownloaded, supersedingAppsNotApplicable, powerShellScriptRequirementNotMet, registryRequirementNotMet, fileSystemRequirementNotMet, platformNotApplicable, minimumCpuSpeedNotMet, minimumLogicalProcessorCountNotMet, minimumPhysicalMemoryNotMet, minimumOsVersionNotMet, minimumDiskSpaceNotMet, processorArchitectureNotApplicable.
     * @return a resultantAppStateDetail
     */
    @javax.annotation.Nullable
    public ResultantAppStateDetail getInstallStateDetail() {
        return this._installStateDetail;
    }
    /**
     * Gets the sourceIds property value. The collection of source mobile app's ids.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSourceIds() {
        return this._sourceIds;
    }
    /**
     * Gets the targetDisplayName property value. The related target app's display name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetDisplayName() {
        return this._targetDisplayName;
    }
    /**
     * Gets the targetId property value. The related target app's id.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetId() {
        return this._targetId;
    }
    /**
     * Gets the targetLastSyncDateTime property value. The last sync time of the target app.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getTargetLastSyncDateTime() {
        return this._targetLastSyncDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeIntegerValue("errorCode", this.getErrorCode());
        writer.writeEnumValue("installState", this.getInstallState());
        writer.writeEnumValue("installStateDetail", this.getInstallStateDetail());
        writer.writeCollectionOfPrimitiveValues("sourceIds", this.getSourceIds());
        writer.writeStringValue("targetDisplayName", this.getTargetDisplayName());
        writer.writeStringValue("targetId", this.getTargetId());
        writer.writeOffsetDateTimeValue("targetLastSyncDateTime", this.getTargetLastSyncDateTime());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the deviceId property value. The corresponding device id.
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this._deviceId = value;
    }
    /**
     * Sets the errorCode property value. The error code for install or uninstall failures of target app.
     * @param value Value to set for the errorCode property.
     * @return a void
     */
    public void setErrorCode(@javax.annotation.Nullable final Integer value) {
        this._errorCode = value;
    }
    /**
     * Sets the installState property value. The install state of the app of target app. Possible values are: installed, failed, notInstalled, uninstallFailed, pendingInstall, unknown, notApplicable.
     * @param value Value to set for the installState property.
     * @return a void
     */
    public void setInstallState(@javax.annotation.Nullable final ResultantAppState value) {
        this._installState = value;
    }
    /**
     * Sets the installStateDetail property value. The install state detail of the app. Possible values are: noAdditionalDetails, dependencyFailedToInstall, dependencyWithRequirementsNotMet, dependencyPendingReboot, dependencyWithAutoInstallDisabled, supersededAppUninstallFailed, supersededAppUninstallPendingReboot, removingSupersededApps, iosAppStoreUpdateFailedToInstall, vppAppHasUpdateAvailable, userRejectedUpdate, uninstallPendingReboot, supersedingAppsDetected, supersededAppsDetected, seeInstallErrorCode, autoInstallDisabled, managedAppNoLongerPresent, userRejectedInstall, userIsNotLoggedIntoAppStore, untargetedSupersedingAppsDetected, appRemovedBySupersedence, seeUninstallErrorCode, pendingReboot, installingDependencies, contentDownloaded, supersedingAppsNotApplicable, powerShellScriptRequirementNotMet, registryRequirementNotMet, fileSystemRequirementNotMet, platformNotApplicable, minimumCpuSpeedNotMet, minimumLogicalProcessorCountNotMet, minimumPhysicalMemoryNotMet, minimumOsVersionNotMet, minimumDiskSpaceNotMet, processorArchitectureNotApplicable.
     * @param value Value to set for the installStateDetail property.
     * @return a void
     */
    public void setInstallStateDetail(@javax.annotation.Nullable final ResultantAppStateDetail value) {
        this._installStateDetail = value;
    }
    /**
     * Sets the sourceIds property value. The collection of source mobile app's ids.
     * @param value Value to set for the sourceIds property.
     * @return a void
     */
    public void setSourceIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._sourceIds = value;
    }
    /**
     * Sets the targetDisplayName property value. The related target app's display name.
     * @param value Value to set for the targetDisplayName property.
     * @return a void
     */
    public void setTargetDisplayName(@javax.annotation.Nullable final String value) {
        this._targetDisplayName = value;
    }
    /**
     * Sets the targetId property value. The related target app's id.
     * @param value Value to set for the targetId property.
     * @return a void
     */
    public void setTargetId(@javax.annotation.Nullable final String value) {
        this._targetId = value;
    }
    /**
     * Sets the targetLastSyncDateTime property value. The last sync time of the target app.
     * @param value Value to set for the targetLastSyncDateTime property.
     * @return a void
     */
    public void setTargetLastSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._targetLastSyncDateTime = value;
    }
}
