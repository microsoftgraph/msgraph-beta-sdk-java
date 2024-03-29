package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AddHeader extends MarkContent implements Parsable {
    /**
     * Instantiates a new {@link AddHeader} and sets the default values.
     */
    public AddHeader() {
        super();
        this.setOdataType("#microsoft.graph.addHeader");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AddHeader}
     */
    @jakarta.annotation.Nonnull
    public static AddHeader createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AddHeader();
    }
    /**
     * Gets the alignment property value. The alignment property
     * @return a {@link Alignment}
     */
    @jakarta.annotation.Nullable
    public Alignment getAlignment() {
        return this.backingStore.get("alignment");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("alignment", (n) -> { this.setAlignment(n.getEnumValue(Alignment::forValue)); });
        deserializerMap.put("margin", (n) -> { this.setMargin(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the margin property value. The margin property
     * @return a {@link Integer}
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
    public void setAlignment(@jakarta.annotation.Nullable final Alignment value) {
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
