package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServiceProvisioningXmlError extends ServiceProvisioningError implements Parsable {
    /**
     * Error Information published by the Federated Service as an xml string .
     */
    private String errorDetail;
    /**
     * Instantiates a new ServiceProvisioningXmlError and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceProvisioningXmlError() {
        super();
        this.setOdataType("#microsoft.graph.serviceProvisioningXmlError");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceProvisioningXmlError
     */
    @javax.annotation.Nonnull
    public static ServiceProvisioningXmlError createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceProvisioningXmlError();
    }
    /**
     * Gets the errorDetail property value. Error Information published by the Federated Service as an xml string .
     * @return a string
     */
    @javax.annotation.Nullable
    public String getErrorDetail() {
        return this.errorDetail;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("errorDetail", (n) -> { this.setErrorDetail(n.getStringValue()); });
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
        writer.writeStringValue("errorDetail", this.getErrorDetail());
    }
    /**
     * Sets the errorDetail property value. Error Information published by the Federated Service as an xml string .
     * @param value Value to set for the errorDetail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrorDetail(@javax.annotation.Nullable final String value) {
        this.errorDetail = value;
    }
}
