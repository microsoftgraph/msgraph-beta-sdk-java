package com.microsoft.graph.beta.models.security.contentmanagement;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Bring-your-own service principal.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServicePrincipalDeploymentIdentity extends DeploymentIdentity implements Parsable {
    /**
     * Instantiates a new {@link ServicePrincipalDeploymentIdentity} and sets the default values.
     */
    public ServicePrincipalDeploymentIdentity() {
        super();
        this.setOdataType("#microsoft.graph.security.contentManagement.servicePrincipalDeploymentIdentity");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ServicePrincipalDeploymentIdentity}
     */
    @jakarta.annotation.Nonnull
    public static ServicePrincipalDeploymentIdentity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServicePrincipalDeploymentIdentity();
    }
    /**
     * Gets the applicationId property value. Application (client) id of the customer-supplied service principal.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApplicationId() {
        return this.backingStore.get("applicationId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicationId", (n) -> { this.setApplicationId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("applicationId", this.getApplicationId());
    }
    /**
     * Sets the applicationId property value. Application (client) id of the customer-supplied service principal.
     * @param value Value to set for the applicationId property.
     */
    public void setApplicationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("applicationId", value);
    }
}
