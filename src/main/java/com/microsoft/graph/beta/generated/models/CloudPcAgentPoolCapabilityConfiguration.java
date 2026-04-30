package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcAgentPoolCapabilityConfiguration extends CloudPcPoolCapabilityConfiguration implements Parsable {
    /**
     * Instantiates a new {@link CloudPcAgentPoolCapabilityConfiguration} and sets the default values.
     */
    public CloudPcAgentPoolCapabilityConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.cloudPcAgentPoolCapabilityConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcAgentPoolCapabilityConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcAgentPoolCapabilityConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcAgentPoolCapabilityConfiguration();
    }
    /**
     * Gets the enableSingleSignOn property value. The enableSingleSignOn property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableSingleSignOn() {
        return this.backingStore.get("enableSingleSignOn");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("enableSingleSignOn", (n) -> { this.setEnableSingleSignOn(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("enableSingleSignOn", this.getEnableSingleSignOn());
    }
    /**
     * Sets the enableSingleSignOn property value. The enableSingleSignOn property
     * @param value Value to set for the enableSingleSignOn property.
     */
    public void setEnableSingleSignOn(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enableSingleSignOn", value);
    }
}
