package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsDefenderAdvancedThreatProtectionConfiguration extends DeviceConfiguration implements Parsable {
    /** Auto populate onboarding blob programmatically from Advanced Threat protection service */
    private Boolean _advancedThreatProtectionAutoPopulateOnboardingBlob;
    /** Windows Defender AdvancedThreatProtection Offboarding Blob. */
    private String _advancedThreatProtectionOffboardingBlob;
    /** Name of the file from which AdvancedThreatProtectionOffboardingBlob was obtained. */
    private String _advancedThreatProtectionOffboardingFilename;
    /** Windows Defender AdvancedThreatProtection Onboarding Blob. */
    private String _advancedThreatProtectionOnboardingBlob;
    /** Name of the file from which AdvancedThreatProtectionOnboardingBlob was obtained. */
    private String _advancedThreatProtectionOnboardingFilename;
    /** Windows Defender AdvancedThreatProtection 'Allow Sample Sharing' Rule */
    private Boolean _allowSampleSharing;
    /** Expedite Windows Defender Advanced Threat Protection telemetry reporting frequency. */
    private Boolean _enableExpeditedTelemetryReporting;
    /**
     * Instantiates a new WindowsDefenderAdvancedThreatProtectionConfiguration and sets the default values.
     * @return a void
     */
    public WindowsDefenderAdvancedThreatProtectionConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windowsDefenderAdvancedThreatProtectionConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsDefenderAdvancedThreatProtectionConfiguration
     */
    @javax.annotation.Nonnull
    public static WindowsDefenderAdvancedThreatProtectionConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsDefenderAdvancedThreatProtectionConfiguration();
    }
    /**
     * Gets the advancedThreatProtectionAutoPopulateOnboardingBlob property value. Auto populate onboarding blob programmatically from Advanced Threat protection service
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAdvancedThreatProtectionAutoPopulateOnboardingBlob() {
        return this._advancedThreatProtectionAutoPopulateOnboardingBlob;
    }
    /**
     * Gets the advancedThreatProtectionOffboardingBlob property value. Windows Defender AdvancedThreatProtection Offboarding Blob.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAdvancedThreatProtectionOffboardingBlob() {
        return this._advancedThreatProtectionOffboardingBlob;
    }
    /**
     * Gets the advancedThreatProtectionOffboardingFilename property value. Name of the file from which AdvancedThreatProtectionOffboardingBlob was obtained.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAdvancedThreatProtectionOffboardingFilename() {
        return this._advancedThreatProtectionOffboardingFilename;
    }
    /**
     * Gets the advancedThreatProtectionOnboardingBlob property value. Windows Defender AdvancedThreatProtection Onboarding Blob.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAdvancedThreatProtectionOnboardingBlob() {
        return this._advancedThreatProtectionOnboardingBlob;
    }
    /**
     * Gets the advancedThreatProtectionOnboardingFilename property value. Name of the file from which AdvancedThreatProtectionOnboardingBlob was obtained.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAdvancedThreatProtectionOnboardingFilename() {
        return this._advancedThreatProtectionOnboardingFilename;
    }
    /**
     * Gets the allowSampleSharing property value. Windows Defender AdvancedThreatProtection 'Allow Sample Sharing' Rule
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowSampleSharing() {
        return this._allowSampleSharing;
    }
    /**
     * Gets the enableExpeditedTelemetryReporting property value. Expedite Windows Defender Advanced Threat Protection telemetry reporting frequency.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableExpeditedTelemetryReporting() {
        return this._enableExpeditedTelemetryReporting;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsDefenderAdvancedThreatProtectionConfiguration currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("advancedThreatProtectionAutoPopulateOnboardingBlob", (n) -> { currentObject.setAdvancedThreatProtectionAutoPopulateOnboardingBlob(n.getBooleanValue()); });
            this.put("advancedThreatProtectionOffboardingBlob", (n) -> { currentObject.setAdvancedThreatProtectionOffboardingBlob(n.getStringValue()); });
            this.put("advancedThreatProtectionOffboardingFilename", (n) -> { currentObject.setAdvancedThreatProtectionOffboardingFilename(n.getStringValue()); });
            this.put("advancedThreatProtectionOnboardingBlob", (n) -> { currentObject.setAdvancedThreatProtectionOnboardingBlob(n.getStringValue()); });
            this.put("advancedThreatProtectionOnboardingFilename", (n) -> { currentObject.setAdvancedThreatProtectionOnboardingFilename(n.getStringValue()); });
            this.put("allowSampleSharing", (n) -> { currentObject.setAllowSampleSharing(n.getBooleanValue()); });
            this.put("enableExpeditedTelemetryReporting", (n) -> { currentObject.setEnableExpeditedTelemetryReporting(n.getBooleanValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("advancedThreatProtectionAutoPopulateOnboardingBlob", this.getAdvancedThreatProtectionAutoPopulateOnboardingBlob());
        writer.writeStringValue("advancedThreatProtectionOffboardingBlob", this.getAdvancedThreatProtectionOffboardingBlob());
        writer.writeStringValue("advancedThreatProtectionOffboardingFilename", this.getAdvancedThreatProtectionOffboardingFilename());
        writer.writeStringValue("advancedThreatProtectionOnboardingBlob", this.getAdvancedThreatProtectionOnboardingBlob());
        writer.writeStringValue("advancedThreatProtectionOnboardingFilename", this.getAdvancedThreatProtectionOnboardingFilename());
        writer.writeBooleanValue("allowSampleSharing", this.getAllowSampleSharing());
        writer.writeBooleanValue("enableExpeditedTelemetryReporting", this.getEnableExpeditedTelemetryReporting());
    }
    /**
     * Sets the advancedThreatProtectionAutoPopulateOnboardingBlob property value. Auto populate onboarding blob programmatically from Advanced Threat protection service
     * @param value Value to set for the advancedThreatProtectionAutoPopulateOnboardingBlob property.
     * @return a void
     */
    public void setAdvancedThreatProtectionAutoPopulateOnboardingBlob(@javax.annotation.Nullable final Boolean value) {
        this._advancedThreatProtectionAutoPopulateOnboardingBlob = value;
    }
    /**
     * Sets the advancedThreatProtectionOffboardingBlob property value. Windows Defender AdvancedThreatProtection Offboarding Blob.
     * @param value Value to set for the advancedThreatProtectionOffboardingBlob property.
     * @return a void
     */
    public void setAdvancedThreatProtectionOffboardingBlob(@javax.annotation.Nullable final String value) {
        this._advancedThreatProtectionOffboardingBlob = value;
    }
    /**
     * Sets the advancedThreatProtectionOffboardingFilename property value. Name of the file from which AdvancedThreatProtectionOffboardingBlob was obtained.
     * @param value Value to set for the advancedThreatProtectionOffboardingFilename property.
     * @return a void
     */
    public void setAdvancedThreatProtectionOffboardingFilename(@javax.annotation.Nullable final String value) {
        this._advancedThreatProtectionOffboardingFilename = value;
    }
    /**
     * Sets the advancedThreatProtectionOnboardingBlob property value. Windows Defender AdvancedThreatProtection Onboarding Blob.
     * @param value Value to set for the advancedThreatProtectionOnboardingBlob property.
     * @return a void
     */
    public void setAdvancedThreatProtectionOnboardingBlob(@javax.annotation.Nullable final String value) {
        this._advancedThreatProtectionOnboardingBlob = value;
    }
    /**
     * Sets the advancedThreatProtectionOnboardingFilename property value. Name of the file from which AdvancedThreatProtectionOnboardingBlob was obtained.
     * @param value Value to set for the advancedThreatProtectionOnboardingFilename property.
     * @return a void
     */
    public void setAdvancedThreatProtectionOnboardingFilename(@javax.annotation.Nullable final String value) {
        this._advancedThreatProtectionOnboardingFilename = value;
    }
    /**
     * Sets the allowSampleSharing property value. Windows Defender AdvancedThreatProtection 'Allow Sample Sharing' Rule
     * @param value Value to set for the allowSampleSharing property.
     * @return a void
     */
    public void setAllowSampleSharing(@javax.annotation.Nullable final Boolean value) {
        this._allowSampleSharing = value;
    }
    /**
     * Sets the enableExpeditedTelemetryReporting property value. Expedite Windows Defender Advanced Threat Protection telemetry reporting frequency.
     * @param value Value to set for the enableExpeditedTelemetryReporting property.
     * @return a void
     */
    public void setEnableExpeditedTelemetryReporting(@javax.annotation.Nullable final Boolean value) {
        this._enableExpeditedTelemetryReporting = value;
    }
}
