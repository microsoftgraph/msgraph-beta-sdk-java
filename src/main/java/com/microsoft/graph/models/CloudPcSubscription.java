package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcSubscription extends Entity implements Parsable {
    /**
     * The ID of the subscription.
     */
    private String subscriptionId;
    /**
     * The name of the subscription.
     */
    private String subscriptionName;
    /**
     * Instantiates a new cloudPcSubscription and sets the default values.
     */
    public CloudPcSubscription() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cloudPcSubscription
     */
    @jakarta.annotation.Nonnull
    public static CloudPcSubscription createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcSubscription();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("subscriptionId", (n) -> { this.setSubscriptionId(n.getStringValue()); });
        deserializerMap.put("subscriptionName", (n) -> { this.setSubscriptionName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the subscriptionId property value. The ID of the subscription.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSubscriptionId() {
        return this.subscriptionId;
    }
    /**
     * Gets the subscriptionName property value. The name of the subscription.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSubscriptionName() {
        return this.subscriptionName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("subscriptionId", this.getSubscriptionId());
        writer.writeStringValue("subscriptionName", this.getSubscriptionName());
    }
    /**
     * Sets the subscriptionId property value. The ID of the subscription.
     * @param value Value to set for the subscriptionId property.
     */
    public void setSubscriptionId(@jakarta.annotation.Nullable final String value) {
        this.subscriptionId = value;
    }
    /**
     * Sets the subscriptionName property value. The name of the subscription.
     * @param value Value to set for the subscriptionName property.
     */
    public void setSubscriptionName(@jakarta.annotation.Nullable final String value) {
        this.subscriptionName = value;
    }
}
