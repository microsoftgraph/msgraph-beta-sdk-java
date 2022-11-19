package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementAbstractComplexSettingInstance extends DeviceManagementSettingInstance implements Parsable {
    /** The definition ID for the chosen implementation of this complex setting */
    private String _implementationId;
    /** The values that make up the complex setting */
    private java.util.List<DeviceManagementSettingInstance> _value;
    /**
     * Instantiates a new DeviceManagementAbstractComplexSettingInstance and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementAbstractComplexSettingInstance() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementAbstractComplexSettingInstance");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementAbstractComplexSettingInstance
     */
    @javax.annotation.Nonnull
    public static DeviceManagementAbstractComplexSettingInstance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementAbstractComplexSettingInstance();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementAbstractComplexSettingInstance currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("implementationId", (n) -> { currentObject.setImplementationId(n.getStringValue()); });
        deserializerMap.put("value", (n) -> { currentObject.setValue(n.getCollectionOfObjectValues(DeviceManagementSettingInstance::createFromDiscriminatorValue)); });
        return deserializerMap
    }
    /**
     * Gets the implementationId property value. The definition ID for the chosen implementation of this complex setting
     * @return a string
     */
    @javax.annotation.Nullable
    public String getImplementationId() {
        return this._implementationId;
    }
    /**
     * Gets the value property value. The values that make up the complex setting
     * @return a deviceManagementSettingInstance
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementSettingInstance> getValue() {
        return this._value;
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
        writer.writeStringValue("implementationId", this.getImplementationId());
        writer.writeCollectionOfObjectValues("value", this.getValue());
    }
    /**
     * Sets the implementationId property value. The definition ID for the chosen implementation of this complex setting
     * @param value Value to set for the implementationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setImplementationId(@javax.annotation.Nullable final String value) {
        this._implementationId = value;
    }
    /**
     * Sets the value property value. The values that make up the complex setting
     * @param value Value to set for the value property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValue(@javax.annotation.Nullable final java.util.List<DeviceManagementSettingInstance> value) {
        this._value = value;
    }
}
