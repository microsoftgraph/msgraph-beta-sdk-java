package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcFrontLineServicePlan extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CloudPcFrontLineServicePlan} and sets the default values.
     */
    public CloudPcFrontLineServicePlan() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcFrontLineServicePlan}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcFrontLineServicePlan createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcFrontLineServicePlan();
    }
    /**
     * Gets the displayName property value. The display name of the front-line service plan. For example, 2vCPU/8GB/128GB Front-line or 4vCPU/16GB/256GB Front-line.
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
     * Gets the totalCount property value. The total number of front-line service plans purchased by the customer.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalCount() {
        return this.backingStore.get("totalCount");
    }
    /**
     * Gets the usedCount property value. The number of service plans that have been used for the account.
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
     * Sets the displayName property value. The display name of the front-line service plan. For example, 2vCPU/8GB/128GB Front-line or 4vCPU/16GB/256GB Front-line.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the totalCount property value. The total number of front-line service plans purchased by the customer.
     * @param value Value to set for the totalCount property.
     */
    public void setTotalCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalCount", value);
    }
    /**
     * Sets the usedCount property value. The number of service plans that have been used for the account.
     * @param value Value to set for the usedCount property.
     */
    public void setUsedCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("usedCount", value);
    }
}
