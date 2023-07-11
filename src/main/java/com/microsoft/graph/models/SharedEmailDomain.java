package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SharedEmailDomain extends Entity implements Parsable {
    /**
     * The provisioningStatus property
     */
    private String provisioningStatus;
    /**
     * Instantiates a new sharedEmailDomain and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SharedEmailDomain() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sharedEmailDomain
     */
    @javax.annotation.Nonnull
    public static SharedEmailDomain createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharedEmailDomain();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("provisioningStatus", (n) -> { this.setProvisioningStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the provisioningStatus property value. The provisioningStatus property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProvisioningStatus() {
        return this.provisioningStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("provisioningStatus", this.getProvisioningStatus());
    }
    /**
     * Sets the provisioningStatus property value. The provisioningStatus property
     * @param value Value to set for the provisioningStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProvisioningStatus(@javax.annotation.Nullable final String value) {
        this.provisioningStatus = value;
    }
}
