package microsoft.graph.models.externalconnectors;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.Entity;
public class ConnectionQuota extends Entity implements Parsable {
    /** The minimum of two values, one representing the items remaining in the connection and the other remaining items at tenant-level. The following equation represents the formula used to calculate the minimum number: min ({max capacity in the connection} – {number of items in the connection}, {tenant quota} – {number of items indexed in all connections}). If the connection is not monetized, such as in a preview connector or preview content experience, then this property is simply the number of remaining items in the connection. */
    private Long _itemsRemaining;
    /**
     * Instantiates a new ConnectionQuota and sets the default values.
     * @return a void
     */
    public ConnectionQuota() {
        super();
        this.setOdataType("#microsoft.graph.externalConnectors.connectionQuota");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConnectionQuota
     */
    @javax.annotation.Nonnull
    public static ConnectionQuota createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConnectionQuota();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ConnectionQuota currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("itemsRemaining", (n) -> { currentObject.setItemsRemaining(n.getLongValue()); });
        }};
    }
    /**
     * Gets the itemsRemaining property value. The minimum of two values, one representing the items remaining in the connection and the other remaining items at tenant-level. The following equation represents the formula used to calculate the minimum number: min ({max capacity in the connection} – {number of items in the connection}, {tenant quota} – {number of items indexed in all connections}). If the connection is not monetized, such as in a preview connector or preview content experience, then this property is simply the number of remaining items in the connection.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getItemsRemaining() {
        return this._itemsRemaining;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("itemsRemaining", this.getItemsRemaining());
    }
    /**
     * Sets the itemsRemaining property value. The minimum of two values, one representing the items remaining in the connection and the other remaining items at tenant-level. The following equation represents the formula used to calculate the minimum number: min ({max capacity in the connection} – {number of items in the connection}, {tenant quota} – {number of items indexed in all connections}). If the connection is not monetized, such as in a preview connector or preview content experience, then this property is simply the number of remaining items in the connection.
     * @param value Value to set for the itemsRemaining property.
     * @return a void
     */
    public void setItemsRemaining(@javax.annotation.Nullable final Long value) {
        this._itemsRemaining = value;
    }
}
