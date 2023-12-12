package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceProvisioningLinkedResourceErrorDetail extends ServiceProvisioningResourceErrorDetail implements Parsable {
    /**
     * Instantiates a new ServiceProvisioningLinkedResourceErrorDetail and sets the default values.
     */
    public ServiceProvisioningLinkedResourceErrorDetail() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceProvisioningLinkedResourceErrorDetail
     */
    @jakarta.annotation.Nonnull
    public static ServiceProvisioningLinkedResourceErrorDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceProvisioningLinkedResourceErrorDetail();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("propertyName", (n) -> { this.setPropertyName(n.getStringValue()); });
        deserializerMap.put("target", (n) -> { this.setTarget(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the propertyName property value. The propertyName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPropertyName() {
        return this.backingStore.get("propertyName");
    }
    /**
     * Gets the target property value. The target property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTarget() {
        return this.backingStore.get("target");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("propertyName", this.getPropertyName());
        writer.writeStringValue("target", this.getTarget());
    }
    /**
     * Sets the propertyName property value. The propertyName property
     * @param value Value to set for the propertyName property.
     */
    public void setPropertyName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("propertyName", value);
    }
    /**
     * Sets the target property value. The target property
     * @param value Value to set for the target property.
     */
    public void setTarget(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("target", value);
    }
}
