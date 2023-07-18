package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServiceLevelAgreementRoot extends Entity implements Parsable {
    /**
     * Collects the Azure AD SLA attainment for each month for an Azure AD tenant.
     */
    private AzureADAuthentication azureADAuthentication;
    /**
     * Instantiates a new serviceLevelAgreementRoot and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceLevelAgreementRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a serviceLevelAgreementRoot
     */
    @javax.annotation.Nonnull
    public static ServiceLevelAgreementRoot createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceLevelAgreementRoot();
    }
    /**
     * Gets the azureADAuthentication property value. Collects the Azure AD SLA attainment for each month for an Azure AD tenant.
     * @return a azureADAuthentication
     */
    @javax.annotation.Nullable
    public AzureADAuthentication getAzureADAuthentication() {
        return this.azureADAuthentication;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("azureADAuthentication", (n) -> { this.setAzureADAuthentication(n.getObjectValue(AzureADAuthentication::createFromDiscriminatorValue)); });
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
        writer.writeObjectValue("azureADAuthentication", this.getAzureADAuthentication());
    }
    /**
     * Sets the azureADAuthentication property value. Collects the Azure AD SLA attainment for each month for an Azure AD tenant.
     * @param value Value to set for the azureADAuthentication property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAzureADAuthentication(@javax.annotation.Nullable final AzureADAuthentication value) {
        this.azureADAuthentication = value;
    }
}
