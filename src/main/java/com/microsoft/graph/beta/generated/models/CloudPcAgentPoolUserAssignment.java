package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcAgentPoolUserAssignment extends CloudPcPoolAssignment implements Parsable {
    /**
     * Instantiates a new {@link CloudPcAgentPoolUserAssignment} and sets the default values.
     */
    public CloudPcAgentPoolUserAssignment() {
        super();
        this.setOdataType("#microsoft.graph.cloudPcAgentPoolUserAssignment");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcAgentPoolUserAssignment}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcAgentPoolUserAssignment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcAgentPoolUserAssignment();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("userPrincipalId", (n) -> { this.setUserPrincipalId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the userPrincipalId property value. The userPrincipalId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalId() {
        return this.backingStore.get("userPrincipalId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("userPrincipalId", this.getUserPrincipalId());
    }
    /**
     * Sets the userPrincipalId property value. The userPrincipalId property
     * @param value Value to set for the userPrincipalId property.
     */
    public void setUserPrincipalId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalId", value);
    }
}
