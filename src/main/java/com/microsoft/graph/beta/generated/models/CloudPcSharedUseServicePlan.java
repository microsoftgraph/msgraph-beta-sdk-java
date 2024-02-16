package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcSharedUseServicePlan extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CloudPcSharedUseServicePlan} and sets the default values.
     */
    public CloudPcSharedUseServicePlan() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcSharedUseServicePlan}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcSharedUseServicePlan createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcSharedUseServicePlan();
    }
    /**
     * Gets the displayName property value. The display name of the shared-use service plan.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("totalCount", (n) -> { this.setTotalCount(n.getIntegerValue()); });
        deserializerMap.put("usedCount", (n) -> { this.setUsedCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the totalCount property value. Total number of shared-use service plans purchased by the customer.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalCount() {
        return this.backingStore.get("totalCount");
    }
    /**
     * Gets the usedCount property value. The number of service plans that the account uses.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUsedCount() {
        return this.backingStore.get("usedCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeIntegerValue("totalCount", this.getTotalCount());
        writer.writeIntegerValue("usedCount", this.getUsedCount());
    }
    /**
     * Sets the displayName property value. The display name of the shared-use service plan.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the totalCount property value. Total number of shared-use service plans purchased by the customer.
     * @param value Value to set for the totalCount property.
     */
    public void setTotalCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalCount", value);
    }
    /**
     * Sets the usedCount property value. The number of service plans that the account uses.
     * @param value Value to set for the usedCount property.
     */
    public void setUsedCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("usedCount", value);
    }
}
