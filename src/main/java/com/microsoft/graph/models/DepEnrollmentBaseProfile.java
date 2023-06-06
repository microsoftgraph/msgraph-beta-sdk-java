package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DepEnrollmentBaseProfile extends EnrollmentProfile implements Parsable {
    /** Indicates if Apple id setup pane is disabled */
    private Boolean appleIdDisabled;
    /** Indicates if Apple pay setup pane is disabled */
    private Boolean applePayDisabled;
    /** URL for setup assistant login */
    private Boolean configurationWebUrl;
    /** Sets a literal or name pattern. */
    private String deviceNameTemplate;
    /** Indicates if diagnostics setup pane is disabled */
    private Boolean diagnosticsDisabled;
    /** Indicates if displaytone setup screen is disabled */
    private Boolean displayToneSetupDisabled;
    /** enabledSkipKeys contains all the enabled skip keys as strings */
    private java.util.List<String> enabledSkipKeys;
    /** Indicates if this is the default profile */
    private Boolean isDefault;
    /** Indicates if the profile is mandatory */
    private Boolean isMandatory;
    /** Indicates if Location service setup pane is disabled */
    private Boolean locationDisabled;
    /** Indicates if privacy screen is disabled */
    private Boolean privacyPaneDisabled;
    /** Indicates if the profile removal option is disabled */
    private Boolean profileRemovalDisabled;
    /** Indicates if Restore setup pane is blocked */
    private Boolean restoreBlocked;
    /** Indicates if screen timeout setup is disabled */
    private Boolean screenTimeScreenDisabled;
    /** Indicates if siri setup pane is disabled */
    private Boolean siriDisabled;
    /** Supervised mode, True to enable, false otherwise. See https://learn.microsoft.com/intune/deploy-use/enroll-devices-in-microsoft-intune for additional information. */
    private Boolean supervisedModeEnabled;
    /** Support department information */
    private String supportDepartment;
    /** Support phone number */
    private String supportPhoneNumber;
    /** Indicates if 'Terms and Conditions' setup pane is disabled */
    private Boolean termsAndConditionsDisabled;
    /** Indicates if touch id setup pane is disabled */
    private Boolean touchIdDisabled;
    /**
     * Instantiates a new DepEnrollmentBaseProfile and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DepEnrollmentBaseProfile() {
        super();
        this.setOdataType("#microsoft.graph.depEnrollmentBaseProfile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DepEnrollmentBaseProfile
     */
    @javax.annotation.Nonnull
    public static DepEnrollmentBaseProfile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAppleIdDisabled() {
        return this.appleIdDisabled;
    }
    /**
     * Gets the applePayDisabled property value. Indicates if Apple pay setup pane is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplePayDisabled() {
        return this.applePayDisabled;
    }
    /**
     * Gets the configurationWebUrl property value. URL for setup assistant login
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getConfigurationWebUrl() {
        return this.configurationWebUrl;
    }
    /**
     * Gets the deviceNameTemplate property value. Sets a literal or name pattern.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceNameTemplate() {
        return this.deviceNameTemplate;
    }
    /**
     * Gets the diagnosticsDisabled property value. Indicates if diagnostics setup pane is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDiagnosticsDisabled() {
        return this.diagnosticsDisabled;
    }
    /**
     * Gets the displayToneSetupDisabled property value. Indicates if displaytone setup screen is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDisplayToneSetupDisabled() {
        return this.displayToneSetupDisabled;
    }
    /**
     * Gets the enabledSkipKeys property value. enabledSkipKeys contains all the enabled skip keys as strings
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getEnabledSkipKeys() {
        return this.enabledSkipKeys;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appleIdDisabled", (n) -> { this.setAppleIdDisabled(n.getBooleanValue()); });
        deserializerMap.put("applePayDisabled", (n) -> { this.setApplePayDisabled(n.getBooleanValue()); });
        deserializerMap.put("configurationWebUrl", (n) -> { this.setConfigurationWebUrl(n.getBooleanValue()); });
        deserializerMap.put("deviceNameTemplate", (n) -> { this.setDeviceNameTemplate(n.getStringValue()); });
        deserializerMap.put("diagnosticsDisabled", (n) -> { this.setDiagnosticsDisabled(n.getBooleanValue()); });
        deserializerMap.put("displayToneSetupDisabled", (n) -> { this.setDisplayToneSetupDisabled(n.getBooleanValue()); });
        deserializerMap.put("enabledSkipKeys", (n) -> { this.setEnabledSkipKeys(n.getCollectionOfPrimitiveValues(String.class)); });
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
        return deserializerMap;
    }
    /**
     * Gets the isDefault property value. Indicates if this is the default profile
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDefault() {
        return this.isDefault;
    }
    /**
     * Gets the isMandatory property value. Indicates if the profile is mandatory
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsMandatory() {
        return this.isMandatory;
    }
    /**
     * Gets the locationDisabled property value. Indicates if Location service setup pane is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocationDisabled() {
        return this.locationDisabled;
    }
    /**
     * Gets the privacyPaneDisabled property value. Indicates if privacy screen is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPrivacyPaneDisabled() {
        return this.privacyPaneDisabled;
    }
    /**
     * Gets the profileRemovalDisabled property value. Indicates if the profile removal option is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getProfileRemovalDisabled() {
        return this.profileRemovalDisabled;
    }
    /**
     * Gets the restoreBlocked property value. Indicates if Restore setup pane is blocked
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRestoreBlocked() {
        return this.restoreBlocked;
    }
    /**
     * Gets the screenTimeScreenDisabled property value. Indicates if screen timeout setup is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getScreenTimeScreenDisabled() {
        return this.screenTimeScreenDisabled;
    }
    /**
     * Gets the siriDisabled property value. Indicates if siri setup pane is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSiriDisabled() {
        return this.siriDisabled;
    }
    /**
     * Gets the supervisedModeEnabled property value. Supervised mode, True to enable, false otherwise. See https://learn.microsoft.com/intune/deploy-use/enroll-devices-in-microsoft-intune for additional information.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSupervisedModeEnabled() {
        return this.supervisedModeEnabled;
    }
    /**
     * Gets the supportDepartment property value. Support department information
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSupportDepartment() {
        return this.supportDepartment;
    }
    /**
     * Gets the supportPhoneNumber property value. Support phone number
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSupportPhoneNumber() {
        return this.supportPhoneNumber;
    }
    /**
     * Gets the termsAndConditionsDisabled property value. Indicates if 'Terms and Conditions' setup pane is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getTermsAndConditionsDisabled() {
        return this.termsAndConditionsDisabled;
    }
    /**
     * Gets the touchIdDisabled property value. Indicates if touch id setup pane is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getTouchIdDisabled() {
        return this.touchIdDisabled;
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
        writer.writeBooleanValue("configurationWebUrl", this.getConfigurationWebUrl());
        writer.writeStringValue("deviceNameTemplate", this.getDeviceNameTemplate());
        writer.writeBooleanValue("diagnosticsDisabled", this.getDiagnosticsDisabled());
        writer.writeBooleanValue("displayToneSetupDisabled", this.getDisplayToneSetupDisabled());
        writer.writeCollectionOfPrimitiveValues("enabledSkipKeys", this.getEnabledSkipKeys());
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
    }
    /**
     * Sets the appleIdDisabled property value. Indicates if Apple id setup pane is disabled
     * @param value Value to set for the appleIdDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppleIdDisabled(@javax.annotation.Nullable final Boolean value) {
        this.appleIdDisabled = value;
    }
    /**
     * Sets the applePayDisabled property value. Indicates if Apple pay setup pane is disabled
     * @param value Value to set for the applePayDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplePayDisabled(@javax.annotation.Nullable final Boolean value) {
        this.applePayDisabled = value;
    }
    /**
     * Sets the configurationWebUrl property value. URL for setup assistant login
     * @param value Value to set for the configurationWebUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfigurationWebUrl(@javax.annotation.Nullable final Boolean value) {
        this.configurationWebUrl = value;
    }
    /**
     * Sets the deviceNameTemplate property value. Sets a literal or name pattern.
     * @param value Value to set for the deviceNameTemplate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceNameTemplate(@javax.annotation.Nullable final String value) {
        this.deviceNameTemplate = value;
    }
    /**
     * Sets the diagnosticsDisabled property value. Indicates if diagnostics setup pane is disabled
     * @param value Value to set for the diagnosticsDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDiagnosticsDisabled(@javax.annotation.Nullable final Boolean value) {
        this.diagnosticsDisabled = value;
    }
    /**
     * Sets the displayToneSetupDisabled property value. Indicates if displaytone setup screen is disabled
     * @param value Value to set for the displayToneSetupDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayToneSetupDisabled(@javax.annotation.Nullable final Boolean value) {
        this.displayToneSetupDisabled = value;
    }
    /**
     * Sets the enabledSkipKeys property value. enabledSkipKeys contains all the enabled skip keys as strings
     * @param value Value to set for the enabledSkipKeys property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnabledSkipKeys(@javax.annotation.Nullable final java.util.List<String> value) {
        this.enabledSkipKeys = value;
    }
    /**
     * Sets the isDefault property value. Indicates if this is the default profile
     * @param value Value to set for the isDefault property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsDefault(@javax.annotation.Nullable final Boolean value) {
        this.isDefault = value;
    }
    /**
     * Sets the isMandatory property value. Indicates if the profile is mandatory
     * @param value Value to set for the isMandatory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsMandatory(@javax.annotation.Nullable final Boolean value) {
        this.isMandatory = value;
    }
    /**
     * Sets the locationDisabled property value. Indicates if Location service setup pane is disabled
     * @param value Value to set for the locationDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocationDisabled(@javax.annotation.Nullable final Boolean value) {
        this.locationDisabled = value;
    }
    /**
     * Sets the privacyPaneDisabled property value. Indicates if privacy screen is disabled
     * @param value Value to set for the privacyPaneDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrivacyPaneDisabled(@javax.annotation.Nullable final Boolean value) {
        this.privacyPaneDisabled = value;
    }
    /**
     * Sets the profileRemovalDisabled property value. Indicates if the profile removal option is disabled
     * @param value Value to set for the profileRemovalDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProfileRemovalDisabled(@javax.annotation.Nullable final Boolean value) {
        this.profileRemovalDisabled = value;
    }
    /**
     * Sets the restoreBlocked property value. Indicates if Restore setup pane is blocked
     * @param value Value to set for the restoreBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRestoreBlocked(@javax.annotation.Nullable final Boolean value) {
        this.restoreBlocked = value;
    }
    /**
     * Sets the screenTimeScreenDisabled property value. Indicates if screen timeout setup is disabled
     * @param value Value to set for the screenTimeScreenDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScreenTimeScreenDisabled(@javax.annotation.Nullable final Boolean value) {
        this.screenTimeScreenDisabled = value;
    }
    /**
     * Sets the siriDisabled property value. Indicates if siri setup pane is disabled
     * @param value Value to set for the siriDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSiriDisabled(@javax.annotation.Nullable final Boolean value) {
        this.siriDisabled = value;
    }
    /**
     * Sets the supervisedModeEnabled property value. Supervised mode, True to enable, false otherwise. See https://learn.microsoft.com/intune/deploy-use/enroll-devices-in-microsoft-intune for additional information.
     * @param value Value to set for the supervisedModeEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSupervisedModeEnabled(@javax.annotation.Nullable final Boolean value) {
        this.supervisedModeEnabled = value;
    }
    /**
     * Sets the supportDepartment property value. Support department information
     * @param value Value to set for the supportDepartment property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSupportDepartment(@javax.annotation.Nullable final String value) {
        this.supportDepartment = value;
    }
    /**
     * Sets the supportPhoneNumber property value. Support phone number
     * @param value Value to set for the supportPhoneNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSupportPhoneNumber(@javax.annotation.Nullable final String value) {
        this.supportPhoneNumber = value;
    }
    /**
     * Sets the termsAndConditionsDisabled property value. Indicates if 'Terms and Conditions' setup pane is disabled
     * @param value Value to set for the termsAndConditionsDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTermsAndConditionsDisabled(@javax.annotation.Nullable final Boolean value) {
        this.termsAndConditionsDisabled = value;
    }
    /**
     * Sets the touchIdDisabled property value. Indicates if touch id setup pane is disabled
     * @param value Value to set for the touchIdDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTouchIdDisabled(@javax.annotation.Nullable final Boolean value) {
        this.touchIdDisabled = value;
    }
}
