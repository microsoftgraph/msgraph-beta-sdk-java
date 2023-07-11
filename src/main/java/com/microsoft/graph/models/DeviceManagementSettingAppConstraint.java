package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Base entity for a constraint
 */
public class DeviceManagementSettingAppConstraint extends DeviceManagementConstraint implements Parsable {
    /**
     * Acceptable app types to allow for this setting
     */
    private java.util.List<String> supportedTypes;
    /**
     * Instantiates a new deviceManagementSettingAppConstraint and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementSettingAppConstraint() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementSettingAppConstraint");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementSettingAppConstraint
     */
    @javax.annotation.Nonnull
    public static DeviceManagementSettingAppConstraint createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementSettingAppConstraint();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("supportedTypes", (n) -> { this.setSupportedTypes(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the supportedTypes property value. Acceptable app types to allow for this setting
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSupportedTypes() {
        return this.supportedTypes;
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
        writer.writeCollectionOfPrimitiveValues("supportedTypes", this.getSupportedTypes());
    }
    /**
     * Sets the supportedTypes property value. Acceptable app types to allow for this setting
     * @param value Value to set for the supportedTypes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSupportedTypes(@javax.annotation.Nullable final java.util.List<String> value) {
        this.supportedTypes = value;
    }
}
