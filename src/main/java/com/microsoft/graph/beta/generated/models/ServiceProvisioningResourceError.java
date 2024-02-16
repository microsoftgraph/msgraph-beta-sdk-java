package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceProvisioningResourceError extends ServiceProvisioningError implements Parsable {
    /**
     * Instantiates a new {@link ServiceProvisioningResourceError} and sets the default values.
     */
    public ServiceProvisioningResourceError() {
        super();
        this.setOdataType("#microsoft.graph.serviceProvisioningResourceError");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ServiceProvisioningResourceError}
     */
    @jakarta.annotation.Nonnull
    public static ServiceProvisioningResourceError createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceProvisioningResourceError();
    }
    /**
     * Gets the errors property value. The errors property
     * @return a {@link java.util.List<ServiceProvisioningResourceErrorDetail>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceProvisioningResourceErrorDetail> getErrors() {
        return this.backingStore.get("errors");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(ServiceProvisioningResourceErrorDetail::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
    }
    /**
     * Sets the errors property value. The errors property
     * @param value Value to set for the errors property.
     */
    public void setErrors(@jakarta.annotation.Nullable final java.util.List<ServiceProvisioningResourceErrorDetail> value) {
        this.backingStore.set("errors", value);
    }
}
