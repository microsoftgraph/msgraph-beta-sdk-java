package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementConfigurationWindowsSettingApplicability extends DeviceManagementConfigurationSettingApplicability implements Parsable {
    /**
     * Version of CSP setting is a part of
     */
    private String configurationServiceProviderVersion;
    /**
     * Maximum supported version of Windows
     */
    private String maximumSupportedVersion;
    /**
     * Minimum supported version of Windows
     */
    private String minimumSupportedVersion;
    /**
     * Required AAD Trust Type
     */
    private DeviceManagementConfigurationAzureAdTrustType requiredAzureAdTrustType;
    /**
     * AzureAD setting requirement
     */
    private Boolean requiresAzureAd;
    /**
     * List of Windows SKUs that the setting is applicable for
     */
    private java.util.List<DeviceManagementConfigurationWindowsSkus> windowsSkus;
    /**
     * Instantiates a new deviceManagementConfigurationWindowsSettingApplicability and sets the default values.
     */
    public DeviceManagementConfigurationWindowsSettingApplicability() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationWindowsSettingApplicability");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationWindowsSettingApplicability
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationWindowsSettingApplicability createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationWindowsSettingApplicability();
    }
    /**
     * Gets the configurationServiceProviderVersion property value. Version of CSP setting is a part of
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getConfigurationServiceProviderVersion() {
        return this.configurationServiceProviderVersion;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("configurationServiceProviderVersion", (n) -> { this.setConfigurationServiceProviderVersion(n.getStringValue()); });
        deserializerMap.put("maximumSupportedVersion", (n) -> { this.setMaximumSupportedVersion(n.getStringValue()); });
        deserializerMap.put("minimumSupportedVersion", (n) -> { this.setMinimumSupportedVersion(n.getStringValue()); });
        deserializerMap.put("requiredAzureAdTrustType", (n) -> { this.setRequiredAzureAdTrustType(n.getEnumValue(DeviceManagementConfigurationAzureAdTrustType.class)); });
        deserializerMap.put("requiresAzureAd", (n) -> { this.setRequiresAzureAd(n.getBooleanValue()); });
        deserializerMap.put("windowsSkus", (n) -> { this.setWindowsSkus(n.getCollectionOfEnumValues(DeviceManagementConfigurationWindowsSkus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the maximumSupportedVersion property value. Maximum supported version of Windows
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMaximumSupportedVersion() {
        return this.maximumSupportedVersion;
    }
    /**
     * Gets the minimumSupportedVersion property value. Minimum supported version of Windows
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getMinimumSupportedVersion() {
        return this.minimumSupportedVersion;
    }
    /**
     * Gets the requiredAzureAdTrustType property value. Required AAD Trust Type
     * @return a deviceManagementConfigurationAzureAdTrustType
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationAzureAdTrustType getRequiredAzureAdTrustType() {
        return this.requiredAzureAdTrustType;
    }
    /**
     * Gets the requiresAzureAd property value. AzureAD setting requirement
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRequiresAzureAd() {
        return this.requiresAzureAd;
    }
    /**
     * Gets the windowsSkus property value. List of Windows SKUs that the setting is applicable for
     * @return a deviceManagementConfigurationWindowsSkus
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationWindowsSkus> getWindowsSkus() {
        return this.windowsSkus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("configurationServiceProviderVersion", this.getConfigurationServiceProviderVersion());
        writer.writeStringValue("maximumSupportedVersion", this.getMaximumSupportedVersion());
        writer.writeStringValue("minimumSupportedVersion", this.getMinimumSupportedVersion());
        writer.writeEnumValue("requiredAzureAdTrustType", this.getRequiredAzureAdTrustType());
        writer.writeBooleanValue("requiresAzureAd", this.getRequiresAzureAd());
        writer.writeCollectionOfEnumValues("windowsSkus", this.getWindowsSkus());
    }
    /**
     * Sets the configurationServiceProviderVersion property value. Version of CSP setting is a part of
     * @param value Value to set for the configurationServiceProviderVersion property.
     */
    public void setConfigurationServiceProviderVersion(@jakarta.annotation.Nullable final String value) {
        this.configurationServiceProviderVersion = value;
    }
    /**
     * Sets the maximumSupportedVersion property value. Maximum supported version of Windows
     * @param value Value to set for the maximumSupportedVersion property.
     */
    public void setMaximumSupportedVersion(@jakarta.annotation.Nullable final String value) {
        this.maximumSupportedVersion = value;
    }
    /**
     * Sets the minimumSupportedVersion property value. Minimum supported version of Windows
     * @param value Value to set for the minimumSupportedVersion property.
     */
    public void setMinimumSupportedVersion(@jakarta.annotation.Nullable final String value) {
        this.minimumSupportedVersion = value;
    }
    /**
     * Sets the requiredAzureAdTrustType property value. Required AAD Trust Type
     * @param value Value to set for the requiredAzureAdTrustType property.
     */
    public void setRequiredAzureAdTrustType(@jakarta.annotation.Nullable final DeviceManagementConfigurationAzureAdTrustType value) {
        this.requiredAzureAdTrustType = value;
    }
    /**
     * Sets the requiresAzureAd property value. AzureAD setting requirement
     * @param value Value to set for the requiresAzureAd property.
     */
    public void setRequiresAzureAd(@jakarta.annotation.Nullable final Boolean value) {
        this.requiresAzureAd = value;
    }
    /**
     * Sets the windowsSkus property value. List of Windows SKUs that the setting is applicable for
     * @param value Value to set for the windowsSkus property.
     */
    public void setWindowsSkus(@jakarta.annotation.Nullable final java.util.List<DeviceManagementConfigurationWindowsSkus> value) {
        this.windowsSkus = value;
    }
}
