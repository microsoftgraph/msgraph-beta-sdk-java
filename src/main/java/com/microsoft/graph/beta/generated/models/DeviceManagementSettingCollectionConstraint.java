package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Constraint that enforces the maximum number of elements a collection
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementSettingCollectionConstraint extends DeviceManagementConstraint implements Parsable {
    /**
     * Instantiates a new {@link DeviceManagementSettingCollectionConstraint} and sets the default values.
     */
    public DeviceManagementSettingCollectionConstraint() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementSettingCollectionConstraint");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceManagementSettingCollectionConstraint}
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementSettingCollectionConstraint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementSettingCollectionConstraint();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("maximumLength", (n) -> { this.setMaximumLength(n.getIntegerValue()); });
        deserializerMap.put("minimumLength", (n) -> { this.setMinimumLength(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maximumLength property value. The maximum number of elements in the collection
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMaximumLength() {
        return this.backingStore.get("maximumLength");
    }
    /**
     * Gets the minimumLength property value. The minimum number of elements in the collection
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMinimumLength() {
        return this.backingStore.get("minimumLength");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("maximumLength", this.getMaximumLength());
        writer.writeIntegerValue("minimumLength", this.getMinimumLength());
    }
    /**
     * Sets the maximumLength property value. The maximum number of elements in the collection
     * @param value Value to set for the maximumLength property.
     */
    public void setMaximumLength(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("maximumLength", value);
    }
    /**
     * Sets the minimumLength property value. The minimum number of elements in the collection
     * @param value Value to set for the minimumLength property.
     */
    public void setMinimumLength(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("minimumLength", value);
    }
}
