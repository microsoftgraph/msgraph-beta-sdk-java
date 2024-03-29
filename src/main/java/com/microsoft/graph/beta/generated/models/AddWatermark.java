package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AddWatermark extends MarkContent implements Parsable {
    /**
     * Instantiates a new {@link AddWatermark} and sets the default values.
     */
    public AddWatermark() {
        super();
        this.setOdataType("#microsoft.graph.addWatermark");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AddWatermark}
     */
    @jakarta.annotation.Nonnull
    public static AddWatermark createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AddWatermark();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("orientation", (n) -> { this.setOrientation(n.getEnumValue(PageOrientation::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the orientation property value. The orientation property
     * @return a {@link PageOrientation}
     */
    @jakarta.annotation.Nullable
    public PageOrientation getOrientation() {
        return this.backingStore.get("orientation");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("orientation", this.getOrientation());
    }
    /**
     * Sets the orientation property value. The orientation property
     * @param value Value to set for the orientation property.
     */
    public void setOrientation(@jakarta.annotation.Nullable final PageOrientation value) {
        this.backingStore.set("orientation", value);
    }
}
