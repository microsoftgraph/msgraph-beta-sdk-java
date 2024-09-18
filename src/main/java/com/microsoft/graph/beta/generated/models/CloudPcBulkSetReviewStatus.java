package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcBulkSetReviewStatus extends CloudPcBulkAction implements Parsable {
    /**
     * Instantiates a new {@link CloudPcBulkSetReviewStatus} and sets the default values.
     */
    public CloudPcBulkSetReviewStatus() {
        super();
        this.setOdataType("#microsoft.graph.cloudPcBulkSetReviewStatus");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcBulkSetReviewStatus}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcBulkSetReviewStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcBulkSetReviewStatus();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("reviewStatus", (n) -> { this.setReviewStatus(n.getObjectValue(CloudPcReviewStatus::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the reviewStatus property value. The reviewStatus property
     * @return a {@link CloudPcReviewStatus}
     */
    @jakarta.annotation.Nullable
    public CloudPcReviewStatus getReviewStatus() {
        return this.backingStore.get("reviewStatus");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("reviewStatus", this.getReviewStatus());
    }
    /**
     * Sets the reviewStatus property value. The reviewStatus property
     * @param value Value to set for the reviewStatus property.
     */
    public void setReviewStatus(@jakarta.annotation.Nullable final CloudPcReviewStatus value) {
        this.backingStore.set("reviewStatus", value);
    }
}
