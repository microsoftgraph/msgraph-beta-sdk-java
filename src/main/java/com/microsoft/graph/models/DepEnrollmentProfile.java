package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The depEnrollmentProfile resource represents an Apple Device Enrollment Program (DEP) enrollment profile. This type of profile must be assigned to Apple DEP serial numbers before the corresponding devices can enroll via DEP.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DepEnrollmentProfile extends EnrollmentProfile implements Parsable {
    /**
     * Indicates if Apple id setup pane is disabled
     */
    private Boolean appleIdDisabled;
    /**
     * Indicates if Apple pay setup pane is disabled
     */
    private Boolean applePayDisabled;
    /**
     * Indicates if the device will need to wait for configured confirmation
     */
    private Boolean awaitDeviceConfiguredConfirmation;
    /**
     * Indicates if diagnostics setup pane is disabled
     */
    private Boolean diagnosticsDisabled;
    /**
     * This indicates whether the device is to be enrolled in a mode which enables multi user scenarios. Only applicable in shared iPads.
     */
    private Boolean enableSharedIPad;
    /**
     * Indicates if this is the default profile
     */
    private Boolean isDefault;
    /**
     * Indicates if the profile is mandatory
     */
    private Boolean isMandatory;
    /**
     * The iTunesPairingMode property
     */
    private ITunesPairingMode iTunesPairingMode;
    /**
     * Indicates if Location service setup pane is disabled
     */
    private Boolean locationDisabled;
    /**
     * Indicates if Mac OS file vault is disabled
     */
    private Boolean macOSFileVaultDisabled;
    /**
     * Indicates if Mac OS registration is disabled
     */
    private Boolean macOSRegistrationDisabled;
    /**
     * Management certificates for Apple Configurator
     */
    private java.util.List<ManagementCertificateWithThumbprint> managementCertificates;
    /**
     * Indicates if Passcode setup pane is disabled
     */
    private Boolean passCodeDisabled;
    /**
     * Indicates if the profile removal option is disabled
     */
    private Boolean profileRemovalDisabled;
    /**
     * Indicates if Restore setup pane is blocked
     */
    private Boolean restoreBlocked;
    /**
     * Indicates if Restore from Android is disabled
     */
    private Boolean restoreFromAndroidDisabled;
    /**
     * This specifies the maximum number of users that can use a shared iPad. Only applicable in shared iPad mode.
     */
    private Integer sharedIPadMaximumUserCount;
    /**
     * Indicates if siri setup pane is disabled
     */
    private Boolean siriDisabled;
    /**
     * Supervised mode, True to enable, false otherwise. See https://learn.microsoft.com/intune/deploy-use/enroll-devices-in-microsoft-intune for additional information.
     */
    private Boolean supervisedModeEnabled;
    /**
     * Support department information
     */
    private String supportDepartment;
    /**
     * Support phone number
     */
    private String supportPhoneNumber;
    /**
     * Indicates if 'Terms and Conditions' setup pane is disabled
     */
    private Boolean termsAndConditionsDisabled;
    /**
     * Indicates if touch id setup pane is disabled
     */
    private Boolean touchIdDisabled;
    /**
     * Indicates if zoom setup pane is disabled
     */
    private Boolean zoomDisabled;
    /**
     * Instantiates a new DepEnrollmentProfile and sets the default values.
     */
    public DepEnrollmentProfile() {
        super();
        this.setOdataType("#microsoft.graph.depEnrollmentProfile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DepEnrollmentProfile
     */
    @jakarta.annotation.Nonnull
    public static DepEnrollmentProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DepEnrollmentProfile();
    }
    /**
     * Gets the appleIdDisabled property value. Indicates if Apple id setup pane is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAppleIdDisabled() {
        return this.appleIdDisabled;
    }
    /**
     * Gets the applePayDisabled property value. Indicates if Apple pay setup pane is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getApplePayDisabled() {
        return this.applePayDisabled;
    }
    /**
     * Gets the awaitDeviceConfiguredConfirmation property value. Indicates if the device will need to wait for configured confirmation
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAwaitDeviceConfiguredConfirmation() {
        return this.awaitDeviceConfiguredConfirmation;
    }
    /**
     * Gets the diagnosticsDisabled property value. Indicates if diagnostics setup pane is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDiagnosticsDisabled() {
        return this.diagnosticsDisabled;
    }
    /**
     * Gets the enableSharedIPad property value. This indicates whether the device is to be enrolled in a mode which enables multi user scenarios. Only applicable in shared iPads.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableSharedIPad() {
        return this.enableSharedIPad;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appleIdDisabled", (n) -> { this.setAppleIdDisabled(n.getBooleanValue()); });
        deserializerMap.put("applePayDisabled", (n) -> { this.setApplePayDisabled(n.getBooleanValue()); });
        deserializerMap.put("awaitDeviceConfiguredConfirmation", (n) -> { this.setAwaitDeviceConfiguredConfirmation(n.getBooleanValue()); });
        deserializerMap.put("diagnosticsDisabled", (n) -> { this.setDiagnosticsDisabled(n.getBooleanValue()); });
        deserializerMap.put("enableSharedIPad", (n) -> { this.setEnableSharedIPad(n.getBooleanValue()); });
        deserializerMap.put("isDefault", (n) -> { this.setIsDefault(n.getBooleanValue()); });
        deserializerMap.put("isMandatory", (n) -> { this.setIsMandatory(n.getBooleanValue()); });
        deserializerMap.put("iTunesPairingMode", (n) -> { this.setITunesPairingMode(n.getEnumValue(ITunesPairingMode.class)); });
        deserializerMap.put("locationDisabled", (n) -> { this.setLocationDisabled(n.getBooleanValue()); });
        deserializerMap.put("macOSFileVaultDisabled", (n) -> { this.setMacOSFileVaultDisabled(n.getBooleanValue()); });
        deserializerMap.put("macOSRegistrationDisabled", (n) -> { this.setMacOSRegistrationDisabled(n.getBooleanValue()); });
        deserializerMap.put("managementCertificates", (n) -> { this.setManagementCertificates(n.getCollectionOfObjectValues(ManagementCertificateWithThumbprint::createFromDiscriminatorValue)); });
        deserializerMap.put("passCodeDisabled", (n) -> { this.setPassCodeDisabled(n.getBooleanValue()); });
        deserializerMap.put("profileRemovalDisabled", (n) -> { this.setProfileRemovalDisabled(n.getBooleanValue()); });
        deserializerMap.put("restoreBlocked", (n) -> { this.setRestoreBlocked(n.getBooleanValue()); });
        deserializerMap.put("restoreFromAndroidDisabled", (n) -> { this.setRestoreFromAndroidDisabled(n.getBooleanValue()); });
        deserializerMap.put("sharedIPadMaximumUserCount", (n) -> { this.setSharedIPadMaximumUserCount(n.getIntegerValue()); });
        deserializerMap.put("siriDisabled", (n) -> { this.setSiriDisabled(n.getBooleanValue()); });
        deserializerMap.put("supervisedModeEnabled", (n) -> { this.setSupervisedModeEnabled(n.getBooleanValue()); });
        deserializerMap.put("supportDepartment", (n) -> { this.setSupportDepartment(n.getStringValue()); });
        deserializerMap.put("supportPhoneNumber", (n) -> { this.setSupportPhoneNumber(n.getStringValue()); });
        deserializerMap.put("termsAndConditionsDisabled", (n) -> { this.setTermsAndConditionsDisabled(n.getBooleanValue()); });
        deserializerMap.put("touchIdDisabled", (n) -> { this.setTouchIdDisabled(n.getBooleanValue()); });
        deserializerMap.put("zoomDisabled", (n) -> { this.setZoomDisabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isDefault property value. Indicates if this is the default profile
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDefault() {
        return this.isDefault;
    }
    /**
     * Gets the isMandatory property value. Indicates if the profile is mandatory
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsMandatory() {
        return this.isMandatory;
    }
    /**
     * Gets the iTunesPairingMode property value. The iTunesPairingMode property
     * @return a ITunesPairingMode
     */
    @jakarta.annotation.Nullable
    public ITunesPairingMode getITunesPairingMode() {
        return this.iTunesPairingMode;
    }
    /**
     * Gets the locationDisabled property value. Indicates if Location service setup pane is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLocationDisabled() {
        return this.locationDisabled;
    }
    /**
     * Gets the macOSFileVaultDisabled property value. Indicates if Mac OS file vault is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getMacOSFileVaultDisabled() {
        return this.macOSFileVaultDisabled;
    }
    /**
     * Gets the macOSRegistrationDisabled property value. Indicates if Mac OS registration is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getMacOSRegistrationDisabled() {
        return this.macOSRegistrationDisabled;
    }
    /**
     * Gets the managementCertificates property value. Management certificates for Apple Configurator
     * @return a java.util.List<ManagementCertificateWithThumbprint>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagementCertificateWithThumbprint> getManagementCertificates() {
        return this.managementCertificates;
    }
    /**
     * Gets the passCodeDisabled property value. Indicates if Passcode setup pane is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPassCodeDisabled() {
        return this.passCodeDisabled;
    }
    /**
     * Gets the profileRemovalDisabled property value. Indicates if the profile removal option is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getProfileRemovalDisabled() {
        return this.profileRemovalDisabled;
    }
    /**
     * Gets the restoreBlocked property value. Indicates if Restore setup pane is blocked
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRestoreBlocked() {
        return this.restoreBlocked;
    }
    /**
     * Gets the restoreFromAndroidDisabled property value. Indicates if Restore from Android is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRestoreFromAndroidDisabled() {
        return this.restoreFromAndroidDisabled;
    }
    /**
     * Gets the sharedIPadMaximumUserCount property value. This specifies the maximum number of users that can use a shared iPad. Only applicable in shared iPad mode.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSharedIPadMaximumUserCount() {
        return this.sharedIPadMaximumUserCount;
    }
    /**
     * Gets the siriDisabled property value. Indicates if siri setup pane is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSiriDisabled() {
        return this.siriDisabled;
    }
    /**
     * Gets the supervisedModeEnabled property value. Supervised mode, True to enable, false otherwise. See https://learn.microsoft.com/intune/deploy-use/enroll-devices-in-microsoft-intune for additional information.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSupervisedModeEnabled() {
        return this.supervisedModeEnabled;
    }
    /**
     * Gets the supportDepartment property value. Support department information
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSupportDepartment() {
        return this.supportDepartment;
    }
    /**
     * Gets the supportPhoneNumber property value. Support phone number
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSupportPhoneNumber() {
        return this.supportPhoneNumber;
    }
    /**
     * Gets the termsAndConditionsDisabled property value. Indicates if 'Terms and Conditions' setup pane is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getTermsAndConditionsDisabled() {
        return this.termsAndConditionsDisabled;
    }
    /**
     * Gets the touchIdDisabled property value. Indicates if touch id setup pane is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getTouchIdDisabled() {
        return this.touchIdDisabled;
    }
    /**
     * Gets the zoomDisabled property value. Indicates if zoom setup pane is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getZoomDisabled() {
        return this.zoomDisabled;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAppleIdDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.appleIdDisabled = value;
    }
    /**
     * Sets the applePayDisabled property value. Indicates if Apple pay setup pane is disabled
     * @param value Value to set for the applePayDisabled property.
     */
    public void setApplePayDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.applePayDisabled = value;
    }
    /**
     * Sets the awaitDeviceConfiguredConfirmation property value. Indicates if the device will need to wait for configured confirmation
     * @param value Value to set for the awaitDeviceConfiguredConfirmation property.
     */
    public void setAwaitDeviceConfiguredConfirmation(@jakarta.annotation.Nullable final Boolean value) {
        this.awaitDeviceConfiguredConfirmation = value;
    }
    /**
     * Sets the diagnosticsDisabled property value. Indicates if diagnostics setup pane is disabled
     * @param value Value to set for the diagnosticsDisabled property.
     */
    public void setDiagnosticsDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.diagnosticsDisabled = value;
    }
    /**
     * Sets the enableSharedIPad property value. This indicates whether the device is to be enrolled in a mode which enables multi user scenarios. Only applicable in shared iPads.
     * @param value Value to set for the enableSharedIPad property.
     */
    public void setEnableSharedIPad(@jakarta.annotation.Nullable final Boolean value) {
        this.enableSharedIPad = value;
    }
    /**
     * Sets the isDefault property value. Indicates if this is the default profile
     * @param value Value to set for the isDefault property.
     */
    public void setIsDefault(@jakarta.annotation.Nullable final Boolean value) {
        this.isDefault = value;
    }
    /**
     * Sets the isMandatory property value. Indicates if the profile is mandatory
     * @param value Value to set for the isMandatory property.
     */
    public void setIsMandatory(@jakarta.annotation.Nullable final Boolean value) {
        this.isMandatory = value;
    }
    /**
     * Sets the iTunesPairingMode property value. The iTunesPairingMode property
     * @param value Value to set for the iTunesPairingMode property.
     */
    public void setITunesPairingMode(@jakarta.annotation.Nullable final ITunesPairingMode value) {
        this.iTunesPairingMode = value;
    }
    /**
     * Sets the locationDisabled property value. Indicates if Location service setup pane is disabled
     * @param value Value to set for the locationDisabled property.
     */
    public void setLocationDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.locationDisabled = value;
    }
    /**
     * Sets the macOSFileVaultDisabled property value. Indicates if Mac OS file vault is disabled
     * @param value Value to set for the macOSFileVaultDisabled property.
     */
    public void setMacOSFileVaultDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.macOSFileVaultDisabled = value;
    }
    /**
     * Sets the macOSRegistrationDisabled property value. Indicates if Mac OS registration is disabled
     * @param value Value to set for the macOSRegistrationDisabled property.
     */
    public void setMacOSRegistrationDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.macOSRegistrationDisabled = value;
    }
    /**
     * Sets the managementCertificates property value. Management certificates for Apple Configurator
     * @param value Value to set for the managementCertificates property.
     */
    public void setManagementCertificates(@jakarta.annotation.Nullable final java.util.List<ManagementCertificateWithThumbprint> value) {
        this.managementCertificates = value;
    }
    /**
     * Sets the passCodeDisabled property value. Indicates if Passcode setup pane is disabled
     * @param value Value to set for the passCodeDisabled property.
     */
    public void setPassCodeDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.passCodeDisabled = value;
    }
    /**
     * Sets the profileRemovalDisabled property value. Indicates if the profile removal option is disabled
     * @param value Value to set for the profileRemovalDisabled property.
     */
    public void setProfileRemovalDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.profileRemovalDisabled = value;
    }
    /**
     * Sets the restoreBlocked property value. Indicates if Restore setup pane is blocked
     * @param value Value to set for the restoreBlocked property.
     */
    public void setRestoreBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.restoreBlocked = value;
    }
    /**
     * Sets the restoreFromAndroidDisabled property value. Indicates if Restore from Android is disabled
     * @param value Value to set for the restoreFromAndroidDisabled property.
     */
    public void setRestoreFromAndroidDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.restoreFromAndroidDisabled = value;
    }
    /**
     * Sets the sharedIPadMaximumUserCount property value. This specifies the maximum number of users that can use a shared iPad. Only applicable in shared iPad mode.
     * @param value Value to set for the sharedIPadMaximumUserCount property.
     */
    public void setSharedIPadMaximumUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.sharedIPadMaximumUserCount = value;
    }
    /**
     * Sets the siriDisabled property value. Indicates if siri setup pane is disabled
     * @param value Value to set for the siriDisabled property.
     */
    public void setSiriDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.siriDisabled = value;
    }
    /**
     * Sets the supervisedModeEnabled property value. Supervised mode, True to enable, false otherwise. See https://learn.microsoft.com/intune/deploy-use/enroll-devices-in-microsoft-intune for additional information.
     * @param value Value to set for the supervisedModeEnabled property.
     */
    public void setSupervisedModeEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.supervisedModeEnabled = value;
    }
    /**
     * Sets the supportDepartment property value. Support department information
     * @param value Value to set for the supportDepartment property.
     */
    public void setSupportDepartment(@jakarta.annotation.Nullable final String value) {
        this.supportDepartment = value;
    }
    /**
     * Sets the supportPhoneNumber property value. Support phone number
     * @param value Value to set for the supportPhoneNumber property.
     */
    public void setSupportPhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.supportPhoneNumber = value;
    }
    /**
     * Sets the termsAndConditionsDisabled property value. Indicates if 'Terms and Conditions' setup pane is disabled
     * @param value Value to set for the termsAndConditionsDisabled property.
     */
    public void setTermsAndConditionsDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.termsAndConditionsDisabled = value;
    }
    /**
     * Sets the touchIdDisabled property value. Indicates if touch id setup pane is disabled
     * @param value Value to set for the touchIdDisabled property.
     */
    public void setTouchIdDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.touchIdDisabled = value;
    }
    /**
     * Sets the zoomDisabled property value. Indicates if zoom setup pane is disabled
     * @param value Value to set for the zoomDisabled property.
     */
    public void setZoomDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.zoomDisabled = value;
    }
}
