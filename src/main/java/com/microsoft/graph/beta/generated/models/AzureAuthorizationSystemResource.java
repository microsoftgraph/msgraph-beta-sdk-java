package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AzureAuthorizationSystemResource extends AuthorizationSystemResource implements Parsable {
    /**
     * Instantiates a new {@link AzureAuthorizationSystemResource} and sets the default values.
     */
    public AzureAuthorizationSystemResource() {
        super();
        this.setOdataType("#microsoft.graph.azureAuthorizationSystemResource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AzureAuthorizationSystemResource}
     */
    @jakarta.annotation.Nonnull
    public static AzureAuthorizationSystemResource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AzureAuthorizationSystemResource();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("service", (n) -> { this.setService(n.getObjectValue(AuthorizationSystemTypeService::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the service property value. The service associated with the resource in an Azure authorization system. This object is auto-expanded.
     * @return a {@link AuthorizationSystemTypeService}
     */
    @jakarta.annotation.Nullable
    public AuthorizationSystemTypeService getService() {
        return this.backingStore.get("service");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("service", this.getService());
    }
    /**
     * Sets the service property value. The service associated with the resource in an Azure authorization system. This object is auto-expanded.
     * @param value Value to set for the service property.
     */
    public void setService(@jakarta.annotation.Nullable final AuthorizationSystemTypeService value) {
        this.backingStore.set("service", value);
    }
}
