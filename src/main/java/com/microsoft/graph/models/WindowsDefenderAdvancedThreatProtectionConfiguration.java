package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Windows Defender AdvancedThreatProtection Configuration.
 */
public class WindowsDefenderAdvancedThreatProtectionConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Auto populate onboarding blob programmatically from Advanced Threat protection service
     */
    private Boolean advancedThreatProtectionAutoPopulateOnboardingBlob;
    /**
     * Windows Defender AdvancedThreatProtection Offboarding Blob.
     */
    private String advancedThreatProtectionOffboardingBlob;
    /**
     * Name of the file from which AdvancedThreatProtectionOffboardingBlob was obtained.
     */
    private String advancedThreatProtectionOffboardingFilename;
    /**
     * Windows Defender AdvancedThreatProtection Onboarding Blob.
     */
    private String advancedThreatProtectionOnboardingBlob;
    /**
     * Name of the file from which AdvancedThreatProtectionOnboardingBlob was obtained.
     */
    private String advancedThreatProtectionOnboardingFilename;
    /**
     * Windows Defender AdvancedThreatProtection 'Allow Sample Sharing' Rule
     */
    private Boolean allowSampleSharing;
    /**
     * Expedite Windows Defender Advanced Threat Protection telemetry reporting frequency.
     */
    private Boolean enableExpeditedTelemetryReporting;
    /**
     * Instantiates a new windowsDefenderAdvancedThreatProtectionConfiguration and sets the default values.
     */
    public WindowsDefenderAdvancedThreatProtectionConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windowsDefenderAdvancedThreatProtectionConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsDefenderAdvancedThreatProtectionConfiguration
     */
    @jakarta.annotation.Nonnull
    public static WindowsDefenderAdvancedThreatProtectionConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsDefenderAdvancedThreatProtectionConfiguration();
    }
    /**
     * Gets the advancedThreatProtectionAutoPopulateOnboardingBlob property value. Auto populate onboarding blob programmatically from Advanced Threat protection service
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAdvancedThreatProtectionAutoPopulateOnboardingBlob() {
        return this.advancedThreatProtectionAutoPopulateOnboardingBlob;
    }
    /**
     * Gets the advancedThreatProtectionOffboardingBlob property value. Windows Defender AdvancedThreatProtection Offboarding Blob.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAdvancedThreatProtectionOffboardingBlob() {
        return this.advancedThreatProtectionOffboardingBlob;
    }
    /**
     * Gets the advancedThreatProtectionOffboardingFilename property value. Name of the file from which AdvancedThreatProtectionOffboardingBlob was obtained.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAdvancedThreatProtectionOffboardingFilename() {
        return this.advancedThreatProtectionOffboardingFilename;
    }
    /**
     * Gets the advancedThreatProtectionOnboardingBlob property value. Windows Defender AdvancedThreatProtection Onboarding Blob.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAdvancedThreatProtectionOnboardingBlob() {
        return this.advancedThreatProtectionOnboardingBlob;
    }
    /**
     * Gets the advancedThreatProtectionOnboardingFilename property value. Name of the file from which AdvancedThreatProtectionOnboardingBlob was obtained.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAdvancedThreatProtectionOnboardingFilename() {
        return this.advancedThreatProtectionOnboardingFilename;
    }
    /**
     * Gets the allowSampleSharing property value. Windows Defender AdvancedThreatProtection 'Allow Sample Sharing' Rule
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowSampleSharing() {
        return this.allowSampleSharing;
    }
    /**
     * Gets the enableExpeditedTelemetryReporting property value. Expedite Windows Defender Advanced Threat Protection telemetry reporting frequency.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableExpeditedTelemetryReporting() {
        return this.enableExpeditedTelemetryReporting;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("advancedThreatProtectionAutoPopulateOnboardingBlob", (n) -> { this.setAdvancedThreatProtectionAutoPopulateOnboardingBlob(n.getBooleanValue()); });
        deserializerMap.put("advancedThreatProtectionOffboardingBlob", (n) -> { this.setAdvancedThreatProtectionOffboardingBlob(n.getStringValue()); });
        deserializerMap.put("advancedThreatProtectionOffboardingFilename", (n) -> { this.setAdvancedThreatProtectionOffboardingFilename(n.getStringValue()); });
        deserializerMap.put("advancedThreatProtectionOnboardingBlob", (n) -> { this.setAdvancedThreatProtectionOnboardingBlob(n.getStringValue()); });
        deserializerMap.put("advancedThreatProtectionOnboardingFilename", (n) -> { this.setAdvancedThreatProtectionOnboardingFilename(n.getStringValue()); });
        deserializerMap.put("allowSampleSharing", (n) -> { this.setAllowSampleSharing(n.getBooleanValue()); });
        deserializerMap.put("enableExpeditedTelemetryReporting", (n) -> { this.setEnableExpeditedTelemetryReporting(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAdvancedThreatProtectionAutoPopulateOnboardingBlob(@jakarta.annotation.Nullable final Boolean value) {
        this.advancedThreatProtectionAutoPopulateOnboardingBlob = value;
    }
    /**
     * Sets the advancedThreatProtectionOffboardingBlob property value. Windows Defender AdvancedThreatProtection Offboarding Blob.
     * @param value Value to set for the advancedThreatProtectionOffboardingBlob property.
     */
    public void setAdvancedThreatProtectionOffboardingBlob(@jakarta.annotation.Nullable final String value) {
        this.advancedThreatProtectionOffboardingBlob = value;
    }
    /**
     * Sets the advancedThreatProtectionOffboardingFilename property value. Name of the file from which AdvancedThreatProtectionOffboardingBlob was obtained.
     * @param value Value to set for the advancedThreatProtectionOffboardingFilename property.
     */
    public void setAdvancedThreatProtectionOffboardingFilename(@jakarta.annotation.Nullable final String value) {
        this.advancedThreatProtectionOffboardingFilename = value;
    }
    /**
     * Sets the advancedThreatProtectionOnboardingBlob property value. Windows Defender AdvancedThreatProtection Onboarding Blob.
     * @param value Value to set for the advancedThreatProtectionOnboardingBlob property.
     */
    public void setAdvancedThreatProtectionOnboardingBlob(@jakarta.annotation.Nullable final String value) {
        this.advancedThreatProtectionOnboardingBlob = value;
    }
    /**
     * Sets the advancedThreatProtectionOnboardingFilename property value. Name of the file from which AdvancedThreatProtectionOnboardingBlob was obtained.
     * @param value Value to set for the advancedThreatProtectionOnboardingFilename property.
     */
    public void setAdvancedThreatProtectionOnboardingFilename(@jakarta.annotation.Nullable final String value) {
        this.advancedThreatProtectionOnboardingFilename = value;
    }
    /**
     * Sets the allowSampleSharing property value. Windows Defender AdvancedThreatProtection 'Allow Sample Sharing' Rule
     * @param value Value to set for the allowSampleSharing property.
     */
    public void setAllowSampleSharing(@jakarta.annotation.Nullable final Boolean value) {
        this.allowSampleSharing = value;
    }
    /**
     * Sets the enableExpeditedTelemetryReporting property value. Expedite Windows Defender Advanced Threat Protection telemetry reporting frequency.
     * @param value Value to set for the enableExpeditedTelemetryReporting property.
     */
    public void setEnableExpeditedTelemetryReporting(@jakarta.annotation.Nullable final Boolean value) {
        this.enableExpeditedTelemetryReporting = value;
    }
}
