package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DepIOSEnrollmentProfile extends DepEnrollmentBaseProfile implements Parsable {
    /** Indicates if Apperance screen is disabled */
    private Boolean _appearanceScreenDisabled;
    /** Indicates if the device will need to wait for configured confirmation */
    private Boolean _awaitDeviceConfiguredConfirmation;
    /** Carrier URL for activating device eSIM. */
    private String _carrierActivationUrl;
    /** If set, indicates which Vpp token should be used to deploy the Company Portal w/ device licensing. 'enableAuthenticationViaCompanyPortal' must be set in order for this property to be set. */
    private String _companyPortalVppTokenId;
    /** Indicates if Device To Device Migration is disabled */
    private Boolean _deviceToDeviceMigrationDisabled;
    /** This indicates whether the device is to be enrolled in a mode which enables multi user scenarios. Only applicable in shared iPads. */
    private Boolean _enableSharedIPad;
    /** Tells the device to enable single app mode and apply app-lock during enrollment. Default is false. 'enableAuthenticationViaCompanyPortal' and 'companyPortalVppTokenId' must be set for this property to be set. */
    private Boolean _enableSingleAppEnrollmentMode;
    /** Indicates if Express Language screen is disabled */
    private Boolean _expressLanguageScreenDisabled;
    /** Indicates if temporary sessions is enabled */
    private Boolean _forceTemporarySession;
    /** Indicates if home button sensitivity screen is disabled */
    private Boolean _homeButtonScreenDisabled;
    /** Indicates if iMessage and FaceTime screen is disabled */
    private Boolean _iMessageAndFaceTimeScreenDisabled;
    /** The iTunesPairingMode property */
    private ITunesPairingMode _iTunesPairingMode;
    /** Management certificates for Apple Configurator */
    private java.util.List<ManagementCertificateWithThumbprint> _managementCertificates;
    /** Indicates if onboarding setup screen is disabled */
    private Boolean _onBoardingScreenDisabled;
    /** Indicates if Passcode setup pane is disabled */
    private Boolean _passCodeDisabled;
    /** Indicates timeout before locked screen requires the user to enter the device passocde to unlock it */
    private Integer _passcodeLockGracePeriodInSeconds;
    /** Indicates if Preferred language screen is disabled */
    private Boolean _preferredLanguageScreenDisabled;
    /** Indicates if Weclome screen is disabled */
    private Boolean _restoreCompletedScreenDisabled;
    /** Indicates if Restore from Android is disabled */
    private Boolean _restoreFromAndroidDisabled;
    /** This specifies the maximum number of users that can use a shared iPad. Only applicable in shared iPad mode. */
    private Integer _sharedIPadMaximumUserCount;
    /** Indicates if the SIMSetup screen is disabled */
    private Boolean _simSetupScreenDisabled;
    /** Indicates if the mandatory sofware update screen is disabled */
    private Boolean _softwareUpdateScreenDisabled;
    /** Indicates timeout of temporary session */
    private Integer _temporarySessionTimeoutInSeconds;
    /** Indicates if Weclome screen is disabled */
    private Boolean _updateCompleteScreenDisabled;
    /** Indicates that this apple device is designated to support 'shared device mode' scenarios. This is distinct from the 'shared iPad' scenario. See https://learn.microsoft.com/mem/intune/enrollment/device-enrollment-shared-ios */
    private Boolean _userlessSharedAadModeEnabled;
    /** Indicates timeout of temporary session */
    private Integer _userSessionTimeoutInSeconds;
    /** Indicates if the watch migration screen is disabled */
    private Boolean _watchMigrationScreenDisabled;
    /** Indicates if Weclome screen is disabled */
    private Boolean _welcomeScreenDisabled;
    /** Indicates if zoom setup pane is disabled */
    private Boolean _zoomDisabled;
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
        return this._appearanceScreenDisabled;
    }
    /**
     * Gets the awaitDeviceConfiguredConfirmation property value. Indicates if the device will need to wait for configured confirmation
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAwaitDeviceConfiguredConfirmation() {
        return this._awaitDeviceConfiguredConfirmation;
    }
    /**
     * Gets the carrierActivationUrl property value. Carrier URL for activating device eSIM.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCarrierActivationUrl() {
        return this._carrierActivationUrl;
    }
    /**
     * Gets the companyPortalVppTokenId property value. If set, indicates which Vpp token should be used to deploy the Company Portal w/ device licensing. 'enableAuthenticationViaCompanyPortal' must be set in order for this property to be set.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCompanyPortalVppTokenId() {
        return this._companyPortalVppTokenId;
    }
    /**
     * Gets the deviceToDeviceMigrationDisabled property value. Indicates if Device To Device Migration is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDeviceToDeviceMigrationDisabled() {
        return this._deviceToDeviceMigrationDisabled;
    }
    /**
     * Gets the enableSharedIPad property value. This indicates whether the device is to be enrolled in a mode which enables multi user scenarios. Only applicable in shared iPads.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableSharedIPad() {
        return this._enableSharedIPad;
    }
    /**
     * Gets the enableSingleAppEnrollmentMode property value. Tells the device to enable single app mode and apply app-lock during enrollment. Default is false. 'enableAuthenticationViaCompanyPortal' and 'companyPortalVppTokenId' must be set for this property to be set.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableSingleAppEnrollmentMode() {
        return this._enableSingleAppEnrollmentMode;
    }
    /**
     * Gets the expressLanguageScreenDisabled property value. Indicates if Express Language screen is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getExpressLanguageScreenDisabled() {
        return this._expressLanguageScreenDisabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
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
        return this._forceTemporarySession;
    }
    /**
     * Gets the homeButtonScreenDisabled property value. Indicates if home button sensitivity screen is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHomeButtonScreenDisabled() {
        return this._homeButtonScreenDisabled;
    }
    /**
     * Gets the iMessageAndFaceTimeScreenDisabled property value. Indicates if iMessage and FaceTime screen is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIMessageAndFaceTimeScreenDisabled() {
        return this._iMessageAndFaceTimeScreenDisabled;
    }
    /**
     * Gets the iTunesPairingMode property value. The iTunesPairingMode property
     * @return a iTunesPairingMode
     */
    @javax.annotation.Nullable
    public ITunesPairingMode getITunesPairingMode() {
        return this._iTunesPairingMode;
    }
    /**
     * Gets the managementCertificates property value. Management certificates for Apple Configurator
     * @return a managementCertificateWithThumbprint
     */
    @javax.annotation.Nullable
    public java.util.List<ManagementCertificateWithThumbprint> getManagementCertificates() {
        return this._managementCertificates;
    }
    /**
     * Gets the onBoardingScreenDisabled property value. Indicates if onboarding setup screen is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOnBoardingScreenDisabled() {
        return this._onBoardingScreenDisabled;
    }
    /**
     * Gets the passCodeDisabled property value. Indicates if Passcode setup pane is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPassCodeDisabled() {
        return this._passCodeDisabled;
    }
    /**
     * Gets the passcodeLockGracePeriodInSeconds property value. Indicates timeout before locked screen requires the user to enter the device passocde to unlock it
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasscodeLockGracePeriodInSeconds() {
        return this._passcodeLockGracePeriodInSeconds;
    }
    /**
     * Gets the preferredLanguageScreenDisabled property value. Indicates if Preferred language screen is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPreferredLanguageScreenDisabled() {
        return this._preferredLanguageScreenDisabled;
    }
    /**
     * Gets the restoreCompletedScreenDisabled property value. Indicates if Weclome screen is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRestoreCompletedScreenDisabled() {
        return this._restoreCompletedScreenDisabled;
    }
    /**
     * Gets the restoreFromAndroidDisabled property value. Indicates if Restore from Android is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRestoreFromAndroidDisabled() {
        return this._restoreFromAndroidDisabled;
    }
    /**
     * Gets the sharedIPadMaximumUserCount property value. This specifies the maximum number of users that can use a shared iPad. Only applicable in shared iPad mode.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSharedIPadMaximumUserCount() {
        return this._sharedIPadMaximumUserCount;
    }
    /**
     * Gets the simSetupScreenDisabled property value. Indicates if the SIMSetup screen is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSimSetupScreenDisabled() {
        return this._simSetupScreenDisabled;
    }
    /**
     * Gets the softwareUpdateScreenDisabled property value. Indicates if the mandatory sofware update screen is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSoftwareUpdateScreenDisabled() {
        return this._softwareUpdateScreenDisabled;
    }
    /**
     * Gets the temporarySessionTimeoutInSeconds property value. Indicates timeout of temporary session
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTemporarySessionTimeoutInSeconds() {
        return this._temporarySessionTimeoutInSeconds;
    }
    /**
     * Gets the updateCompleteScreenDisabled property value. Indicates if Weclome screen is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUpdateCompleteScreenDisabled() {
        return this._updateCompleteScreenDisabled;
    }
    /**
     * Gets the userlessSharedAadModeEnabled property value. Indicates that this apple device is designated to support 'shared device mode' scenarios. This is distinct from the 'shared iPad' scenario. See https://learn.microsoft.com/mem/intune/enrollment/device-enrollment-shared-ios
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUserlessSharedAadModeEnabled() {
        return this._userlessSharedAadModeEnabled;
    }
    /**
     * Gets the userSessionTimeoutInSeconds property value. Indicates timeout of temporary session
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUserSessionTimeoutInSeconds() {
        return this._userSessionTimeoutInSeconds;
    }
    /**
     * Gets the watchMigrationScreenDisabled property value. Indicates if the watch migration screen is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWatchMigrationScreenDisabled() {
        return this._watchMigrationScreenDisabled;
    }
    /**
     * Gets the welcomeScreenDisabled property value. Indicates if Weclome screen is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWelcomeScreenDisabled() {
        return this._welcomeScreenDisabled;
    }
    /**
     * Gets the zoomDisabled property value. Indicates if zoom setup pane is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getZoomDisabled() {
        return this._zoomDisabled;
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
        this._appearanceScreenDisabled = value;
    }
    /**
     * Sets the awaitDeviceConfiguredConfirmation property value. Indicates if the device will need to wait for configured confirmation
     * @param value Value to set for the awaitDeviceConfiguredConfirmation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAwaitDeviceConfiguredConfirmation(@javax.annotation.Nullable final Boolean value) {
        this._awaitDeviceConfiguredConfirmation = value;
    }
    /**
     * Sets the carrierActivationUrl property value. Carrier URL for activating device eSIM.
     * @param value Value to set for the carrierActivationUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCarrierActivationUrl(@javax.annotation.Nullable final String value) {
        this._carrierActivationUrl = value;
    }
    /**
     * Sets the companyPortalVppTokenId property value. If set, indicates which Vpp token should be used to deploy the Company Portal w/ device licensing. 'enableAuthenticationViaCompanyPortal' must be set in order for this property to be set.
     * @param value Value to set for the companyPortalVppTokenId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompanyPortalVppTokenId(@javax.annotation.Nullable final String value) {
        this._companyPortalVppTokenId = value;
    }
    /**
     * Sets the deviceToDeviceMigrationDisabled property value. Indicates if Device To Device Migration is disabled
     * @param value Value to set for the deviceToDeviceMigrationDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceToDeviceMigrationDisabled(@javax.annotation.Nullable final Boolean value) {
        this._deviceToDeviceMigrationDisabled = value;
    }
    /**
     * Sets the enableSharedIPad property value. This indicates whether the device is to be enrolled in a mode which enables multi user scenarios. Only applicable in shared iPads.
     * @param value Value to set for the enableSharedIPad property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnableSharedIPad(@javax.annotation.Nullable final Boolean value) {
        this._enableSharedIPad = value;
    }
    /**
     * Sets the enableSingleAppEnrollmentMode property value. Tells the device to enable single app mode and apply app-lock during enrollment. Default is false. 'enableAuthenticationViaCompanyPortal' and 'companyPortalVppTokenId' must be set for this property to be set.
     * @param value Value to set for the enableSingleAppEnrollmentMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnableSingleAppEnrollmentMode(@javax.annotation.Nullable final Boolean value) {
        this._enableSingleAppEnrollmentMode = value;
    }
    /**
     * Sets the expressLanguageScreenDisabled property value. Indicates if Express Language screen is disabled
     * @param value Value to set for the expressLanguageScreenDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExpressLanguageScreenDisabled(@javax.annotation.Nullable final Boolean value) {
        this._expressLanguageScreenDisabled = value;
    }
    /**
     * Sets the forceTemporarySession property value. Indicates if temporary sessions is enabled
     * @param value Value to set for the forceTemporarySession property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setForceTemporarySession(@javax.annotation.Nullable final Boolean value) {
        this._forceTemporarySession = value;
    }
    /**
     * Sets the homeButtonScreenDisabled property value. Indicates if home button sensitivity screen is disabled
     * @param value Value to set for the homeButtonScreenDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHomeButtonScreenDisabled(@javax.annotation.Nullable final Boolean value) {
        this._homeButtonScreenDisabled = value;
    }
    /**
     * Sets the iMessageAndFaceTimeScreenDisabled property value. Indicates if iMessage and FaceTime screen is disabled
     * @param value Value to set for the iMessageAndFaceTimeScreenDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIMessageAndFaceTimeScreenDisabled(@javax.annotation.Nullable final Boolean value) {
        this._iMessageAndFaceTimeScreenDisabled = value;
    }
    /**
     * Sets the iTunesPairingMode property value. The iTunesPairingMode property
     * @param value Value to set for the iTunesPairingMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setITunesPairingMode(@javax.annotation.Nullable final ITunesPairingMode value) {
        this._iTunesPairingMode = value;
    }
    /**
     * Sets the managementCertificates property value. Management certificates for Apple Configurator
     * @param value Value to set for the managementCertificates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagementCertificates(@javax.annotation.Nullable final java.util.List<ManagementCertificateWithThumbprint> value) {
        this._managementCertificates = value;
    }
    /**
     * Sets the onBoardingScreenDisabled property value. Indicates if onboarding setup screen is disabled
     * @param value Value to set for the onBoardingScreenDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnBoardingScreenDisabled(@javax.annotation.Nullable final Boolean value) {
        this._onBoardingScreenDisabled = value;
    }
    /**
     * Sets the passCodeDisabled property value. Indicates if Passcode setup pane is disabled
     * @param value Value to set for the passCodeDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPassCodeDisabled(@javax.annotation.Nullable final Boolean value) {
        this._passCodeDisabled = value;
    }
    /**
     * Sets the passcodeLockGracePeriodInSeconds property value. Indicates timeout before locked screen requires the user to enter the device passocde to unlock it
     * @param value Value to set for the passcodeLockGracePeriodInSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasscodeLockGracePeriodInSeconds(@javax.annotation.Nullable final Integer value) {
        this._passcodeLockGracePeriodInSeconds = value;
    }
    /**
     * Sets the preferredLanguageScreenDisabled property value. Indicates if Preferred language screen is disabled
     * @param value Value to set for the preferredLanguageScreenDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPreferredLanguageScreenDisabled(@javax.annotation.Nullable final Boolean value) {
        this._preferredLanguageScreenDisabled = value;
    }
    /**
     * Sets the restoreCompletedScreenDisabled property value. Indicates if Weclome screen is disabled
     * @param value Value to set for the restoreCompletedScreenDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRestoreCompletedScreenDisabled(@javax.annotation.Nullable final Boolean value) {
        this._restoreCompletedScreenDisabled = value;
    }
    /**
     * Sets the restoreFromAndroidDisabled property value. Indicates if Restore from Android is disabled
     * @param value Value to set for the restoreFromAndroidDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRestoreFromAndroidDisabled(@javax.annotation.Nullable final Boolean value) {
        this._restoreFromAndroidDisabled = value;
    }
    /**
     * Sets the sharedIPadMaximumUserCount property value. This specifies the maximum number of users that can use a shared iPad. Only applicable in shared iPad mode.
     * @param value Value to set for the sharedIPadMaximumUserCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharedIPadMaximumUserCount(@javax.annotation.Nullable final Integer value) {
        this._sharedIPadMaximumUserCount = value;
    }
    /**
     * Sets the simSetupScreenDisabled property value. Indicates if the SIMSetup screen is disabled
     * @param value Value to set for the simSetupScreenDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSimSetupScreenDisabled(@javax.annotation.Nullable final Boolean value) {
        this._simSetupScreenDisabled = value;
    }
    /**
     * Sets the softwareUpdateScreenDisabled property value. Indicates if the mandatory sofware update screen is disabled
     * @param value Value to set for the softwareUpdateScreenDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSoftwareUpdateScreenDisabled(@javax.annotation.Nullable final Boolean value) {
        this._softwareUpdateScreenDisabled = value;
    }
    /**
     * Sets the temporarySessionTimeoutInSeconds property value. Indicates timeout of temporary session
     * @param value Value to set for the temporarySessionTimeoutInSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTemporarySessionTimeoutInSeconds(@javax.annotation.Nullable final Integer value) {
        this._temporarySessionTimeoutInSeconds = value;
    }
    /**
     * Sets the updateCompleteScreenDisabled property value. Indicates if Weclome screen is disabled
     * @param value Value to set for the updateCompleteScreenDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpdateCompleteScreenDisabled(@javax.annotation.Nullable final Boolean value) {
        this._updateCompleteScreenDisabled = value;
    }
    /**
     * Sets the userlessSharedAadModeEnabled property value. Indicates that this apple device is designated to support 'shared device mode' scenarios. This is distinct from the 'shared iPad' scenario. See https://learn.microsoft.com/mem/intune/enrollment/device-enrollment-shared-ios
     * @param value Value to set for the userlessSharedAadModeEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserlessSharedAadModeEnabled(@javax.annotation.Nullable final Boolean value) {
        this._userlessSharedAadModeEnabled = value;
    }
    /**
     * Sets the userSessionTimeoutInSeconds property value. Indicates timeout of temporary session
     * @param value Value to set for the userSessionTimeoutInSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserSessionTimeoutInSeconds(@javax.annotation.Nullable final Integer value) {
        this._userSessionTimeoutInSeconds = value;
    }
    /**
     * Sets the watchMigrationScreenDisabled property value. Indicates if the watch migration screen is disabled
     * @param value Value to set for the watchMigrationScreenDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWatchMigrationScreenDisabled(@javax.annotation.Nullable final Boolean value) {
        this._watchMigrationScreenDisabled = value;
    }
    /**
     * Sets the welcomeScreenDisabled property value. Indicates if Weclome screen is disabled
     * @param value Value to set for the welcomeScreenDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWelcomeScreenDisabled(@javax.annotation.Nullable final Boolean value) {
        this._welcomeScreenDisabled = value;
    }
    /**
     * Sets the zoomDisabled property value. Indicates if zoom setup pane is disabled
     * @param value Value to set for the zoomDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setZoomDisabled(@javax.annotation.Nullable final Boolean value) {
        this._zoomDisabled = value;
    }
}
