package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DepIOSEnrollmentProfile extends DepEnrollmentBaseProfile implements Parsable {
    /** Indicates if Apperance screen is disabled */
    private Boolean appearanceScreenDisabled;
    /** Indicates if the device will need to wait for configured confirmation */
    private Boolean awaitDeviceConfiguredConfirmation;
    /** Carrier URL for activating device eSIM. */
    private String carrierActivationUrl;
    /** If set, indicates which Vpp token should be used to deploy the Company Portal w/ device licensing. 'enableAuthenticationViaCompanyPortal' must be set in order for this property to be set. */
    private String companyPortalVppTokenId;
    /** Indicates if Device To Device Migration is disabled */
    private Boolean deviceToDeviceMigrationDisabled;
    /** This indicates whether the device is to be enrolled in a mode which enables multi user scenarios. Only applicable in shared iPads. */
    private Boolean enableSharedIPad;
    /** Tells the device to enable single app mode and apply app-lock during enrollment. Default is false. 'enableAuthenticationViaCompanyPortal' and 'companyPortalVppTokenId' must be set for this property to be set. */
    private Boolean enableSingleAppEnrollmentMode;
    /** Indicates if Express Language screen is disabled */
    private Boolean expressLanguageScreenDisabled;
    /** Indicates if temporary sessions is enabled */
    private Boolean forceTemporarySession;
    /** Indicates if home button sensitivity screen is disabled */
    private Boolean homeButtonScreenDisabled;
    /** Indicates if iMessage and FaceTime screen is disabled */
    private Boolean iMessageAndFaceTimeScreenDisabled;
    /** The iTunesPairingMode property */
    private ITunesPairingMode iTunesPairingMode;
    /** Management certificates for Apple Configurator */
    private java.util.List<ManagementCertificateWithThumbprint> managementCertificates;
    /** Indicates if onboarding setup screen is disabled */
    private Boolean onBoardingScreenDisabled;
    /** Indicates if Passcode setup pane is disabled */
    private Boolean passCodeDisabled;
    /** Indicates timeout before locked screen requires the user to enter the device passocde to unlock it */
    private Integer passcodeLockGracePeriodInSeconds;
    /** Indicates if Preferred language screen is disabled */
    private Boolean preferredLanguageScreenDisabled;
    /** Indicates if Weclome screen is disabled */
    private Boolean restoreCompletedScreenDisabled;
    /** Indicates if Restore from Android is disabled */
    private Boolean restoreFromAndroidDisabled;
    /** This specifies the maximum number of users that can use a shared iPad. Only applicable in shared iPad mode. */
    private Integer sharedIPadMaximumUserCount;
    /** Indicates if the SIMSetup screen is disabled */
    private Boolean simSetupScreenDisabled;
    /** Indicates if the mandatory sofware update screen is disabled */
    private Boolean softwareUpdateScreenDisabled;
    /** Indicates timeout of temporary session */
    private Integer temporarySessionTimeoutInSeconds;
    /** Indicates if Weclome screen is disabled */
    private Boolean updateCompleteScreenDisabled;
    /** Indicates that this apple device is designated to support 'shared device mode' scenarios. This is distinct from the 'shared iPad' scenario. See https://learn.microsoft.com/mem/intune/enrollment/device-enrollment-shared-ios */
    private Boolean userlessSharedAadModeEnabled;
    /** Indicates timeout of temporary session */
    private Integer userSessionTimeoutInSeconds;
    /** Indicates if the watch migration screen is disabled */
    private Boolean watchMigrationScreenDisabled;
    /** Indicates if Weclome screen is disabled */
    private Boolean welcomeScreenDisabled;
    /** Indicates if zoom setup pane is disabled */
    private Boolean zoomDisabled;
    /**
     * Instantiates a new DepIOSEnrollmentProfile and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DepIOSEnrollmentProfile() {
        super();
        this.setOdataType("#microsoft.graph.depIOSEnrollmentProfile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DepIOSEnrollmentProfile
     */
    @javax.annotation.Nonnull
    public static DepIOSEnrollmentProfile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DepIOSEnrollmentProfile();
    }
    /**
     * Gets the appearanceScreenDisabled property value. Indicates if Apperance screen is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAppearanceScreenDisabled() {
        return this.appearanceScreenDisabled;
    }
    /**
     * Gets the awaitDeviceConfiguredConfirmation property value. Indicates if the device will need to wait for configured confirmation
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAwaitDeviceConfiguredConfirmation() {
        return this.awaitDeviceConfiguredConfirmation;
    }
    /**
     * Gets the carrierActivationUrl property value. Carrier URL for activating device eSIM.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCarrierActivationUrl() {
        return this.carrierActivationUrl;
    }
    /**
     * Gets the companyPortalVppTokenId property value. If set, indicates which Vpp token should be used to deploy the Company Portal w/ device licensing. 'enableAuthenticationViaCompanyPortal' must be set in order for this property to be set.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCompanyPortalVppTokenId() {
        return this.companyPortalVppTokenId;
    }
    /**
     * Gets the deviceToDeviceMigrationDisabled property value. Indicates if Device To Device Migration is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDeviceToDeviceMigrationDisabled() {
        return this.deviceToDeviceMigrationDisabled;
    }
    /**
     * Gets the enableSharedIPad property value. This indicates whether the device is to be enrolled in a mode which enables multi user scenarios. Only applicable in shared iPads.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableSharedIPad() {
        return this.enableSharedIPad;
    }
    /**
     * Gets the enableSingleAppEnrollmentMode property value. Tells the device to enable single app mode and apply app-lock during enrollment. Default is false. 'enableAuthenticationViaCompanyPortal' and 'companyPortalVppTokenId' must be set for this property to be set.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableSingleAppEnrollmentMode() {
        return this.enableSingleAppEnrollmentMode;
    }
    /**
     * Gets the expressLanguageScreenDisabled property value. Indicates if Express Language screen is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getExpressLanguageScreenDisabled() {
        return this.expressLanguageScreenDisabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
        deserializerMap.put("iTunesPairingMode", (n) -> { this.setITunesPairingMode(n.getEnumValue(ITunesPairingMode.class)); });
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
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getForceTemporarySession() {
        return this.forceTemporarySession;
    }
    /**
     * Gets the homeButtonScreenDisabled property value. Indicates if home button sensitivity screen is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHomeButtonScreenDisabled() {
        return this.homeButtonScreenDisabled;
    }
    /**
     * Gets the iMessageAndFaceTimeScreenDisabled property value. Indicates if iMessage and FaceTime screen is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIMessageAndFaceTimeScreenDisabled() {
        return this.iMessageAndFaceTimeScreenDisabled;
    }
    /**
     * Gets the iTunesPairingMode property value. The iTunesPairingMode property
     * @return a iTunesPairingMode
     */
    @javax.annotation.Nullable
    public ITunesPairingMode getITunesPairingMode() {
        return this.iTunesPairingMode;
    }
    /**
     * Gets the managementCertificates property value. Management certificates for Apple Configurator
     * @return a managementCertificateWithThumbprint
     */
    @javax.annotation.Nullable
    public java.util.List<ManagementCertificateWithThumbprint> getManagementCertificates() {
        return this.managementCertificates;
    }
    /**
     * Gets the onBoardingScreenDisabled property value. Indicates if onboarding setup screen is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOnBoardingScreenDisabled() {
        return this.onBoardingScreenDisabled;
    }
    /**
     * Gets the passCodeDisabled property value. Indicates if Passcode setup pane is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPassCodeDisabled() {
        return this.passCodeDisabled;
    }
    /**
     * Gets the passcodeLockGracePeriodInSeconds property value. Indicates timeout before locked screen requires the user to enter the device passocde to unlock it
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasscodeLockGracePeriodInSeconds() {
        return this.passcodeLockGracePeriodInSeconds;
    }
    /**
     * Gets the preferredLanguageScreenDisabled property value. Indicates if Preferred language screen is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPreferredLanguageScreenDisabled() {
        return this.preferredLanguageScreenDisabled;
    }
    /**
     * Gets the restoreCompletedScreenDisabled property value. Indicates if Weclome screen is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRestoreCompletedScreenDisabled() {
        return this.restoreCompletedScreenDisabled;
    }
    /**
     * Gets the restoreFromAndroidDisabled property value. Indicates if Restore from Android is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRestoreFromAndroidDisabled() {
        return this.restoreFromAndroidDisabled;
    }
    /**
     * Gets the sharedIPadMaximumUserCount property value. This specifies the maximum number of users that can use a shared iPad. Only applicable in shared iPad mode.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSharedIPadMaximumUserCount() {
        return this.sharedIPadMaximumUserCount;
    }
    /**
     * Gets the simSetupScreenDisabled property value. Indicates if the SIMSetup screen is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSimSetupScreenDisabled() {
        return this.simSetupScreenDisabled;
    }
    /**
     * Gets the softwareUpdateScreenDisabled property value. Indicates if the mandatory sofware update screen is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSoftwareUpdateScreenDisabled() {
        return this.softwareUpdateScreenDisabled;
    }
    /**
     * Gets the temporarySessionTimeoutInSeconds property value. Indicates timeout of temporary session
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTemporarySessionTimeoutInSeconds() {
        return this.temporarySessionTimeoutInSeconds;
    }
    /**
     * Gets the updateCompleteScreenDisabled property value. Indicates if Weclome screen is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUpdateCompleteScreenDisabled() {
        return this.updateCompleteScreenDisabled;
    }
    /**
     * Gets the userlessSharedAadModeEnabled property value. Indicates that this apple device is designated to support 'shared device mode' scenarios. This is distinct from the 'shared iPad' scenario. See https://learn.microsoft.com/mem/intune/enrollment/device-enrollment-shared-ios
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUserlessSharedAadModeEnabled() {
        return this.userlessSharedAadModeEnabled;
    }
    /**
     * Gets the userSessionTimeoutInSeconds property value. Indicates timeout of temporary session
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUserSessionTimeoutInSeconds() {
        return this.userSessionTimeoutInSeconds;
    }
    /**
     * Gets the watchMigrationScreenDisabled property value. Indicates if the watch migration screen is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWatchMigrationScreenDisabled() {
        return this.watchMigrationScreenDisabled;
    }
    /**
     * Gets the welcomeScreenDisabled property value. Indicates if Weclome screen is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWelcomeScreenDisabled() {
        return this.welcomeScreenDisabled;
    }
    /**
     * Gets the zoomDisabled property value. Indicates if zoom setup pane is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getZoomDisabled() {
        return this.zoomDisabled;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppearanceScreenDisabled(@javax.annotation.Nullable final Boolean value) {
        this.appearanceScreenDisabled = value;
    }
    /**
     * Sets the awaitDeviceConfiguredConfirmation property value. Indicates if the device will need to wait for configured confirmation
     * @param value Value to set for the awaitDeviceConfiguredConfirmation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAwaitDeviceConfiguredConfirmation(@javax.annotation.Nullable final Boolean value) {
        this.awaitDeviceConfiguredConfirmation = value;
    }
    /**
     * Sets the carrierActivationUrl property value. Carrier URL for activating device eSIM.
     * @param value Value to set for the carrierActivationUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCarrierActivationUrl(@javax.annotation.Nullable final String value) {
        this.carrierActivationUrl = value;
    }
    /**
     * Sets the companyPortalVppTokenId property value. If set, indicates which Vpp token should be used to deploy the Company Portal w/ device licensing. 'enableAuthenticationViaCompanyPortal' must be set in order for this property to be set.
     * @param value Value to set for the companyPortalVppTokenId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompanyPortalVppTokenId(@javax.annotation.Nullable final String value) {
        this.companyPortalVppTokenId = value;
    }
    /**
     * Sets the deviceToDeviceMigrationDisabled property value. Indicates if Device To Device Migration is disabled
     * @param value Value to set for the deviceToDeviceMigrationDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceToDeviceMigrationDisabled(@javax.annotation.Nullable final Boolean value) {
        this.deviceToDeviceMigrationDisabled = value;
    }
    /**
     * Sets the enableSharedIPad property value. This indicates whether the device is to be enrolled in a mode which enables multi user scenarios. Only applicable in shared iPads.
     * @param value Value to set for the enableSharedIPad property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnableSharedIPad(@javax.annotation.Nullable final Boolean value) {
        this.enableSharedIPad = value;
    }
    /**
     * Sets the enableSingleAppEnrollmentMode property value. Tells the device to enable single app mode and apply app-lock during enrollment. Default is false. 'enableAuthenticationViaCompanyPortal' and 'companyPortalVppTokenId' must be set for this property to be set.
     * @param value Value to set for the enableSingleAppEnrollmentMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnableSingleAppEnrollmentMode(@javax.annotation.Nullable final Boolean value) {
        this.enableSingleAppEnrollmentMode = value;
    }
    /**
     * Sets the expressLanguageScreenDisabled property value. Indicates if Express Language screen is disabled
     * @param value Value to set for the expressLanguageScreenDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExpressLanguageScreenDisabled(@javax.annotation.Nullable final Boolean value) {
        this.expressLanguageScreenDisabled = value;
    }
    /**
     * Sets the forceTemporarySession property value. Indicates if temporary sessions is enabled
     * @param value Value to set for the forceTemporarySession property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setForceTemporarySession(@javax.annotation.Nullable final Boolean value) {
        this.forceTemporarySession = value;
    }
    /**
     * Sets the homeButtonScreenDisabled property value. Indicates if home button sensitivity screen is disabled
     * @param value Value to set for the homeButtonScreenDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHomeButtonScreenDisabled(@javax.annotation.Nullable final Boolean value) {
        this.homeButtonScreenDisabled = value;
    }
    /**
     * Sets the iMessageAndFaceTimeScreenDisabled property value. Indicates if iMessage and FaceTime screen is disabled
     * @param value Value to set for the iMessageAndFaceTimeScreenDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIMessageAndFaceTimeScreenDisabled(@javax.annotation.Nullable final Boolean value) {
        this.iMessageAndFaceTimeScreenDisabled = value;
    }
    /**
     * Sets the iTunesPairingMode property value. The iTunesPairingMode property
     * @param value Value to set for the iTunesPairingMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setITunesPairingMode(@javax.annotation.Nullable final ITunesPairingMode value) {
        this.iTunesPairingMode = value;
    }
    /**
     * Sets the managementCertificates property value. Management certificates for Apple Configurator
     * @param value Value to set for the managementCertificates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagementCertificates(@javax.annotation.Nullable final java.util.List<ManagementCertificateWithThumbprint> value) {
        this.managementCertificates = value;
    }
    /**
     * Sets the onBoardingScreenDisabled property value. Indicates if onboarding setup screen is disabled
     * @param value Value to set for the onBoardingScreenDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnBoardingScreenDisabled(@javax.annotation.Nullable final Boolean value) {
        this.onBoardingScreenDisabled = value;
    }
    /**
     * Sets the passCodeDisabled property value. Indicates if Passcode setup pane is disabled
     * @param value Value to set for the passCodeDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPassCodeDisabled(@javax.annotation.Nullable final Boolean value) {
        this.passCodeDisabled = value;
    }
    /**
     * Sets the passcodeLockGracePeriodInSeconds property value. Indicates timeout before locked screen requires the user to enter the device passocde to unlock it
     * @param value Value to set for the passcodeLockGracePeriodInSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasscodeLockGracePeriodInSeconds(@javax.annotation.Nullable final Integer value) {
        this.passcodeLockGracePeriodInSeconds = value;
    }
    /**
     * Sets the preferredLanguageScreenDisabled property value. Indicates if Preferred language screen is disabled
     * @param value Value to set for the preferredLanguageScreenDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPreferredLanguageScreenDisabled(@javax.annotation.Nullable final Boolean value) {
        this.preferredLanguageScreenDisabled = value;
    }
    /**
     * Sets the restoreCompletedScreenDisabled property value. Indicates if Weclome screen is disabled
     * @param value Value to set for the restoreCompletedScreenDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRestoreCompletedScreenDisabled(@javax.annotation.Nullable final Boolean value) {
        this.restoreCompletedScreenDisabled = value;
    }
    /**
     * Sets the restoreFromAndroidDisabled property value. Indicates if Restore from Android is disabled
     * @param value Value to set for the restoreFromAndroidDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRestoreFromAndroidDisabled(@javax.annotation.Nullable final Boolean value) {
        this.restoreFromAndroidDisabled = value;
    }
    /**
     * Sets the sharedIPadMaximumUserCount property value. This specifies the maximum number of users that can use a shared iPad. Only applicable in shared iPad mode.
     * @param value Value to set for the sharedIPadMaximumUserCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharedIPadMaximumUserCount(@javax.annotation.Nullable final Integer value) {
        this.sharedIPadMaximumUserCount = value;
    }
    /**
     * Sets the simSetupScreenDisabled property value. Indicates if the SIMSetup screen is disabled
     * @param value Value to set for the simSetupScreenDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSimSetupScreenDisabled(@javax.annotation.Nullable final Boolean value) {
        this.simSetupScreenDisabled = value;
    }
    /**
     * Sets the softwareUpdateScreenDisabled property value. Indicates if the mandatory sofware update screen is disabled
     * @param value Value to set for the softwareUpdateScreenDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSoftwareUpdateScreenDisabled(@javax.annotation.Nullable final Boolean value) {
        this.softwareUpdateScreenDisabled = value;
    }
    /**
     * Sets the temporarySessionTimeoutInSeconds property value. Indicates timeout of temporary session
     * @param value Value to set for the temporarySessionTimeoutInSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTemporarySessionTimeoutInSeconds(@javax.annotation.Nullable final Integer value) {
        this.temporarySessionTimeoutInSeconds = value;
    }
    /**
     * Sets the updateCompleteScreenDisabled property value. Indicates if Weclome screen is disabled
     * @param value Value to set for the updateCompleteScreenDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpdateCompleteScreenDisabled(@javax.annotation.Nullable final Boolean value) {
        this.updateCompleteScreenDisabled = value;
    }
    /**
     * Sets the userlessSharedAadModeEnabled property value. Indicates that this apple device is designated to support 'shared device mode' scenarios. This is distinct from the 'shared iPad' scenario. See https://learn.microsoft.com/mem/intune/enrollment/device-enrollment-shared-ios
     * @param value Value to set for the userlessSharedAadModeEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserlessSharedAadModeEnabled(@javax.annotation.Nullable final Boolean value) {
        this.userlessSharedAadModeEnabled = value;
    }
    /**
     * Sets the userSessionTimeoutInSeconds property value. Indicates timeout of temporary session
     * @param value Value to set for the userSessionTimeoutInSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserSessionTimeoutInSeconds(@javax.annotation.Nullable final Integer value) {
        this.userSessionTimeoutInSeconds = value;
    }
    /**
     * Sets the watchMigrationScreenDisabled property value. Indicates if the watch migration screen is disabled
     * @param value Value to set for the watchMigrationScreenDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWatchMigrationScreenDisabled(@javax.annotation.Nullable final Boolean value) {
        this.watchMigrationScreenDisabled = value;
    }
    /**
     * Sets the welcomeScreenDisabled property value. Indicates if Weclome screen is disabled
     * @param value Value to set for the welcomeScreenDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWelcomeScreenDisabled(@javax.annotation.Nullable final Boolean value) {
        this.welcomeScreenDisabled = value;
    }
    /**
     * Sets the zoomDisabled property value. Indicates if zoom setup pane is disabled
     * @param value Value to set for the zoomDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setZoomDisabled(@javax.annotation.Nullable final Boolean value) {
        this.zoomDisabled = value;
    }
}
