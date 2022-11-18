package com.microsoft.graph.models;

import com.microsoft.graph.models.DepIOSEnrollmentProfile;
import com.microsoft.graph.models.DepMacOSEnrollmentProfile;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DepEnrollmentBaseProfile extends EnrollmentProfile implements Parsable {
    /** Indicates if Apple id setup pane is disabled */
    private Boolean _appleIdDisabled;
    /** Indicates if Apple pay setup pane is disabled */
    private Boolean _applePayDisabled;
    /** URL for setup assistant login */
    private Boolean _configurationWebUrl;
    /** Sets a literal or name pattern. */
    private String _deviceNameTemplate;
    /** Indicates if diagnostics setup pane is disabled */
    private Boolean _diagnosticsDisabled;
    /** Indicates if displaytone setup screen is disabled */
    private Boolean _displayToneSetupDisabled;
    /** Indicates if this is the default profile */
    private Boolean _isDefault;
    /** Indicates if the profile is mandatory */
    private Boolean _isMandatory;
    /** Indicates if Location service setup pane is disabled */
    private Boolean _locationDisabled;
    /** Indicates if privacy screen is disabled */
    private Boolean _privacyPaneDisabled;
    /** Indicates if the profile removal option is disabled */
    private Boolean _profileRemovalDisabled;
    /** Indicates if Restore setup pane is blocked */
    private Boolean _restoreBlocked;
    /** Indicates if screen timeout setup is disabled */
    private Boolean _screenTimeScreenDisabled;
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
     * Gets the configurationWebUrl property value. URL for setup assistant login
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getConfigurationWebUrl() {
        return this._configurationWebUrl;
    }
    /**
     * Gets the deviceNameTemplate property value. Sets a literal or name pattern.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceNameTemplate() {
        return this._deviceNameTemplate;
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
     * Gets the displayToneSetupDisabled property value. Indicates if displaytone setup screen is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDisplayToneSetupDisabled() {
        return this._displayToneSetupDisabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DepEnrollmentBaseProfile currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("appleIdDisabled", (n) -> { currentObject.setAppleIdDisabled(n.getBooleanValue()); });
            this.put("applePayDisabled", (n) -> { currentObject.setApplePayDisabled(n.getBooleanValue()); });
            this.put("configurationWebUrl", (n) -> { currentObject.setConfigurationWebUrl(n.getBooleanValue()); });
            this.put("deviceNameTemplate", (n) -> { currentObject.setDeviceNameTemplate(n.getStringValue()); });
            this.put("diagnosticsDisabled", (n) -> { currentObject.setDiagnosticsDisabled(n.getBooleanValue()); });
            this.put("displayToneSetupDisabled", (n) -> { currentObject.setDisplayToneSetupDisabled(n.getBooleanValue()); });
            this.put("isDefault", (n) -> { currentObject.setIsDefault(n.getBooleanValue()); });
            this.put("isMandatory", (n) -> { currentObject.setIsMandatory(n.getBooleanValue()); });
            this.put("locationDisabled", (n) -> { currentObject.setLocationDisabled(n.getBooleanValue()); });
            this.put("privacyPaneDisabled", (n) -> { currentObject.setPrivacyPaneDisabled(n.getBooleanValue()); });
            this.put("profileRemovalDisabled", (n) -> { currentObject.setProfileRemovalDisabled(n.getBooleanValue()); });
            this.put("restoreBlocked", (n) -> { currentObject.setRestoreBlocked(n.getBooleanValue()); });
            this.put("screenTimeScreenDisabled", (n) -> { currentObject.setScreenTimeScreenDisabled(n.getBooleanValue()); });
            this.put("siriDisabled", (n) -> { currentObject.setSiriDisabled(n.getBooleanValue()); });
            this.put("supervisedModeEnabled", (n) -> { currentObject.setSupervisedModeEnabled(n.getBooleanValue()); });
            this.put("supportDepartment", (n) -> { currentObject.setSupportDepartment(n.getStringValue()); });
            this.put("supportPhoneNumber", (n) -> { currentObject.setSupportPhoneNumber(n.getStringValue()); });
            this.put("termsAndConditionsDisabled", (n) -> { currentObject.setTermsAndConditionsDisabled(n.getBooleanValue()); });
            this.put("touchIdDisabled", (n) -> { currentObject.setTouchIdDisabled(n.getBooleanValue()); });
        }};
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
     * Gets the locationDisabled property value. Indicates if Location service setup pane is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocationDisabled() {
        return this._locationDisabled;
    }
    /**
     * Gets the privacyPaneDisabled property value. Indicates if privacy screen is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPrivacyPaneDisabled() {
        return this._privacyPaneDisabled;
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
     * Gets the screenTimeScreenDisabled property value. Indicates if screen timeout setup is disabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getScreenTimeScreenDisabled() {
        return this._screenTimeScreenDisabled;
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
     * Sets the configurationWebUrl property value. URL for setup assistant login
     * @param value Value to set for the configurationWebUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfigurationWebUrl(@javax.annotation.Nullable final Boolean value) {
        this._configurationWebUrl = value;
    }
    /**
     * Sets the deviceNameTemplate property value. Sets a literal or name pattern.
     * @param value Value to set for the deviceNameTemplate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceNameTemplate(@javax.annotation.Nullable final String value) {
        this._deviceNameTemplate = value;
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
     * Sets the displayToneSetupDisabled property value. Indicates if displaytone setup screen is disabled
     * @param value Value to set for the displayToneSetupDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayToneSetupDisabled(@javax.annotation.Nullable final Boolean value) {
        this._displayToneSetupDisabled = value;
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
     * Sets the locationDisabled property value. Indicates if Location service setup pane is disabled
     * @param value Value to set for the locationDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocationDisabled(@javax.annotation.Nullable final Boolean value) {
        this._locationDisabled = value;
    }
    /**
     * Sets the privacyPaneDisabled property value. Indicates if privacy screen is disabled
     * @param value Value to set for the privacyPaneDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrivacyPaneDisabled(@javax.annotation.Nullable final Boolean value) {
        this._privacyPaneDisabled = value;
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
     * Sets the screenTimeScreenDisabled property value. Indicates if screen timeout setup is disabled
     * @param value Value to set for the screenTimeScreenDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScreenTimeScreenDisabled(@javax.annotation.Nullable final Boolean value) {
        this._screenTimeScreenDisabled = value;
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
}
