package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
/**
 * The DepEnrollmentBaseProfile resource represents an Apple Device Enrollment Program (DEP) enrollment profile. This type of profile must be assigned to Apple DEP serial numbers before the corresponding devices can enroll via DEP.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DepEnrollmentBaseProfile extends EnrollmentProfile implements Parsable {
    /**
     * Instantiates a new DepEnrollmentBaseProfile and sets the default values.
     */
    public DepEnrollmentBaseProfile() {
        super();
        this.setOdataType("#microsoft.graph.depEnrollmentBaseProfile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DepEnrollmentBaseProfile
     */
    @jakarta.annotation.Nonnull
    public static DepEnrollmentBaseProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.depIOSEnrollmentProfile": return new DepIOSEnrollmentProfile();
                case "#microsoft.graph.depMacOSEnrollmentProfile": return new DepMacOSEnrollmentProfile();
            }
        }
        return new DepEnrollmentBaseProfile();
    }
    /**
     * Gets the appleIdDisabled property value. Indicates if Apple id setup pane is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAppleIdDisabled() {
        return this.backingStore.get("appleIdDisabled");
    }
    /**
     * Gets the applePayDisabled property value. Indicates if Apple pay setup pane is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getApplePayDisabled() {
        return this.backingStore.get("applePayDisabled");
    }
    /**
     * Gets the configurationWebUrl property value. URL for setup assistant login
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getConfigurationWebUrl() {
        return this.backingStore.get("configurationWebUrl");
    }
    /**
     * Gets the deviceNameTemplate property value. Sets a literal or name pattern.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceNameTemplate() {
        return this.backingStore.get("deviceNameTemplate");
    }
    /**
     * Gets the diagnosticsDisabled property value. Indicates if diagnostics setup pane is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDiagnosticsDisabled() {
        return this.backingStore.get("diagnosticsDisabled");
    }
    /**
     * Gets the displayToneSetupDisabled property value. Indicates if displaytone setup screen is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDisplayToneSetupDisabled() {
        return this.backingStore.get("displayToneSetupDisabled");
    }
    /**
     * Gets the enabledSkipKeys property value. enabledSkipKeys contains all the enabled skip keys as strings
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getEnabledSkipKeys() {
        return this.backingStore.get("enabledSkipKeys");
    }
    /**
     * Gets the enrollmentTimeAzureAdGroupIds property value. EnrollmentTimeAzureAdGroupIds contains list of enrollment time Azure Group Ids to be associated with profile
     * @return a java.util.List<UUID>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UUID> getEnrollmentTimeAzureAdGroupIds() {
        return this.backingStore.get("enrollmentTimeAzureAdGroupIds");
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
        deserializerMap.put("configurationWebUrl", (n) -> { this.setConfigurationWebUrl(n.getBooleanValue()); });
        deserializerMap.put("deviceNameTemplate", (n) -> { this.setDeviceNameTemplate(n.getStringValue()); });
        deserializerMap.put("diagnosticsDisabled", (n) -> { this.setDiagnosticsDisabled(n.getBooleanValue()); });
        deserializerMap.put("displayToneSetupDisabled", (n) -> { this.setDisplayToneSetupDisabled(n.getBooleanValue()); });
        deserializerMap.put("enabledSkipKeys", (n) -> { this.setEnabledSkipKeys(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("enrollmentTimeAzureAdGroupIds", (n) -> { this.setEnrollmentTimeAzureAdGroupIds(n.getCollectionOfPrimitiveValues(UUID.class)); });
        deserializerMap.put("isDefault", (n) -> { this.setIsDefault(n.getBooleanValue()); });
        deserializerMap.put("isMandatory", (n) -> { this.setIsMandatory(n.getBooleanValue()); });
        deserializerMap.put("locationDisabled", (n) -> { this.setLocationDisabled(n.getBooleanValue()); });
        deserializerMap.put("privacyPaneDisabled", (n) -> { this.setPrivacyPaneDisabled(n.getBooleanValue()); });
        deserializerMap.put("profileRemovalDisabled", (n) -> { this.setProfileRemovalDisabled(n.getBooleanValue()); });
        deserializerMap.put("restoreBlocked", (n) -> { this.setRestoreBlocked(n.getBooleanValue()); });
        deserializerMap.put("screenTimeScreenDisabled", (n) -> { this.setScreenTimeScreenDisabled(n.getBooleanValue()); });
        deserializerMap.put("siriDisabled", (n) -> { this.setSiriDisabled(n.getBooleanValue()); });
        deserializerMap.put("supervisedModeEnabled", (n) -> { this.setSupervisedModeEnabled(n.getBooleanValue()); });
        deserializerMap.put("supportDepartment", (n) -> { this.setSupportDepartment(n.getStringValue()); });
        deserializerMap.put("supportPhoneNumber", (n) -> { this.setSupportPhoneNumber(n.getStringValue()); });
        deserializerMap.put("termsAndConditionsDisabled", (n) -> { this.setTermsAndConditionsDisabled(n.getBooleanValue()); });
        deserializerMap.put("touchIdDisabled", (n) -> { this.setTouchIdDisabled(n.getBooleanValue()); });
        deserializerMap.put("waitForDeviceConfiguredConfirmation", (n) -> { this.setWaitForDeviceConfiguredConfirmation(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isDefault property value. Indicates if this is the default profile
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDefault() {
        return this.backingStore.get("isDefault");
    }
    /**
     * Gets the isMandatory property value. Indicates if the profile is mandatory
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsMandatory() {
        return this.backingStore.get("isMandatory");
    }
    /**
     * Gets the locationDisabled property value. Indicates if Location service setup pane is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLocationDisabled() {
        return this.backingStore.get("locationDisabled");
    }
    /**
     * Gets the privacyPaneDisabled property value. Indicates if privacy screen is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPrivacyPaneDisabled() {
        return this.backingStore.get("privacyPaneDisabled");
    }
    /**
     * Gets the profileRemovalDisabled property value. Indicates if the profile removal option is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getProfileRemovalDisabled() {
        return this.backingStore.get("profileRemovalDisabled");
    }
    /**
     * Gets the restoreBlocked property value. Indicates if Restore setup pane is blocked
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRestoreBlocked() {
        return this.backingStore.get("restoreBlocked");
    }
    /**
     * Gets the screenTimeScreenDisabled property value. Indicates if screen timeout setup is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getScreenTimeScreenDisabled() {
        return this.backingStore.get("screenTimeScreenDisabled");
    }
    /**
     * Gets the siriDisabled property value. Indicates if siri setup pane is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSiriDisabled() {
        return this.backingStore.get("siriDisabled");
    }
    /**
     * Gets the supervisedModeEnabled property value. Supervised mode, True to enable, false otherwise. See https://learn.microsoft.com/intune/deploy-use/enroll-devices-in-microsoft-intune for additional information.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSupervisedModeEnabled() {
        return this.backingStore.get("supervisedModeEnabled");
    }
    /**
     * Gets the supportDepartment property value. Support department information
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSupportDepartment() {
        return this.backingStore.get("supportDepartment");
    }
    /**
     * Gets the supportPhoneNumber property value. Support phone number
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSupportPhoneNumber() {
        return this.backingStore.get("supportPhoneNumber");
    }
    /**
     * Gets the termsAndConditionsDisabled property value. Indicates if 'Terms and Conditions' setup pane is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getTermsAndConditionsDisabled() {
        return this.backingStore.get("termsAndConditionsDisabled");
    }
    /**
     * Gets the touchIdDisabled property value. Indicates if touch id setup pane is disabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getTouchIdDisabled() {
        return this.backingStore.get("touchIdDisabled");
    }
    /**
     * Gets the waitForDeviceConfiguredConfirmation property value. Indicates if the device will need to wait for configured confirmation
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWaitForDeviceConfiguredConfirmation() {
        return this.backingStore.get("waitForDeviceConfiguredConfirmation");
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
        writer.writeBooleanValue("configurationWebUrl", this.getConfigurationWebUrl());
        writer.writeStringValue("deviceNameTemplate", this.getDeviceNameTemplate());
        writer.writeBooleanValue("diagnosticsDisabled", this.getDiagnosticsDisabled());
        writer.writeBooleanValue("displayToneSetupDisabled", this.getDisplayToneSetupDisabled());
        writer.writeCollectionOfPrimitiveValues("enabledSkipKeys", this.getEnabledSkipKeys());
        writer.writeCollectionOfPrimitiveValues("enrollmentTimeAzureAdGroupIds", this.getEnrollmentTimeAzureAdGroupIds());
        writer.writeBooleanValue("isDefault", this.getIsDefault());
        writer.writeBooleanValue("isMandatory", this.getIsMandatory());
        writer.writeBooleanValue("locationDisabled", this.getLocationDisabled());
        writer.writeBooleanValue("privacyPaneDisabled", this.getPrivacyPaneDisabled());
        writer.writeBooleanValue("profileRemovalDisabled", this.getProfileRemovalDisabled());
        writer.writeBooleanValue("restoreBlocked", this.getRestoreBlocked());
        writer.writeBooleanValue("screenTimeScreenDisabled", this.getScreenTimeScreenDisabled());
        writer.writeBooleanValue("siriDisabled", this.getSiriDisabled());
        writer.writeBooleanValue("supervisedModeEnabled", this.getSupervisedModeEnabled());
        writer.writeStringValue("supportDepartment", this.getSupportDepartment());
        writer.writeStringValue("supportPhoneNumber", this.getSupportPhoneNumber());
        writer.writeBooleanValue("termsAndConditionsDisabled", this.getTermsAndConditionsDisabled());
        writer.writeBooleanValue("touchIdDisabled", this.getTouchIdDisabled());
        writer.writeBooleanValue("waitForDeviceConfiguredConfirmation", this.getWaitForDeviceConfiguredConfirmation());
    }
    /**
     * Sets the appleIdDisabled property value. Indicates if Apple id setup pane is disabled
     * @param value Value to set for the appleIdDisabled property.
     */
    public void setAppleIdDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("appleIdDisabled", value);
    }
    /**
     * Sets the applePayDisabled property value. Indicates if Apple pay setup pane is disabled
     * @param value Value to set for the applePayDisabled property.
     */
    public void setApplePayDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("applePayDisabled", value);
    }
    /**
     * Sets the configurationWebUrl property value. URL for setup assistant login
     * @param value Value to set for the configurationWebUrl property.
     */
    public void setConfigurationWebUrl(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("configurationWebUrl", value);
    }
    /**
     * Sets the deviceNameTemplate property value. Sets a literal or name pattern.
     * @param value Value to set for the deviceNameTemplate property.
     */
    public void setDeviceNameTemplate(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceNameTemplate", value);
    }
    /**
     * Sets the diagnosticsDisabled property value. Indicates if diagnostics setup pane is disabled
     * @param value Value to set for the diagnosticsDisabled property.
     */
    public void setDiagnosticsDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("diagnosticsDisabled", value);
    }
    /**
     * Sets the displayToneSetupDisabled property value. Indicates if displaytone setup screen is disabled
     * @param value Value to set for the displayToneSetupDisabled property.
     */
    public void setDisplayToneSetupDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("displayToneSetupDisabled", value);
    }
    /**
     * Sets the enabledSkipKeys property value. enabledSkipKeys contains all the enabled skip keys as strings
     * @param value Value to set for the enabledSkipKeys property.
     */
    public void setEnabledSkipKeys(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("enabledSkipKeys", value);
    }
    /**
     * Sets the enrollmentTimeAzureAdGroupIds property value. EnrollmentTimeAzureAdGroupIds contains list of enrollment time Azure Group Ids to be associated with profile
     * @param value Value to set for the enrollmentTimeAzureAdGroupIds property.
     */
    public void setEnrollmentTimeAzureAdGroupIds(@jakarta.annotation.Nullable final java.util.List<UUID> value) {
        this.backingStore.set("enrollmentTimeAzureAdGroupIds", value);
    }
    /**
     * Sets the isDefault property value. Indicates if this is the default profile
     * @param value Value to set for the isDefault property.
     */
    public void setIsDefault(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDefault", value);
    }
    /**
     * Sets the isMandatory property value. Indicates if the profile is mandatory
     * @param value Value to set for the isMandatory property.
     */
    public void setIsMandatory(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isMandatory", value);
    }
    /**
     * Sets the locationDisabled property value. Indicates if Location service setup pane is disabled
     * @param value Value to set for the locationDisabled property.
     */
    public void setLocationDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("locationDisabled", value);
    }
    /**
     * Sets the privacyPaneDisabled property value. Indicates if privacy screen is disabled
     * @param value Value to set for the privacyPaneDisabled property.
     */
    public void setPrivacyPaneDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("privacyPaneDisabled", value);
    }
    /**
     * Sets the profileRemovalDisabled property value. Indicates if the profile removal option is disabled
     * @param value Value to set for the profileRemovalDisabled property.
     */
    public void setProfileRemovalDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("profileRemovalDisabled", value);
    }
    /**
     * Sets the restoreBlocked property value. Indicates if Restore setup pane is blocked
     * @param value Value to set for the restoreBlocked property.
     */
    public void setRestoreBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("restoreBlocked", value);
    }
    /**
     * Sets the screenTimeScreenDisabled property value. Indicates if screen timeout setup is disabled
     * @param value Value to set for the screenTimeScreenDisabled property.
     */
    public void setScreenTimeScreenDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("screenTimeScreenDisabled", value);
    }
    /**
     * Sets the siriDisabled property value. Indicates if siri setup pane is disabled
     * @param value Value to set for the siriDisabled property.
     */
    public void setSiriDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("siriDisabled", value);
    }
    /**
     * Sets the supervisedModeEnabled property value. Supervised mode, True to enable, false otherwise. See https://learn.microsoft.com/intune/deploy-use/enroll-devices-in-microsoft-intune for additional information.
     * @param value Value to set for the supervisedModeEnabled property.
     */
    public void setSupervisedModeEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("supervisedModeEnabled", value);
    }
    /**
     * Sets the supportDepartment property value. Support department information
     * @param value Value to set for the supportDepartment property.
     */
    public void setSupportDepartment(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("supportDepartment", value);
    }
    /**
     * Sets the supportPhoneNumber property value. Support phone number
     * @param value Value to set for the supportPhoneNumber property.
     */
    public void setSupportPhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("supportPhoneNumber", value);
    }
    /**
     * Sets the termsAndConditionsDisabled property value. Indicates if 'Terms and Conditions' setup pane is disabled
     * @param value Value to set for the termsAndConditionsDisabled property.
     */
    public void setTermsAndConditionsDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("termsAndConditionsDisabled", value);
    }
    /**
     * Sets the touchIdDisabled property value. Indicates if touch id setup pane is disabled
     * @param value Value to set for the touchIdDisabled property.
     */
    public void setTouchIdDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("touchIdDisabled", value);
    }
    /**
     * Sets the waitForDeviceConfiguredConfirmation property value. Indicates if the device will need to wait for configured confirmation
     * @param value Value to set for the waitForDeviceConfiguredConfirmation property.
     */
    public void setWaitForDeviceConfiguredConfirmation(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("waitForDeviceConfiguredConfirmation", value);
    }
}
