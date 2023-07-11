package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServiceProvisioningLinkedResourceErrorDetail extends ServiceProvisioningResourceErrorDetail implements Parsable {
    /**
     * The propertyName property
     */
    private String propertyName;
    /**
     * The target property
     */
    private String target;
    /**
     * Instantiates a new serviceProvisioningLinkedResourceErrorDetail and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceProvisioningLinkedResourceErrorDetail() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a serviceProvisioningLinkedResourceErrorDetail
     */
    @javax.annotation.Nonnull
    public static ServiceProvisioningLinkedResourceErrorDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceProvisioningLinkedResourceErrorDetail();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("propertyName", (n) -> { this.setPropertyName(n.getStringValue()); });
        deserializerMap.put("target", (n) -> { this.setTarget(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the propertyName property value. The propertyName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPropertyName() {
        return this.propertyName;
    }
    /**
     * Gets the target property value. The target property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTarget() {
        return this.target;
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
        writer.writeStringValue("propertyName", this.getPropertyName());
        writer.writeStringValue("target", this.getTarget());
    }
    /**
     * Sets the propertyName property value. The propertyName property
     * @param value Value to set for the propertyName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPropertyName(@javax.annotation.Nullable final String value) {
        this.propertyName = value;
    }
    /**
     * Sets the target property value. The target property
     * @param value Value to set for the target property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTarget(@javax.annotation.Nullable final String value) {
        this.target = value;
    }
}
