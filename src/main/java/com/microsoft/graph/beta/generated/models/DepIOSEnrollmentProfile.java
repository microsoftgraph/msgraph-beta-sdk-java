package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The DepIOSEnrollmentProfile resource represents an Apple Device Enrollment Program (DEP) enrollment profile specific to iOS configuration. This type of profile must be assigned to Apple DEP serial numbers before the corresponding devices can enroll via DEP.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DepIOSEnrollmentProfile extends DepEnrollmentBaseProfile implements Parsable {
    /**
     * Instantiates a new DepIOSEnrollmentProfile and sets the default values.
     */
    public DepIOSEnrollmentProfile() {
        super();
        this.setOdataType("#microsoft.graph.depIOSEnrollmentProfile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DepIOSEnrollmentProfile
     */
    @jakarta.annotation.Nonnull
    public static DepIOSEnrollmentProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DepIOSEnrollmentProfile();
    }
    /**
     * Gets the appearanceScreenDisabled property value. Indicates if Apperance screen is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAppearanceScreenDisabled() {
        return this.backingStore.get("appearanceScreenDisabled");
    }
    /**
     * Gets the awaitDeviceConfiguredConfirmation property value. Indicates if the device will need to wait for configured confirmation
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAwaitDeviceConfiguredConfirmation() {
        return this.backingStore.get("awaitDeviceConfiguredConfirmation");
    }
    /**
     * Gets the carrierActivationUrl property value. Carrier URL for activating device eSIM.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCarrierActivationUrl() {
        return this.backingStore.get("carrierActivationUrl");
    }
    /**
     * Gets the companyPortalVppTokenId property value. If set, indicates which Vpp token should be used to deploy the Company Portal w/ device licensing. 'enableAuthenticationViaCompanyPortal' must be set in order for this property to be set.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCompanyPortalVppTokenId() {
        return this.backingStore.get("companyPortalVppTokenId");
    }
    /**
     * Gets the deviceToDeviceMigrationDisabled property value. Indicates if Device To Device Migration is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDeviceToDeviceMigrationDisabled() {
        return this.backingStore.get("deviceToDeviceMigrationDisabled");
    }
    /**
     * Gets the enableSharedIPad property value. This indicates whether the device is to be enrolled in a mode which enables multi user scenarios. Only applicable in shared iPads.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableSharedIPad() {
        return this.backingStore.get("enableSharedIPad");
    }
    /**
     * Gets the enableSingleAppEnrollmentMode property value. Tells the device to enable single app mode and apply app-lock during enrollment. Default is false. 'enableAuthenticationViaCompanyPortal' and 'companyPortalVppTokenId' must be set for this property to be set.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableSingleAppEnrollmentMode() {
        return this.backingStore.get("enableSingleAppEnrollmentMode");
    }
    /**
     * Gets the expressLanguageScreenDisabled property value. Indicates if Express Language screen is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getExpressLanguageScreenDisabled() {
        return this.backingStore.get("expressLanguageScreenDisabled");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appearanceScreenDisabled", (n) -> { this.setAppearanceScreenDisabled(n.getBooleanValue()); });
        deserializerMap.put("awaitDeviceConfiguredConfirmation", (n) -> { this.setAwaitDeviceConfiguredConfirmation(n.getBooleanValue()); });
        deserializerMap.put("carrierActivationUrl", (n) -> { this.setCarrierActivationUrl(n.getStringValue()); });
        deserializerMap.put("companyPortalVppTokenId", (n) -> { this.setCompanyPortalVppTokenId(n.getStringValue()); });
        deserializerMap.put("deviceToDeviceMigrationDisabled", (n) -> { this.setDeviceToDeviceMigrationDisabled(n.getBooleanValue()); });
        deserializerMap.put("enableSharedIPad", (n) -> { this.setEnableSharedIPad(n.getBooleanValue()); });
        deserializerMap.put("enableSingleAppEnrollmentMode", (n) -> { this.setEnableSingleAppEnrollmentMode(n.getBooleanValue()); });
        deserializerMap.put("expressLanguageScreenDisabled", (n) -> { this.setExpressLanguageScreenDisabled(n.getBooleanValue()); });
        deserializerMap.put("forceTemporarySession", (n) -> { this.setForceTemporarySession(n.getBooleanValue()); });
        deserializerMap.put("homeButtonScreenDisabled", (n) -> { this.setHomeButtonScreenDisabled(n.getBooleanValue()); });
        deserializerMap.put("iMessageAndFaceTimeScreenDisabled", (n) -> { this.setIMessageAndFaceTimeScreenDisabled(n.getBooleanValue()); });
        deserializerMap.put("iTunesPairingMode", (n) -> { this.setITunesPairingMode(n.getEnumValue(ITunesPairingMode::forValue)); });
        deserializerMap.put("managementCertificates", (n) -> { this.setManagementCertificates(n.getCollectionOfObjectValues(ManagementCertificateWithThumbprint::createFromDiscriminatorValue)); });
        deserializerMap.put("onBoardingScreenDisabled", (n) -> { this.setOnBoardingScreenDisabled(n.getBooleanValue()); });
        deserializerMap.put("passCodeDisabled", (n) -> { this.setPassCodeDisabled(n.getBooleanValue()); });
        deserializerMap.put("passcodeLockGracePeriodInSeconds", (n) -> { this.setPasscodeLockGracePeriodInSeconds(n.getIntegerValue()); });
        deserializerMap.put("preferredLanguageScreenDisabled", (n) -> { this.setPreferredLanguageScreenDisabled(n.getBooleanValue()); });
        deserializerMap.put("restoreCompletedScreenDisabled", (n) -> { this.setRestoreCompletedScreenDisabled(n.getBooleanValue()); });
        deserializerMap.put("restoreFromAndroidDisabled", (n) -> { this.setRestoreFromAndroidDisabled(n.getBooleanValue()); });
        deserializerMap.put("sharedIPadMaximumUserCount", (n) -> { this.setSharedIPadMaximumUserCount(n.getIntegerValue()); });
        deserializerMap.put("simSetupScreenDisabled", (n) -> { this.setSimSetupScreenDisabled(n.getBooleanValue()); });
        deserializerMap.put("softwareUpdateScreenDisabled", (n) -> { this.setSoftwareUpdateScreenDisabled(n.getBooleanValue()); });
        deserializerMap.put("temporarySessionTimeoutInSeconds", (n) -> { this.setTemporarySessionTimeoutInSeconds(n.getIntegerValue()); });
        deserializerMap.put("updateCompleteScreenDisabled", (n) -> { this.setUpdateCompleteScreenDisabled(n.getBooleanValue()); });
        deserializerMap.put("userlessSharedAadModeEnabled", (n) -> { this.setUserlessSharedAadModeEnabled(n.getBooleanValue()); });
        deserializerMap.put("userSessionTimeoutInSeconds", (n) -> { this.setUserSessionTimeoutInSeconds(n.getIntegerValue()); });
        deserializerMap.put("watchMigrationScreenDisabled", (n) -> { this.setWatchMigrationScreenDisabled(n.getBooleanValue()); });
        deserializerMap.put("welcomeScreenDisabled", (n) -> { this.setWelcomeScreenDisabled(n.getBooleanValue()); });
        deserializerMap.put("zoomDisabled", (n) -> { this.setZoomDisabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the forceTemporarySession property value. Indicates if temporary sessions is enabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getForceTemporarySession() {
        return this.backingStore.get("forceTemporarySession");
    }
    /**
     * Gets the homeButtonScreenDisabled property value. Indicates if home button sensitivity screen is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHomeButtonScreenDisabled() {
        return this.backingStore.get("homeButtonScreenDisabled");
    }
    /**
     * Gets the iMessageAndFaceTimeScreenDisabled property value. Indicates if iMessage and FaceTime screen is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIMessageAndFaceTimeScreenDisabled() {
        return this.backingStore.get("iMessageAndFaceTimeScreenDisabled");
    }
    /**
     * Gets the iTunesPairingMode property value. The iTunesPairingMode property
     * @return a ITunesPairingMode
     */
    @jakarta.annotation.Nullable
    public ITunesPairingMode getITunesPairingMode() {
        return this.backingStore.get("iTunesPairingMode");
    }
    /**
     * Gets the managementCertificates property value. Management certificates for Apple Configurator
     * @return a java.util.List<ManagementCertificateWithThumbprint>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagementCertificateWithThumbprint> getManagementCertificates() {
        return this.backingStore.get("managementCertificates");
    }
    /**
     * Gets the onBoardingScreenDisabled property value. Indicates if onboarding setup screen is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getOnBoardingScreenDisabled() {
        return this.backingStore.get("onBoardingScreenDisabled");
    }
    /**
     * Gets the passCodeDisabled property value. Indicates if Passcode setup pane is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPassCodeDisabled() {
        return this.backingStore.get("passCodeDisabled");
    }
    /**
     * Gets the passcodeLockGracePeriodInSeconds property value. Indicates timeout before locked screen requires the user to enter the device passocde to unlock it
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasscodeLockGracePeriodInSeconds() {
        return this.backingStore.get("passcodeLockGracePeriodInSeconds");
    }
    /**
     * Gets the preferredLanguageScreenDisabled property value. Indicates if Preferred language screen is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPreferredLanguageScreenDisabled() {
        return this.backingStore.get("preferredLanguageScreenDisabled");
    }
    /**
     * Gets the restoreCompletedScreenDisabled property value. Indicates if Weclome screen is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRestoreCompletedScreenDisabled() {
        return this.backingStore.get("restoreCompletedScreenDisabled");
    }
    /**
     * Gets the restoreFromAndroidDisabled property value. Indicates if Restore from Android is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRestoreFromAndroidDisabled() {
        return this.backingStore.get("restoreFromAndroidDisabled");
    }
    /**
     * Gets the sharedIPadMaximumUserCount property value. This specifies the maximum number of users that can use a shared iPad. Only applicable in shared iPad mode.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSharedIPadMaximumUserCount() {
        return this.backingStore.get("sharedIPadMaximumUserCount");
    }
    /**
     * Gets the simSetupScreenDisabled property value. Indicates if the SIMSetup screen is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSimSetupScreenDisabled() {
        return this.backingStore.get("simSetupScreenDisabled");
    }
    /**
     * Gets the softwareUpdateScreenDisabled property value. Indicates if the mandatory sofware update screen is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSoftwareUpdateScreenDisabled() {
        return this.backingStore.get("softwareUpdateScreenDisabled");
    }
    /**
     * Gets the temporarySessionTimeoutInSeconds property value. Indicates timeout of temporary session
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTemporarySessionTimeoutInSeconds() {
        return this.backingStore.get("temporarySessionTimeoutInSeconds");
    }
    /**
     * Gets the updateCompleteScreenDisabled property value. Indicates if Weclome screen is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUpdateCompleteScreenDisabled() {
        return this.backingStore.get("updateCompleteScreenDisabled");
    }
    /**
     * Gets the userlessSharedAadModeEnabled property value. Indicates that this apple device is designated to support 'shared device mode' scenarios. This is distinct from the 'shared iPad' scenario. See https://learn.microsoft.com/mem/intune/enrollment/device-enrollment-shared-ios
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUserlessSharedAadModeEnabled() {
        return this.backingStore.get("userlessSharedAadModeEnabled");
    }
    /**
     * Gets the userSessionTimeoutInSeconds property value. Indicates timeout of temporary session
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getUserSessionTimeoutInSeconds() {
        return this.backingStore.get("userSessionTimeoutInSeconds");
    }
    /**
     * Gets the watchMigrationScreenDisabled property value. Indicates if the watch migration screen is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWatchMigrationScreenDisabled() {
        return this.backingStore.get("watchMigrationScreenDisabled");
    }
    /**
     * Gets the welcomeScreenDisabled property value. Indicates if Weclome screen is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWelcomeScreenDisabled() {
        return this.backingStore.get("welcomeScreenDisabled");
    }
    /**
     * Gets the zoomDisabled property value. Indicates if zoom setup pane is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getZoomDisabled() {
        return this.backingStore.get("zoomDisabled");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("appearanceScreenDisabled", this.getAppearanceScreenDisabled());
        writer.writeBooleanValue("awaitDeviceConfiguredConfirmation", this.getAwaitDeviceConfiguredConfirmation());
        writer.writeStringValue("carrierActivationUrl", this.getCarrierActivationUrl());
        writer.writeStringValue("companyPortalVppTokenId", this.getCompanyPortalVppTokenId());
        writer.writeBooleanValue("deviceToDeviceMigrationDisabled", this.getDeviceToDeviceMigrationDisabled());
        writer.writeBooleanValue("enableSharedIPad", this.getEnableSharedIPad());
        writer.writeBooleanValue("enableSingleAppEnrollmentMode", this.getEnableSingleAppEnrollmentMode());
        writer.writeBooleanValue("expressLanguageScreenDisabled", this.getExpressLanguageScreenDisabled());
        writer.writeBooleanValue("forceTemporarySession", this.getForceTemporarySession());
        writer.writeBooleanValue("homeButtonScreenDisabled", this.getHomeButtonScreenDisabled());
        writer.writeBooleanValue("iMessageAndFaceTimeScreenDisabled", this.getIMessageAndFaceTimeScreenDisabled());
        writer.writeEnumValue("iTunesPairingMode", this.getITunesPairingMode());
        writer.writeCollectionOfObjectValues("managementCertificates", this.getManagementCertificates());
        writer.writeBooleanValue("onBoardingScreenDisabled", this.getOnBoardingScreenDisabled());
        writer.writeBooleanValue("passCodeDisabled", this.getPassCodeDisabled());
        writer.writeIntegerValue("passcodeLockGracePeriodInSeconds", this.getPasscodeLockGracePeriodInSeconds());
        writer.writeBooleanValue("preferredLanguageScreenDisabled", this.getPreferredLanguageScreenDisabled());
        writer.writeBooleanValue("restoreCompletedScreenDisabled", this.getRestoreCompletedScreenDisabled());
        writer.writeBooleanValue("restoreFromAndroidDisabled", this.getRestoreFromAndroidDisabled());
        writer.writeIntegerValue("sharedIPadMaximumUserCount", this.getSharedIPadMaximumUserCount());
        writer.writeBooleanValue("simSetupScreenDisabled", this.getSimSetupScreenDisabled());
        writer.writeBooleanValue("softwareUpdateScreenDisabled", this.getSoftwareUpdateScreenDisabled());
        writer.writeIntegerValue("temporarySessionTimeoutInSeconds", this.getTemporarySessionTimeoutInSeconds());
        writer.writeBooleanValue("updateCompleteScreenDisabled", this.getUpdateCompleteScreenDisabled());
        writer.writeBooleanValue("userlessSharedAadModeEnabled", this.getUserlessSharedAadModeEnabled());
        writer.writeIntegerValue("userSessionTimeoutInSeconds", this.getUserSessionTimeoutInSeconds());
        writer.writeBooleanValue("watchMigrationScreenDisabled", this.getWatchMigrationScreenDisabled());
        writer.writeBooleanValue("welcomeScreenDisabled", this.getWelcomeScreenDisabled());
        writer.writeBooleanValue("zoomDisabled", this.getZoomDisabled());
    }
    /**
     * Sets the appearanceScreenDisabled property value. Indicates if Apperance screen is disabled
     * @param value Value to set for the appearanceScreenDisabled property.
     */
    public void setAppearanceScreenDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("appearanceScreenDisabled", value);
    }
    /**
     * Sets the awaitDeviceConfiguredConfirmation property value. Indicates if the device will need to wait for configured confirmation
     * @param value Value to set for the awaitDeviceConfiguredConfirmation property.
     */
    public void setAwaitDeviceConfiguredConfirmation(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("awaitDeviceConfiguredConfirmation", value);
    }
    /**
     * Sets the carrierActivationUrl property value. Carrier URL for activating device eSIM.
     * @param value Value to set for the carrierActivationUrl property.
     */
    public void setCarrierActivationUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("carrierActivationUrl", value);
    }
    /**
     * Sets the companyPortalVppTokenId property value. If set, indicates which Vpp token should be used to deploy the Company Portal w/ device licensing. 'enableAuthenticationViaCompanyPortal' must be set in order for this property to be set.
     * @param value Value to set for the companyPortalVppTokenId property.
     */
    public void setCompanyPortalVppTokenId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("companyPortalVppTokenId", value);
    }
    /**
     * Sets the deviceToDeviceMigrationDisabled property value. Indicates if Device To Device Migration is disabled
     * @param value Value to set for the deviceToDeviceMigrationDisabled property.
     */
    public void setDeviceToDeviceMigrationDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("deviceToDeviceMigrationDisabled", value);
    }
    /**
     * Sets the enableSharedIPad property value. This indicates whether the device is to be enrolled in a mode which enables multi user scenarios. Only applicable in shared iPads.
     * @param value Value to set for the enableSharedIPad property.
     */
    public void setEnableSharedIPad(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enableSharedIPad", value);
    }
    /**
     * Sets the enableSingleAppEnrollmentMode property value. Tells the device to enable single app mode and apply app-lock during enrollment. Default is false. 'enableAuthenticationViaCompanyPortal' and 'companyPortalVppTokenId' must be set for this property to be set.
     * @param value Value to set for the enableSingleAppEnrollmentMode property.
     */
    public void setEnableSingleAppEnrollmentMode(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enableSingleAppEnrollmentMode", value);
    }
    /**
     * Sets the expressLanguageScreenDisabled property value. Indicates if Express Language screen is disabled
     * @param value Value to set for the expressLanguageScreenDisabled property.
     */
    public void setExpressLanguageScreenDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("expressLanguageScreenDisabled", value);
    }
    /**
     * Sets the forceTemporarySession property value. Indicates if temporary sessions is enabled
     * @param value Value to set for the forceTemporarySession property.
     */
    public void setForceTemporarySession(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("forceTemporarySession", value);
    }
    /**
     * Sets the homeButtonScreenDisabled property value. Indicates if home button sensitivity screen is disabled
     * @param value Value to set for the homeButtonScreenDisabled property.
     */
    public void setHomeButtonScreenDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("homeButtonScreenDisabled", value);
    }
    /**
     * Sets the iMessageAndFaceTimeScreenDisabled property value. Indicates if iMessage and FaceTime screen is disabled
     * @param value Value to set for the iMessageAndFaceTimeScreenDisabled property.
     */
    public void setIMessageAndFaceTimeScreenDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("iMessageAndFaceTimeScreenDisabled", value);
    }
    /**
     * Sets the iTunesPairingMode property value. The iTunesPairingMode property
     * @param value Value to set for the iTunesPairingMode property.
     */
    public void setITunesPairingMode(@jakarta.annotation.Nullable final ITunesPairingMode value) {
        this.backingStore.set("iTunesPairingMode", value);
    }
    /**
     * Sets the managementCertificates property value. Management certificates for Apple Configurator
     * @param value Value to set for the managementCertificates property.
     */
    public void setManagementCertificates(@jakarta.annotation.Nullable final java.util.List<ManagementCertificateWithThumbprint> value) {
        this.backingStore.set("managementCertificates", value);
    }
    /**
     * Sets the onBoardingScreenDisabled property value. Indicates if onboarding setup screen is disabled
     * @param value Value to set for the onBoardingScreenDisabled property.
     */
    public void setOnBoardingScreenDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("onBoardingScreenDisabled", value);
    }
    /**
     * Sets the passCodeDisabled property value. Indicates if Passcode setup pane is disabled
     * @param value Value to set for the passCodeDisabled property.
     */
    public void setPassCodeDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("passCodeDisabled", value);
    }
    /**
     * Sets the passcodeLockGracePeriodInSeconds property value. Indicates timeout before locked screen requires the user to enter the device passocde to unlock it
     * @param value Value to set for the passcodeLockGracePeriodInSeconds property.
     */
    public void setPasscodeLockGracePeriodInSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passcodeLockGracePeriodInSeconds", value);
    }
    /**
     * Sets the preferredLanguageScreenDisabled property value. Indicates if Preferred language screen is disabled
     * @param value Value to set for the preferredLanguageScreenDisabled property.
     */
    public void setPreferredLanguageScreenDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("preferredLanguageScreenDisabled", value);
    }
    /**
     * Sets the restoreCompletedScreenDisabled property value. Indicates if Weclome screen is disabled
     * @param value Value to set for the restoreCompletedScreenDisabled property.
     */
    public void setRestoreCompletedScreenDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("restoreCompletedScreenDisabled", value);
    }
    /**
     * Sets the restoreFromAndroidDisabled property value. Indicates if Restore from Android is disabled
     * @param value Value to set for the restoreFromAndroidDisabled property.
     */
    public void setRestoreFromAndroidDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("restoreFromAndroidDisabled", value);
    }
    /**
     * Sets the sharedIPadMaximumUserCount property value. This specifies the maximum number of users that can use a shared iPad. Only applicable in shared iPad mode.
     * @param value Value to set for the sharedIPadMaximumUserCount property.
     */
    public void setSharedIPadMaximumUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("sharedIPadMaximumUserCount", value);
    }
    /**
     * Sets the simSetupScreenDisabled property value. Indicates if the SIMSetup screen is disabled
     * @param value Value to set for the simSetupScreenDisabled property.
     */
    public void setSimSetupScreenDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("simSetupScreenDisabled", value);
    }
    /**
     * Sets the softwareUpdateScreenDisabled property value. Indicates if the mandatory sofware update screen is disabled
     * @param value Value to set for the softwareUpdateScreenDisabled property.
     */
    public void setSoftwareUpdateScreenDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("softwareUpdateScreenDisabled", value);
    }
    /**
     * Sets the temporarySessionTimeoutInSeconds property value. Indicates timeout of temporary session
     * @param value Value to set for the temporarySessionTimeoutInSeconds property.
     */
    public void setTemporarySessionTimeoutInSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("temporarySessionTimeoutInSeconds", value);
    }
    /**
     * Sets the updateCompleteScreenDisabled property value. Indicates if Weclome screen is disabled
     * @param value Value to set for the updateCompleteScreenDisabled property.
     */
    public void setUpdateCompleteScreenDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("updateCompleteScreenDisabled", value);
    }
    /**
     * Sets the userlessSharedAadModeEnabled property value. Indicates that this apple device is designated to support 'shared device mode' scenarios. This is distinct from the 'shared iPad' scenario. See https://learn.microsoft.com/mem/intune/enrollment/device-enrollment-shared-ios
     * @param value Value to set for the userlessSharedAadModeEnabled property.
     */
    public void setUserlessSharedAadModeEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("userlessSharedAadModeEnabled", value);
    }
    /**
     * Sets the userSessionTimeoutInSeconds property value. Indicates timeout of temporary session
     * @param value Value to set for the userSessionTimeoutInSeconds property.
     */
    public void setUserSessionTimeoutInSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("userSessionTimeoutInSeconds", value);
    }
    /**
     * Sets the watchMigrationScreenDisabled property value. Indicates if the watch migration screen is disabled
     * @param value Value to set for the watchMigrationScreenDisabled property.
     */
    public void setWatchMigrationScreenDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("watchMigrationScreenDisabled", value);
    }
    /**
     * Sets the welcomeScreenDisabled property value. Indicates if Weclome screen is disabled
     * @param value Value to set for the welcomeScreenDisabled property.
     */
    public void setWelcomeScreenDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("welcomeScreenDisabled", value);
    }
    /**
     * Sets the zoomDisabled property value. Indicates if zoom setup pane is disabled
     * @param value Value to set for the zoomDisabled property.
     */
    public void setZoomDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("zoomDisabled", value);
    }
}
