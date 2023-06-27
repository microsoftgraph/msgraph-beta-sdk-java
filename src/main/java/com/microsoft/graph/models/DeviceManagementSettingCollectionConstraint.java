package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementSettingCollectionConstraint extends DeviceManagementConstraint implements Parsable {
    /**
     * The maximum number of elements in the collection
     */
    private Integer maximumLength;
    /**
     * The minimum number of elements in the collection
     */
    private Integer minimumLength;
    /**
     * Instantiates a new DeviceManagementSettingCollectionConstraint and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementSettingCollectionConstraint() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementSettingCollectionConstraint");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementSettingCollectionConstraint
     */
    @javax.annotation.Nonnull
    public static DeviceManagementSettingCollectionConstraint createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementSettingCollectionConstraint();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("maximumLength", (n) -> { this.setMaximumLength(n.getIntegerValue()); });
        deserializerMap.put("minimumLength", (n) -> { this.setMinimumLength(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maximumLength property value. The maximum number of elements in the collection
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaximumLength() {
        return this.maximumLength;
    }
    /**
     * Gets the minimumLength property value. The minimum number of elements in the collection
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMinimumLength() {
        return this.minimumLength;
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
        writer.writeIntegerValue("maximumLength", this.getMaximumLength());
        writer.writeIntegerValue("minimumLength", this.getMinimumLength());
    }
    /**
     * Sets the maximumLength property value. The maximum number of elements in the collection
     * @param value Value to set for the maximumLength property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaximumLength(@javax.annotation.Nullable final Integer value) {
        this.maximumLength = value;
    }
    /**
     * Sets the minimumLength property value. The minimum number of elements in the collection
     * @param value Value to set for the minimumLength property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumLength(@javax.annotation.Nullable final Integer value) {
        this.minimumLength = value;
    }
}
