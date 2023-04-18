package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class LookupResultRow extends Entity implements Parsable {
    /** The row property */
    private String row;
    /**
     * Instantiates a new lookupResultRow and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public LookupResultRow() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a lookupResultRow
     */
    @javax.annotation.Nonnull
    public static LookupResultRow createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LookupResultRow();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("row", (n) -> { this.setRow(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the row property value. The row property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRow() {
        return this.row;
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
        writer.writeStringValue("row", this.getRow());
    }
    /**
     * Sets the row property value. The row property
     * @param value Value to set for the row property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRow(@javax.annotation.Nullable final String value) {
        this.row = value;
    }
}
