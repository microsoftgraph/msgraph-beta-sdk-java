package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DepEnrollmentProfile extends EnrollmentProfile implements Parsable {
    /** Indicates if Apple id setup pane is disabled */
    private Boolean _appleIdDisabled;
    /** Indicates if Apple pay setup pane is disabled */
    private Boolean _applePayDisabled;
    /** Indicates if the device will need to wait for configured confirmation */
    private Boolean _awaitDeviceConfiguredConfirmation;
    /** Indicates if diagnostics setup pane is disabled */
    private Boolean _diagnosticsDisabled;
    /** This indicates whether the device is to be enrolled in a mode which enables multi user scenarios. Only applicable in shared iPads. */
    private Boolean _enableSharedIPad;
    /** Indicates if this is the default profile */
    private Boolean _isDefault;
    /** Indicates if the profile is mandatory */
    private Boolean _isMandatory;
    /** The iTunesPairingMode property */
    private ITunesPairingMode _iTunesPairingMode;
    /** Indicates if Location service setup pane is disabled */
    private Boolean _locationDisabled;
    /** Indicates if Mac OS file vault is disabled */
    private Boolean _macOSFileVaultDisabled;
    /** Indicates if Mac OS registration is disabled */
    private Boolean _macOSRegistrationDisabled;
    /** Management certificates for Apple Configurator */
    private java.util.List<ManagementCertificateWithThumbprint> _managementCertificates;
    /** Indicates if Passcode setup pane is disabled */
    private Boolean _passCodeDisabled;
    /** Indicates if the profile removal option is disabled */
    private Boolean _profileRemovalDisabled;
    /** Indicates if Restore setup pane is blocked */
    private Boolean _restoreBlocked;
    /** Indicates if Restore from Android is disabled */
    private Boolean _restoreFromAndroidDisabled;
    /** This specifies the maximum number of users that can use a shared iPad. Only applicable in shared iPad mode. */
    private Integer _sharedIPadMaximumUserCount;
    /** Indicates if siri setup pane is disabled */
    private Boolean _siriDisabled;
    /** Supervised mode, True to enable, false otherwise. See https://learn.microsoft.com/intune/deploy-use/enroll-devices-in-microsoft-intune for additional information. */
    private Boolean _supervisedModeEnabled;
    /** Support department information */
    private String _supportDepartment;
    /** Support phone number */
    private String _supportPhoneNumber;
    /** Indicates if 'Terms and Conditions' setup pane is disabled */
    private Boolean _termsAndConditionsDisabled;
    /** Indicates if touch id setup pane is disabled */
    private Boolean _touchIdDisabled;
    /** Indicates if zoom setup pane is disabled */
    private Boolean _zoomDisabled;
    /**
     * Instantiates a new DepEnrollmentProfile and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DepEnrollmentProfile() {
        super();
        this.setOdataType("#microsoft.graph.depEnrollmentProfile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DepEnrollmentProfile
     */
    @javax.annotation.Nonnull
    public static DepEnrollmentProfile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DepEnrollmentProfile();
    }
    /**
     * Gets the appleIdDisabled property value. Indicates if Apple id setup pane is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAppleIdDisabled() {
        return this._appleIdDisabled;
    }
    /**
     * Gets the applePayDisabled property value. Indicates if Apple pay setup pane is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplePayDisabled() {
        return this._applePayDisabled;
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
     * Gets the diagnosticsDisabled property value. Indicates if diagnostics setup pane is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDiagnosticsDisabled() {
        return this._diagnosticsDisabled;
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DepEnrollmentProfile currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appleIdDisabled", (n) -> { currentObject.setAppleIdDisabled(n.getBooleanValue()); });
        deserializerMap.put("applePayDisabled", (n) -> { currentObject.setApplePayDisabled(n.getBooleanValue()); });
        deserializerMap.put("awaitDeviceConfiguredConfirmation", (n) -> { currentObject.setAwaitDeviceConfiguredConfirmation(n.getBooleanValue()); });
        deserializerMap.put("diagnosticsDisabled", (n) -> { currentObject.setDiagnosticsDisabled(n.getBooleanValue()); });
        deserializerMap.put("enableSharedIPad", (n) -> { currentObject.setEnableSharedIPad(n.getBooleanValue()); });
        deserializerMap.put("isDefault", (n) -> { currentObject.setIsDefault(n.getBooleanValue()); });
        deserializerMap.put("isMandatory", (n) -> { currentObject.setIsMandatory(n.getBooleanValue()); });
        deserializerMap.put("iTunesPairingMode", (n) -> { currentObject.setITunesPairingMode(n.getEnumValue(ITunesPairingMode.class)); });
        deserializerMap.put("locationDisabled", (n) -> { currentObject.setLocationDisabled(n.getBooleanValue()); });
        deserializerMap.put("macOSFileVaultDisabled", (n) -> { currentObject.setMacOSFileVaultDisabled(n.getBooleanValue()); });
        deserializerMap.put("macOSRegistrationDisabled", (n) -> { currentObject.setMacOSRegistrationDisabled(n.getBooleanValue()); });
        deserializerMap.put("managementCertificates", (n) -> { currentObject.setManagementCertificates(n.getCollectionOfObjectValues(ManagementCertificateWithThumbprint::createFromDiscriminatorValue)); });
        deserializerMap.put("passCodeDisabled", (n) -> { currentObject.setPassCodeDisabled(n.getBooleanValue()); });
        deserializerMap.put("profileRemovalDisabled", (n) -> { currentObject.setProfileRemovalDisabled(n.getBooleanValue()); });
        deserializerMap.put("restoreBlocked", (n) -> { currentObject.setRestoreBlocked(n.getBooleanValue()); });
        deserializerMap.put("restoreFromAndroidDisabled", (n) -> { currentObject.setRestoreFromAndroidDisabled(n.getBooleanValue()); });
        deserializerMap.put("sharedIPadMaximumUserCount", (n) -> { currentObject.setSharedIPadMaximumUserCount(n.getIntegerValue()); });
        deserializerMap.put("siriDisabled", (n) -> { currentObject.setSiriDisabled(n.getBooleanValue()); });
        deserializerMap.put("supervisedModeEnabled", (n) -> { currentObject.setSupervisedModeEnabled(n.getBooleanValue()); });
        deserializerMap.put("supportDepartment", (n) -> { currentObject.setSupportDepartment(n.getStringValue()); });
        deserializerMap.put("supportPhoneNumber", (n) -> { currentObject.setSupportPhoneNumber(n.getStringValue()); });
        deserializerMap.put("termsAndConditionsDisabled", (n) -> { currentObject.setTermsAndConditionsDisabled(n.getBooleanValue()); });
        deserializerMap.put("touchIdDisabled", (n) -> { currentObject.setTouchIdDisabled(n.getBooleanValue()); });
        deserializerMap.put("zoomDisabled", (n) -> { currentObject.setZoomDisabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isDefault property value. Indicates if this is the default profile
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDefault() {
        return this._isDefault;
    }
    /**
     * Gets the isMandatory property value. Indicates if the profile is mandatory
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsMandatory() {
        return this._isMandatory;
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
     * Gets the locationDisabled property value. Indicates if Location service setup pane is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocationDisabled() {
        return this._locationDisabled;
    }
    /**
     * Gets the macOSFileVaultDisabled property value. Indicates if Mac OS file vault is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMacOSFileVaultDisabled() {
        return this._macOSFileVaultDisabled;
    }
    /**
     * Gets the macOSRegistrationDisabled property value. Indicates if Mac OS registration is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMacOSRegistrationDisabled() {
        return this._macOSRegistrationDisabled;
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
     * Gets the passCodeDisabled property value. Indicates if Passcode setup pane is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPassCodeDisabled() {
        return this._passCodeDisabled;
    }
    /**
     * Gets the profileRemovalDisabled property value. Indicates if the profile removal option is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getProfileRemovalDisabled() {
        return this._profileRemovalDisabled;
    }
    /**
     * Gets the restoreBlocked property value. Indicates if Restore setup pane is blocked
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRestoreBlocked() {
        return this._restoreBlocked;
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
     * Gets the siriDisabled property value. Indicates if siri setup pane is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSiriDisabled() {
        return this._siriDisabled;
    }
    /**
     * Gets the supervisedModeEnabled property value. Supervised mode, True to enable, false otherwise. See https://learn.microsoft.com/intune/deploy-use/enroll-devices-in-microsoft-intune for additional information.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSupervisedModeEnabled() {
        return this._supervisedModeEnabled;
    }
    /**
     * Gets the supportDepartment property value. Support department information
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSupportDepartment() {
        return this._supportDepartment;
    }
    /**
     * Gets the supportPhoneNumber property value. Support phone number
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSupportPhoneNumber() {
        return this._supportPhoneNumber;
    }
    /**
     * Gets the termsAndConditionsDisabled property value. Indicates if 'Terms and Conditions' setup pane is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getTermsAndConditionsDisabled() {
        return this._termsAndConditionsDisabled;
    }
    /**
     * Gets the touchIdDisabled property value. Indicates if touch id setup pane is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getTouchIdDisabled() {
        return this._touchIdDisabled;
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
        writer.writeBooleanValue("appleIdDisabled", this.getAppleIdDisabled());
        writer.writeBooleanValue("applePayDisabled", this.getApplePayDisabled());
        writer.writeBooleanValue("awaitDeviceConfiguredConfirmation", this.getAwaitDeviceConfiguredConfirmation());
        writer.writeBooleanValue("diagnosticsDisabled", this.getDiagnosticsDisabled());
        writer.writeBooleanValue("enableSharedIPad", this.getEnableSharedIPad());
        writer.writeBooleanValue("isDefault", this.getIsDefault());
        writer.writeBooleanValue("isMandatory", this.getIsMandatory());
        writer.writeEnumValue("iTunesPairingMode", this.getITunesPairingMode());
        writer.writeBooleanValue("locationDisabled", this.getLocationDisabled());
        writer.writeBooleanValue("macOSFileVaultDisabled", this.getMacOSFileVaultDisabled());
        writer.writeBooleanValue("macOSRegistrationDisabled", this.getMacOSRegistrationDisabled());
        writer.writeCollectionOfObjectValues("managementCertificates", this.getManagementCertificates());
        writer.writeBooleanValue("passCodeDisabled", this.getPassCodeDisabled());
        writer.writeBooleanValue("profileRemovalDisabled", this.getProfileRemovalDisabled());
        writer.writeBooleanValue("restoreBlocked", this.getRestoreBlocked());
        writer.writeBooleanValue("restoreFromAndroidDisabled", this.getRestoreFromAndroidDisabled());
        writer.writeIntegerValue("sharedIPadMaximumUserCount", this.getSharedIPadMaximumUserCount());
        writer.writeBooleanValue("siriDisabled", this.getSiriDisabled());
        writer.writeBooleanValue("supervisedModeEnabled", this.getSupervisedModeEnabled());
        writer.writeStringValue("supportDepartment", this.getSupportDepartment());
        writer.writeStringValue("supportPhoneNumber", this.getSupportPhoneNumber());
        writer.writeBooleanValue("termsAndConditionsDisabled", this.getTermsAndConditionsDisabled());
        writer.writeBooleanValue("touchIdDisabled", this.getTouchIdDisabled());
        writer.writeBooleanValue("zoomDisabled", this.getZoomDisabled());
    }
    /**
     * Sets the appleIdDisabled property value. Indicates if Apple id setup pane is disabled
     * @param value Value to set for the appleIdDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppleIdDisabled(@javax.annotation.Nullable final Boolean value) {
        this._appleIdDisabled = value;
    }
    /**
     * Sets the applePayDisabled property value. Indicates if Apple pay setup pane is disabled
     * @param value Value to set for the applePayDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplePayDisabled(@javax.annotation.Nullable final Boolean value) {
        this._applePayDisabled = value;
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
     * Sets the diagnosticsDisabled property value. Indicates if diagnostics setup pane is disabled
     * @param value Value to set for the diagnosticsDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDiagnosticsDisabled(@javax.annotation.Nullable final Boolean value) {
        this._diagnosticsDisabled = value;
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
     * Sets the isDefault property value. Indicates if this is the default profile
     * @param value Value to set for the isDefault property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsDefault(@javax.annotation.Nullable final Boolean value) {
        this._isDefault = value;
    }
    /**
     * Sets the isMandatory property value. Indicates if the profile is mandatory
     * @param value Value to set for the isMandatory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsMandatory(@javax.annotation.Nullable final Boolean value) {
        this._isMandatory = value;
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
     * Sets the locationDisabled property value. Indicates if Location service setup pane is disabled
     * @param value Value to set for the locationDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocationDisabled(@javax.annotation.Nullable final Boolean value) {
        this._locationDisabled = value;
    }
    /**
     * Sets the macOSFileVaultDisabled property value. Indicates if Mac OS file vault is disabled
     * @param value Value to set for the macOSFileVaultDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMacOSFileVaultDisabled(@javax.annotation.Nullable final Boolean value) {
        this._macOSFileVaultDisabled = value;
    }
    /**
     * Sets the macOSRegistrationDisabled property value. Indicates if Mac OS registration is disabled
     * @param value Value to set for the macOSRegistrationDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMacOSRegistrationDisabled(@javax.annotation.Nullable final Boolean value) {
        this._macOSRegistrationDisabled = value;
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
     * Sets the passCodeDisabled property value. Indicates if Passcode setup pane is disabled
     * @param value Value to set for the passCodeDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPassCodeDisabled(@javax.annotation.Nullable final Boolean value) {
        this._passCodeDisabled = value;
    }
    /**
     * Sets the profileRemovalDisabled property value. Indicates if the profile removal option is disabled
     * @param value Value to set for the profileRemovalDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProfileRemovalDisabled(@javax.annotation.Nullable final Boolean value) {
        this._profileRemovalDisabled = value;
    }
    /**
     * Sets the restoreBlocked property value. Indicates if Restore setup pane is blocked
     * @param value Value to set for the restoreBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRestoreBlocked(@javax.annotation.Nullable final Boolean value) {
        this._restoreBlocked = value;
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
     * Sets the siriDisabled property value. Indicates if siri setup pane is disabled
     * @param value Value to set for the siriDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSiriDisabled(@javax.annotation.Nullable final Boolean value) {
        this._siriDisabled = value;
    }
    /**
     * Sets the supervisedModeEnabled property value. Supervised mode, True to enable, false otherwise. See https://learn.microsoft.com/intune/deploy-use/enroll-devices-in-microsoft-intune for additional information.
     * @param value Value to set for the supervisedModeEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSupervisedModeEnabled(@javax.annotation.Nullable final Boolean value) {
        this._supervisedModeEnabled = value;
    }
    /**
     * Sets the supportDepartment property value. Support department information
     * @param value Value to set for the supportDepartment property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSupportDepartment(@javax.annotation.Nullable final String value) {
        this._supportDepartment = value;
    }
    /**
     * Sets the supportPhoneNumber property value. Support phone number
     * @param value Value to set for the supportPhoneNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSupportPhoneNumber(@javax.annotation.Nullable final String value) {
        this._supportPhoneNumber = value;
    }
    /**
     * Sets the termsAndConditionsDisabled property value. Indicates if 'Terms and Conditions' setup pane is disabled
     * @param value Value to set for the termsAndConditionsDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTermsAndConditionsDisabled(@javax.annotation.Nullable final Boolean value) {
        this._termsAndConditionsDisabled = value;
    }
    /**
     * Sets the touchIdDisabled property value. Indicates if touch id setup pane is disabled
     * @param value Value to set for the touchIdDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTouchIdDisabled(@javax.annotation.Nullable final Boolean value) {
        this._touchIdDisabled = value;
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
