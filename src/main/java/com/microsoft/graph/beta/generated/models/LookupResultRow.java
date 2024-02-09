package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LookupResultRow extends Entity implements Parsable {
    /**
     * Instantiates a new {@link LookupResultRow} and sets the default values.
     */
    public LookupResultRow() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LookupResultRow}
     */
    @jakarta.annotation.Nonnull
    public static LookupResultRow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LookupResultRow();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("row", (n) -> { this.setRow(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the row property value. The row property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRow() {
        return this.backingStore.get("row");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("row", this.getRow());
    }
    /**
     * Sets the row property value. The row property
     * @param value Value to set for the row property.
     */
    public void setRow(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("row", value);
    }
}
