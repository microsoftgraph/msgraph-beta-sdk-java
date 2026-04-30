package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcAgentPool extends CloudPcPool implements Parsable {
    /**
     * Instantiates a new {@link CloudPcAgentPool} and sets the default values.
     */
    public CloudPcAgentPool() {
        super();
        this.setOdataType("#microsoft.graph.cloudPcAgentPool");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcAgentPool}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcAgentPool createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcAgentPool();
    }
    /**
     * Gets the billingConfiguration property value. The billingConfiguration property
     * @return a {@link CloudPcAgentPoolBillingConfiguration}
     */
    @jakarta.annotation.Nullable
    public CloudPcAgentPoolBillingConfiguration getBillingConfiguration() {
        return this.backingStore.get("billingConfiguration");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("billingConfiguration", (n) -> { this.setBillingConfiguration(n.getObjectValue(CloudPcAgentPoolBillingConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("poolUrl", (n) -> { this.setPoolUrl(n.getStringValue()); });
        deserializerMap.put("scalingPolicy", (n) -> { this.setScalingPolicy(n.getObjectValue(CloudPcAgentPoolScalingPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("sessionUsage", (n) -> { this.setSessionUsage(n.getObjectValue(CloudPcAgentPoolSessionUsage::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the poolUrl property value. The poolUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPoolUrl() {
        return this.backingStore.get("poolUrl");
    }
    /**
     * Gets the scalingPolicy property value. The scalingPolicy property
     * @return a {@link CloudPcAgentPoolScalingPolicy}
     */
    @jakarta.annotation.Nullable
    public CloudPcAgentPoolScalingPolicy getScalingPolicy() {
        return this.backingStore.get("scalingPolicy");
    }
    /**
     * Gets the sessionUsage property value. The sessionUsage property
     * @return a {@link CloudPcAgentPoolSessionUsage}
     */
    @jakarta.annotation.Nullable
    public CloudPcAgentPoolSessionUsage getSessionUsage() {
        return this.backingStore.get("sessionUsage");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("billingConfiguration", this.getBillingConfiguration());
        writer.writeStringValue("poolUrl", this.getPoolUrl());
        writer.writeObjectValue("scalingPolicy", this.getScalingPolicy());
        writer.writeObjectValue("sessionUsage", this.getSessionUsage());
    }
    /**
     * Sets the billingConfiguration property value. The billingConfiguration property
     * @param value Value to set for the billingConfiguration property.
     */
    public void setBillingConfiguration(@jakarta.annotation.Nullable final CloudPcAgentPoolBillingConfiguration value) {
        this.backingStore.set("billingConfiguration", value);
    }
    /**
     * Sets the poolUrl property value. The poolUrl property
     * @param value Value to set for the poolUrl property.
     */
    public void setPoolUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("poolUrl", value);
    }
    /**
     * Sets the scalingPolicy property value. The scalingPolicy property
     * @param value Value to set for the scalingPolicy property.
     */
    public void setScalingPolicy(@jakarta.annotation.Nullable final CloudPcAgentPoolScalingPolicy value) {
        this.backingStore.set("scalingPolicy", value);
    }
    /**
     * Sets the sessionUsage property value. The sessionUsage property
     * @param value Value to set for the sessionUsage property.
     */
    public void setSessionUsage(@jakarta.annotation.Nullable final CloudPcAgentPoolSessionUsage value) {
        this.backingStore.set("sessionUsage", value);
    }
}
