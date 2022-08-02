package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementConfigurationWindowsSettingApplicability extends DeviceManagementConfigurationSettingApplicability implements Parsable {
    /** Version of CSP setting is a part of */
    private String _configurationServiceProviderVersion;
    /** Maximum supported version of Windows */
    private String _maximumSupportedVersion;
    /** Minimum supported version of Windows */
    private String _minimumSupportedVersion;
    /** Required AAD Trust Type */
    private DeviceManagementConfigurationAzureAdTrustType _requiredAzureAdTrustType;
    /** AzureAD setting requirement */
    private Boolean _requiresAzureAd;
    /** List of Windows SKUs that the setting is applicable for */
    private java.util.List<String> _windowsSkus;
    /**
     * Instantiates a new DeviceManagementConfigurationWindowsSettingApplicability and sets the default values.
     * @return a void
     */
    public DeviceManagementConfigurationWindowsSettingApplicability() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationWindowsSettingApplicability");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementConfigurationWindowsSettingApplicability
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationWindowsSettingApplicability createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationWindowsSettingApplicability();
    }
    /**
     * Gets the configurationServiceProviderVersion property value. Version of CSP setting is a part of
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConfigurationServiceProviderVersion() {
        return this._configurationServiceProviderVersion;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementConfigurationWindowsSettingApplicability currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("configurationServiceProviderVersion", (n) -> { currentObject.setConfigurationServiceProviderVersion(n.getStringValue()); });
            this.put("maximumSupportedVersion", (n) -> { currentObject.setMaximumSupportedVersion(n.getStringValue()); });
            this.put("minimumSupportedVersion", (n) -> { currentObject.setMinimumSupportedVersion(n.getStringValue()); });
            this.put("requiredAzureAdTrustType", (n) -> { currentObject.setRequiredAzureAdTrustType(n.getEnumValue(DeviceManagementConfigurationAzureAdTrustType.class)); });
            this.put("requiresAzureAd", (n) -> { currentObject.setRequiresAzureAd(n.getBooleanValue()); });
            this.put("windowsSkus", (n) -> { currentObject.setWindowsSkus(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the maximumSupportedVersion property value. Maximum supported version of Windows
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMaximumSupportedVersion() {
        return this._maximumSupportedVersion;
    }
    /**
     * Gets the minimumSupportedVersion property value. Minimum supported version of Windows
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumSupportedVersion() {
        return this._minimumSupportedVersion;
    }
    /**
     * Gets the requiredAzureAdTrustType property value. Required AAD Trust Type
     * @return a deviceManagementConfigurationAzureAdTrustType
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationAzureAdTrustType getRequiredAzureAdTrustType() {
        return this._requiredAzureAdTrustType;
    }
    /**
     * Gets the requiresAzureAd property value. AzureAD setting requirement
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequiresAzureAd() {
        return this._requiresAzureAd;
    }
    /**
     * Gets the windowsSkus property value. List of Windows SKUs that the setting is applicable for
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getWindowsSkus() {
        return this._windowsSkus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("configurationServiceProviderVersion", this.getConfigurationServiceProviderVersion());
        writer.writeStringValue("maximumSupportedVersion", this.getMaximumSupportedVersion());
        writer.writeStringValue("minimumSupportedVersion", this.getMinimumSupportedVersion());
        writer.writeEnumValue("requiredAzureAdTrustType", this.getRequiredAzureAdTrustType());
        writer.writeBooleanValue("requiresAzureAd", this.getRequiresAzureAd());
        writer.writeCollectionOfPrimitiveValues("windowsSkus", this.getWindowsSkus());
    }
    /**
     * Sets the configurationServiceProviderVersion property value. Version of CSP setting is a part of
     * @param value Value to set for the configurationServiceProviderVersion property.
     * @return a void
     */
    public void setConfigurationServiceProviderVersion(@javax.annotation.Nullable final String value) {
        this._configurationServiceProviderVersion = value;
    }
    /**
     * Sets the maximumSupportedVersion property value. Maximum supported version of Windows
     * @param value Value to set for the maximumSupportedVersion property.
     * @return a void
     */
    public void setMaximumSupportedVersion(@javax.annotation.Nullable final String value) {
        this._maximumSupportedVersion = value;
    }
    /**
     * Sets the minimumSupportedVersion property value. Minimum supported version of Windows
     * @param value Value to set for the minimumSupportedVersion property.
     * @return a void
     */
    public void setMinimumSupportedVersion(@javax.annotation.Nullable final String value) {
        this._minimumSupportedVersion = value;
    }
    /**
     * Sets the requiredAzureAdTrustType property value. Required AAD Trust Type
     * @param value Value to set for the requiredAzureAdTrustType property.
     * @return a void
     */
    public void setRequiredAzureAdTrustType(@javax.annotation.Nullable final DeviceManagementConfigurationAzureAdTrustType value) {
        this._requiredAzureAdTrustType = value;
    }
    /**
     * Sets the requiresAzureAd property value. AzureAD setting requirement
     * @param value Value to set for the requiresAzureAd property.
     * @return a void
     */
    public void setRequiresAzureAd(@javax.annotation.Nullable final Boolean value) {
        this._requiresAzureAd = value;
    }
    /**
     * Sets the windowsSkus property value. List of Windows SKUs that the setting is applicable for
     * @param value Value to set for the windowsSkus property.
     * @return a void
     */
    public void setWindowsSkus(@javax.annotation.Nullable final java.util.List<String> value) {
        this._windowsSkus = value;
    }
}
