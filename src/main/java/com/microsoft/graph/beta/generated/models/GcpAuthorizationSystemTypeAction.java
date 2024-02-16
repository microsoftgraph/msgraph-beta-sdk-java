package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GcpAuthorizationSystemTypeAction extends AuthorizationSystemTypeAction implements Parsable {
    /**
     * Instantiates a new {@link GcpAuthorizationSystemTypeAction} and sets the default values.
     */
    public GcpAuthorizationSystemTypeAction() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GcpAuthorizationSystemTypeAction}
     */
    @jakarta.annotation.Nonnull
    public static GcpAuthorizationSystemTypeAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GcpAuthorizationSystemTypeAction();
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
     * Gets the service property value. The service property
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
     * Sets the service property value. The service property
     * @param value Value to set for the service property.
     */
    public void setService(@jakarta.annotation.Nullable final AuthorizationSystemTypeService value) {
        this.backingStore.set("service", value);
    }
}
