package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementSettingProfileConstraint extends DeviceManagementConstraint implements Parsable {
    /** The source of the entity */
    private String _source;
    /** A collection of types this entity carries */
    private java.util.List<String> _types;
    /**
     * Instantiates a new DeviceManagementSettingProfileConstraint and sets the default values.
     * @return a void
     */
    public DeviceManagementSettingProfileConstraint() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementSettingProfileConstraint");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementSettingProfileConstraint
     */
    @javax.annotation.Nonnull
    public static DeviceManagementSettingProfileConstraint createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementSettingProfileConstraint();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementSettingProfileConstraint currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("source", (n) -> { currentObject.setSource(n.getStringValue()); });
            this.put("types", (n) -> { currentObject.setTypes(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the source property value. The source of the entity
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSource() {
        return this._source;
    }
    /**
     * Gets the types property value. A collection of types this entity carries
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTypes() {
        return this._types;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("source", this.getSource());
        writer.writeCollectionOfPrimitiveValues("types", this.getTypes());
    }
    /**
     * Sets the source property value. The source of the entity
     * @param value Value to set for the source property.
     * @return a void
     */
    public void setSource(@javax.annotation.Nullable final String value) {
        this._source = value;
    }
    /**
     * Sets the types property value. A collection of types this entity carries
     * @param value Value to set for the types property.
     * @return a void
     */
    public void setTypes(@javax.annotation.Nullable final java.util.List<String> value) {
        this._types = value;
    }
}
