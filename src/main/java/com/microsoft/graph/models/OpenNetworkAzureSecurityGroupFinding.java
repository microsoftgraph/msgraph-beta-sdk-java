package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OpenNetworkAzureSecurityGroupFinding extends Finding implements Parsable {
    /**
     * Instantiates a new OpenNetworkAzureSecurityGroupFinding and sets the default values.
     */
    public OpenNetworkAzureSecurityGroupFinding() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OpenNetworkAzureSecurityGroupFinding
     */
    @jakarta.annotation.Nonnull
    public static OpenNetworkAzureSecurityGroupFinding createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OpenNetworkAzureSecurityGroupFinding();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("inboundPorts", (n) -> { this.setInboundPorts(n.getObjectValue(InboundPorts::createFromDiscriminatorValue)); });
        deserializerMap.put("securityGroup", (n) -> { this.setSecurityGroup(n.getObjectValue(AuthorizationSystemResource::createFromDiscriminatorValue)); });
        deserializerMap.put("virtualMachines", (n) -> { this.setVirtualMachines(n.getCollectionOfObjectValues(AuthorizationSystemResource::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the inboundPorts property value. The inboundPorts property
     * @return a InboundPorts
     */
    @jakarta.annotation.Nullable
    public InboundPorts getInboundPorts() {
        return this.backingStore.get("inboundPorts");
    }
    /**
     * Gets the securityGroup property value. The securityGroup property
     * @return a AuthorizationSystemResource
     */
    @jakarta.annotation.Nullable
    public AuthorizationSystemResource getSecurityGroup() {
        return this.backingStore.get("securityGroup");
    }
    /**
     * Gets the virtualMachines property value. The virtualMachines property
     * @return a java.util.List<AuthorizationSystemResource>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthorizationSystemResource> getVirtualMachines() {
        return this.backingStore.get("virtualMachines");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("inboundPorts", this.getInboundPorts());
        writer.writeObjectValue("securityGroup", this.getSecurityGroup());
        writer.writeCollectionOfObjectValues("virtualMachines", this.getVirtualMachines());
    }
    /**
     * Sets the inboundPorts property value. The inboundPorts property
     * @param value Value to set for the inboundPorts property.
     */
    public void setInboundPorts(@jakarta.annotation.Nullable final InboundPorts value) {
        this.backingStore.set("inboundPorts", value);
    }
    /**
     * Sets the securityGroup property value. The securityGroup property
     * @param value Value to set for the securityGroup property.
     */
    public void setSecurityGroup(@jakarta.annotation.Nullable final AuthorizationSystemResource value) {
        this.backingStore.set("securityGroup", value);
    }
    /**
     * Sets the virtualMachines property value. The virtualMachines property
     * @param value Value to set for the virtualMachines property.
     */
    public void setVirtualMachines(@jakarta.annotation.Nullable final java.util.List<AuthorizationSystemResource> value) {
        this.backingStore.set("virtualMachines", value);
    }
}
