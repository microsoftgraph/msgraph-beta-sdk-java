package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SharedEmailDomain extends Entity implements Parsable {
    /**
     * Instantiates a new {@link SharedEmailDomain} and sets the default values.
     */
    public SharedEmailDomain() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SharedEmailDomain}
     */
    @jakarta.annotation.Nonnull
    public static SharedEmailDomain createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharedEmailDomain();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("provisioningStatus", (n) -> { this.setProvisioningStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the provisioningStatus property value. The provisioningStatus property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProvisioningStatus() {
        return this.backingStore.get("provisioningStatus");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("provisioningStatus", this.getProvisioningStatus());
    }
    /**
     * Sets the provisioningStatus property value. The provisioningStatus property
     * @param value Value to set for the provisioningStatus property.
     */
    public void setProvisioningStatus(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("provisioningStatus", value);
    }
}
