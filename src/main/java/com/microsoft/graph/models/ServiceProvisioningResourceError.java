package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServiceProvisioningResourceError extends ServiceProvisioningError implements Parsable {
    /**
     * The errors property
     */
    private java.util.List<ServiceProvisioningResourceErrorDetail> errors;
    /**
     * Instantiates a new serviceProvisioningResourceError and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceProvisioningResourceError() {
        super();
        this.setOdataType("#microsoft.graph.serviceProvisioningResourceError");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a serviceProvisioningResourceError
     */
    @javax.annotation.Nonnull
    public static ServiceProvisioningResourceError createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceProvisioningResourceError();
    }
    /**
     * Gets the errors property value. The errors property
     * @return a serviceProvisioningResourceErrorDetail
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceProvisioningResourceErrorDetail> getErrors() {
        return this.errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("errors", (n) -> { this.setErrors(n.getCollectionOfObjectValues(ServiceProvisioningResourceErrorDetail::createFromDiscriminatorValue)); });
        return deserializerMap;
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
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
    }
    /**
     * Sets the errors property value. The errors property
     * @param value Value to set for the errors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrors(@javax.annotation.Nullable final java.util.List<ServiceProvisioningResourceErrorDetail> value) {
        this.errors = value;
    }
}
