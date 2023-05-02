package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementConfigurationSimpleSettingCollectionInstance extends DeviceManagementConfigurationSettingInstance implements Parsable {
    /** Simple setting collection instance value */
    private java.util.List<DeviceManagementConfigurationSimpleSettingValue> simpleSettingCollectionValue;
    /**
     * Instantiates a new DeviceManagementConfigurationSimpleSettingCollectionInstance and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationSimpleSettingCollectionInstance() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationSimpleSettingCollectionInstance");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementConfigurationSimpleSettingCollectionInstance
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationSimpleSettingCollectionInstance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationSimpleSettingCollectionInstance();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("simpleSettingCollectionValue", (n) -> { this.setSimpleSettingCollectionValue(n.getCollectionOfObjectValues(DeviceManagementConfigurationSimpleSettingValue::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the simpleSettingCollectionValue property value. Simple setting collection instance value
     * @return a deviceManagementConfigurationSimpleSettingValue
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSimpleSettingValue> getSimpleSettingCollectionValue() {
        return this.simpleSettingCollectionValue;
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
        writer.writeCollectionOfObjectValues("simpleSettingCollectionValue", this.getSimpleSettingCollectionValue());
    }
    /**
     * Sets the simpleSettingCollectionValue property value. Simple setting collection instance value
     * @param value Value to set for the simpleSettingCollectionValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSimpleSettingCollectionValue(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationSimpleSettingValue> value) {
        this.simpleSettingCollectionValue = value;
    }
}
