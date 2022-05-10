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
    /** The itemsRemaining property */
    private Long _itemsRemaining;
    /**
     * Instantiates a new connectionQuota and sets the default values.
     * @return a void
     */
    public ConnectionQuota() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a connectionQuota
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
     * Gets the itemsRemaining property value. The itemsRemaining property
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
     * Sets the itemsRemaining property value. The itemsRemaining property
     * @param value Value to set for the itemsRemaining property.
     * @return a void
     */
    public void setItemsRemaining(@javax.annotation.Nullable final Long value) {
        this._itemsRemaining = value;
    }
}
