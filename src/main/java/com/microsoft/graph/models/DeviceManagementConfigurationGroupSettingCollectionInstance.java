package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Setting instance within policy
 */
public class DeviceManagementConfigurationGroupSettingCollectionInstance extends DeviceManagementConfigurationSettingInstance implements Parsable {
    /**
     * A collection of GroupSetting values
     */
    private java.util.List<DeviceManagementConfigurationGroupSettingValue> groupSettingCollectionValue;
    /**
     * Instantiates a new deviceManagementConfigurationGroupSettingCollectionInstance and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationGroupSettingCollectionInstance() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationGroupSettingCollectionInstance");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationGroupSettingCollectionInstance
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationGroupSettingCollectionInstance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationGroupSettingCollectionInstance();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("groupSettingCollectionValue", (n) -> { this.setGroupSettingCollectionValue(n.getCollectionOfObjectValues(DeviceManagementConfigurationGroupSettingValue::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the groupSettingCollectionValue property value. A collection of GroupSetting values
     * @return a deviceManagementConfigurationGroupSettingValue
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationGroupSettingValue> getGroupSettingCollectionValue() {
        return this.groupSettingCollectionValue;
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
        writer.writeCollectionOfObjectValues("groupSettingCollectionValue", this.getGroupSettingCollectionValue());
    }
    /**
     * Sets the groupSettingCollectionValue property value. A collection of GroupSetting values
     * @param value Value to set for the groupSettingCollectionValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupSettingCollectionValue(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationGroupSettingValue> value) {
        this.groupSettingCollectionValue = value;
    }
}
