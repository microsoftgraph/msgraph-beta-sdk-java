package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcSubscription extends Entity implements Parsable {
    /** The ID of the subscription. */
    private String _subscriptionId;
    /** The name of the subscription. */
    private String _subscriptionName;
    /**
     * Instantiates a new cloudPcSubscription and sets the default values.
     * @return a void
     */
    public CloudPcSubscription() {
        super();
        this.setOdataType("#microsoft.graph.cloudPcSubscription");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cloudPcSubscription
     */
    @javax.annotation.Nonnull
    public static CloudPcSubscription createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcSubscription();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CloudPcSubscription currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("subscriptionId", (n) -> { currentObject.setSubscriptionId(n.getStringValue()); });
            this.put("subscriptionName", (n) -> { currentObject.setSubscriptionName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the subscriptionId property value. The ID of the subscription.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubscriptionId() {
        return this._subscriptionId;
    }
    /**
     * Gets the subscriptionName property value. The name of the subscription.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubscriptionName() {
        return this._subscriptionName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("subscriptionId", this.getSubscriptionId());
        writer.writeStringValue("subscriptionName", this.getSubscriptionName());
    }
    /**
     * Sets the subscriptionId property value. The ID of the subscription.
     * @param value Value to set for the subscriptionId property.
     * @return a void
     */
    public void setSubscriptionId(@javax.annotation.Nullable final String value) {
        this._subscriptionId = value;
    }
    /**
     * Sets the subscriptionName property value. The name of the subscription.
     * @param value Value to set for the subscriptionName property.
     * @return a void
     */
    public void setSubscriptionName(@javax.annotation.Nullable final String value) {
        this._subscriptionName = value;
    }
}
