package com.microsoft.graph.models.externalconnectors;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConnectionQuota extends Entity implements Parsable {
    /**
     * Instantiates a new ConnectionQuota and sets the default values.
     */
    public ConnectionQuota() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConnectionQuota
     */
    @jakarta.annotation.Nonnull
    public static ConnectionQuota createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConnectionQuota();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("itemsRemaining", (n) -> { this.setItemsRemaining(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the itemsRemaining property value. The minimum of two values, one representing the items remaining in the connection and the other remaining items at tenant-level. The following equation represents the formula used to calculate the minimum number: min ({max capacity in the connection}  {number of items in the connection}, {tenant quota}  {number of items indexed in all connections}). If the connection is not monetized, such as in a preview connector or preview content experience, then this property is simply the number of remaining items in the connection.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getItemsRemaining() {
        return this.backingStore.get("itemsRemaining");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("itemsRemaining", this.getItemsRemaining());
    }
    /**
     * Sets the itemsRemaining property value. The minimum of two values, one representing the items remaining in the connection and the other remaining items at tenant-level. The following equation represents the formula used to calculate the minimum number: min ({max capacity in the connection}  {number of items in the connection}, {tenant quota}  {number of items indexed in all connections}). If the connection is not monetized, such as in a preview connector or preview content experience, then this property is simply the number of remaining items in the connection.
     * @param value Value to set for the itemsRemaining property.
     */
    public void setItemsRemaining(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("itemsRemaining", value);
    }
}
