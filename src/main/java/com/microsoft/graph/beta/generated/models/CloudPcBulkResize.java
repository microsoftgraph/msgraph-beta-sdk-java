package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcBulkResize extends CloudPcBulkAction implements Parsable {
    /**
     * Instantiates a new {@link CloudPcBulkResize} and sets the default values.
     */
    public CloudPcBulkResize() {
        super();
        this.setOdataType("#microsoft.graph.cloudPcBulkResize");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcBulkResize}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcBulkResize createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcBulkResize();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("targetServicePlanId", (n) -> { this.setTargetServicePlanId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the targetServicePlanId property value. The targetServicePlanId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTargetServicePlanId() {
        return this.backingStore.get("targetServicePlanId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("targetServicePlanId", this.getTargetServicePlanId());
    }
    /**
     * Sets the targetServicePlanId property value. The targetServicePlanId property
     * @param value Value to set for the targetServicePlanId property.
     */
    public void setTargetServicePlanId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("targetServicePlanId", value);
    }
}
