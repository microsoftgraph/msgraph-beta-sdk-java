package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkbookTableRow extends Entity implements Parsable {
    /**
     * Instantiates a new {@link WorkbookTableRow} and sets the default values.
     */
    public WorkbookTableRow() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WorkbookTableRow}
     */
    @jakarta.annotation.Nonnull
    public static WorkbookTableRow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookTableRow();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("index", (n) -> { this.setIndex(n.getIntegerValue()); });
        deserializerMap.put("values", (n) -> { this.setValues(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the index property value. The index of the row within the rows collection of the table. Zero-based. Read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getIndex() {
        return this.backingStore.get("index");
    }
    /**
     * Gets the values property value. The raw values of the specified range. The data returned could be of type string, number, or a Boolean. Any cell that contain an error will return the error string.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getValues() {
        return this.backingStore.get("values");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("index", this.getIndex());
        writer.writeObjectValue("values", this.getValues());
    }
    /**
     * Sets the index property value. The index of the row within the rows collection of the table. Zero-based. Read-only.
     * @param value Value to set for the index property.
     */
    public void setIndex(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("index", value);
    }
    /**
     * Sets the values property value. The raw values of the specified range. The data returned could be of type string, number, or a Boolean. Any cell that contain an error will return the error string.
     * @param value Value to set for the values property.
     */
    public void setValues(@jakarta.annotation.Nullable final UntypedNode value) {
        this.backingStore.set("values", value);
    }
}
