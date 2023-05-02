package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementConfigurationSettingApplicability implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** description of the setting */
    private String description;
    /** Describes applicability for the mode the device is in */
    private DeviceManagementConfigurationDeviceMode deviceMode;
    /** The OdataType property */
    private String odataType;
    /** Supported platform types. */
    private DeviceManagementConfigurationPlatforms platform;
    /** Describes which technology this setting can be deployed with */
    private DeviceManagementConfigurationTechnologies technologies;
    /**
     * Instantiates a new deviceManagementConfigurationSettingApplicability and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationSettingApplicability() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationSettingApplicability
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationSettingApplicability createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.deviceManagementConfigurationApplicationSettingApplicability": return new DeviceManagementConfigurationApplicationSettingApplicability();
                case "#microsoft.graph.deviceManagementConfigurationExchangeOnlineSettingApplicability": return new DeviceManagementConfigurationExchangeOnlineSettingApplicability();
                case "#microsoft.graph.deviceManagementConfigurationWindowsSettingApplicability": return new DeviceManagementConfigurationWindowsSettingApplicability();
            }
        }
        return new DeviceManagementConfigurationSettingApplicability();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the description property value. description of the setting
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the deviceMode property value. Describes applicability for the mode the device is in
     * @return a deviceManagementConfigurationDeviceMode
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationDeviceMode getDeviceMode() {
        return this.deviceMode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("deviceMode", (n) -> { this.setDeviceMode(n.getEnumValue(DeviceManagementConfigurationDeviceMode.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("platform", (n) -> { this.setPlatform(n.getEnumValue(DeviceManagementConfigurationPlatforms.class)); });
        deserializerMap.put("technologies", (n) -> { this.setTechnologies(n.getEnumValue(DeviceManagementConfigurationTechnologies.class)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the platform property value. Supported platform types.
     * @return a deviceManagementConfigurationPlatforms
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationPlatforms getPlatform() {
        return this.platform;
    }
    /**
     * Gets the technologies property value. Describes which technology this setting can be deployed with
     * @return a deviceManagementConfigurationTechnologies
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationTechnologies getTechnologies() {
        return this.technologies;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeEnumValue("deviceMode", this.getDeviceMode());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("platform", this.getPlatform());
        writer.writeEnumValue("technologies", this.getTechnologies());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the description property value. description of the setting
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the deviceMode property value. Describes applicability for the mode the device is in
     * @param value Value to set for the deviceMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceMode(@javax.annotation.Nullable final DeviceManagementConfigurationDeviceMode value) {
        this.deviceMode = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the platform property value. Supported platform types.
     * @param value Value to set for the platform property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlatform(@javax.annotation.Nullable final DeviceManagementConfigurationPlatforms value) {
        this.platform = value;
    }
    /**
     * Sets the technologies property value. Describes which technology this setting can be deployed with
     * @param value Value to set for the technologies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTechnologies(@javax.annotation.Nullable final DeviceManagementConfigurationTechnologies value) {
        this.technologies = value;
    }
}
