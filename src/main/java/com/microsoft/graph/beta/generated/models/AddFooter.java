package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AddFooter extends MarkContent implements Parsable {
    /**
     * Instantiates a new AddFooter and sets the default values.
     */
    public AddFooter() {
        super();
        this.setOdataType("#microsoft.graph.addFooter");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AddFooter
     */
    @jakarta.annotation.Nonnull
    public static AddFooter createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AddFooter();
    }
    /**
     * Gets the alignment property value. The alignment property
     * @return a AddFooterAlignment
     */
    @jakarta.annotation.Nullable
    public AddFooterAlignment getAlignment() {
        return this.backingStore.get("alignment");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("alignment", (n) -> { this.setAlignment(n.getEnumValue(AddFooterAlignment::forValue)); });
        deserializerMap.put("margin", (n) -> { this.setMargin(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the margin property value. The margin property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMargin() {
        return this.backingStore.get("margin");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("alignment", this.getAlignment());
        writer.writeIntegerValue("margin", this.getMargin());
    }
    /**
     * Sets the alignment property value. The alignment property
     * @param value Value to set for the alignment property.
     */
    public void setAlignment(@jakarta.annotation.Nullable final AddFooterAlignment value) {
        this.backingStore.set("alignment", value);
    }
    /**
     * Sets the margin property value. The margin property
     * @param value Value to set for the margin property.
     */
    public void setMargin(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("margin", value);
    }
}
