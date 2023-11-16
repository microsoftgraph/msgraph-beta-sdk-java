package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This topic provides descriptions of the declared methods, properties and relationships exposed by the iosGeneralDeviceConfiguration resource.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IosGeneralDeviceConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new IosGeneralDeviceConfiguration and sets the default values.
     */
    public IosGeneralDeviceConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.iosGeneralDeviceConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosGeneralDeviceConfiguration
     */
    @jakarta.annotation.Nonnull
    public static IosGeneralDeviceConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosGeneralDeviceConfiguration();
    }
    /**
     * Gets the accountBlockModification property value. Indicates whether or not to allow account modification when the device is in supervised mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAccountBlockModification() {
        return this.BackingStore.get("accountBlockModification");
    }
    /**
     * Gets the activationLockAllowWhenSupervised property value. Indicates whether or not to allow activation lock when the device is in the supervised mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getActivationLockAllowWhenSupervised() {
        return this.BackingStore.get("activationLockAllowWhenSupervised");
    }
    /**
     * Gets the airDropBlocked property value. Indicates whether or not to allow AirDrop when the device is in supervised mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAirDropBlocked() {
        return this.BackingStore.get("airDropBlocked");
    }
    /**
     * Gets the airDropForceUnmanagedDropTarget property value. Indicates whether or not to cause AirDrop to be considered an unmanaged drop target (iOS 9.0 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAirDropForceUnmanagedDropTarget() {
        return this.BackingStore.get("airDropForceUnmanagedDropTarget");
    }
    /**
     * Gets the airPlayForcePairingPasswordForOutgoingRequests property value. Indicates whether or not to enforce all devices receiving AirPlay requests from this device to use a pairing password.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAirPlayForcePairingPasswordForOutgoingRequests() {
        return this.BackingStore.get("airPlayForcePairingPasswordForOutgoingRequests");
    }
    /**
     * Gets the airPrintBlockCredentialsStorage property value. Indicates whether or not keychain storage of username and password for Airprint is blocked (iOS 11.0 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAirPrintBlockCredentialsStorage() {
        return this.BackingStore.get("airPrintBlockCredentialsStorage");
    }
    /**
     * Gets the airPrintBlocked property value. Indicates whether or not AirPrint is blocked (iOS 11.0 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAirPrintBlocked() {
        return this.BackingStore.get("airPrintBlocked");
    }
    /**
     * Gets the airPrintBlockiBeaconDiscovery property value. Indicates whether or not iBeacon discovery of AirPrint printers is blocked. This prevents spurious AirPrint Bluetooth beacons from phishing for network traffic (iOS 11.0 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAirPrintBlockiBeaconDiscovery() {
        return this.BackingStore.get("airPrintBlockiBeaconDiscovery");
    }
    /**
     * Gets the airPrintForceTrustedTLS property value. Indicates if trusted certificates are required for TLS printing communication (iOS 11.0 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAirPrintForceTrustedTLS() {
        return this.BackingStore.get("airPrintForceTrustedTLS");
    }
    /**
     * Gets the appClipsBlocked property value. Prevents a user from adding any App Clips and removes any existing App Clips on the device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAppClipsBlocked() {
        return this.BackingStore.get("appClipsBlocked");
    }
    /**
     * Gets the appleNewsBlocked property value. Indicates whether or not to block the user from using News when the device is in supervised mode (iOS 9.0 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAppleNewsBlocked() {
        return this.BackingStore.get("appleNewsBlocked");
    }
    /**
     * Gets the applePersonalizedAdsBlocked property value. Limits Apple personalized advertising when true. Available in iOS 14 and later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getApplePersonalizedAdsBlocked() {
        return this.BackingStore.get("applePersonalizedAdsBlocked");
    }
    /**
     * Gets the appleWatchBlockPairing property value. Indicates whether or not to allow Apple Watch pairing when the device is in supervised mode (iOS 9.0 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAppleWatchBlockPairing() {
        return this.BackingStore.get("appleWatchBlockPairing");
    }
    /**
     * Gets the appleWatchForceWristDetection property value. Indicates whether or not to force a paired Apple Watch to use Wrist Detection (iOS 8.2 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAppleWatchForceWristDetection() {
        return this.BackingStore.get("appleWatchForceWristDetection");
    }
    /**
     * Gets the appRemovalBlocked property value. Indicates if the removal of apps is allowed.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAppRemovalBlocked() {
        return this.BackingStore.get("appRemovalBlocked");
    }
    /**
     * Gets the appsSingleAppModeList property value. Gets or sets the list of iOS apps allowed to autonomously enter Single App Mode. Supervised only. iOS 7.0 and later. This collection can contain a maximum of 500 elements.
     * @return a java.util.List<AppListItem>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppListItem> getAppsSingleAppModeList() {
        return this.BackingStore.get("appsSingleAppModeList");
    }
    /**
     * Gets the appStoreBlockAutomaticDownloads property value. Indicates whether or not to block the automatic downloading of apps purchased on other devices when the device is in supervised mode (iOS 9.0 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAppStoreBlockAutomaticDownloads() {
        return this.BackingStore.get("appStoreBlockAutomaticDownloads");
    }
    /**
     * Gets the appStoreBlocked property value. Indicates whether or not to block the user from using the App Store. Requires a supervised device for iOS 13 and later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAppStoreBlocked() {
        return this.BackingStore.get("appStoreBlocked");
    }
    /**
     * Gets the appStoreBlockInAppPurchases property value. Indicates whether or not to block the user from making in app purchases.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAppStoreBlockInAppPurchases() {
        return this.BackingStore.get("appStoreBlockInAppPurchases");
    }
    /**
     * Gets the appStoreBlockUIAppInstallation property value. Indicates whether or not to block the App Store app, not restricting installation through Host apps. Applies to supervised mode only (iOS 9.0 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAppStoreBlockUIAppInstallation() {
        return this.BackingStore.get("appStoreBlockUIAppInstallation");
    }
    /**
     * Gets the appStoreRequirePassword property value. Indicates whether or not to require a password when using the app store.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAppStoreRequirePassword() {
        return this.BackingStore.get("appStoreRequirePassword");
    }
    /**
     * Gets the appsVisibilityList property value. List of apps in the visibility list (either visible/launchable apps list or hidden/unlaunchable apps list, controlled by AppsVisibilityListType) (iOS 9.3 and later). This collection can contain a maximum of 10000 elements.
     * @return a java.util.List<AppListItem>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppListItem> getAppsVisibilityList() {
        return this.BackingStore.get("appsVisibilityList");
    }
    /**
     * Gets the appsVisibilityListType property value. Possible values of the compliance app list.
     * @return a AppListType
     */
    @jakarta.annotation.Nullable
    public AppListType getAppsVisibilityListType() {
        return this.BackingStore.get("appsVisibilityListType");
    }
    /**
     * Gets the autoFillForceAuthentication property value. Indicates whether or not to force user authentication before autofilling passwords and credit card information in Safari and other apps on supervised devices.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAutoFillForceAuthentication() {
        return this.BackingStore.get("autoFillForceAuthentication");
    }
    /**
     * Gets the autoUnlockBlocked property value. Blocks users from unlocking their device with Apple Watch. Available for devices running iOS and iPadOS versions 14.5 and later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAutoUnlockBlocked() {
        return this.BackingStore.get("autoUnlockBlocked");
    }
    /**
     * Gets the blockSystemAppRemoval property value. Indicates whether or not the removal of system apps from the device is blocked on a supervised device (iOS 11.0 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBlockSystemAppRemoval() {
        return this.BackingStore.get("blockSystemAppRemoval");
    }
    /**
     * Gets the bluetoothBlockModification property value. Indicates whether or not to allow modification of Bluetooth settings when the device is in supervised mode (iOS 10.0 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBluetoothBlockModification() {
        return this.BackingStore.get("bluetoothBlockModification");
    }
    /**
     * Gets the cameraBlocked property value. Indicates whether or not to block the user from accessing the camera of the device. Requires a supervised device for iOS 13 and later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCameraBlocked() {
        return this.BackingStore.get("cameraBlocked");
    }
    /**
     * Gets the cellularBlockDataRoaming property value. Indicates whether or not to block data roaming.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCellularBlockDataRoaming() {
        return this.BackingStore.get("cellularBlockDataRoaming");
    }
    /**
     * Gets the cellularBlockGlobalBackgroundFetchWhileRoaming property value. Indicates whether or not to block global background fetch while roaming.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCellularBlockGlobalBackgroundFetchWhileRoaming() {
        return this.BackingStore.get("cellularBlockGlobalBackgroundFetchWhileRoaming");
    }
    /**
     * Gets the cellularBlockPerAppDataModification property value. Indicates whether or not to allow changes to cellular app data usage settings when the device is in supervised mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCellularBlockPerAppDataModification() {
        return this.BackingStore.get("cellularBlockPerAppDataModification");
    }
    /**
     * Gets the cellularBlockPersonalHotspot property value. Indicates whether or not to block Personal Hotspot.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCellularBlockPersonalHotspot() {
        return this.BackingStore.get("cellularBlockPersonalHotspot");
    }
    /**
     * Gets the cellularBlockPersonalHotspotModification property value. Indicates whether or not to block the user from modifying the personal hotspot setting (iOS 12.2 or later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCellularBlockPersonalHotspotModification() {
        return this.BackingStore.get("cellularBlockPersonalHotspotModification");
    }
    /**
     * Gets the cellularBlockPlanModification property value. Indicates whether or not to allow users to change the settings of the cellular plan on a supervised device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCellularBlockPlanModification() {
        return this.BackingStore.get("cellularBlockPlanModification");
    }
    /**
     * Gets the cellularBlockVoiceRoaming property value. Indicates whether or not to block voice roaming.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCellularBlockVoiceRoaming() {
        return this.BackingStore.get("cellularBlockVoiceRoaming");
    }
    /**
     * Gets the certificatesBlockUntrustedTlsCertificates property value. Indicates whether or not to block untrusted TLS certificates.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCertificatesBlockUntrustedTlsCertificates() {
        return this.BackingStore.get("certificatesBlockUntrustedTlsCertificates");
    }
    /**
     * Gets the classroomAppBlockRemoteScreenObservation property value. Indicates whether or not to allow remote screen observation by Classroom app when the device is in supervised mode (iOS 9.3 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getClassroomAppBlockRemoteScreenObservation() {
        return this.BackingStore.get("classroomAppBlockRemoteScreenObservation");
    }
    /**
     * Gets the classroomAppForceUnpromptedScreenObservation property value. Indicates whether or not to automatically give permission to the teacher of a managed course on the Classroom app to view a student's screen without prompting when the device is in supervised mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getClassroomAppForceUnpromptedScreenObservation() {
        return this.BackingStore.get("classroomAppForceUnpromptedScreenObservation");
    }
    /**
     * Gets the classroomForceAutomaticallyJoinClasses property value. Indicates whether or not to automatically give permission to the teacher's requests, without prompting the student, when the device is in supervised mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getClassroomForceAutomaticallyJoinClasses() {
        return this.BackingStore.get("classroomForceAutomaticallyJoinClasses");
    }
    /**
     * Gets the classroomForceRequestPermissionToLeaveClasses property value. Indicates whether a student enrolled in an unmanaged course via Classroom will request permission from the teacher when attempting to leave the course (iOS 11.3 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getClassroomForceRequestPermissionToLeaveClasses() {
        return this.BackingStore.get("classroomForceRequestPermissionToLeaveClasses");
    }
    /**
     * Gets the classroomForceUnpromptedAppAndDeviceLock property value. Indicates whether or not to allow the teacher to lock apps or the device without prompting the student. Supervised only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getClassroomForceUnpromptedAppAndDeviceLock() {
        return this.BackingStore.get("classroomForceUnpromptedAppAndDeviceLock");
    }
    /**
     * Gets the compliantAppListType property value. Possible values of the compliance app list.
     * @return a AppListType
     */
    @jakarta.annotation.Nullable
    public AppListType getCompliantAppListType() {
        return this.BackingStore.get("compliantAppListType");
    }
    /**
     * Gets the compliantAppsList property value. List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements.
     * @return a java.util.List<AppListItem>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppListItem> getCompliantAppsList() {
        return this.BackingStore.get("compliantAppsList");
    }
    /**
     * Gets the configurationProfileBlockChanges property value. Indicates whether or not to block the user from installing configuration profiles and certificates interactively when the device is in supervised mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getConfigurationProfileBlockChanges() {
        return this.BackingStore.get("configurationProfileBlockChanges");
    }
    /**
     * Gets the contactsAllowManagedToUnmanagedWrite property value. Indicates whether or not managed apps can write contacts to unmanaged contacts accounts (iOS 12.0 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getContactsAllowManagedToUnmanagedWrite() {
        return this.BackingStore.get("contactsAllowManagedToUnmanagedWrite");
    }
    /**
     * Gets the contactsAllowUnmanagedToManagedRead property value. Indicates whether or not unmanaged apps can read from managed contacts accounts (iOS 12.0 or later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getContactsAllowUnmanagedToManagedRead() {
        return this.BackingStore.get("contactsAllowUnmanagedToManagedRead");
    }
    /**
     * Gets the continuousPathKeyboardBlocked property value. Indicates whether or not to block the continuous path keyboard when the device is supervised (iOS 13 or later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getContinuousPathKeyboardBlocked() {
        return this.BackingStore.get("continuousPathKeyboardBlocked");
    }
    /**
     * Gets the dateAndTimeForceSetAutomatically property value. Indicates whether or not the Date and Time 'Set Automatically' feature is enabled and cannot be turned off by the user (iOS 12.0 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDateAndTimeForceSetAutomatically() {
        return this.BackingStore.get("dateAndTimeForceSetAutomatically");
    }
    /**
     * Gets the definitionLookupBlocked property value. Indicates whether or not to block definition lookup when the device is in supervised mode (iOS 8.1.3 and later ).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefinitionLookupBlocked() {
        return this.BackingStore.get("definitionLookupBlocked");
    }
    /**
     * Gets the deviceBlockEnableRestrictions property value. Indicates whether or not to allow the user to enables restrictions in the device settings when the device is in supervised mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDeviceBlockEnableRestrictions() {
        return this.BackingStore.get("deviceBlockEnableRestrictions");
    }
    /**
     * Gets the deviceBlockEraseContentAndSettings property value. Indicates whether or not to allow the use of the 'Erase all content and settings' option on the device when the device is in supervised mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDeviceBlockEraseContentAndSettings() {
        return this.BackingStore.get("deviceBlockEraseContentAndSettings");
    }
    /**
     * Gets the deviceBlockNameModification property value. Indicates whether or not to allow device name modification when the device is in supervised mode (iOS 9.0 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDeviceBlockNameModification() {
        return this.BackingStore.get("deviceBlockNameModification");
    }
    /**
     * Gets the diagnosticDataBlockSubmission property value. Indicates whether or not to block diagnostic data submission.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDiagnosticDataBlockSubmission() {
        return this.BackingStore.get("diagnosticDataBlockSubmission");
    }
    /**
     * Gets the diagnosticDataBlockSubmissionModification property value. Indicates whether or not to allow diagnostics submission settings modification when the device is in supervised mode (iOS 9.3.2 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDiagnosticDataBlockSubmissionModification() {
        return this.BackingStore.get("diagnosticDataBlockSubmissionModification");
    }
    /**
     * Gets the documentsBlockManagedDocumentsInUnmanagedApps property value. Indicates whether or not to block the user from viewing managed documents in unmanaged apps.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDocumentsBlockManagedDocumentsInUnmanagedApps() {
        return this.BackingStore.get("documentsBlockManagedDocumentsInUnmanagedApps");
    }
    /**
     * Gets the documentsBlockUnmanagedDocumentsInManagedApps property value. Indicates whether or not to block the user from viewing unmanaged documents in managed apps.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDocumentsBlockUnmanagedDocumentsInManagedApps() {
        return this.BackingStore.get("documentsBlockUnmanagedDocumentsInManagedApps");
    }
    /**
     * Gets the emailInDomainSuffixes property value. An email address lacking a suffix that matches any of these strings will be considered out-of-domain.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getEmailInDomainSuffixes() {
        return this.BackingStore.get("emailInDomainSuffixes");
    }
    /**
     * Gets the enterpriseAppBlockTrust property value. Indicates whether or not to block the user from trusting an enterprise app.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnterpriseAppBlockTrust() {
        return this.BackingStore.get("enterpriseAppBlockTrust");
    }
    /**
     * Gets the enterpriseAppBlockTrustModification property value. [Deprecated] Configuring this setting and setting the value to 'true' has no effect on the device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnterpriseAppBlockTrustModification() {
        return this.BackingStore.get("enterpriseAppBlockTrustModification");
    }
    /**
     * Gets the enterpriseBookBlockBackup property value. Indicates whether or not Enterprise book back up is blocked.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnterpriseBookBlockBackup() {
        return this.BackingStore.get("enterpriseBookBlockBackup");
    }
    /**
     * Gets the enterpriseBookBlockMetadataSync property value. Indicates whether or not Enterprise book notes and highlights sync is blocked.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnterpriseBookBlockMetadataSync() {
        return this.BackingStore.get("enterpriseBookBlockMetadataSync");
    }
    /**
     * Gets the esimBlockModification property value. Indicates whether or not to allow the addition or removal of cellular plans on the eSIM of a supervised device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEsimBlockModification() {
        return this.BackingStore.get("esimBlockModification");
    }
    /**
     * Gets the faceTimeBlocked property value. Indicates whether or not to block the user from using FaceTime. Requires a supervised device for iOS 13 and later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFaceTimeBlocked() {
        return this.BackingStore.get("faceTimeBlocked");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accountBlockModification", (n) -> { this.setAccountBlockModification(n.getBooleanValue()); });
        deserializerMap.put("activationLockAllowWhenSupervised", (n) -> { this.setActivationLockAllowWhenSupervised(n.getBooleanValue()); });
        deserializerMap.put("airDropBlocked", (n) -> { this.setAirDropBlocked(n.getBooleanValue()); });
        deserializerMap.put("airDropForceUnmanagedDropTarget", (n) -> { this.setAirDropForceUnmanagedDropTarget(n.getBooleanValue()); });
        deserializerMap.put("airPlayForcePairingPasswordForOutgoingRequests", (n) -> { this.setAirPlayForcePairingPasswordForOutgoingRequests(n.getBooleanValue()); });
        deserializerMap.put("airPrintBlockCredentialsStorage", (n) -> { this.setAirPrintBlockCredentialsStorage(n.getBooleanValue()); });
        deserializerMap.put("airPrintBlocked", (n) -> { this.setAirPrintBlocked(n.getBooleanValue()); });
        deserializerMap.put("airPrintBlockiBeaconDiscovery", (n) -> { this.setAirPrintBlockiBeaconDiscovery(n.getBooleanValue()); });
        deserializerMap.put("airPrintForceTrustedTLS", (n) -> { this.setAirPrintForceTrustedTLS(n.getBooleanValue()); });
        deserializerMap.put("appClipsBlocked", (n) -> { this.setAppClipsBlocked(n.getBooleanValue()); });
        deserializerMap.put("appleNewsBlocked", (n) -> { this.setAppleNewsBlocked(n.getBooleanValue()); });
        deserializerMap.put("applePersonalizedAdsBlocked", (n) -> { this.setApplePersonalizedAdsBlocked(n.getBooleanValue()); });
        deserializerMap.put("appleWatchBlockPairing", (n) -> { this.setAppleWatchBlockPairing(n.getBooleanValue()); });
        deserializerMap.put("appleWatchForceWristDetection", (n) -> { this.setAppleWatchForceWristDetection(n.getBooleanValue()); });
        deserializerMap.put("appRemovalBlocked", (n) -> { this.setAppRemovalBlocked(n.getBooleanValue()); });
        deserializerMap.put("appsSingleAppModeList", (n) -> { this.setAppsSingleAppModeList(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("appStoreBlockAutomaticDownloads", (n) -> { this.setAppStoreBlockAutomaticDownloads(n.getBooleanValue()); });
        deserializerMap.put("appStoreBlocked", (n) -> { this.setAppStoreBlocked(n.getBooleanValue()); });
        deserializerMap.put("appStoreBlockInAppPurchases", (n) -> { this.setAppStoreBlockInAppPurchases(n.getBooleanValue()); });
        deserializerMap.put("appStoreBlockUIAppInstallation", (n) -> { this.setAppStoreBlockUIAppInstallation(n.getBooleanValue()); });
        deserializerMap.put("appStoreRequirePassword", (n) -> { this.setAppStoreRequirePassword(n.getBooleanValue()); });
        deserializerMap.put("appsVisibilityList", (n) -> { this.setAppsVisibilityList(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("appsVisibilityListType", (n) -> { this.setAppsVisibilityListType(n.getEnumValue(AppListType.class)); });
        deserializerMap.put("autoFillForceAuthentication", (n) -> { this.setAutoFillForceAuthentication(n.getBooleanValue()); });
        deserializerMap.put("autoUnlockBlocked", (n) -> { this.setAutoUnlockBlocked(n.getBooleanValue()); });
        deserializerMap.put("blockSystemAppRemoval", (n) -> { this.setBlockSystemAppRemoval(n.getBooleanValue()); });
        deserializerMap.put("bluetoothBlockModification", (n) -> { this.setBluetoothBlockModification(n.getBooleanValue()); });
        deserializerMap.put("cameraBlocked", (n) -> { this.setCameraBlocked(n.getBooleanValue()); });
        deserializerMap.put("cellularBlockDataRoaming", (n) -> { this.setCellularBlockDataRoaming(n.getBooleanValue()); });
        deserializerMap.put("cellularBlockGlobalBackgroundFetchWhileRoaming", (n) -> { this.setCellularBlockGlobalBackgroundFetchWhileRoaming(n.getBooleanValue()); });
        deserializerMap.put("cellularBlockPerAppDataModification", (n) -> { this.setCellularBlockPerAppDataModification(n.getBooleanValue()); });
        deserializerMap.put("cellularBlockPersonalHotspot", (n) -> { this.setCellularBlockPersonalHotspot(n.getBooleanValue()); });
        deserializerMap.put("cellularBlockPersonalHotspotModification", (n) -> { this.setCellularBlockPersonalHotspotModification(n.getBooleanValue()); });
        deserializerMap.put("cellularBlockPlanModification", (n) -> { this.setCellularBlockPlanModification(n.getBooleanValue()); });
        deserializerMap.put("cellularBlockVoiceRoaming", (n) -> { this.setCellularBlockVoiceRoaming(n.getBooleanValue()); });
        deserializerMap.put("certificatesBlockUntrustedTlsCertificates", (n) -> { this.setCertificatesBlockUntrustedTlsCertificates(n.getBooleanValue()); });
        deserializerMap.put("classroomAppBlockRemoteScreenObservation", (n) -> { this.setClassroomAppBlockRemoteScreenObservation(n.getBooleanValue()); });
        deserializerMap.put("classroomAppForceUnpromptedScreenObservation", (n) -> { this.setClassroomAppForceUnpromptedScreenObservation(n.getBooleanValue()); });
        deserializerMap.put("classroomForceAutomaticallyJoinClasses", (n) -> { this.setClassroomForceAutomaticallyJoinClasses(n.getBooleanValue()); });
        deserializerMap.put("classroomForceRequestPermissionToLeaveClasses", (n) -> { this.setClassroomForceRequestPermissionToLeaveClasses(n.getBooleanValue()); });
        deserializerMap.put("classroomForceUnpromptedAppAndDeviceLock", (n) -> { this.setClassroomForceUnpromptedAppAndDeviceLock(n.getBooleanValue()); });
        deserializerMap.put("compliantAppListType", (n) -> { this.setCompliantAppListType(n.getEnumValue(AppListType.class)); });
        deserializerMap.put("compliantAppsList", (n) -> { this.setCompliantAppsList(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("configurationProfileBlockChanges", (n) -> { this.setConfigurationProfileBlockChanges(n.getBooleanValue()); });
        deserializerMap.put("contactsAllowManagedToUnmanagedWrite", (n) -> { this.setContactsAllowManagedToUnmanagedWrite(n.getBooleanValue()); });
        deserializerMap.put("contactsAllowUnmanagedToManagedRead", (n) -> { this.setContactsAllowUnmanagedToManagedRead(n.getBooleanValue()); });
        deserializerMap.put("continuousPathKeyboardBlocked", (n) -> { this.setContinuousPathKeyboardBlocked(n.getBooleanValue()); });
        deserializerMap.put("dateAndTimeForceSetAutomatically", (n) -> { this.setDateAndTimeForceSetAutomatically(n.getBooleanValue()); });
        deserializerMap.put("definitionLookupBlocked", (n) -> { this.setDefinitionLookupBlocked(n.getBooleanValue()); });
        deserializerMap.put("deviceBlockEnableRestrictions", (n) -> { this.setDeviceBlockEnableRestrictions(n.getBooleanValue()); });
        deserializerMap.put("deviceBlockEraseContentAndSettings", (n) -> { this.setDeviceBlockEraseContentAndSettings(n.getBooleanValue()); });
        deserializerMap.put("deviceBlockNameModification", (n) -> { this.setDeviceBlockNameModification(n.getBooleanValue()); });
        deserializerMap.put("diagnosticDataBlockSubmission", (n) -> { this.setDiagnosticDataBlockSubmission(n.getBooleanValue()); });
        deserializerMap.put("diagnosticDataBlockSubmissionModification", (n) -> { this.setDiagnosticDataBlockSubmissionModification(n.getBooleanValue()); });
        deserializerMap.put("documentsBlockManagedDocumentsInUnmanagedApps", (n) -> { this.setDocumentsBlockManagedDocumentsInUnmanagedApps(n.getBooleanValue()); });
        deserializerMap.put("documentsBlockUnmanagedDocumentsInManagedApps", (n) -> { this.setDocumentsBlockUnmanagedDocumentsInManagedApps(n.getBooleanValue()); });
        deserializerMap.put("emailInDomainSuffixes", (n) -> { this.setEmailInDomainSuffixes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("enterpriseAppBlockTrust", (n) -> { this.setEnterpriseAppBlockTrust(n.getBooleanValue()); });
        deserializerMap.put("enterpriseAppBlockTrustModification", (n) -> { this.setEnterpriseAppBlockTrustModification(n.getBooleanValue()); });
        deserializerMap.put("enterpriseBookBlockBackup", (n) -> { this.setEnterpriseBookBlockBackup(n.getBooleanValue()); });
        deserializerMap.put("enterpriseBookBlockMetadataSync", (n) -> { this.setEnterpriseBookBlockMetadataSync(n.getBooleanValue()); });
        deserializerMap.put("esimBlockModification", (n) -> { this.setEsimBlockModification(n.getBooleanValue()); });
        deserializerMap.put("faceTimeBlocked", (n) -> { this.setFaceTimeBlocked(n.getBooleanValue()); });
        deserializerMap.put("filesNetworkDriveAccessBlocked", (n) -> { this.setFilesNetworkDriveAccessBlocked(n.getBooleanValue()); });
        deserializerMap.put("filesUsbDriveAccessBlocked", (n) -> { this.setFilesUsbDriveAccessBlocked(n.getBooleanValue()); });
        deserializerMap.put("findMyDeviceInFindMyAppBlocked", (n) -> { this.setFindMyDeviceInFindMyAppBlocked(n.getBooleanValue()); });
        deserializerMap.put("findMyFriendsBlocked", (n) -> { this.setFindMyFriendsBlocked(n.getBooleanValue()); });
        deserializerMap.put("findMyFriendsInFindMyAppBlocked", (n) -> { this.setFindMyFriendsInFindMyAppBlocked(n.getBooleanValue()); });
        deserializerMap.put("gameCenterBlocked", (n) -> { this.setGameCenterBlocked(n.getBooleanValue()); });
        deserializerMap.put("gamingBlockGameCenterFriends", (n) -> { this.setGamingBlockGameCenterFriends(n.getBooleanValue()); });
        deserializerMap.put("gamingBlockMultiplayer", (n) -> { this.setGamingBlockMultiplayer(n.getBooleanValue()); });
        deserializerMap.put("hostPairingBlocked", (n) -> { this.setHostPairingBlocked(n.getBooleanValue()); });
        deserializerMap.put("iBooksStoreBlocked", (n) -> { this.setIBooksStoreBlocked(n.getBooleanValue()); });
        deserializerMap.put("iBooksStoreBlockErotica", (n) -> { this.setIBooksStoreBlockErotica(n.getBooleanValue()); });
        deserializerMap.put("iCloudBlockActivityContinuation", (n) -> { this.setICloudBlockActivityContinuation(n.getBooleanValue()); });
        deserializerMap.put("iCloudBlockBackup", (n) -> { this.setICloudBlockBackup(n.getBooleanValue()); });
        deserializerMap.put("iCloudBlockDocumentSync", (n) -> { this.setICloudBlockDocumentSync(n.getBooleanValue()); });
        deserializerMap.put("iCloudBlockManagedAppsSync", (n) -> { this.setICloudBlockManagedAppsSync(n.getBooleanValue()); });
        deserializerMap.put("iCloudBlockPhotoLibrary", (n) -> { this.setICloudBlockPhotoLibrary(n.getBooleanValue()); });
        deserializerMap.put("iCloudBlockPhotoStreamSync", (n) -> { this.setICloudBlockPhotoStreamSync(n.getBooleanValue()); });
        deserializerMap.put("iCloudBlockSharedPhotoStream", (n) -> { this.setICloudBlockSharedPhotoStream(n.getBooleanValue()); });
        deserializerMap.put("iCloudPrivateRelayBlocked", (n) -> { this.setICloudPrivateRelayBlocked(n.getBooleanValue()); });
        deserializerMap.put("iCloudRequireEncryptedBackup", (n) -> { this.setICloudRequireEncryptedBackup(n.getBooleanValue()); });
        deserializerMap.put("iTunesBlocked", (n) -> { this.setITunesBlocked(n.getBooleanValue()); });
        deserializerMap.put("iTunesBlockExplicitContent", (n) -> { this.setITunesBlockExplicitContent(n.getBooleanValue()); });
        deserializerMap.put("iTunesBlockMusicService", (n) -> { this.setITunesBlockMusicService(n.getBooleanValue()); });
        deserializerMap.put("iTunesBlockRadio", (n) -> { this.setITunesBlockRadio(n.getBooleanValue()); });
        deserializerMap.put("keyboardBlockAutoCorrect", (n) -> { this.setKeyboardBlockAutoCorrect(n.getBooleanValue()); });
        deserializerMap.put("keyboardBlockDictation", (n) -> { this.setKeyboardBlockDictation(n.getBooleanValue()); });
        deserializerMap.put("keyboardBlockPredictive", (n) -> { this.setKeyboardBlockPredictive(n.getBooleanValue()); });
        deserializerMap.put("keyboardBlockShortcuts", (n) -> { this.setKeyboardBlockShortcuts(n.getBooleanValue()); });
        deserializerMap.put("keyboardBlockSpellCheck", (n) -> { this.setKeyboardBlockSpellCheck(n.getBooleanValue()); });
        deserializerMap.put("keychainBlockCloudSync", (n) -> { this.setKeychainBlockCloudSync(n.getBooleanValue()); });
        deserializerMap.put("kioskModeAllowAssistiveSpeak", (n) -> { this.setKioskModeAllowAssistiveSpeak(n.getBooleanValue()); });
        deserializerMap.put("kioskModeAllowAssistiveTouchSettings", (n) -> { this.setKioskModeAllowAssistiveTouchSettings(n.getBooleanValue()); });
        deserializerMap.put("kioskModeAllowAutoLock", (n) -> { this.setKioskModeAllowAutoLock(n.getBooleanValue()); });
        deserializerMap.put("kioskModeAllowColorInversionSettings", (n) -> { this.setKioskModeAllowColorInversionSettings(n.getBooleanValue()); });
        deserializerMap.put("kioskModeAllowRingerSwitch", (n) -> { this.setKioskModeAllowRingerSwitch(n.getBooleanValue()); });
        deserializerMap.put("kioskModeAllowScreenRotation", (n) -> { this.setKioskModeAllowScreenRotation(n.getBooleanValue()); });
        deserializerMap.put("kioskModeAllowSleepButton", (n) -> { this.setKioskModeAllowSleepButton(n.getBooleanValue()); });
        deserializerMap.put("kioskModeAllowTouchscreen", (n) -> { this.setKioskModeAllowTouchscreen(n.getBooleanValue()); });
        deserializerMap.put("kioskModeAllowVoiceControlModification", (n) -> { this.setKioskModeAllowVoiceControlModification(n.getBooleanValue()); });
        deserializerMap.put("kioskModeAllowVoiceOverSettings", (n) -> { this.setKioskModeAllowVoiceOverSettings(n.getBooleanValue()); });
        deserializerMap.put("kioskModeAllowVolumeButtons", (n) -> { this.setKioskModeAllowVolumeButtons(n.getBooleanValue()); });
        deserializerMap.put("kioskModeAllowZoomSettings", (n) -> { this.setKioskModeAllowZoomSettings(n.getBooleanValue()); });
        deserializerMap.put("kioskModeAppStoreUrl", (n) -> { this.setKioskModeAppStoreUrl(n.getStringValue()); });
        deserializerMap.put("kioskModeAppType", (n) -> { this.setKioskModeAppType(n.getEnumValue(IosKioskModeAppType.class)); });
        deserializerMap.put("kioskModeBlockAutoLock", (n) -> { this.setKioskModeBlockAutoLock(n.getBooleanValue()); });
        deserializerMap.put("kioskModeBlockRingerSwitch", (n) -> { this.setKioskModeBlockRingerSwitch(n.getBooleanValue()); });
        deserializerMap.put("kioskModeBlockScreenRotation", (n) -> { this.setKioskModeBlockScreenRotation(n.getBooleanValue()); });
        deserializerMap.put("kioskModeBlockSleepButton", (n) -> { this.setKioskModeBlockSleepButton(n.getBooleanValue()); });
        deserializerMap.put("kioskModeBlockTouchscreen", (n) -> { this.setKioskModeBlockTouchscreen(n.getBooleanValue()); });
        deserializerMap.put("kioskModeBlockVolumeButtons", (n) -> { this.setKioskModeBlockVolumeButtons(n.getBooleanValue()); });
        deserializerMap.put("kioskModeBuiltInAppId", (n) -> { this.setKioskModeBuiltInAppId(n.getStringValue()); });
        deserializerMap.put("kioskModeEnableVoiceControl", (n) -> { this.setKioskModeEnableVoiceControl(n.getBooleanValue()); });
        deserializerMap.put("kioskModeManagedAppId", (n) -> { this.setKioskModeManagedAppId(n.getStringValue()); });
        deserializerMap.put("kioskModeRequireAssistiveTouch", (n) -> { this.setKioskModeRequireAssistiveTouch(n.getBooleanValue()); });
        deserializerMap.put("kioskModeRequireColorInversion", (n) -> { this.setKioskModeRequireColorInversion(n.getBooleanValue()); });
        deserializerMap.put("kioskModeRequireMonoAudio", (n) -> { this.setKioskModeRequireMonoAudio(n.getBooleanValue()); });
        deserializerMap.put("kioskModeRequireVoiceOver", (n) -> { this.setKioskModeRequireVoiceOver(n.getBooleanValue()); });
        deserializerMap.put("kioskModeRequireZoom", (n) -> { this.setKioskModeRequireZoom(n.getBooleanValue()); });
        deserializerMap.put("lockScreenBlockControlCenter", (n) -> { this.setLockScreenBlockControlCenter(n.getBooleanValue()); });
        deserializerMap.put("lockScreenBlockNotificationView", (n) -> { this.setLockScreenBlockNotificationView(n.getBooleanValue()); });
        deserializerMap.put("lockScreenBlockPassbook", (n) -> { this.setLockScreenBlockPassbook(n.getBooleanValue()); });
        deserializerMap.put("lockScreenBlockTodayView", (n) -> { this.setLockScreenBlockTodayView(n.getBooleanValue()); });
        deserializerMap.put("managedPasteboardRequired", (n) -> { this.setManagedPasteboardRequired(n.getBooleanValue()); });
        deserializerMap.put("mediaContentRatingApps", (n) -> { this.setMediaContentRatingApps(n.getEnumValue(RatingAppsType.class)); });
        deserializerMap.put("mediaContentRatingAustralia", (n) -> { this.setMediaContentRatingAustralia(n.getObjectValue(MediaContentRatingAustralia::createFromDiscriminatorValue)); });
        deserializerMap.put("mediaContentRatingCanada", (n) -> { this.setMediaContentRatingCanada(n.getObjectValue(MediaContentRatingCanada::createFromDiscriminatorValue)); });
        deserializerMap.put("mediaContentRatingFrance", (n) -> { this.setMediaContentRatingFrance(n.getObjectValue(MediaContentRatingFrance::createFromDiscriminatorValue)); });
        deserializerMap.put("mediaContentRatingGermany", (n) -> { this.setMediaContentRatingGermany(n.getObjectValue(MediaContentRatingGermany::createFromDiscriminatorValue)); });
        deserializerMap.put("mediaContentRatingIreland", (n) -> { this.setMediaContentRatingIreland(n.getObjectValue(MediaContentRatingIreland::createFromDiscriminatorValue)); });
        deserializerMap.put("mediaContentRatingJapan", (n) -> { this.setMediaContentRatingJapan(n.getObjectValue(MediaContentRatingJapan::createFromDiscriminatorValue)); });
        deserializerMap.put("mediaContentRatingNewZealand", (n) -> { this.setMediaContentRatingNewZealand(n.getObjectValue(MediaContentRatingNewZealand::createFromDiscriminatorValue)); });
        deserializerMap.put("mediaContentRatingUnitedKingdom", (n) -> { this.setMediaContentRatingUnitedKingdom(n.getObjectValue(MediaContentRatingUnitedKingdom::createFromDiscriminatorValue)); });
        deserializerMap.put("mediaContentRatingUnitedStates", (n) -> { this.setMediaContentRatingUnitedStates(n.getObjectValue(MediaContentRatingUnitedStates::createFromDiscriminatorValue)); });
        deserializerMap.put("messagesBlocked", (n) -> { this.setMessagesBlocked(n.getBooleanValue()); });
        deserializerMap.put("networkUsageRules", (n) -> { this.setNetworkUsageRules(n.getCollectionOfObjectValues(IosNetworkUsageRule::createFromDiscriminatorValue)); });
        deserializerMap.put("nfcBlocked", (n) -> { this.setNfcBlocked(n.getBooleanValue()); });
        deserializerMap.put("notificationsBlockSettingsModification", (n) -> { this.setNotificationsBlockSettingsModification(n.getBooleanValue()); });
        deserializerMap.put("onDeviceOnlyDictationForced", (n) -> { this.setOnDeviceOnlyDictationForced(n.getBooleanValue()); });
        deserializerMap.put("onDeviceOnlyTranslationForced", (n) -> { this.setOnDeviceOnlyTranslationForced(n.getBooleanValue()); });
        deserializerMap.put("passcodeBlockFingerprintModification", (n) -> { this.setPasscodeBlockFingerprintModification(n.getBooleanValue()); });
        deserializerMap.put("passcodeBlockFingerprintUnlock", (n) -> { this.setPasscodeBlockFingerprintUnlock(n.getBooleanValue()); });
        deserializerMap.put("passcodeBlockModification", (n) -> { this.setPasscodeBlockModification(n.getBooleanValue()); });
        deserializerMap.put("passcodeBlockSimple", (n) -> { this.setPasscodeBlockSimple(n.getBooleanValue()); });
        deserializerMap.put("passcodeExpirationDays", (n) -> { this.setPasscodeExpirationDays(n.getIntegerValue()); });
        deserializerMap.put("passcodeMinimumCharacterSetCount", (n) -> { this.setPasscodeMinimumCharacterSetCount(n.getIntegerValue()); });
        deserializerMap.put("passcodeMinimumLength", (n) -> { this.setPasscodeMinimumLength(n.getIntegerValue()); });
        deserializerMap.put("passcodeMinutesOfInactivityBeforeLock", (n) -> { this.setPasscodeMinutesOfInactivityBeforeLock(n.getIntegerValue()); });
        deserializerMap.put("passcodeMinutesOfInactivityBeforeScreenTimeout", (n) -> { this.setPasscodeMinutesOfInactivityBeforeScreenTimeout(n.getIntegerValue()); });
        deserializerMap.put("passcodePreviousPasscodeBlockCount", (n) -> { this.setPasscodePreviousPasscodeBlockCount(n.getIntegerValue()); });
        deserializerMap.put("passcodeRequired", (n) -> { this.setPasscodeRequired(n.getBooleanValue()); });
        deserializerMap.put("passcodeRequiredType", (n) -> { this.setPasscodeRequiredType(n.getEnumValue(RequiredPasswordType.class)); });
        deserializerMap.put("passcodeSignInFailureCountBeforeWipe", (n) -> { this.setPasscodeSignInFailureCountBeforeWipe(n.getIntegerValue()); });
        deserializerMap.put("passwordBlockAirDropSharing", (n) -> { this.setPasswordBlockAirDropSharing(n.getBooleanValue()); });
        deserializerMap.put("passwordBlockAutoFill", (n) -> { this.setPasswordBlockAutoFill(n.getBooleanValue()); });
        deserializerMap.put("passwordBlockProximityRequests", (n) -> { this.setPasswordBlockProximityRequests(n.getBooleanValue()); });
        deserializerMap.put("pkiBlockOTAUpdates", (n) -> { this.setPkiBlockOTAUpdates(n.getBooleanValue()); });
        deserializerMap.put("podcastsBlocked", (n) -> { this.setPodcastsBlocked(n.getBooleanValue()); });
        deserializerMap.put("privacyForceLimitAdTracking", (n) -> { this.setPrivacyForceLimitAdTracking(n.getBooleanValue()); });
        deserializerMap.put("proximityBlockSetupToNewDevice", (n) -> { this.setProximityBlockSetupToNewDevice(n.getBooleanValue()); });
        deserializerMap.put("safariBlockAutofill", (n) -> { this.setSafariBlockAutofill(n.getBooleanValue()); });
        deserializerMap.put("safariBlocked", (n) -> { this.setSafariBlocked(n.getBooleanValue()); });
        deserializerMap.put("safariBlockJavaScript", (n) -> { this.setSafariBlockJavaScript(n.getBooleanValue()); });
        deserializerMap.put("safariBlockPopups", (n) -> { this.setSafariBlockPopups(n.getBooleanValue()); });
        deserializerMap.put("safariCookieSettings", (n) -> { this.setSafariCookieSettings(n.getEnumValue(WebBrowserCookieSettings.class)); });
        deserializerMap.put("safariManagedDomains", (n) -> { this.setSafariManagedDomains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("safariPasswordAutoFillDomains", (n) -> { this.setSafariPasswordAutoFillDomains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("safariRequireFraudWarning", (n) -> { this.setSafariRequireFraudWarning(n.getBooleanValue()); });
        deserializerMap.put("screenCaptureBlocked", (n) -> { this.setScreenCaptureBlocked(n.getBooleanValue()); });
        deserializerMap.put("sharedDeviceBlockTemporarySessions", (n) -> { this.setSharedDeviceBlockTemporarySessions(n.getBooleanValue()); });
        deserializerMap.put("siriBlocked", (n) -> { this.setSiriBlocked(n.getBooleanValue()); });
        deserializerMap.put("siriBlockedWhenLocked", (n) -> { this.setSiriBlockedWhenLocked(n.getBooleanValue()); });
        deserializerMap.put("siriBlockUserGeneratedContent", (n) -> { this.setSiriBlockUserGeneratedContent(n.getBooleanValue()); });
        deserializerMap.put("siriRequireProfanityFilter", (n) -> { this.setSiriRequireProfanityFilter(n.getBooleanValue()); });
        deserializerMap.put("softwareUpdatesEnforcedDelayInDays", (n) -> { this.setSoftwareUpdatesEnforcedDelayInDays(n.getIntegerValue()); });
        deserializerMap.put("softwareUpdatesForceDelayed", (n) -> { this.setSoftwareUpdatesForceDelayed(n.getBooleanValue()); });
        deserializerMap.put("spotlightBlockInternetResults", (n) -> { this.setSpotlightBlockInternetResults(n.getBooleanValue()); });
        deserializerMap.put("unpairedExternalBootToRecoveryAllowed", (n) -> { this.setUnpairedExternalBootToRecoveryAllowed(n.getBooleanValue()); });
        deserializerMap.put("usbRestrictedModeBlocked", (n) -> { this.setUsbRestrictedModeBlocked(n.getBooleanValue()); });
        deserializerMap.put("voiceDialingBlocked", (n) -> { this.setVoiceDialingBlocked(n.getBooleanValue()); });
        deserializerMap.put("vpnBlockCreation", (n) -> { this.setVpnBlockCreation(n.getBooleanValue()); });
        deserializerMap.put("wallpaperBlockModification", (n) -> { this.setWallpaperBlockModification(n.getBooleanValue()); });
        deserializerMap.put("wiFiConnectOnlyToConfiguredNetworks", (n) -> { this.setWiFiConnectOnlyToConfiguredNetworks(n.getBooleanValue()); });
        deserializerMap.put("wiFiConnectToAllowedNetworksOnlyForced", (n) -> { this.setWiFiConnectToAllowedNetworksOnlyForced(n.getBooleanValue()); });
        deserializerMap.put("wifiPowerOnForced", (n) -> { this.setWifiPowerOnForced(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the filesNetworkDriveAccessBlocked property value. Indicates if devices can access files or other resources on a network server using the Server Message Block (SMB) protocol. Available for devices running iOS and iPadOS, versions 13.0 and later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFilesNetworkDriveAccessBlocked() {
        return this.BackingStore.get("filesNetworkDriveAccessBlocked");
    }
    /**
     * Gets the filesUsbDriveAccessBlocked property value. Indicates if sevices with access can connect to and open files on a USB drive. Available for devices running iOS and iPadOS, versions 13.0 and later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFilesUsbDriveAccessBlocked() {
        return this.BackingStore.get("filesUsbDriveAccessBlocked");
    }
    /**
     * Gets the findMyDeviceInFindMyAppBlocked property value. Indicates whether or not to block Find My Device when the device is supervised (iOS 13 or later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFindMyDeviceInFindMyAppBlocked() {
        return this.BackingStore.get("findMyDeviceInFindMyAppBlocked");
    }
    /**
     * Gets the findMyFriendsBlocked property value. Indicates whether or not to block changes to Find My Friends when the device is in supervised mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFindMyFriendsBlocked() {
        return this.BackingStore.get("findMyFriendsBlocked");
    }
    /**
     * Gets the findMyFriendsInFindMyAppBlocked property value. Indicates whether or not to block Find My Friends when the device is supervised (iOS 13 or later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFindMyFriendsInFindMyAppBlocked() {
        return this.BackingStore.get("findMyFriendsInFindMyAppBlocked");
    }
    /**
     * Gets the gameCenterBlocked property value. Indicates whether or not to block the user from using Game Center when the device is in supervised mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getGameCenterBlocked() {
        return this.BackingStore.get("gameCenterBlocked");
    }
    /**
     * Gets the gamingBlockGameCenterFriends property value. Indicates whether or not to block the user from having friends in Game Center. Requires a supervised device for iOS 13 and later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getGamingBlockGameCenterFriends() {
        return this.BackingStore.get("gamingBlockGameCenterFriends");
    }
    /**
     * Gets the gamingBlockMultiplayer property value. Indicates whether or not to block the user from using multiplayer gaming. Requires a supervised device for iOS 13 and later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getGamingBlockMultiplayer() {
        return this.BackingStore.get("gamingBlockMultiplayer");
    }
    /**
     * Gets the hostPairingBlocked property value. indicates whether or not to allow host pairing to control the devices an iOS device can pair with when the iOS device is in supervised mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHostPairingBlocked() {
        return this.BackingStore.get("hostPairingBlocked");
    }
    /**
     * Gets the iBooksStoreBlocked property value. Indicates whether or not to block the user from using the iBooks Store when the device is in supervised mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIBooksStoreBlocked() {
        return this.BackingStore.get("iBooksStoreBlocked");
    }
    /**
     * Gets the iBooksStoreBlockErotica property value. Indicates whether or not to block the user from downloading media from the iBookstore that has been tagged as erotica.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIBooksStoreBlockErotica() {
        return this.BackingStore.get("iBooksStoreBlockErotica");
    }
    /**
     * Gets the iCloudBlockActivityContinuation property value. Indicates whether or not to block the user from continuing work they started on iOS device to another iOS or macOS device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudBlockActivityContinuation() {
        return this.BackingStore.get("iCloudBlockActivityContinuation");
    }
    /**
     * Gets the iCloudBlockBackup property value. Indicates whether or not to block iCloud backup. Requires a supervised device for iOS 13 and later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudBlockBackup() {
        return this.BackingStore.get("iCloudBlockBackup");
    }
    /**
     * Gets the iCloudBlockDocumentSync property value. Indicates whether or not to block iCloud document sync. Requires a supervised device for iOS 13 and later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudBlockDocumentSync() {
        return this.BackingStore.get("iCloudBlockDocumentSync");
    }
    /**
     * Gets the iCloudBlockManagedAppsSync property value. Indicates whether or not to block Managed Apps Cloud Sync.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudBlockManagedAppsSync() {
        return this.BackingStore.get("iCloudBlockManagedAppsSync");
    }
    /**
     * Gets the iCloudBlockPhotoLibrary property value. Indicates whether or not to block iCloud Photo Library.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudBlockPhotoLibrary() {
        return this.BackingStore.get("iCloudBlockPhotoLibrary");
    }
    /**
     * Gets the iCloudBlockPhotoStreamSync property value. Indicates whether or not to block iCloud Photo Stream Sync.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudBlockPhotoStreamSync() {
        return this.BackingStore.get("iCloudBlockPhotoStreamSync");
    }
    /**
     * Gets the iCloudBlockSharedPhotoStream property value. Indicates whether or not to block Shared Photo Stream.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudBlockSharedPhotoStream() {
        return this.BackingStore.get("iCloudBlockSharedPhotoStream");
    }
    /**
     * Gets the iCloudPrivateRelayBlocked property value. iCloud private relay is an iCloud+ service that prevents networks and servers from monitoring a person's activity across the internet. By blocking iCloud private relay, Apple will not encrypt the traffic leaving the device. Available for devices running iOS 15 and later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudPrivateRelayBlocked() {
        return this.BackingStore.get("iCloudPrivateRelayBlocked");
    }
    /**
     * Gets the iCloudRequireEncryptedBackup property value. Indicates whether or not to require backups to iCloud be encrypted.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getICloudRequireEncryptedBackup() {
        return this.BackingStore.get("iCloudRequireEncryptedBackup");
    }
    /**
     * Gets the iTunesBlocked property value. Indicates whether or not to block the iTunes app. Requires a supervised device for iOS 13 and later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getITunesBlocked() {
        return this.BackingStore.get("iTunesBlocked");
    }
    /**
     * Gets the iTunesBlockExplicitContent property value. Indicates whether or not to block the user from accessing explicit content in iTunes and the App Store. Requires a supervised device for iOS 13 and later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getITunesBlockExplicitContent() {
        return this.BackingStore.get("iTunesBlockExplicitContent");
    }
    /**
     * Gets the iTunesBlockMusicService property value. Indicates whether or not to block Music service and revert Music app to classic mode when the device is in supervised mode (iOS 9.3 and later and macOS 10.12 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getITunesBlockMusicService() {
        return this.BackingStore.get("iTunesBlockMusicService");
    }
    /**
     * Gets the iTunesBlockRadio property value. Indicates whether or not to block the user from using iTunes Radio when the device is in supervised mode (iOS 9.3 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getITunesBlockRadio() {
        return this.BackingStore.get("iTunesBlockRadio");
    }
    /**
     * Gets the keyboardBlockAutoCorrect property value. Indicates whether or not to block keyboard auto-correction when the device is in supervised mode (iOS 8.1.3 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKeyboardBlockAutoCorrect() {
        return this.BackingStore.get("keyboardBlockAutoCorrect");
    }
    /**
     * Gets the keyboardBlockDictation property value. Indicates whether or not to block the user from using dictation input when the device is in supervised mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKeyboardBlockDictation() {
        return this.BackingStore.get("keyboardBlockDictation");
    }
    /**
     * Gets the keyboardBlockPredictive property value. Indicates whether or not to block predictive keyboards when device is in supervised mode (iOS 8.1.3 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKeyboardBlockPredictive() {
        return this.BackingStore.get("keyboardBlockPredictive");
    }
    /**
     * Gets the keyboardBlockShortcuts property value. Indicates whether or not to block keyboard shortcuts when the device is in supervised mode (iOS 9.0 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKeyboardBlockShortcuts() {
        return this.BackingStore.get("keyboardBlockShortcuts");
    }
    /**
     * Gets the keyboardBlockSpellCheck property value. Indicates whether or not to block keyboard spell-checking when the device is in supervised mode (iOS 8.1.3 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKeyboardBlockSpellCheck() {
        return this.BackingStore.get("keyboardBlockSpellCheck");
    }
    /**
     * Gets the keychainBlockCloudSync property value. Indicates whether or not iCloud keychain synchronization is blocked. Requires a supervised device for iOS 13 and later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKeychainBlockCloudSync() {
        return this.BackingStore.get("keychainBlockCloudSync");
    }
    /**
     * Gets the kioskModeAllowAssistiveSpeak property value. Indicates whether or not to allow assistive speak while in kiosk mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeAllowAssistiveSpeak() {
        return this.BackingStore.get("kioskModeAllowAssistiveSpeak");
    }
    /**
     * Gets the kioskModeAllowAssistiveTouchSettings property value. Indicates whether or not to allow access to the Assistive Touch Settings while in kiosk mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeAllowAssistiveTouchSettings() {
        return this.BackingStore.get("kioskModeAllowAssistiveTouchSettings");
    }
    /**
     * Gets the kioskModeAllowAutoLock property value. Indicates whether or not to allow device auto lock while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockAutoLock instead.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeAllowAutoLock() {
        return this.BackingStore.get("kioskModeAllowAutoLock");
    }
    /**
     * Gets the kioskModeAllowColorInversionSettings property value. Indicates whether or not to allow access to the Color Inversion Settings while in kiosk mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeAllowColorInversionSettings() {
        return this.BackingStore.get("kioskModeAllowColorInversionSettings");
    }
    /**
     * Gets the kioskModeAllowRingerSwitch property value. Indicates whether or not to allow use of the ringer switch while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockRingerSwitch instead.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeAllowRingerSwitch() {
        return this.BackingStore.get("kioskModeAllowRingerSwitch");
    }
    /**
     * Gets the kioskModeAllowScreenRotation property value. Indicates whether or not to allow screen rotation while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockScreenRotation instead.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeAllowScreenRotation() {
        return this.BackingStore.get("kioskModeAllowScreenRotation");
    }
    /**
     * Gets the kioskModeAllowSleepButton property value. Indicates whether or not to allow use of the sleep button while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockSleepButton instead.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeAllowSleepButton() {
        return this.BackingStore.get("kioskModeAllowSleepButton");
    }
    /**
     * Gets the kioskModeAllowTouchscreen property value. Indicates whether or not to allow use of the touchscreen while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockTouchscreen instead.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeAllowTouchscreen() {
        return this.BackingStore.get("kioskModeAllowTouchscreen");
    }
    /**
     * Gets the kioskModeAllowVoiceControlModification property value. Indicates whether or not to allow the user to toggle voice control in kiosk mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeAllowVoiceControlModification() {
        return this.BackingStore.get("kioskModeAllowVoiceControlModification");
    }
    /**
     * Gets the kioskModeAllowVoiceOverSettings property value. Indicates whether or not to allow access to the voice over settings while in kiosk mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeAllowVoiceOverSettings() {
        return this.BackingStore.get("kioskModeAllowVoiceOverSettings");
    }
    /**
     * Gets the kioskModeAllowVolumeButtons property value. Indicates whether or not to allow use of the volume buttons while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockVolumeButtons instead.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeAllowVolumeButtons() {
        return this.BackingStore.get("kioskModeAllowVolumeButtons");
    }
    /**
     * Gets the kioskModeAllowZoomSettings property value. Indicates whether or not to allow access to the zoom settings while in kiosk mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeAllowZoomSettings() {
        return this.BackingStore.get("kioskModeAllowZoomSettings");
    }
    /**
     * Gets the kioskModeAppStoreUrl property value. URL in the app store to the app to use for kiosk mode. Use if KioskModeManagedAppId is not known.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getKioskModeAppStoreUrl() {
        return this.BackingStore.get("kioskModeAppStoreUrl");
    }
    /**
     * Gets the kioskModeAppType property value. App source options for iOS kiosk mode.
     * @return a IosKioskModeAppType
     */
    @jakarta.annotation.Nullable
    public IosKioskModeAppType getKioskModeAppType() {
        return this.BackingStore.get("kioskModeAppType");
    }
    /**
     * Gets the kioskModeBlockAutoLock property value. Indicates whether or not to block device auto lock while in kiosk mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeBlockAutoLock() {
        return this.BackingStore.get("kioskModeBlockAutoLock");
    }
    /**
     * Gets the kioskModeBlockRingerSwitch property value. Indicates whether or not to block use of the ringer switch while in kiosk mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeBlockRingerSwitch() {
        return this.BackingStore.get("kioskModeBlockRingerSwitch");
    }
    /**
     * Gets the kioskModeBlockScreenRotation property value. Indicates whether or not to block screen rotation while in kiosk mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeBlockScreenRotation() {
        return this.BackingStore.get("kioskModeBlockScreenRotation");
    }
    /**
     * Gets the kioskModeBlockSleepButton property value. Indicates whether or not to block use of the sleep button while in kiosk mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeBlockSleepButton() {
        return this.BackingStore.get("kioskModeBlockSleepButton");
    }
    /**
     * Gets the kioskModeBlockTouchscreen property value. Indicates whether or not to block use of the touchscreen while in kiosk mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeBlockTouchscreen() {
        return this.BackingStore.get("kioskModeBlockTouchscreen");
    }
    /**
     * Gets the kioskModeBlockVolumeButtons property value. Indicates whether or not to block the volume buttons while in Kiosk Mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeBlockVolumeButtons() {
        return this.BackingStore.get("kioskModeBlockVolumeButtons");
    }
    /**
     * Gets the kioskModeBuiltInAppId property value. ID for built-in apps to use for kiosk mode. Used when KioskModeManagedAppId and KioskModeAppStoreUrl are not set.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getKioskModeBuiltInAppId() {
        return this.BackingStore.get("kioskModeBuiltInAppId");
    }
    /**
     * Gets the kioskModeEnableVoiceControl property value. Indicates whether or not to enable voice control in kiosk mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeEnableVoiceControl() {
        return this.BackingStore.get("kioskModeEnableVoiceControl");
    }
    /**
     * Gets the kioskModeManagedAppId property value. Managed app id of the app to use for kiosk mode. If KioskModeManagedAppId is specified then KioskModeAppStoreUrl will be ignored.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getKioskModeManagedAppId() {
        return this.BackingStore.get("kioskModeManagedAppId");
    }
    /**
     * Gets the kioskModeRequireAssistiveTouch property value. Indicates whether or not to require assistive touch while in kiosk mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeRequireAssistiveTouch() {
        return this.BackingStore.get("kioskModeRequireAssistiveTouch");
    }
    /**
     * Gets the kioskModeRequireColorInversion property value. Indicates whether or not to require color inversion while in kiosk mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeRequireColorInversion() {
        return this.BackingStore.get("kioskModeRequireColorInversion");
    }
    /**
     * Gets the kioskModeRequireMonoAudio property value. Indicates whether or not to require mono audio while in kiosk mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeRequireMonoAudio() {
        return this.BackingStore.get("kioskModeRequireMonoAudio");
    }
    /**
     * Gets the kioskModeRequireVoiceOver property value. Indicates whether or not to require voice over while in kiosk mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeRequireVoiceOver() {
        return this.BackingStore.get("kioskModeRequireVoiceOver");
    }
    /**
     * Gets the kioskModeRequireZoom property value. Indicates whether or not to require zoom while in kiosk mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeRequireZoom() {
        return this.BackingStore.get("kioskModeRequireZoom");
    }
    /**
     * Gets the lockScreenBlockControlCenter property value. Indicates whether or not to block the user from using control center on the lock screen.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLockScreenBlockControlCenter() {
        return this.BackingStore.get("lockScreenBlockControlCenter");
    }
    /**
     * Gets the lockScreenBlockNotificationView property value. Indicates whether or not to block the user from using the notification view on the lock screen.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLockScreenBlockNotificationView() {
        return this.BackingStore.get("lockScreenBlockNotificationView");
    }
    /**
     * Gets the lockScreenBlockPassbook property value. Indicates whether or not to block the user from using passbook when the device is locked.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLockScreenBlockPassbook() {
        return this.BackingStore.get("lockScreenBlockPassbook");
    }
    /**
     * Gets the lockScreenBlockTodayView property value. Indicates whether or not to block the user from using the Today View on the lock screen.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLockScreenBlockTodayView() {
        return this.BackingStore.get("lockScreenBlockTodayView");
    }
    /**
     * Gets the managedPasteboardRequired property value. Open-in management controls how people share data between unmanaged and managed apps. Setting this to true enforces copy/paste restrictions based on how you configured Block viewing corporate documents in unmanaged apps  and  Block viewing non-corporate documents in corporate apps.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getManagedPasteboardRequired() {
        return this.BackingStore.get("managedPasteboardRequired");
    }
    /**
     * Gets the mediaContentRatingApps property value. Apps rating as in media content
     * @return a RatingAppsType
     */
    @jakarta.annotation.Nullable
    public RatingAppsType getMediaContentRatingApps() {
        return this.BackingStore.get("mediaContentRatingApps");
    }
    /**
     * Gets the mediaContentRatingAustralia property value. Media content rating settings for Australia
     * @return a MediaContentRatingAustralia
     */
    @jakarta.annotation.Nullable
    public MediaContentRatingAustralia getMediaContentRatingAustralia() {
        return this.BackingStore.get("mediaContentRatingAustralia");
    }
    /**
     * Gets the mediaContentRatingCanada property value. Media content rating settings for Canada
     * @return a MediaContentRatingCanada
     */
    @jakarta.annotation.Nullable
    public MediaContentRatingCanada getMediaContentRatingCanada() {
        return this.BackingStore.get("mediaContentRatingCanada");
    }
    /**
     * Gets the mediaContentRatingFrance property value. Media content rating settings for France
     * @return a MediaContentRatingFrance
     */
    @jakarta.annotation.Nullable
    public MediaContentRatingFrance getMediaContentRatingFrance() {
        return this.BackingStore.get("mediaContentRatingFrance");
    }
    /**
     * Gets the mediaContentRatingGermany property value. Media content rating settings for Germany
     * @return a MediaContentRatingGermany
     */
    @jakarta.annotation.Nullable
    public MediaContentRatingGermany getMediaContentRatingGermany() {
        return this.BackingStore.get("mediaContentRatingGermany");
    }
    /**
     * Gets the mediaContentRatingIreland property value. Media content rating settings for Ireland
     * @return a MediaContentRatingIreland
     */
    @jakarta.annotation.Nullable
    public MediaContentRatingIreland getMediaContentRatingIreland() {
        return this.BackingStore.get("mediaContentRatingIreland");
    }
    /**
     * Gets the mediaContentRatingJapan property value. Media content rating settings for Japan
     * @return a MediaContentRatingJapan
     */
    @jakarta.annotation.Nullable
    public MediaContentRatingJapan getMediaContentRatingJapan() {
        return this.BackingStore.get("mediaContentRatingJapan");
    }
    /**
     * Gets the mediaContentRatingNewZealand property value. Media content rating settings for New Zealand
     * @return a MediaContentRatingNewZealand
     */
    @jakarta.annotation.Nullable
    public MediaContentRatingNewZealand getMediaContentRatingNewZealand() {
        return this.BackingStore.get("mediaContentRatingNewZealand");
    }
    /**
     * Gets the mediaContentRatingUnitedKingdom property value. Media content rating settings for United Kingdom
     * @return a MediaContentRatingUnitedKingdom
     */
    @jakarta.annotation.Nullable
    public MediaContentRatingUnitedKingdom getMediaContentRatingUnitedKingdom() {
        return this.BackingStore.get("mediaContentRatingUnitedKingdom");
    }
    /**
     * Gets the mediaContentRatingUnitedStates property value. Media content rating settings for United States
     * @return a MediaContentRatingUnitedStates
     */
    @jakarta.annotation.Nullable
    public MediaContentRatingUnitedStates getMediaContentRatingUnitedStates() {
        return this.BackingStore.get("mediaContentRatingUnitedStates");
    }
    /**
     * Gets the messagesBlocked property value. Indicates whether or not to block the user from using the Messages app on the supervised device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getMessagesBlocked() {
        return this.BackingStore.get("messagesBlocked");
    }
    /**
     * Gets the networkUsageRules property value. List of managed apps and the network rules that applies to them. This collection can contain a maximum of 1000 elements.
     * @return a java.util.List<IosNetworkUsageRule>
     */
    @jakarta.annotation.Nullable
    public java.util.List<IosNetworkUsageRule> getNetworkUsageRules() {
        return this.BackingStore.get("networkUsageRules");
    }
    /**
     * Gets the nfcBlocked property value. Disable NFC to prevent devices from pairing with other NFC-enabled devices. Available for iOS/iPadOS devices running 14.2 and later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getNfcBlocked() {
        return this.BackingStore.get("nfcBlocked");
    }
    /**
     * Gets the notificationsBlockSettingsModification property value. Indicates whether or not to allow notifications settings modification (iOS 9.3 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getNotificationsBlockSettingsModification() {
        return this.BackingStore.get("notificationsBlockSettingsModification");
    }
    /**
     * Gets the onDeviceOnlyDictationForced property value. Disables connections to Siri servers so that users cant use Siri to dictate text. Available for devices running iOS and iPadOS versions 14.5 and later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getOnDeviceOnlyDictationForced() {
        return this.BackingStore.get("onDeviceOnlyDictationForced");
    }
    /**
     * Gets the onDeviceOnlyTranslationForced property value. When set to TRUE, the setting disables connections to Siri servers so that users cant use Siri to translate text. When set to FALSE, the setting allows connections to to Siri servers to users can use Siri to translate text. Available for devices running iOS and iPadOS versions 15.0 and later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getOnDeviceOnlyTranslationForced() {
        return this.BackingStore.get("onDeviceOnlyTranslationForced");
    }
    /**
     * Gets the passcodeBlockFingerprintModification property value. Block modification of registered Touch ID fingerprints when in supervised mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasscodeBlockFingerprintModification() {
        return this.BackingStore.get("passcodeBlockFingerprintModification");
    }
    /**
     * Gets the passcodeBlockFingerprintUnlock property value. Indicates whether or not to block fingerprint unlock.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasscodeBlockFingerprintUnlock() {
        return this.BackingStore.get("passcodeBlockFingerprintUnlock");
    }
    /**
     * Gets the passcodeBlockModification property value. Indicates whether or not to allow passcode modification on the supervised device (iOS 9.0 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasscodeBlockModification() {
        return this.BackingStore.get("passcodeBlockModification");
    }
    /**
     * Gets the passcodeBlockSimple property value. Indicates whether or not to block simple passcodes.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasscodeBlockSimple() {
        return this.BackingStore.get("passcodeBlockSimple");
    }
    /**
     * Gets the passcodeExpirationDays property value. Number of days before the passcode expires. Valid values 1 to 65535
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasscodeExpirationDays() {
        return this.BackingStore.get("passcodeExpirationDays");
    }
    /**
     * Gets the passcodeMinimumCharacterSetCount property value. Number of character sets a passcode must contain. Valid values 0 to 4
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasscodeMinimumCharacterSetCount() {
        return this.BackingStore.get("passcodeMinimumCharacterSetCount");
    }
    /**
     * Gets the passcodeMinimumLength property value. Minimum length of passcode. Valid values 4 to 14
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasscodeMinimumLength() {
        return this.BackingStore.get("passcodeMinimumLength");
    }
    /**
     * Gets the passcodeMinutesOfInactivityBeforeLock property value. Minutes of inactivity before a passcode is required.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasscodeMinutesOfInactivityBeforeLock() {
        return this.BackingStore.get("passcodeMinutesOfInactivityBeforeLock");
    }
    /**
     * Gets the passcodeMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity before the screen times out.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasscodeMinutesOfInactivityBeforeScreenTimeout() {
        return this.BackingStore.get("passcodeMinutesOfInactivityBeforeScreenTimeout");
    }
    /**
     * Gets the passcodePreviousPasscodeBlockCount property value. Number of previous passcodes to block. Valid values 1 to 24
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasscodePreviousPasscodeBlockCount() {
        return this.BackingStore.get("passcodePreviousPasscodeBlockCount");
    }
    /**
     * Gets the passcodeRequired property value. Indicates whether or not to require a passcode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasscodeRequired() {
        return this.BackingStore.get("passcodeRequired");
    }
    /**
     * Gets the passcodeRequiredType property value. Possible values of required passwords.
     * @return a RequiredPasswordType
     */
    @jakarta.annotation.Nullable
    public RequiredPasswordType getPasscodeRequiredType() {
        return this.BackingStore.get("passcodeRequiredType");
    }
    /**
     * Gets the passcodeSignInFailureCountBeforeWipe property value. Number of sign in failures allowed before wiping the device. Valid values 2 to 11
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasscodeSignInFailureCountBeforeWipe() {
        return this.BackingStore.get("passcodeSignInFailureCountBeforeWipe");
    }
    /**
     * Gets the passwordBlockAirDropSharing property value. Indicates whether or not to block sharing passwords with the AirDrop passwords feature iOS 12.0 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordBlockAirDropSharing() {
        return this.BackingStore.get("passwordBlockAirDropSharing");
    }
    /**
     * Gets the passwordBlockAutoFill property value. Indicates if the AutoFill passwords feature is allowed (iOS 12.0 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordBlockAutoFill() {
        return this.BackingStore.get("passwordBlockAutoFill");
    }
    /**
     * Gets the passwordBlockProximityRequests property value. Indicates whether or not to block requesting passwords from nearby devices (iOS 12.0 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordBlockProximityRequests() {
        return this.BackingStore.get("passwordBlockProximityRequests");
    }
    /**
     * Gets the pkiBlockOTAUpdates property value. Indicates whether or not over-the-air PKI updates are blocked. Setting this restriction to false does not disable CRL and OCSP checks (iOS 7.0 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPkiBlockOTAUpdates() {
        return this.BackingStore.get("pkiBlockOTAUpdates");
    }
    /**
     * Gets the podcastsBlocked property value. Indicates whether or not to block the user from using podcasts on the supervised device (iOS 8.0 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPodcastsBlocked() {
        return this.BackingStore.get("podcastsBlocked");
    }
    /**
     * Gets the privacyForceLimitAdTracking property value. Indicates if ad tracking is limited.(iOS 7.0 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPrivacyForceLimitAdTracking() {
        return this.BackingStore.get("privacyForceLimitAdTracking");
    }
    /**
     * Gets the proximityBlockSetupToNewDevice property value. Indicates whether or not to enable the prompt to setup nearby devices with a supervised device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getProximityBlockSetupToNewDevice() {
        return this.BackingStore.get("proximityBlockSetupToNewDevice");
    }
    /**
     * Gets the safariBlockAutofill property value. Indicates whether or not to block the user from using Auto fill in Safari. Requires a supervised device for iOS 13 and later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSafariBlockAutofill() {
        return this.BackingStore.get("safariBlockAutofill");
    }
    /**
     * Gets the safariBlocked property value. Indicates whether or not to block the user from using Safari. Requires a supervised device for iOS 13 and later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSafariBlocked() {
        return this.BackingStore.get("safariBlocked");
    }
    /**
     * Gets the safariBlockJavaScript property value. Indicates whether or not to block JavaScript in Safari.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSafariBlockJavaScript() {
        return this.BackingStore.get("safariBlockJavaScript");
    }
    /**
     * Gets the safariBlockPopups property value. Indicates whether or not to block popups in Safari.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSafariBlockPopups() {
        return this.BackingStore.get("safariBlockPopups");
    }
    /**
     * Gets the safariCookieSettings property value. Web Browser Cookie Settings.
     * @return a WebBrowserCookieSettings
     */
    @jakarta.annotation.Nullable
    public WebBrowserCookieSettings getSafariCookieSettings() {
        return this.BackingStore.get("safariCookieSettings");
    }
    /**
     * Gets the safariManagedDomains property value. URLs matching the patterns listed here will be considered managed.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSafariManagedDomains() {
        return this.BackingStore.get("safariManagedDomains");
    }
    /**
     * Gets the safariPasswordAutoFillDomains property value. Users can save passwords in Safari only from URLs matching the patterns listed here. Applies to devices in supervised mode (iOS 9.3 and later).
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSafariPasswordAutoFillDomains() {
        return this.BackingStore.get("safariPasswordAutoFillDomains");
    }
    /**
     * Gets the safariRequireFraudWarning property value. Indicates whether or not to require fraud warning in Safari.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSafariRequireFraudWarning() {
        return this.BackingStore.get("safariRequireFraudWarning");
    }
    /**
     * Gets the screenCaptureBlocked property value. Indicates whether or not to block the user from taking Screenshots.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getScreenCaptureBlocked() {
        return this.BackingStore.get("screenCaptureBlocked");
    }
    /**
     * Gets the sharedDeviceBlockTemporarySessions property value. Indicates whether or not to block temporary sessions on Shared iPads (iOS 13.4 or later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSharedDeviceBlockTemporarySessions() {
        return this.BackingStore.get("sharedDeviceBlockTemporarySessions");
    }
    /**
     * Gets the siriBlocked property value. Indicates whether or not to block the user from using Siri.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSiriBlocked() {
        return this.BackingStore.get("siriBlocked");
    }
    /**
     * Gets the siriBlockedWhenLocked property value. Indicates whether or not to block the user from using Siri when locked.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSiriBlockedWhenLocked() {
        return this.BackingStore.get("siriBlockedWhenLocked");
    }
    /**
     * Gets the siriBlockUserGeneratedContent property value. Indicates whether or not to block Siri from querying user-generated content when used on a supervised device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSiriBlockUserGeneratedContent() {
        return this.BackingStore.get("siriBlockUserGeneratedContent");
    }
    /**
     * Gets the siriRequireProfanityFilter property value. Indicates whether or not to prevent Siri from dictating, or speaking profane language on supervised device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSiriRequireProfanityFilter() {
        return this.BackingStore.get("siriRequireProfanityFilter");
    }
    /**
     * Gets the softwareUpdatesEnforcedDelayInDays property value. Sets how many days a software update will be delyed for a supervised device. Valid values 0 to 90
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSoftwareUpdatesEnforcedDelayInDays() {
        return this.BackingStore.get("softwareUpdatesEnforcedDelayInDays");
    }
    /**
     * Gets the softwareUpdatesForceDelayed property value. Indicates whether or not to delay user visibility of software updates when the device is in supervised mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSoftwareUpdatesForceDelayed() {
        return this.BackingStore.get("softwareUpdatesForceDelayed");
    }
    /**
     * Gets the spotlightBlockInternetResults property value. Indicates whether or not to block Spotlight search from returning internet results on supervised device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSpotlightBlockInternetResults() {
        return this.BackingStore.get("spotlightBlockInternetResults");
    }
    /**
     * Gets the unpairedExternalBootToRecoveryAllowed property value. Allow users to boot devices into recovery mode with unpaired devices. Available for devices running iOS and iPadOS versions 14.5 and later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUnpairedExternalBootToRecoveryAllowed() {
        return this.BackingStore.get("unpairedExternalBootToRecoveryAllowed");
    }
    /**
     * Gets the usbRestrictedModeBlocked property value. Indicates if connecting to USB accessories while the device is locked is allowed (iOS 11.4.1 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUsbRestrictedModeBlocked() {
        return this.BackingStore.get("usbRestrictedModeBlocked");
    }
    /**
     * Gets the voiceDialingBlocked property value. Indicates whether or not to block voice dialing.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getVoiceDialingBlocked() {
        return this.BackingStore.get("voiceDialingBlocked");
    }
    /**
     * Gets the vpnBlockCreation property value. Indicates whether or not the creation of VPN configurations is blocked (iOS 11.0 and later).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getVpnBlockCreation() {
        return this.BackingStore.get("vpnBlockCreation");
    }
    /**
     * Gets the wallpaperBlockModification property value. Indicates whether or not to allow wallpaper modification on supervised device (iOS 9.0 and later) .
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWallpaperBlockModification() {
        return this.BackingStore.get("wallpaperBlockModification");
    }
    /**
     * Gets the wiFiConnectOnlyToConfiguredNetworks property value. Indicates whether or not to force the device to use only Wi-Fi networks from configuration profiles when the device is in supervised mode. Available for devices running iOS and iPadOS versions 14.4 and earlier. Devices running 14.5+ should use the setting, 'WiFiConnectToAllowedNetworksOnlyForced.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWiFiConnectOnlyToConfiguredNetworks() {
        return this.BackingStore.get("wiFiConnectOnlyToConfiguredNetworks");
    }
    /**
     * Gets the wiFiConnectToAllowedNetworksOnlyForced property value. Require devices to use Wi-Fi networks set up via configuration profiles. Available for devices running iOS and iPadOS versions 14.5 and later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWiFiConnectToAllowedNetworksOnlyForced() {
        return this.BackingStore.get("wiFiConnectToAllowedNetworksOnlyForced");
    }
    /**
     * Gets the wifiPowerOnForced property value. Indicates whether or not Wi-Fi remains on, even when device is in airplane mode. Available for devices running iOS and iPadOS, versions 13.0 and later.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWifiPowerOnForced() {
        return this.BackingStore.get("wifiPowerOnForced");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("accountBlockModification", this.getAccountBlockModification());
        writer.writeBooleanValue("activationLockAllowWhenSupervised", this.getActivationLockAllowWhenSupervised());
        writer.writeBooleanValue("airDropBlocked", this.getAirDropBlocked());
        writer.writeBooleanValue("airDropForceUnmanagedDropTarget", this.getAirDropForceUnmanagedDropTarget());
        writer.writeBooleanValue("airPlayForcePairingPasswordForOutgoingRequests", this.getAirPlayForcePairingPasswordForOutgoingRequests());
        writer.writeBooleanValue("airPrintBlockCredentialsStorage", this.getAirPrintBlockCredentialsStorage());
        writer.writeBooleanValue("airPrintBlocked", this.getAirPrintBlocked());
        writer.writeBooleanValue("airPrintBlockiBeaconDiscovery", this.getAirPrintBlockiBeaconDiscovery());
        writer.writeBooleanValue("airPrintForceTrustedTLS", this.getAirPrintForceTrustedTLS());
        writer.writeBooleanValue("appClipsBlocked", this.getAppClipsBlocked());
        writer.writeBooleanValue("appleNewsBlocked", this.getAppleNewsBlocked());
        writer.writeBooleanValue("applePersonalizedAdsBlocked", this.getApplePersonalizedAdsBlocked());
        writer.writeBooleanValue("appleWatchBlockPairing", this.getAppleWatchBlockPairing());
        writer.writeBooleanValue("appleWatchForceWristDetection", this.getAppleWatchForceWristDetection());
        writer.writeBooleanValue("appRemovalBlocked", this.getAppRemovalBlocked());
        writer.writeCollectionOfObjectValues("appsSingleAppModeList", this.getAppsSingleAppModeList());
        writer.writeBooleanValue("appStoreBlockAutomaticDownloads", this.getAppStoreBlockAutomaticDownloads());
        writer.writeBooleanValue("appStoreBlocked", this.getAppStoreBlocked());
        writer.writeBooleanValue("appStoreBlockInAppPurchases", this.getAppStoreBlockInAppPurchases());
        writer.writeBooleanValue("appStoreBlockUIAppInstallation", this.getAppStoreBlockUIAppInstallation());
        writer.writeBooleanValue("appStoreRequirePassword", this.getAppStoreRequirePassword());
        writer.writeCollectionOfObjectValues("appsVisibilityList", this.getAppsVisibilityList());
        writer.writeEnumValue("appsVisibilityListType", this.getAppsVisibilityListType());
        writer.writeBooleanValue("autoFillForceAuthentication", this.getAutoFillForceAuthentication());
        writer.writeBooleanValue("autoUnlockBlocked", this.getAutoUnlockBlocked());
        writer.writeBooleanValue("blockSystemAppRemoval", this.getBlockSystemAppRemoval());
        writer.writeBooleanValue("bluetoothBlockModification", this.getBluetoothBlockModification());
        writer.writeBooleanValue("cameraBlocked", this.getCameraBlocked());
        writer.writeBooleanValue("cellularBlockDataRoaming", this.getCellularBlockDataRoaming());
        writer.writeBooleanValue("cellularBlockGlobalBackgroundFetchWhileRoaming", this.getCellularBlockGlobalBackgroundFetchWhileRoaming());
        writer.writeBooleanValue("cellularBlockPerAppDataModification", this.getCellularBlockPerAppDataModification());
        writer.writeBooleanValue("cellularBlockPersonalHotspot", this.getCellularBlockPersonalHotspot());
        writer.writeBooleanValue("cellularBlockPersonalHotspotModification", this.getCellularBlockPersonalHotspotModification());
        writer.writeBooleanValue("cellularBlockPlanModification", this.getCellularBlockPlanModification());
        writer.writeBooleanValue("cellularBlockVoiceRoaming", this.getCellularBlockVoiceRoaming());
        writer.writeBooleanValue("certificatesBlockUntrustedTlsCertificates", this.getCertificatesBlockUntrustedTlsCertificates());
        writer.writeBooleanValue("classroomAppBlockRemoteScreenObservation", this.getClassroomAppBlockRemoteScreenObservation());
        writer.writeBooleanValue("classroomAppForceUnpromptedScreenObservation", this.getClassroomAppForceUnpromptedScreenObservation());
        writer.writeBooleanValue("classroomForceAutomaticallyJoinClasses", this.getClassroomForceAutomaticallyJoinClasses());
        writer.writeBooleanValue("classroomForceRequestPermissionToLeaveClasses", this.getClassroomForceRequestPermissionToLeaveClasses());
        writer.writeBooleanValue("classroomForceUnpromptedAppAndDeviceLock", this.getClassroomForceUnpromptedAppAndDeviceLock());
        writer.writeEnumValue("compliantAppListType", this.getCompliantAppListType());
        writer.writeCollectionOfObjectValues("compliantAppsList", this.getCompliantAppsList());
        writer.writeBooleanValue("configurationProfileBlockChanges", this.getConfigurationProfileBlockChanges());
        writer.writeBooleanValue("contactsAllowManagedToUnmanagedWrite", this.getContactsAllowManagedToUnmanagedWrite());
        writer.writeBooleanValue("contactsAllowUnmanagedToManagedRead", this.getContactsAllowUnmanagedToManagedRead());
        writer.writeBooleanValue("continuousPathKeyboardBlocked", this.getContinuousPathKeyboardBlocked());
        writer.writeBooleanValue("dateAndTimeForceSetAutomatically", this.getDateAndTimeForceSetAutomatically());
        writer.writeBooleanValue("definitionLookupBlocked", this.getDefinitionLookupBlocked());
        writer.writeBooleanValue("deviceBlockEnableRestrictions", this.getDeviceBlockEnableRestrictions());
        writer.writeBooleanValue("deviceBlockEraseContentAndSettings", this.getDeviceBlockEraseContentAndSettings());
        writer.writeBooleanValue("deviceBlockNameModification", this.getDeviceBlockNameModification());
        writer.writeBooleanValue("diagnosticDataBlockSubmission", this.getDiagnosticDataBlockSubmission());
        writer.writeBooleanValue("diagnosticDataBlockSubmissionModification", this.getDiagnosticDataBlockSubmissionModification());
        writer.writeBooleanValue("documentsBlockManagedDocumentsInUnmanagedApps", this.getDocumentsBlockManagedDocumentsInUnmanagedApps());
        writer.writeBooleanValue("documentsBlockUnmanagedDocumentsInManagedApps", this.getDocumentsBlockUnmanagedDocumentsInManagedApps());
        writer.writeCollectionOfPrimitiveValues("emailInDomainSuffixes", this.getEmailInDomainSuffixes());
        writer.writeBooleanValue("enterpriseAppBlockTrust", this.getEnterpriseAppBlockTrust());
        writer.writeBooleanValue("enterpriseAppBlockTrustModification", this.getEnterpriseAppBlockTrustModification());
        writer.writeBooleanValue("enterpriseBookBlockBackup", this.getEnterpriseBookBlockBackup());
        writer.writeBooleanValue("enterpriseBookBlockMetadataSync", this.getEnterpriseBookBlockMetadataSync());
        writer.writeBooleanValue("esimBlockModification", this.getEsimBlockModification());
        writer.writeBooleanValue("faceTimeBlocked", this.getFaceTimeBlocked());
        writer.writeBooleanValue("filesNetworkDriveAccessBlocked", this.getFilesNetworkDriveAccessBlocked());
        writer.writeBooleanValue("filesUsbDriveAccessBlocked", this.getFilesUsbDriveAccessBlocked());
        writer.writeBooleanValue("findMyDeviceInFindMyAppBlocked", this.getFindMyDeviceInFindMyAppBlocked());
        writer.writeBooleanValue("findMyFriendsBlocked", this.getFindMyFriendsBlocked());
        writer.writeBooleanValue("findMyFriendsInFindMyAppBlocked", this.getFindMyFriendsInFindMyAppBlocked());
        writer.writeBooleanValue("gameCenterBlocked", this.getGameCenterBlocked());
        writer.writeBooleanValue("gamingBlockGameCenterFriends", this.getGamingBlockGameCenterFriends());
        writer.writeBooleanValue("gamingBlockMultiplayer", this.getGamingBlockMultiplayer());
        writer.writeBooleanValue("hostPairingBlocked", this.getHostPairingBlocked());
        writer.writeBooleanValue("iBooksStoreBlocked", this.getIBooksStoreBlocked());
        writer.writeBooleanValue("iBooksStoreBlockErotica", this.getIBooksStoreBlockErotica());
        writer.writeBooleanValue("iCloudBlockActivityContinuation", this.getICloudBlockActivityContinuation());
        writer.writeBooleanValue("iCloudBlockBackup", this.getICloudBlockBackup());
        writer.writeBooleanValue("iCloudBlockDocumentSync", this.getICloudBlockDocumentSync());
        writer.writeBooleanValue("iCloudBlockManagedAppsSync", this.getICloudBlockManagedAppsSync());
        writer.writeBooleanValue("iCloudBlockPhotoLibrary", this.getICloudBlockPhotoLibrary());
        writer.writeBooleanValue("iCloudBlockPhotoStreamSync", this.getICloudBlockPhotoStreamSync());
        writer.writeBooleanValue("iCloudBlockSharedPhotoStream", this.getICloudBlockSharedPhotoStream());
        writer.writeBooleanValue("iCloudPrivateRelayBlocked", this.getICloudPrivateRelayBlocked());
        writer.writeBooleanValue("iCloudRequireEncryptedBackup", this.getICloudRequireEncryptedBackup());
        writer.writeBooleanValue("iTunesBlocked", this.getITunesBlocked());
        writer.writeBooleanValue("iTunesBlockExplicitContent", this.getITunesBlockExplicitContent());
        writer.writeBooleanValue("iTunesBlockMusicService", this.getITunesBlockMusicService());
        writer.writeBooleanValue("iTunesBlockRadio", this.getITunesBlockRadio());
        writer.writeBooleanValue("keyboardBlockAutoCorrect", this.getKeyboardBlockAutoCorrect());
        writer.writeBooleanValue("keyboardBlockDictation", this.getKeyboardBlockDictation());
        writer.writeBooleanValue("keyboardBlockPredictive", this.getKeyboardBlockPredictive());
        writer.writeBooleanValue("keyboardBlockShortcuts", this.getKeyboardBlockShortcuts());
        writer.writeBooleanValue("keyboardBlockSpellCheck", this.getKeyboardBlockSpellCheck());
        writer.writeBooleanValue("keychainBlockCloudSync", this.getKeychainBlockCloudSync());
        writer.writeBooleanValue("kioskModeAllowAssistiveSpeak", this.getKioskModeAllowAssistiveSpeak());
        writer.writeBooleanValue("kioskModeAllowAssistiveTouchSettings", this.getKioskModeAllowAssistiveTouchSettings());
        writer.writeBooleanValue("kioskModeAllowAutoLock", this.getKioskModeAllowAutoLock());
        writer.writeBooleanValue("kioskModeAllowColorInversionSettings", this.getKioskModeAllowColorInversionSettings());
        writer.writeBooleanValue("kioskModeAllowRingerSwitch", this.getKioskModeAllowRingerSwitch());
        writer.writeBooleanValue("kioskModeAllowScreenRotation", this.getKioskModeAllowScreenRotation());
        writer.writeBooleanValue("kioskModeAllowSleepButton", this.getKioskModeAllowSleepButton());
        writer.writeBooleanValue("kioskModeAllowTouchscreen", this.getKioskModeAllowTouchscreen());
        writer.writeBooleanValue("kioskModeAllowVoiceControlModification", this.getKioskModeAllowVoiceControlModification());
        writer.writeBooleanValue("kioskModeAllowVoiceOverSettings", this.getKioskModeAllowVoiceOverSettings());
        writer.writeBooleanValue("kioskModeAllowVolumeButtons", this.getKioskModeAllowVolumeButtons());
        writer.writeBooleanValue("kioskModeAllowZoomSettings", this.getKioskModeAllowZoomSettings());
        writer.writeStringValue("kioskModeAppStoreUrl", this.getKioskModeAppStoreUrl());
        writer.writeEnumValue("kioskModeAppType", this.getKioskModeAppType());
        writer.writeBooleanValue("kioskModeBlockAutoLock", this.getKioskModeBlockAutoLock());
        writer.writeBooleanValue("kioskModeBlockRingerSwitch", this.getKioskModeBlockRingerSwitch());
        writer.writeBooleanValue("kioskModeBlockScreenRotation", this.getKioskModeBlockScreenRotation());
        writer.writeBooleanValue("kioskModeBlockSleepButton", this.getKioskModeBlockSleepButton());
        writer.writeBooleanValue("kioskModeBlockTouchscreen", this.getKioskModeBlockTouchscreen());
        writer.writeBooleanValue("kioskModeBlockVolumeButtons", this.getKioskModeBlockVolumeButtons());
        writer.writeStringValue("kioskModeBuiltInAppId", this.getKioskModeBuiltInAppId());
        writer.writeBooleanValue("kioskModeEnableVoiceControl", this.getKioskModeEnableVoiceControl());
        writer.writeStringValue("kioskModeManagedAppId", this.getKioskModeManagedAppId());
        writer.writeBooleanValue("kioskModeRequireAssistiveTouch", this.getKioskModeRequireAssistiveTouch());
        writer.writeBooleanValue("kioskModeRequireColorInversion", this.getKioskModeRequireColorInversion());
        writer.writeBooleanValue("kioskModeRequireMonoAudio", this.getKioskModeRequireMonoAudio());
        writer.writeBooleanValue("kioskModeRequireVoiceOver", this.getKioskModeRequireVoiceOver());
        writer.writeBooleanValue("kioskModeRequireZoom", this.getKioskModeRequireZoom());
        writer.writeBooleanValue("lockScreenBlockControlCenter", this.getLockScreenBlockControlCenter());
        writer.writeBooleanValue("lockScreenBlockNotificationView", this.getLockScreenBlockNotificationView());
        writer.writeBooleanValue("lockScreenBlockPassbook", this.getLockScreenBlockPassbook());
        writer.writeBooleanValue("lockScreenBlockTodayView", this.getLockScreenBlockTodayView());
        writer.writeBooleanValue("managedPasteboardRequired", this.getManagedPasteboardRequired());
        writer.writeEnumValue("mediaContentRatingApps", this.getMediaContentRatingApps());
        writer.writeObjectValue("mediaContentRatingAustralia", this.getMediaContentRatingAustralia());
        writer.writeObjectValue("mediaContentRatingCanada", this.getMediaContentRatingCanada());
        writer.writeObjectValue("mediaContentRatingFrance", this.getMediaContentRatingFrance());
        writer.writeObjectValue("mediaContentRatingGermany", this.getMediaContentRatingGermany());
        writer.writeObjectValue("mediaContentRatingIreland", this.getMediaContentRatingIreland());
        writer.writeObjectValue("mediaContentRatingJapan", this.getMediaContentRatingJapan());
        writer.writeObjectValue("mediaContentRatingNewZealand", this.getMediaContentRatingNewZealand());
        writer.writeObjectValue("mediaContentRatingUnitedKingdom", this.getMediaContentRatingUnitedKingdom());
        writer.writeObjectValue("mediaContentRatingUnitedStates", this.getMediaContentRatingUnitedStates());
        writer.writeBooleanValue("messagesBlocked", this.getMessagesBlocked());
        writer.writeCollectionOfObjectValues("networkUsageRules", this.getNetworkUsageRules());
        writer.writeBooleanValue("nfcBlocked", this.getNfcBlocked());
        writer.writeBooleanValue("notificationsBlockSettingsModification", this.getNotificationsBlockSettingsModification());
        writer.writeBooleanValue("onDeviceOnlyDictationForced", this.getOnDeviceOnlyDictationForced());
        writer.writeBooleanValue("onDeviceOnlyTranslationForced", this.getOnDeviceOnlyTranslationForced());
        writer.writeBooleanValue("passcodeBlockFingerprintModification", this.getPasscodeBlockFingerprintModification());
        writer.writeBooleanValue("passcodeBlockFingerprintUnlock", this.getPasscodeBlockFingerprintUnlock());
        writer.writeBooleanValue("passcodeBlockModification", this.getPasscodeBlockModification());
        writer.writeBooleanValue("passcodeBlockSimple", this.getPasscodeBlockSimple());
        writer.writeIntegerValue("passcodeExpirationDays", this.getPasscodeExpirationDays());
        writer.writeIntegerValue("passcodeMinimumCharacterSetCount", this.getPasscodeMinimumCharacterSetCount());
        writer.writeIntegerValue("passcodeMinimumLength", this.getPasscodeMinimumLength());
        writer.writeIntegerValue("passcodeMinutesOfInactivityBeforeLock", this.getPasscodeMinutesOfInactivityBeforeLock());
        writer.writeIntegerValue("passcodeMinutesOfInactivityBeforeScreenTimeout", this.getPasscodeMinutesOfInactivityBeforeScreenTimeout());
        writer.writeIntegerValue("passcodePreviousPasscodeBlockCount", this.getPasscodePreviousPasscodeBlockCount());
        writer.writeBooleanValue("passcodeRequired", this.getPasscodeRequired());
        writer.writeEnumValue("passcodeRequiredType", this.getPasscodeRequiredType());
        writer.writeIntegerValue("passcodeSignInFailureCountBeforeWipe", this.getPasscodeSignInFailureCountBeforeWipe());
        writer.writeBooleanValue("passwordBlockAirDropSharing", this.getPasswordBlockAirDropSharing());
        writer.writeBooleanValue("passwordBlockAutoFill", this.getPasswordBlockAutoFill());
        writer.writeBooleanValue("passwordBlockProximityRequests", this.getPasswordBlockProximityRequests());
        writer.writeBooleanValue("pkiBlockOTAUpdates", this.getPkiBlockOTAUpdates());
        writer.writeBooleanValue("podcastsBlocked", this.getPodcastsBlocked());
        writer.writeBooleanValue("privacyForceLimitAdTracking", this.getPrivacyForceLimitAdTracking());
        writer.writeBooleanValue("proximityBlockSetupToNewDevice", this.getProximityBlockSetupToNewDevice());
        writer.writeBooleanValue("safariBlockAutofill", this.getSafariBlockAutofill());
        writer.writeBooleanValue("safariBlocked", this.getSafariBlocked());
        writer.writeBooleanValue("safariBlockJavaScript", this.getSafariBlockJavaScript());
        writer.writeBooleanValue("safariBlockPopups", this.getSafariBlockPopups());
        writer.writeEnumValue("safariCookieSettings", this.getSafariCookieSettings());
        writer.writeCollectionOfPrimitiveValues("safariManagedDomains", this.getSafariManagedDomains());
        writer.writeCollectionOfPrimitiveValues("safariPasswordAutoFillDomains", this.getSafariPasswordAutoFillDomains());
        writer.writeBooleanValue("safariRequireFraudWarning", this.getSafariRequireFraudWarning());
        writer.writeBooleanValue("screenCaptureBlocked", this.getScreenCaptureBlocked());
        writer.writeBooleanValue("sharedDeviceBlockTemporarySessions", this.getSharedDeviceBlockTemporarySessions());
        writer.writeBooleanValue("siriBlocked", this.getSiriBlocked());
        writer.writeBooleanValue("siriBlockedWhenLocked", this.getSiriBlockedWhenLocked());
        writer.writeBooleanValue("siriBlockUserGeneratedContent", this.getSiriBlockUserGeneratedContent());
        writer.writeBooleanValue("siriRequireProfanityFilter", this.getSiriRequireProfanityFilter());
        writer.writeIntegerValue("softwareUpdatesEnforcedDelayInDays", this.getSoftwareUpdatesEnforcedDelayInDays());
        writer.writeBooleanValue("softwareUpdatesForceDelayed", this.getSoftwareUpdatesForceDelayed());
        writer.writeBooleanValue("spotlightBlockInternetResults", this.getSpotlightBlockInternetResults());
        writer.writeBooleanValue("unpairedExternalBootToRecoveryAllowed", this.getUnpairedExternalBootToRecoveryAllowed());
        writer.writeBooleanValue("usbRestrictedModeBlocked", this.getUsbRestrictedModeBlocked());
        writer.writeBooleanValue("voiceDialingBlocked", this.getVoiceDialingBlocked());
        writer.writeBooleanValue("vpnBlockCreation", this.getVpnBlockCreation());
        writer.writeBooleanValue("wallpaperBlockModification", this.getWallpaperBlockModification());
        writer.writeBooleanValue("wiFiConnectOnlyToConfiguredNetworks", this.getWiFiConnectOnlyToConfiguredNetworks());
        writer.writeBooleanValue("wiFiConnectToAllowedNetworksOnlyForced", this.getWiFiConnectToAllowedNetworksOnlyForced());
        writer.writeBooleanValue("wifiPowerOnForced", this.getWifiPowerOnForced());
    }
    /**
     * Sets the accountBlockModification property value. Indicates whether or not to allow account modification when the device is in supervised mode.
     * @param value Value to set for the accountBlockModification property.
     */
    public void setAccountBlockModification(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("accountBlockModification", value);
    }
    /**
     * Sets the activationLockAllowWhenSupervised property value. Indicates whether or not to allow activation lock when the device is in the supervised mode.
     * @param value Value to set for the activationLockAllowWhenSupervised property.
     */
    public void setActivationLockAllowWhenSupervised(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("activationLockAllowWhenSupervised", value);
    }
    /**
     * Sets the airDropBlocked property value. Indicates whether or not to allow AirDrop when the device is in supervised mode.
     * @param value Value to set for the airDropBlocked property.
     */
    public void setAirDropBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("airDropBlocked", value);
    }
    /**
     * Sets the airDropForceUnmanagedDropTarget property value. Indicates whether or not to cause AirDrop to be considered an unmanaged drop target (iOS 9.0 and later).
     * @param value Value to set for the airDropForceUnmanagedDropTarget property.
     */
    public void setAirDropForceUnmanagedDropTarget(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("airDropForceUnmanagedDropTarget", value);
    }
    /**
     * Sets the airPlayForcePairingPasswordForOutgoingRequests property value. Indicates whether or not to enforce all devices receiving AirPlay requests from this device to use a pairing password.
     * @param value Value to set for the airPlayForcePairingPasswordForOutgoingRequests property.
     */
    public void setAirPlayForcePairingPasswordForOutgoingRequests(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("airPlayForcePairingPasswordForOutgoingRequests", value);
    }
    /**
     * Sets the airPrintBlockCredentialsStorage property value. Indicates whether or not keychain storage of username and password for Airprint is blocked (iOS 11.0 and later).
     * @param value Value to set for the airPrintBlockCredentialsStorage property.
     */
    public void setAirPrintBlockCredentialsStorage(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("airPrintBlockCredentialsStorage", value);
    }
    /**
     * Sets the airPrintBlocked property value. Indicates whether or not AirPrint is blocked (iOS 11.0 and later).
     * @param value Value to set for the airPrintBlocked property.
     */
    public void setAirPrintBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("airPrintBlocked", value);
    }
    /**
     * Sets the airPrintBlockiBeaconDiscovery property value. Indicates whether or not iBeacon discovery of AirPrint printers is blocked. This prevents spurious AirPrint Bluetooth beacons from phishing for network traffic (iOS 11.0 and later).
     * @param value Value to set for the airPrintBlockiBeaconDiscovery property.
     */
    public void setAirPrintBlockiBeaconDiscovery(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("airPrintBlockiBeaconDiscovery", value);
    }
    /**
     * Sets the airPrintForceTrustedTLS property value. Indicates if trusted certificates are required for TLS printing communication (iOS 11.0 and later).
     * @param value Value to set for the airPrintForceTrustedTLS property.
     */
    public void setAirPrintForceTrustedTLS(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("airPrintForceTrustedTLS", value);
    }
    /**
     * Sets the appClipsBlocked property value. Prevents a user from adding any App Clips and removes any existing App Clips on the device.
     * @param value Value to set for the appClipsBlocked property.
     */
    public void setAppClipsBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("appClipsBlocked", value);
    }
    /**
     * Sets the appleNewsBlocked property value. Indicates whether or not to block the user from using News when the device is in supervised mode (iOS 9.0 and later).
     * @param value Value to set for the appleNewsBlocked property.
     */
    public void setAppleNewsBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("appleNewsBlocked", value);
    }
    /**
     * Sets the applePersonalizedAdsBlocked property value. Limits Apple personalized advertising when true. Available in iOS 14 and later.
     * @param value Value to set for the applePersonalizedAdsBlocked property.
     */
    public void setApplePersonalizedAdsBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("applePersonalizedAdsBlocked", value);
    }
    /**
     * Sets the appleWatchBlockPairing property value. Indicates whether or not to allow Apple Watch pairing when the device is in supervised mode (iOS 9.0 and later).
     * @param value Value to set for the appleWatchBlockPairing property.
     */
    public void setAppleWatchBlockPairing(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("appleWatchBlockPairing", value);
    }
    /**
     * Sets the appleWatchForceWristDetection property value. Indicates whether or not to force a paired Apple Watch to use Wrist Detection (iOS 8.2 and later).
     * @param value Value to set for the appleWatchForceWristDetection property.
     */
    public void setAppleWatchForceWristDetection(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("appleWatchForceWristDetection", value);
    }
    /**
     * Sets the appRemovalBlocked property value. Indicates if the removal of apps is allowed.
     * @param value Value to set for the appRemovalBlocked property.
     */
    public void setAppRemovalBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("appRemovalBlocked", value);
    }
    /**
     * Sets the appsSingleAppModeList property value. Gets or sets the list of iOS apps allowed to autonomously enter Single App Mode. Supervised only. iOS 7.0 and later. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the appsSingleAppModeList property.
     */
    public void setAppsSingleAppModeList(@jakarta.annotation.Nullable final java.util.List<AppListItem> value) {
        this.BackingStore.set("appsSingleAppModeList", value);
    }
    /**
     * Sets the appStoreBlockAutomaticDownloads property value. Indicates whether or not to block the automatic downloading of apps purchased on other devices when the device is in supervised mode (iOS 9.0 and later).
     * @param value Value to set for the appStoreBlockAutomaticDownloads property.
     */
    public void setAppStoreBlockAutomaticDownloads(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("appStoreBlockAutomaticDownloads", value);
    }
    /**
     * Sets the appStoreBlocked property value. Indicates whether or not to block the user from using the App Store. Requires a supervised device for iOS 13 and later.
     * @param value Value to set for the appStoreBlocked property.
     */
    public void setAppStoreBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("appStoreBlocked", value);
    }
    /**
     * Sets the appStoreBlockInAppPurchases property value. Indicates whether or not to block the user from making in app purchases.
     * @param value Value to set for the appStoreBlockInAppPurchases property.
     */
    public void setAppStoreBlockInAppPurchases(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("appStoreBlockInAppPurchases", value);
    }
    /**
     * Sets the appStoreBlockUIAppInstallation property value. Indicates whether or not to block the App Store app, not restricting installation through Host apps. Applies to supervised mode only (iOS 9.0 and later).
     * @param value Value to set for the appStoreBlockUIAppInstallation property.
     */
    public void setAppStoreBlockUIAppInstallation(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("appStoreBlockUIAppInstallation", value);
    }
    /**
     * Sets the appStoreRequirePassword property value. Indicates whether or not to require a password when using the app store.
     * @param value Value to set for the appStoreRequirePassword property.
     */
    public void setAppStoreRequirePassword(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("appStoreRequirePassword", value);
    }
    /**
     * Sets the appsVisibilityList property value. List of apps in the visibility list (either visible/launchable apps list or hidden/unlaunchable apps list, controlled by AppsVisibilityListType) (iOS 9.3 and later). This collection can contain a maximum of 10000 elements.
     * @param value Value to set for the appsVisibilityList property.
     */
    public void setAppsVisibilityList(@jakarta.annotation.Nullable final java.util.List<AppListItem> value) {
        this.BackingStore.set("appsVisibilityList", value);
    }
    /**
     * Sets the appsVisibilityListType property value. Possible values of the compliance app list.
     * @param value Value to set for the appsVisibilityListType property.
     */
    public void setAppsVisibilityListType(@jakarta.annotation.Nullable final AppListType value) {
        this.BackingStore.set("appsVisibilityListType", value);
    }
    /**
     * Sets the autoFillForceAuthentication property value. Indicates whether or not to force user authentication before autofilling passwords and credit card information in Safari and other apps on supervised devices.
     * @param value Value to set for the autoFillForceAuthentication property.
     */
    public void setAutoFillForceAuthentication(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("autoFillForceAuthentication", value);
    }
    /**
     * Sets the autoUnlockBlocked property value. Blocks users from unlocking their device with Apple Watch. Available for devices running iOS and iPadOS versions 14.5 and later.
     * @param value Value to set for the autoUnlockBlocked property.
     */
    public void setAutoUnlockBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("autoUnlockBlocked", value);
    }
    /**
     * Sets the blockSystemAppRemoval property value. Indicates whether or not the removal of system apps from the device is blocked on a supervised device (iOS 11.0 and later).
     * @param value Value to set for the blockSystemAppRemoval property.
     */
    public void setBlockSystemAppRemoval(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("blockSystemAppRemoval", value);
    }
    /**
     * Sets the bluetoothBlockModification property value. Indicates whether or not to allow modification of Bluetooth settings when the device is in supervised mode (iOS 10.0 and later).
     * @param value Value to set for the bluetoothBlockModification property.
     */
    public void setBluetoothBlockModification(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("bluetoothBlockModification", value);
    }
    /**
     * Sets the cameraBlocked property value. Indicates whether or not to block the user from accessing the camera of the device. Requires a supervised device for iOS 13 and later.
     * @param value Value to set for the cameraBlocked property.
     */
    public void setCameraBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("cameraBlocked", value);
    }
    /**
     * Sets the cellularBlockDataRoaming property value. Indicates whether or not to block data roaming.
     * @param value Value to set for the cellularBlockDataRoaming property.
     */
    public void setCellularBlockDataRoaming(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("cellularBlockDataRoaming", value);
    }
    /**
     * Sets the cellularBlockGlobalBackgroundFetchWhileRoaming property value. Indicates whether or not to block global background fetch while roaming.
     * @param value Value to set for the cellularBlockGlobalBackgroundFetchWhileRoaming property.
     */
    public void setCellularBlockGlobalBackgroundFetchWhileRoaming(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("cellularBlockGlobalBackgroundFetchWhileRoaming", value);
    }
    /**
     * Sets the cellularBlockPerAppDataModification property value. Indicates whether or not to allow changes to cellular app data usage settings when the device is in supervised mode.
     * @param value Value to set for the cellularBlockPerAppDataModification property.
     */
    public void setCellularBlockPerAppDataModification(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("cellularBlockPerAppDataModification", value);
    }
    /**
     * Sets the cellularBlockPersonalHotspot property value. Indicates whether or not to block Personal Hotspot.
     * @param value Value to set for the cellularBlockPersonalHotspot property.
     */
    public void setCellularBlockPersonalHotspot(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("cellularBlockPersonalHotspot", value);
    }
    /**
     * Sets the cellularBlockPersonalHotspotModification property value. Indicates whether or not to block the user from modifying the personal hotspot setting (iOS 12.2 or later).
     * @param value Value to set for the cellularBlockPersonalHotspotModification property.
     */
    public void setCellularBlockPersonalHotspotModification(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("cellularBlockPersonalHotspotModification", value);
    }
    /**
     * Sets the cellularBlockPlanModification property value. Indicates whether or not to allow users to change the settings of the cellular plan on a supervised device.
     * @param value Value to set for the cellularBlockPlanModification property.
     */
    public void setCellularBlockPlanModification(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("cellularBlockPlanModification", value);
    }
    /**
     * Sets the cellularBlockVoiceRoaming property value. Indicates whether or not to block voice roaming.
     * @param value Value to set for the cellularBlockVoiceRoaming property.
     */
    public void setCellularBlockVoiceRoaming(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("cellularBlockVoiceRoaming", value);
    }
    /**
     * Sets the certificatesBlockUntrustedTlsCertificates property value. Indicates whether or not to block untrusted TLS certificates.
     * @param value Value to set for the certificatesBlockUntrustedTlsCertificates property.
     */
    public void setCertificatesBlockUntrustedTlsCertificates(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("certificatesBlockUntrustedTlsCertificates", value);
    }
    /**
     * Sets the classroomAppBlockRemoteScreenObservation property value. Indicates whether or not to allow remote screen observation by Classroom app when the device is in supervised mode (iOS 9.3 and later).
     * @param value Value to set for the classroomAppBlockRemoteScreenObservation property.
     */
    public void setClassroomAppBlockRemoteScreenObservation(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("classroomAppBlockRemoteScreenObservation", value);
    }
    /**
     * Sets the classroomAppForceUnpromptedScreenObservation property value. Indicates whether or not to automatically give permission to the teacher of a managed course on the Classroom app to view a student's screen without prompting when the device is in supervised mode.
     * @param value Value to set for the classroomAppForceUnpromptedScreenObservation property.
     */
    public void setClassroomAppForceUnpromptedScreenObservation(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("classroomAppForceUnpromptedScreenObservation", value);
    }
    /**
     * Sets the classroomForceAutomaticallyJoinClasses property value. Indicates whether or not to automatically give permission to the teacher's requests, without prompting the student, when the device is in supervised mode.
     * @param value Value to set for the classroomForceAutomaticallyJoinClasses property.
     */
    public void setClassroomForceAutomaticallyJoinClasses(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("classroomForceAutomaticallyJoinClasses", value);
    }
    /**
     * Sets the classroomForceRequestPermissionToLeaveClasses property value. Indicates whether a student enrolled in an unmanaged course via Classroom will request permission from the teacher when attempting to leave the course (iOS 11.3 and later).
     * @param value Value to set for the classroomForceRequestPermissionToLeaveClasses property.
     */
    public void setClassroomForceRequestPermissionToLeaveClasses(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("classroomForceRequestPermissionToLeaveClasses", value);
    }
    /**
     * Sets the classroomForceUnpromptedAppAndDeviceLock property value. Indicates whether or not to allow the teacher to lock apps or the device without prompting the student. Supervised only.
     * @param value Value to set for the classroomForceUnpromptedAppAndDeviceLock property.
     */
    public void setClassroomForceUnpromptedAppAndDeviceLock(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("classroomForceUnpromptedAppAndDeviceLock", value);
    }
    /**
     * Sets the compliantAppListType property value. Possible values of the compliance app list.
     * @param value Value to set for the compliantAppListType property.
     */
    public void setCompliantAppListType(@jakarta.annotation.Nullable final AppListType value) {
        this.BackingStore.set("compliantAppListType", value);
    }
    /**
     * Sets the compliantAppsList property value. List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements.
     * @param value Value to set for the compliantAppsList property.
     */
    public void setCompliantAppsList(@jakarta.annotation.Nullable final java.util.List<AppListItem> value) {
        this.BackingStore.set("compliantAppsList", value);
    }
    /**
     * Sets the configurationProfileBlockChanges property value. Indicates whether or not to block the user from installing configuration profiles and certificates interactively when the device is in supervised mode.
     * @param value Value to set for the configurationProfileBlockChanges property.
     */
    public void setConfigurationProfileBlockChanges(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("configurationProfileBlockChanges", value);
    }
    /**
     * Sets the contactsAllowManagedToUnmanagedWrite property value. Indicates whether or not managed apps can write contacts to unmanaged contacts accounts (iOS 12.0 and later).
     * @param value Value to set for the contactsAllowManagedToUnmanagedWrite property.
     */
    public void setContactsAllowManagedToUnmanagedWrite(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("contactsAllowManagedToUnmanagedWrite", value);
    }
    /**
     * Sets the contactsAllowUnmanagedToManagedRead property value. Indicates whether or not unmanaged apps can read from managed contacts accounts (iOS 12.0 or later).
     * @param value Value to set for the contactsAllowUnmanagedToManagedRead property.
     */
    public void setContactsAllowUnmanagedToManagedRead(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("contactsAllowUnmanagedToManagedRead", value);
    }
    /**
     * Sets the continuousPathKeyboardBlocked property value. Indicates whether or not to block the continuous path keyboard when the device is supervised (iOS 13 or later).
     * @param value Value to set for the continuousPathKeyboardBlocked property.
     */
    public void setContinuousPathKeyboardBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("continuousPathKeyboardBlocked", value);
    }
    /**
     * Sets the dateAndTimeForceSetAutomatically property value. Indicates whether or not the Date and Time 'Set Automatically' feature is enabled and cannot be turned off by the user (iOS 12.0 and later).
     * @param value Value to set for the dateAndTimeForceSetAutomatically property.
     */
    public void setDateAndTimeForceSetAutomatically(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("dateAndTimeForceSetAutomatically", value);
    }
    /**
     * Sets the definitionLookupBlocked property value. Indicates whether or not to block definition lookup when the device is in supervised mode (iOS 8.1.3 and later ).
     * @param value Value to set for the definitionLookupBlocked property.
     */
    public void setDefinitionLookupBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("definitionLookupBlocked", value);
    }
    /**
     * Sets the deviceBlockEnableRestrictions property value. Indicates whether or not to allow the user to enables restrictions in the device settings when the device is in supervised mode.
     * @param value Value to set for the deviceBlockEnableRestrictions property.
     */
    public void setDeviceBlockEnableRestrictions(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("deviceBlockEnableRestrictions", value);
    }
    /**
     * Sets the deviceBlockEraseContentAndSettings property value. Indicates whether or not to allow the use of the 'Erase all content and settings' option on the device when the device is in supervised mode.
     * @param value Value to set for the deviceBlockEraseContentAndSettings property.
     */
    public void setDeviceBlockEraseContentAndSettings(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("deviceBlockEraseContentAndSettings", value);
    }
    /**
     * Sets the deviceBlockNameModification property value. Indicates whether or not to allow device name modification when the device is in supervised mode (iOS 9.0 and later).
     * @param value Value to set for the deviceBlockNameModification property.
     */
    public void setDeviceBlockNameModification(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("deviceBlockNameModification", value);
    }
    /**
     * Sets the diagnosticDataBlockSubmission property value. Indicates whether or not to block diagnostic data submission.
     * @param value Value to set for the diagnosticDataBlockSubmission property.
     */
    public void setDiagnosticDataBlockSubmission(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("diagnosticDataBlockSubmission", value);
    }
    /**
     * Sets the diagnosticDataBlockSubmissionModification property value. Indicates whether or not to allow diagnostics submission settings modification when the device is in supervised mode (iOS 9.3.2 and later).
     * @param value Value to set for the diagnosticDataBlockSubmissionModification property.
     */
    public void setDiagnosticDataBlockSubmissionModification(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("diagnosticDataBlockSubmissionModification", value);
    }
    /**
     * Sets the documentsBlockManagedDocumentsInUnmanagedApps property value. Indicates whether or not to block the user from viewing managed documents in unmanaged apps.
     * @param value Value to set for the documentsBlockManagedDocumentsInUnmanagedApps property.
     */
    public void setDocumentsBlockManagedDocumentsInUnmanagedApps(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("documentsBlockManagedDocumentsInUnmanagedApps", value);
    }
    /**
     * Sets the documentsBlockUnmanagedDocumentsInManagedApps property value. Indicates whether or not to block the user from viewing unmanaged documents in managed apps.
     * @param value Value to set for the documentsBlockUnmanagedDocumentsInManagedApps property.
     */
    public void setDocumentsBlockUnmanagedDocumentsInManagedApps(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("documentsBlockUnmanagedDocumentsInManagedApps", value);
    }
    /**
     * Sets the emailInDomainSuffixes property value. An email address lacking a suffix that matches any of these strings will be considered out-of-domain.
     * @param value Value to set for the emailInDomainSuffixes property.
     */
    public void setEmailInDomainSuffixes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("emailInDomainSuffixes", value);
    }
    /**
     * Sets the enterpriseAppBlockTrust property value. Indicates whether or not to block the user from trusting an enterprise app.
     * @param value Value to set for the enterpriseAppBlockTrust property.
     */
    public void setEnterpriseAppBlockTrust(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("enterpriseAppBlockTrust", value);
    }
    /**
     * Sets the enterpriseAppBlockTrustModification property value. [Deprecated] Configuring this setting and setting the value to 'true' has no effect on the device.
     * @param value Value to set for the enterpriseAppBlockTrustModification property.
     */
    public void setEnterpriseAppBlockTrustModification(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("enterpriseAppBlockTrustModification", value);
    }
    /**
     * Sets the enterpriseBookBlockBackup property value. Indicates whether or not Enterprise book back up is blocked.
     * @param value Value to set for the enterpriseBookBlockBackup property.
     */
    public void setEnterpriseBookBlockBackup(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("enterpriseBookBlockBackup", value);
    }
    /**
     * Sets the enterpriseBookBlockMetadataSync property value. Indicates whether or not Enterprise book notes and highlights sync is blocked.
     * @param value Value to set for the enterpriseBookBlockMetadataSync property.
     */
    public void setEnterpriseBookBlockMetadataSync(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("enterpriseBookBlockMetadataSync", value);
    }
    /**
     * Sets the esimBlockModification property value. Indicates whether or not to allow the addition or removal of cellular plans on the eSIM of a supervised device.
     * @param value Value to set for the esimBlockModification property.
     */
    public void setEsimBlockModification(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("esimBlockModification", value);
    }
    /**
     * Sets the faceTimeBlocked property value. Indicates whether or not to block the user from using FaceTime. Requires a supervised device for iOS 13 and later.
     * @param value Value to set for the faceTimeBlocked property.
     */
    public void setFaceTimeBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("faceTimeBlocked", value);
    }
    /**
     * Sets the filesNetworkDriveAccessBlocked property value. Indicates if devices can access files or other resources on a network server using the Server Message Block (SMB) protocol. Available for devices running iOS and iPadOS, versions 13.0 and later.
     * @param value Value to set for the filesNetworkDriveAccessBlocked property.
     */
    public void setFilesNetworkDriveAccessBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("filesNetworkDriveAccessBlocked", value);
    }
    /**
     * Sets the filesUsbDriveAccessBlocked property value. Indicates if sevices with access can connect to and open files on a USB drive. Available for devices running iOS and iPadOS, versions 13.0 and later.
     * @param value Value to set for the filesUsbDriveAccessBlocked property.
     */
    public void setFilesUsbDriveAccessBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("filesUsbDriveAccessBlocked", value);
    }
    /**
     * Sets the findMyDeviceInFindMyAppBlocked property value. Indicates whether or not to block Find My Device when the device is supervised (iOS 13 or later).
     * @param value Value to set for the findMyDeviceInFindMyAppBlocked property.
     */
    public void setFindMyDeviceInFindMyAppBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("findMyDeviceInFindMyAppBlocked", value);
    }
    /**
     * Sets the findMyFriendsBlocked property value. Indicates whether or not to block changes to Find My Friends when the device is in supervised mode.
     * @param value Value to set for the findMyFriendsBlocked property.
     */
    public void setFindMyFriendsBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("findMyFriendsBlocked", value);
    }
    /**
     * Sets the findMyFriendsInFindMyAppBlocked property value. Indicates whether or not to block Find My Friends when the device is supervised (iOS 13 or later).
     * @param value Value to set for the findMyFriendsInFindMyAppBlocked property.
     */
    public void setFindMyFriendsInFindMyAppBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("findMyFriendsInFindMyAppBlocked", value);
    }
    /**
     * Sets the gameCenterBlocked property value. Indicates whether or not to block the user from using Game Center when the device is in supervised mode.
     * @param value Value to set for the gameCenterBlocked property.
     */
    public void setGameCenterBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("gameCenterBlocked", value);
    }
    /**
     * Sets the gamingBlockGameCenterFriends property value. Indicates whether or not to block the user from having friends in Game Center. Requires a supervised device for iOS 13 and later.
     * @param value Value to set for the gamingBlockGameCenterFriends property.
     */
    public void setGamingBlockGameCenterFriends(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("gamingBlockGameCenterFriends", value);
    }
    /**
     * Sets the gamingBlockMultiplayer property value. Indicates whether or not to block the user from using multiplayer gaming. Requires a supervised device for iOS 13 and later.
     * @param value Value to set for the gamingBlockMultiplayer property.
     */
    public void setGamingBlockMultiplayer(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("gamingBlockMultiplayer", value);
    }
    /**
     * Sets the hostPairingBlocked property value. indicates whether or not to allow host pairing to control the devices an iOS device can pair with when the iOS device is in supervised mode.
     * @param value Value to set for the hostPairingBlocked property.
     */
    public void setHostPairingBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("hostPairingBlocked", value);
    }
    /**
     * Sets the iBooksStoreBlocked property value. Indicates whether or not to block the user from using the iBooks Store when the device is in supervised mode.
     * @param value Value to set for the iBooksStoreBlocked property.
     */
    public void setIBooksStoreBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("iBooksStoreBlocked", value);
    }
    /**
     * Sets the iBooksStoreBlockErotica property value. Indicates whether or not to block the user from downloading media from the iBookstore that has been tagged as erotica.
     * @param value Value to set for the iBooksStoreBlockErotica property.
     */
    public void setIBooksStoreBlockErotica(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("iBooksStoreBlockErotica", value);
    }
    /**
     * Sets the iCloudBlockActivityContinuation property value. Indicates whether or not to block the user from continuing work they started on iOS device to another iOS or macOS device.
     * @param value Value to set for the iCloudBlockActivityContinuation property.
     */
    public void setICloudBlockActivityContinuation(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("iCloudBlockActivityContinuation", value);
    }
    /**
     * Sets the iCloudBlockBackup property value. Indicates whether or not to block iCloud backup. Requires a supervised device for iOS 13 and later.
     * @param value Value to set for the iCloudBlockBackup property.
     */
    public void setICloudBlockBackup(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("iCloudBlockBackup", value);
    }
    /**
     * Sets the iCloudBlockDocumentSync property value. Indicates whether or not to block iCloud document sync. Requires a supervised device for iOS 13 and later.
     * @param value Value to set for the iCloudBlockDocumentSync property.
     */
    public void setICloudBlockDocumentSync(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("iCloudBlockDocumentSync", value);
    }
    /**
     * Sets the iCloudBlockManagedAppsSync property value. Indicates whether or not to block Managed Apps Cloud Sync.
     * @param value Value to set for the iCloudBlockManagedAppsSync property.
     */
    public void setICloudBlockManagedAppsSync(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("iCloudBlockManagedAppsSync", value);
    }
    /**
     * Sets the iCloudBlockPhotoLibrary property value. Indicates whether or not to block iCloud Photo Library.
     * @param value Value to set for the iCloudBlockPhotoLibrary property.
     */
    public void setICloudBlockPhotoLibrary(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("iCloudBlockPhotoLibrary", value);
    }
    /**
     * Sets the iCloudBlockPhotoStreamSync property value. Indicates whether or not to block iCloud Photo Stream Sync.
     * @param value Value to set for the iCloudBlockPhotoStreamSync property.
     */
    public void setICloudBlockPhotoStreamSync(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("iCloudBlockPhotoStreamSync", value);
    }
    /**
     * Sets the iCloudBlockSharedPhotoStream property value. Indicates whether or not to block Shared Photo Stream.
     * @param value Value to set for the iCloudBlockSharedPhotoStream property.
     */
    public void setICloudBlockSharedPhotoStream(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("iCloudBlockSharedPhotoStream", value);
    }
    /**
     * Sets the iCloudPrivateRelayBlocked property value. iCloud private relay is an iCloud+ service that prevents networks and servers from monitoring a person's activity across the internet. By blocking iCloud private relay, Apple will not encrypt the traffic leaving the device. Available for devices running iOS 15 and later.
     * @param value Value to set for the iCloudPrivateRelayBlocked property.
     */
    public void setICloudPrivateRelayBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("iCloudPrivateRelayBlocked", value);
    }
    /**
     * Sets the iCloudRequireEncryptedBackup property value. Indicates whether or not to require backups to iCloud be encrypted.
     * @param value Value to set for the iCloudRequireEncryptedBackup property.
     */
    public void setICloudRequireEncryptedBackup(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("iCloudRequireEncryptedBackup", value);
    }
    /**
     * Sets the iTunesBlocked property value. Indicates whether or not to block the iTunes app. Requires a supervised device for iOS 13 and later.
     * @param value Value to set for the iTunesBlocked property.
     */
    public void setITunesBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("iTunesBlocked", value);
    }
    /**
     * Sets the iTunesBlockExplicitContent property value. Indicates whether or not to block the user from accessing explicit content in iTunes and the App Store. Requires a supervised device for iOS 13 and later.
     * @param value Value to set for the iTunesBlockExplicitContent property.
     */
    public void setITunesBlockExplicitContent(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("iTunesBlockExplicitContent", value);
    }
    /**
     * Sets the iTunesBlockMusicService property value. Indicates whether or not to block Music service and revert Music app to classic mode when the device is in supervised mode (iOS 9.3 and later and macOS 10.12 and later).
     * @param value Value to set for the iTunesBlockMusicService property.
     */
    public void setITunesBlockMusicService(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("iTunesBlockMusicService", value);
    }
    /**
     * Sets the iTunesBlockRadio property value. Indicates whether or not to block the user from using iTunes Radio when the device is in supervised mode (iOS 9.3 and later).
     * @param value Value to set for the iTunesBlockRadio property.
     */
    public void setITunesBlockRadio(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("iTunesBlockRadio", value);
    }
    /**
     * Sets the keyboardBlockAutoCorrect property value. Indicates whether or not to block keyboard auto-correction when the device is in supervised mode (iOS 8.1.3 and later).
     * @param value Value to set for the keyboardBlockAutoCorrect property.
     */
    public void setKeyboardBlockAutoCorrect(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("keyboardBlockAutoCorrect", value);
    }
    /**
     * Sets the keyboardBlockDictation property value. Indicates whether or not to block the user from using dictation input when the device is in supervised mode.
     * @param value Value to set for the keyboardBlockDictation property.
     */
    public void setKeyboardBlockDictation(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("keyboardBlockDictation", value);
    }
    /**
     * Sets the keyboardBlockPredictive property value. Indicates whether or not to block predictive keyboards when device is in supervised mode (iOS 8.1.3 and later).
     * @param value Value to set for the keyboardBlockPredictive property.
     */
    public void setKeyboardBlockPredictive(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("keyboardBlockPredictive", value);
    }
    /**
     * Sets the keyboardBlockShortcuts property value. Indicates whether or not to block keyboard shortcuts when the device is in supervised mode (iOS 9.0 and later).
     * @param value Value to set for the keyboardBlockShortcuts property.
     */
    public void setKeyboardBlockShortcuts(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("keyboardBlockShortcuts", value);
    }
    /**
     * Sets the keyboardBlockSpellCheck property value. Indicates whether or not to block keyboard spell-checking when the device is in supervised mode (iOS 8.1.3 and later).
     * @param value Value to set for the keyboardBlockSpellCheck property.
     */
    public void setKeyboardBlockSpellCheck(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("keyboardBlockSpellCheck", value);
    }
    /**
     * Sets the keychainBlockCloudSync property value. Indicates whether or not iCloud keychain synchronization is blocked. Requires a supervised device for iOS 13 and later.
     * @param value Value to set for the keychainBlockCloudSync property.
     */
    public void setKeychainBlockCloudSync(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("keychainBlockCloudSync", value);
    }
    /**
     * Sets the kioskModeAllowAssistiveSpeak property value. Indicates whether or not to allow assistive speak while in kiosk mode.
     * @param value Value to set for the kioskModeAllowAssistiveSpeak property.
     */
    public void setKioskModeAllowAssistiveSpeak(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("kioskModeAllowAssistiveSpeak", value);
    }
    /**
     * Sets the kioskModeAllowAssistiveTouchSettings property value. Indicates whether or not to allow access to the Assistive Touch Settings while in kiosk mode.
     * @param value Value to set for the kioskModeAllowAssistiveTouchSettings property.
     */
    public void setKioskModeAllowAssistiveTouchSettings(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("kioskModeAllowAssistiveTouchSettings", value);
    }
    /**
     * Sets the kioskModeAllowAutoLock property value. Indicates whether or not to allow device auto lock while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockAutoLock instead.
     * @param value Value to set for the kioskModeAllowAutoLock property.
     */
    public void setKioskModeAllowAutoLock(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("kioskModeAllowAutoLock", value);
    }
    /**
     * Sets the kioskModeAllowColorInversionSettings property value. Indicates whether or not to allow access to the Color Inversion Settings while in kiosk mode.
     * @param value Value to set for the kioskModeAllowColorInversionSettings property.
     */
    public void setKioskModeAllowColorInversionSettings(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("kioskModeAllowColorInversionSettings", value);
    }
    /**
     * Sets the kioskModeAllowRingerSwitch property value. Indicates whether or not to allow use of the ringer switch while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockRingerSwitch instead.
     * @param value Value to set for the kioskModeAllowRingerSwitch property.
     */
    public void setKioskModeAllowRingerSwitch(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("kioskModeAllowRingerSwitch", value);
    }
    /**
     * Sets the kioskModeAllowScreenRotation property value. Indicates whether or not to allow screen rotation while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockScreenRotation instead.
     * @param value Value to set for the kioskModeAllowScreenRotation property.
     */
    public void setKioskModeAllowScreenRotation(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("kioskModeAllowScreenRotation", value);
    }
    /**
     * Sets the kioskModeAllowSleepButton property value. Indicates whether or not to allow use of the sleep button while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockSleepButton instead.
     * @param value Value to set for the kioskModeAllowSleepButton property.
     */
    public void setKioskModeAllowSleepButton(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("kioskModeAllowSleepButton", value);
    }
    /**
     * Sets the kioskModeAllowTouchscreen property value. Indicates whether or not to allow use of the touchscreen while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockTouchscreen instead.
     * @param value Value to set for the kioskModeAllowTouchscreen property.
     */
    public void setKioskModeAllowTouchscreen(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("kioskModeAllowTouchscreen", value);
    }
    /**
     * Sets the kioskModeAllowVoiceControlModification property value. Indicates whether or not to allow the user to toggle voice control in kiosk mode.
     * @param value Value to set for the kioskModeAllowVoiceControlModification property.
     */
    public void setKioskModeAllowVoiceControlModification(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("kioskModeAllowVoiceControlModification", value);
    }
    /**
     * Sets the kioskModeAllowVoiceOverSettings property value. Indicates whether or not to allow access to the voice over settings while in kiosk mode.
     * @param value Value to set for the kioskModeAllowVoiceOverSettings property.
     */
    public void setKioskModeAllowVoiceOverSettings(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("kioskModeAllowVoiceOverSettings", value);
    }
    /**
     * Sets the kioskModeAllowVolumeButtons property value. Indicates whether or not to allow use of the volume buttons while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockVolumeButtons instead.
     * @param value Value to set for the kioskModeAllowVolumeButtons property.
     */
    public void setKioskModeAllowVolumeButtons(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("kioskModeAllowVolumeButtons", value);
    }
    /**
     * Sets the kioskModeAllowZoomSettings property value. Indicates whether or not to allow access to the zoom settings while in kiosk mode.
     * @param value Value to set for the kioskModeAllowZoomSettings property.
     */
    public void setKioskModeAllowZoomSettings(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("kioskModeAllowZoomSettings", value);
    }
    /**
     * Sets the kioskModeAppStoreUrl property value. URL in the app store to the app to use for kiosk mode. Use if KioskModeManagedAppId is not known.
     * @param value Value to set for the kioskModeAppStoreUrl property.
     */
    public void setKioskModeAppStoreUrl(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("kioskModeAppStoreUrl", value);
    }
    /**
     * Sets the kioskModeAppType property value. App source options for iOS kiosk mode.
     * @param value Value to set for the kioskModeAppType property.
     */
    public void setKioskModeAppType(@jakarta.annotation.Nullable final IosKioskModeAppType value) {
        this.BackingStore.set("kioskModeAppType", value);
    }
    /**
     * Sets the kioskModeBlockAutoLock property value. Indicates whether or not to block device auto lock while in kiosk mode.
     * @param value Value to set for the kioskModeBlockAutoLock property.
     */
    public void setKioskModeBlockAutoLock(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("kioskModeBlockAutoLock", value);
    }
    /**
     * Sets the kioskModeBlockRingerSwitch property value. Indicates whether or not to block use of the ringer switch while in kiosk mode.
     * @param value Value to set for the kioskModeBlockRingerSwitch property.
     */
    public void setKioskModeBlockRingerSwitch(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("kioskModeBlockRingerSwitch", value);
    }
    /**
     * Sets the kioskModeBlockScreenRotation property value. Indicates whether or not to block screen rotation while in kiosk mode.
     * @param value Value to set for the kioskModeBlockScreenRotation property.
     */
    public void setKioskModeBlockScreenRotation(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("kioskModeBlockScreenRotation", value);
    }
    /**
     * Sets the kioskModeBlockSleepButton property value. Indicates whether or not to block use of the sleep button while in kiosk mode.
     * @param value Value to set for the kioskModeBlockSleepButton property.
     */
    public void setKioskModeBlockSleepButton(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("kioskModeBlockSleepButton", value);
    }
    /**
     * Sets the kioskModeBlockTouchscreen property value. Indicates whether or not to block use of the touchscreen while in kiosk mode.
     * @param value Value to set for the kioskModeBlockTouchscreen property.
     */
    public void setKioskModeBlockTouchscreen(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("kioskModeBlockTouchscreen", value);
    }
    /**
     * Sets the kioskModeBlockVolumeButtons property value. Indicates whether or not to block the volume buttons while in Kiosk Mode.
     * @param value Value to set for the kioskModeBlockVolumeButtons property.
     */
    public void setKioskModeBlockVolumeButtons(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("kioskModeBlockVolumeButtons", value);
    }
    /**
     * Sets the kioskModeBuiltInAppId property value. ID for built-in apps to use for kiosk mode. Used when KioskModeManagedAppId and KioskModeAppStoreUrl are not set.
     * @param value Value to set for the kioskModeBuiltInAppId property.
     */
    public void setKioskModeBuiltInAppId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("kioskModeBuiltInAppId", value);
    }
    /**
     * Sets the kioskModeEnableVoiceControl property value. Indicates whether or not to enable voice control in kiosk mode.
     * @param value Value to set for the kioskModeEnableVoiceControl property.
     */
    public void setKioskModeEnableVoiceControl(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("kioskModeEnableVoiceControl", value);
    }
    /**
     * Sets the kioskModeManagedAppId property value. Managed app id of the app to use for kiosk mode. If KioskModeManagedAppId is specified then KioskModeAppStoreUrl will be ignored.
     * @param value Value to set for the kioskModeManagedAppId property.
     */
    public void setKioskModeManagedAppId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("kioskModeManagedAppId", value);
    }
    /**
     * Sets the kioskModeRequireAssistiveTouch property value. Indicates whether or not to require assistive touch while in kiosk mode.
     * @param value Value to set for the kioskModeRequireAssistiveTouch property.
     */
    public void setKioskModeRequireAssistiveTouch(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("kioskModeRequireAssistiveTouch", value);
    }
    /**
     * Sets the kioskModeRequireColorInversion property value. Indicates whether or not to require color inversion while in kiosk mode.
     * @param value Value to set for the kioskModeRequireColorInversion property.
     */
    public void setKioskModeRequireColorInversion(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("kioskModeRequireColorInversion", value);
    }
    /**
     * Sets the kioskModeRequireMonoAudio property value. Indicates whether or not to require mono audio while in kiosk mode.
     * @param value Value to set for the kioskModeRequireMonoAudio property.
     */
    public void setKioskModeRequireMonoAudio(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("kioskModeRequireMonoAudio", value);
    }
    /**
     * Sets the kioskModeRequireVoiceOver property value. Indicates whether or not to require voice over while in kiosk mode.
     * @param value Value to set for the kioskModeRequireVoiceOver property.
     */
    public void setKioskModeRequireVoiceOver(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("kioskModeRequireVoiceOver", value);
    }
    /**
     * Sets the kioskModeRequireZoom property value. Indicates whether or not to require zoom while in kiosk mode.
     * @param value Value to set for the kioskModeRequireZoom property.
     */
    public void setKioskModeRequireZoom(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("kioskModeRequireZoom", value);
    }
    /**
     * Sets the lockScreenBlockControlCenter property value. Indicates whether or not to block the user from using control center on the lock screen.
     * @param value Value to set for the lockScreenBlockControlCenter property.
     */
    public void setLockScreenBlockControlCenter(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("lockScreenBlockControlCenter", value);
    }
    /**
     * Sets the lockScreenBlockNotificationView property value. Indicates whether or not to block the user from using the notification view on the lock screen.
     * @param value Value to set for the lockScreenBlockNotificationView property.
     */
    public void setLockScreenBlockNotificationView(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("lockScreenBlockNotificationView", value);
    }
    /**
     * Sets the lockScreenBlockPassbook property value. Indicates whether or not to block the user from using passbook when the device is locked.
     * @param value Value to set for the lockScreenBlockPassbook property.
     */
    public void setLockScreenBlockPassbook(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("lockScreenBlockPassbook", value);
    }
    /**
     * Sets the lockScreenBlockTodayView property value. Indicates whether or not to block the user from using the Today View on the lock screen.
     * @param value Value to set for the lockScreenBlockTodayView property.
     */
    public void setLockScreenBlockTodayView(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("lockScreenBlockTodayView", value);
    }
    /**
     * Sets the managedPasteboardRequired property value. Open-in management controls how people share data between unmanaged and managed apps. Setting this to true enforces copy/paste restrictions based on how you configured Block viewing corporate documents in unmanaged apps  and  Block viewing non-corporate documents in corporate apps.
     * @param value Value to set for the managedPasteboardRequired property.
     */
    public void setManagedPasteboardRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("managedPasteboardRequired", value);
    }
    /**
     * Sets the mediaContentRatingApps property value. Apps rating as in media content
     * @param value Value to set for the mediaContentRatingApps property.
     */
    public void setMediaContentRatingApps(@jakarta.annotation.Nullable final RatingAppsType value) {
        this.BackingStore.set("mediaContentRatingApps", value);
    }
    /**
     * Sets the mediaContentRatingAustralia property value. Media content rating settings for Australia
     * @param value Value to set for the mediaContentRatingAustralia property.
     */
    public void setMediaContentRatingAustralia(@jakarta.annotation.Nullable final MediaContentRatingAustralia value) {
        this.BackingStore.set("mediaContentRatingAustralia", value);
    }
    /**
     * Sets the mediaContentRatingCanada property value. Media content rating settings for Canada
     * @param value Value to set for the mediaContentRatingCanada property.
     */
    public void setMediaContentRatingCanada(@jakarta.annotation.Nullable final MediaContentRatingCanada value) {
        this.BackingStore.set("mediaContentRatingCanada", value);
    }
    /**
     * Sets the mediaContentRatingFrance property value. Media content rating settings for France
     * @param value Value to set for the mediaContentRatingFrance property.
     */
    public void setMediaContentRatingFrance(@jakarta.annotation.Nullable final MediaContentRatingFrance value) {
        this.BackingStore.set("mediaContentRatingFrance", value);
    }
    /**
     * Sets the mediaContentRatingGermany property value. Media content rating settings for Germany
     * @param value Value to set for the mediaContentRatingGermany property.
     */
    public void setMediaContentRatingGermany(@jakarta.annotation.Nullable final MediaContentRatingGermany value) {
        this.BackingStore.set("mediaContentRatingGermany", value);
    }
    /**
     * Sets the mediaContentRatingIreland property value. Media content rating settings for Ireland
     * @param value Value to set for the mediaContentRatingIreland property.
     */
    public void setMediaContentRatingIreland(@jakarta.annotation.Nullable final MediaContentRatingIreland value) {
        this.BackingStore.set("mediaContentRatingIreland", value);
    }
    /**
     * Sets the mediaContentRatingJapan property value. Media content rating settings for Japan
     * @param value Value to set for the mediaContentRatingJapan property.
     */
    public void setMediaContentRatingJapan(@jakarta.annotation.Nullable final MediaContentRatingJapan value) {
        this.BackingStore.set("mediaContentRatingJapan", value);
    }
    /**
     * Sets the mediaContentRatingNewZealand property value. Media content rating settings for New Zealand
     * @param value Value to set for the mediaContentRatingNewZealand property.
     */
    public void setMediaContentRatingNewZealand(@jakarta.annotation.Nullable final MediaContentRatingNewZealand value) {
        this.BackingStore.set("mediaContentRatingNewZealand", value);
    }
    /**
     * Sets the mediaContentRatingUnitedKingdom property value. Media content rating settings for United Kingdom
     * @param value Value to set for the mediaContentRatingUnitedKingdom property.
     */
    public void setMediaContentRatingUnitedKingdom(@jakarta.annotation.Nullable final MediaContentRatingUnitedKingdom value) {
        this.BackingStore.set("mediaContentRatingUnitedKingdom", value);
    }
    /**
     * Sets the mediaContentRatingUnitedStates property value. Media content rating settings for United States
     * @param value Value to set for the mediaContentRatingUnitedStates property.
     */
    public void setMediaContentRatingUnitedStates(@jakarta.annotation.Nullable final MediaContentRatingUnitedStates value) {
        this.BackingStore.set("mediaContentRatingUnitedStates", value);
    }
    /**
     * Sets the messagesBlocked property value. Indicates whether or not to block the user from using the Messages app on the supervised device.
     * @param value Value to set for the messagesBlocked property.
     */
    public void setMessagesBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("messagesBlocked", value);
    }
    /**
     * Sets the networkUsageRules property value. List of managed apps and the network rules that applies to them. This collection can contain a maximum of 1000 elements.
     * @param value Value to set for the networkUsageRules property.
     */
    public void setNetworkUsageRules(@jakarta.annotation.Nullable final java.util.List<IosNetworkUsageRule> value) {
        this.BackingStore.set("networkUsageRules", value);
    }
    /**
     * Sets the nfcBlocked property value. Disable NFC to prevent devices from pairing with other NFC-enabled devices. Available for iOS/iPadOS devices running 14.2 and later.
     * @param value Value to set for the nfcBlocked property.
     */
    public void setNfcBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("nfcBlocked", value);
    }
    /**
     * Sets the notificationsBlockSettingsModification property value. Indicates whether or not to allow notifications settings modification (iOS 9.3 and later).
     * @param value Value to set for the notificationsBlockSettingsModification property.
     */
    public void setNotificationsBlockSettingsModification(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("notificationsBlockSettingsModification", value);
    }
    /**
     * Sets the onDeviceOnlyDictationForced property value. Disables connections to Siri servers so that users cant use Siri to dictate text. Available for devices running iOS and iPadOS versions 14.5 and later.
     * @param value Value to set for the onDeviceOnlyDictationForced property.
     */
    public void setOnDeviceOnlyDictationForced(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("onDeviceOnlyDictationForced", value);
    }
    /**
     * Sets the onDeviceOnlyTranslationForced property value. When set to TRUE, the setting disables connections to Siri servers so that users cant use Siri to translate text. When set to FALSE, the setting allows connections to to Siri servers to users can use Siri to translate text. Available for devices running iOS and iPadOS versions 15.0 and later.
     * @param value Value to set for the onDeviceOnlyTranslationForced property.
     */
    public void setOnDeviceOnlyTranslationForced(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("onDeviceOnlyTranslationForced", value);
    }
    /**
     * Sets the passcodeBlockFingerprintModification property value. Block modification of registered Touch ID fingerprints when in supervised mode.
     * @param value Value to set for the passcodeBlockFingerprintModification property.
     */
    public void setPasscodeBlockFingerprintModification(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("passcodeBlockFingerprintModification", value);
    }
    /**
     * Sets the passcodeBlockFingerprintUnlock property value. Indicates whether or not to block fingerprint unlock.
     * @param value Value to set for the passcodeBlockFingerprintUnlock property.
     */
    public void setPasscodeBlockFingerprintUnlock(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("passcodeBlockFingerprintUnlock", value);
    }
    /**
     * Sets the passcodeBlockModification property value. Indicates whether or not to allow passcode modification on the supervised device (iOS 9.0 and later).
     * @param value Value to set for the passcodeBlockModification property.
     */
    public void setPasscodeBlockModification(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("passcodeBlockModification", value);
    }
    /**
     * Sets the passcodeBlockSimple property value. Indicates whether or not to block simple passcodes.
     * @param value Value to set for the passcodeBlockSimple property.
     */
    public void setPasscodeBlockSimple(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("passcodeBlockSimple", value);
    }
    /**
     * Sets the passcodeExpirationDays property value. Number of days before the passcode expires. Valid values 1 to 65535
     * @param value Value to set for the passcodeExpirationDays property.
     */
    public void setPasscodeExpirationDays(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("passcodeExpirationDays", value);
    }
    /**
     * Sets the passcodeMinimumCharacterSetCount property value. Number of character sets a passcode must contain. Valid values 0 to 4
     * @param value Value to set for the passcodeMinimumCharacterSetCount property.
     */
    public void setPasscodeMinimumCharacterSetCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("passcodeMinimumCharacterSetCount", value);
    }
    /**
     * Sets the passcodeMinimumLength property value. Minimum length of passcode. Valid values 4 to 14
     * @param value Value to set for the passcodeMinimumLength property.
     */
    public void setPasscodeMinimumLength(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("passcodeMinimumLength", value);
    }
    /**
     * Sets the passcodeMinutesOfInactivityBeforeLock property value. Minutes of inactivity before a passcode is required.
     * @param value Value to set for the passcodeMinutesOfInactivityBeforeLock property.
     */
    public void setPasscodeMinutesOfInactivityBeforeLock(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("passcodeMinutesOfInactivityBeforeLock", value);
    }
    /**
     * Sets the passcodeMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity before the screen times out.
     * @param value Value to set for the passcodeMinutesOfInactivityBeforeScreenTimeout property.
     */
    public void setPasscodeMinutesOfInactivityBeforeScreenTimeout(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("passcodeMinutesOfInactivityBeforeScreenTimeout", value);
    }
    /**
     * Sets the passcodePreviousPasscodeBlockCount property value. Number of previous passcodes to block. Valid values 1 to 24
     * @param value Value to set for the passcodePreviousPasscodeBlockCount property.
     */
    public void setPasscodePreviousPasscodeBlockCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("passcodePreviousPasscodeBlockCount", value);
    }
    /**
     * Sets the passcodeRequired property value. Indicates whether or not to require a passcode.
     * @param value Value to set for the passcodeRequired property.
     */
    public void setPasscodeRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("passcodeRequired", value);
    }
    /**
     * Sets the passcodeRequiredType property value. Possible values of required passwords.
     * @param value Value to set for the passcodeRequiredType property.
     */
    public void setPasscodeRequiredType(@jakarta.annotation.Nullable final RequiredPasswordType value) {
        this.BackingStore.set("passcodeRequiredType", value);
    }
    /**
     * Sets the passcodeSignInFailureCountBeforeWipe property value. Number of sign in failures allowed before wiping the device. Valid values 2 to 11
     * @param value Value to set for the passcodeSignInFailureCountBeforeWipe property.
     */
    public void setPasscodeSignInFailureCountBeforeWipe(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("passcodeSignInFailureCountBeforeWipe", value);
    }
    /**
     * Sets the passwordBlockAirDropSharing property value. Indicates whether or not to block sharing passwords with the AirDrop passwords feature iOS 12.0 and later).
     * @param value Value to set for the passwordBlockAirDropSharing property.
     */
    public void setPasswordBlockAirDropSharing(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("passwordBlockAirDropSharing", value);
    }
    /**
     * Sets the passwordBlockAutoFill property value. Indicates if the AutoFill passwords feature is allowed (iOS 12.0 and later).
     * @param value Value to set for the passwordBlockAutoFill property.
     */
    public void setPasswordBlockAutoFill(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("passwordBlockAutoFill", value);
    }
    /**
     * Sets the passwordBlockProximityRequests property value. Indicates whether or not to block requesting passwords from nearby devices (iOS 12.0 and later).
     * @param value Value to set for the passwordBlockProximityRequests property.
     */
    public void setPasswordBlockProximityRequests(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("passwordBlockProximityRequests", value);
    }
    /**
     * Sets the pkiBlockOTAUpdates property value. Indicates whether or not over-the-air PKI updates are blocked. Setting this restriction to false does not disable CRL and OCSP checks (iOS 7.0 and later).
     * @param value Value to set for the pkiBlockOTAUpdates property.
     */
    public void setPkiBlockOTAUpdates(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("pkiBlockOTAUpdates", value);
    }
    /**
     * Sets the podcastsBlocked property value. Indicates whether or not to block the user from using podcasts on the supervised device (iOS 8.0 and later).
     * @param value Value to set for the podcastsBlocked property.
     */
    public void setPodcastsBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("podcastsBlocked", value);
    }
    /**
     * Sets the privacyForceLimitAdTracking property value. Indicates if ad tracking is limited.(iOS 7.0 and later).
     * @param value Value to set for the privacyForceLimitAdTracking property.
     */
    public void setPrivacyForceLimitAdTracking(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("privacyForceLimitAdTracking", value);
    }
    /**
     * Sets the proximityBlockSetupToNewDevice property value. Indicates whether or not to enable the prompt to setup nearby devices with a supervised device.
     * @param value Value to set for the proximityBlockSetupToNewDevice property.
     */
    public void setProximityBlockSetupToNewDevice(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("proximityBlockSetupToNewDevice", value);
    }
    /**
     * Sets the safariBlockAutofill property value. Indicates whether or not to block the user from using Auto fill in Safari. Requires a supervised device for iOS 13 and later.
     * @param value Value to set for the safariBlockAutofill property.
     */
    public void setSafariBlockAutofill(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("safariBlockAutofill", value);
    }
    /**
     * Sets the safariBlocked property value. Indicates whether or not to block the user from using Safari. Requires a supervised device for iOS 13 and later.
     * @param value Value to set for the safariBlocked property.
     */
    public void setSafariBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("safariBlocked", value);
    }
    /**
     * Sets the safariBlockJavaScript property value. Indicates whether or not to block JavaScript in Safari.
     * @param value Value to set for the safariBlockJavaScript property.
     */
    public void setSafariBlockJavaScript(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("safariBlockJavaScript", value);
    }
    /**
     * Sets the safariBlockPopups property value. Indicates whether or not to block popups in Safari.
     * @param value Value to set for the safariBlockPopups property.
     */
    public void setSafariBlockPopups(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("safariBlockPopups", value);
    }
    /**
     * Sets the safariCookieSettings property value. Web Browser Cookie Settings.
     * @param value Value to set for the safariCookieSettings property.
     */
    public void setSafariCookieSettings(@jakarta.annotation.Nullable final WebBrowserCookieSettings value) {
        this.BackingStore.set("safariCookieSettings", value);
    }
    /**
     * Sets the safariManagedDomains property value. URLs matching the patterns listed here will be considered managed.
     * @param value Value to set for the safariManagedDomains property.
     */
    public void setSafariManagedDomains(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("safariManagedDomains", value);
    }
    /**
     * Sets the safariPasswordAutoFillDomains property value. Users can save passwords in Safari only from URLs matching the patterns listed here. Applies to devices in supervised mode (iOS 9.3 and later).
     * @param value Value to set for the safariPasswordAutoFillDomains property.
     */
    public void setSafariPasswordAutoFillDomains(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("safariPasswordAutoFillDomains", value);
    }
    /**
     * Sets the safariRequireFraudWarning property value. Indicates whether or not to require fraud warning in Safari.
     * @param value Value to set for the safariRequireFraudWarning property.
     */
    public void setSafariRequireFraudWarning(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("safariRequireFraudWarning", value);
    }
    /**
     * Sets the screenCaptureBlocked property value. Indicates whether or not to block the user from taking Screenshots.
     * @param value Value to set for the screenCaptureBlocked property.
     */
    public void setScreenCaptureBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("screenCaptureBlocked", value);
    }
    /**
     * Sets the sharedDeviceBlockTemporarySessions property value. Indicates whether or not to block temporary sessions on Shared iPads (iOS 13.4 or later).
     * @param value Value to set for the sharedDeviceBlockTemporarySessions property.
     */
    public void setSharedDeviceBlockTemporarySessions(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("sharedDeviceBlockTemporarySessions", value);
    }
    /**
     * Sets the siriBlocked property value. Indicates whether or not to block the user from using Siri.
     * @param value Value to set for the siriBlocked property.
     */
    public void setSiriBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("siriBlocked", value);
    }
    /**
     * Sets the siriBlockedWhenLocked property value. Indicates whether or not to block the user from using Siri when locked.
     * @param value Value to set for the siriBlockedWhenLocked property.
     */
    public void setSiriBlockedWhenLocked(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("siriBlockedWhenLocked", value);
    }
    /**
     * Sets the siriBlockUserGeneratedContent property value. Indicates whether or not to block Siri from querying user-generated content when used on a supervised device.
     * @param value Value to set for the siriBlockUserGeneratedContent property.
     */
    public void setSiriBlockUserGeneratedContent(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("siriBlockUserGeneratedContent", value);
    }
    /**
     * Sets the siriRequireProfanityFilter property value. Indicates whether or not to prevent Siri from dictating, or speaking profane language on supervised device.
     * @param value Value to set for the siriRequireProfanityFilter property.
     */
    public void setSiriRequireProfanityFilter(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("siriRequireProfanityFilter", value);
    }
    /**
     * Sets the softwareUpdatesEnforcedDelayInDays property value. Sets how many days a software update will be delyed for a supervised device. Valid values 0 to 90
     * @param value Value to set for the softwareUpdatesEnforcedDelayInDays property.
     */
    public void setSoftwareUpdatesEnforcedDelayInDays(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("softwareUpdatesEnforcedDelayInDays", value);
    }
    /**
     * Sets the softwareUpdatesForceDelayed property value. Indicates whether or not to delay user visibility of software updates when the device is in supervised mode.
     * @param value Value to set for the softwareUpdatesForceDelayed property.
     */
    public void setSoftwareUpdatesForceDelayed(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("softwareUpdatesForceDelayed", value);
    }
    /**
     * Sets the spotlightBlockInternetResults property value. Indicates whether or not to block Spotlight search from returning internet results on supervised device.
     * @param value Value to set for the spotlightBlockInternetResults property.
     */
    public void setSpotlightBlockInternetResults(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("spotlightBlockInternetResults", value);
    }
    /**
     * Sets the unpairedExternalBootToRecoveryAllowed property value. Allow users to boot devices into recovery mode with unpaired devices. Available for devices running iOS and iPadOS versions 14.5 and later.
     * @param value Value to set for the unpairedExternalBootToRecoveryAllowed property.
     */
    public void setUnpairedExternalBootToRecoveryAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("unpairedExternalBootToRecoveryAllowed", value);
    }
    /**
     * Sets the usbRestrictedModeBlocked property value. Indicates if connecting to USB accessories while the device is locked is allowed (iOS 11.4.1 and later).
     * @param value Value to set for the usbRestrictedModeBlocked property.
     */
    public void setUsbRestrictedModeBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("usbRestrictedModeBlocked", value);
    }
    /**
     * Sets the voiceDialingBlocked property value. Indicates whether or not to block voice dialing.
     * @param value Value to set for the voiceDialingBlocked property.
     */
    public void setVoiceDialingBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("voiceDialingBlocked", value);
    }
    /**
     * Sets the vpnBlockCreation property value. Indicates whether or not the creation of VPN configurations is blocked (iOS 11.0 and later).
     * @param value Value to set for the vpnBlockCreation property.
     */
    public void setVpnBlockCreation(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("vpnBlockCreation", value);
    }
    /**
     * Sets the wallpaperBlockModification property value. Indicates whether or not to allow wallpaper modification on supervised device (iOS 9.0 and later) .
     * @param value Value to set for the wallpaperBlockModification property.
     */
    public void setWallpaperBlockModification(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("wallpaperBlockModification", value);
    }
    /**
     * Sets the wiFiConnectOnlyToConfiguredNetworks property value. Indicates whether or not to force the device to use only Wi-Fi networks from configuration profiles when the device is in supervised mode. Available for devices running iOS and iPadOS versions 14.4 and earlier. Devices running 14.5+ should use the setting, 'WiFiConnectToAllowedNetworksOnlyForced.
     * @param value Value to set for the wiFiConnectOnlyToConfiguredNetworks property.
     */
    public void setWiFiConnectOnlyToConfiguredNetworks(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("wiFiConnectOnlyToConfiguredNetworks", value);
    }
    /**
     * Sets the wiFiConnectToAllowedNetworksOnlyForced property value. Require devices to use Wi-Fi networks set up via configuration profiles. Available for devices running iOS and iPadOS versions 14.5 and later.
     * @param value Value to set for the wiFiConnectToAllowedNetworksOnlyForced property.
     */
    public void setWiFiConnectToAllowedNetworksOnlyForced(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("wiFiConnectToAllowedNetworksOnlyForced", value);
    }
    /**
     * Sets the wifiPowerOnForced property value. Indicates whether or not Wi-Fi remains on, even when device is in airplane mode. Available for devices running iOS and iPadOS, versions 13.0 and later.
     * @param value Value to set for the wifiPowerOnForced property.
     */
    public void setWifiPowerOnForced(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("wifiPowerOnForced", value);
    }
}
