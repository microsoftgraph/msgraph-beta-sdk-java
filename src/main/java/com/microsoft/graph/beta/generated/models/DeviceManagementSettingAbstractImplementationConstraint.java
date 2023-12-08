package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Constraint that enforces an AbstractComplex type has or is set to a particular value
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementSettingAbstractImplementationConstraint extends DeviceManagementConstraint implements Parsable {
    /**
     * Instantiates a new DeviceManagementSettingAbstractImplementationConstraint and sets the default values.
     */
    public DeviceManagementSettingAbstractImplementationConstraint() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementSettingAbstractImplementationConstraint");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementSettingAbstractImplementationConstraint
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementSettingAbstractImplementationConstraint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementSettingAbstractImplementationConstraint();
    }
    /**
     * Gets the allowedAbstractImplementationDefinitionIds property value. List of value which means not configured for the setting
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAllowedAbstractImplementationDefinitionIds() {
        return this.backingStore.get("allowedAbstractImplementationDefinitionIds");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowedAbstractImplementationDefinitionIds", (n) -> { this.setAllowedAbstractImplementationDefinitionIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("allowedAbstractImplementationDefinitionIds", this.getAllowedAbstractImplementationDefinitionIds());
    }
    /**
     * Sets the allowedAbstractImplementationDefinitionIds property value. List of value which means not configured for the setting
     * @param value Value to set for the allowedAbstractImplementationDefinitionIds property.
     */
    public void setAllowedAbstractImplementationDefinitionIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("allowedAbstractImplementationDefinitionIds", value);
    }
}
