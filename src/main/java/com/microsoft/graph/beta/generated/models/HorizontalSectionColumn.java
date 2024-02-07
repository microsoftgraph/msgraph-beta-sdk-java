package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HorizontalSectionColumn extends Entity implements Parsable {
    /**
     * Instantiates a new HorizontalSectionColumn and sets the default values.
     */
    public HorizontalSectionColumn() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a HorizontalSectionColumn
     */
    @jakarta.annotation.Nonnull
    public static HorizontalSectionColumn createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HorizontalSectionColumn();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("webparts", (n) -> { this.setWebparts(n.getCollectionOfObjectValues(WebPart::createFromDiscriminatorValue)); });
        deserializerMap.put("width", (n) -> { this.setWidth(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the webparts property value. The collection of WebParts in this column.
     * @return a java.util.List<WebPart>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WebPart> getWebparts() {
        return this.backingStore.get("webparts");
    }
    /**
     * Gets the width property value. Width of the column. A horizontal section is divided into 12 grids. A column should have a value of 1-12 to represent its range spans. For example, there can be two columns both have a width of 6 in a section.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getWidth() {
        return this.backingStore.get("width");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("webparts", this.getWebparts());
        writer.writeIntegerValue("width", this.getWidth());
    }
    /**
     * Sets the webparts property value. The collection of WebParts in this column.
     * @param value Value to set for the webparts property.
     */
    public void setWebparts(@jakarta.annotation.Nullable final java.util.List<WebPart> value) {
        this.backingStore.set("webparts", value);
    }
    /**
     * Sets the width property value. Width of the column. A horizontal section is divided into 12 grids. A column should have a value of 1-12 to represent its range spans. For example, there can be two columns both have a width of 6 in a section.
     * @param value Value to set for the width property.
     */
    public void setWidth(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("width", value);
    }
}
