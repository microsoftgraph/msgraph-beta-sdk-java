package com.microsoft.graph.beta.models.industrydata;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SecurityGroupProvisioningFlow extends ProvisioningFlow implements Parsable {
    /**
     * Instantiates a new {@link SecurityGroupProvisioningFlow} and sets the default values.
     */
    public SecurityGroupProvisioningFlow() {
        super();
        this.setOdataType("#microsoft.graph.industryData.securityGroupProvisioningFlow");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SecurityGroupProvisioningFlow}
     */
    @jakarta.annotation.Nonnull
    public static SecurityGroupProvisioningFlow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SecurityGroupProvisioningFlow();
    }
    /**
     * Gets the creationOptions property value. The creationOptions property
     * @return a {@link SecurityGroupCreationOptions}
     */
    @jakarta.annotation.Nullable
    public SecurityGroupCreationOptions getCreationOptions() {
        return this.backingStore.get("creationOptions");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("creationOptions", (n) -> { this.setCreationOptions(n.getObjectValue(SecurityGroupCreationOptions::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("creationOptions", this.getCreationOptions());
    }
    /**
     * Sets the creationOptions property value. The creationOptions property
     * @param value Value to set for the creationOptions property.
     */
    public void setCreationOptions(@jakarta.annotation.Nullable final SecurityGroupCreationOptions value) {
        this.backingStore.set("creationOptions", value);
    }
}
