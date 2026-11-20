package com.microsoft.graph.beta.models.security.contentmanagement;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Bring-your-own user-assigned managed identity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagedIdentityDeploymentIdentity extends DeploymentIdentity implements Parsable {
    /**
     * Instantiates a new {@link ManagedIdentityDeploymentIdentity} and sets the default values.
     */
    public ManagedIdentityDeploymentIdentity() {
        super();
        this.setOdataType("#microsoft.graph.security.contentManagement.managedIdentityDeploymentIdentity");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ManagedIdentityDeploymentIdentity}
     */
    @jakarta.annotation.Nonnull
    public static ManagedIdentityDeploymentIdentity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedIdentityDeploymentIdentity();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("managedIdentityId", (n) -> { this.setManagedIdentityId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the managedIdentityId property value. Resource id of the user-assigned managed identity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManagedIdentityId() {
        return this.backingStore.get("managedIdentityId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("managedIdentityId", this.getManagedIdentityId());
    }
    /**
     * Sets the managedIdentityId property value. Resource id of the user-assigned managed identity.
     * @param value Value to set for the managedIdentityId property.
     */
    public void setManagedIdentityId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managedIdentityId", value);
    }
}
