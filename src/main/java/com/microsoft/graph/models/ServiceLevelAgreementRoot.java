package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceLevelAgreementRoot extends Entity implements Parsable {
    /**
     * Instantiates a new ServiceLevelAgreementRoot and sets the default values.
     */
    public ServiceLevelAgreementRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceLevelAgreementRoot
     */
    @jakarta.annotation.Nonnull
    public static ServiceLevelAgreementRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceLevelAgreementRoot();
    }
    /**
     * Gets the azureADAuthentication property value. Collects the Microsoft Entra SLA attainment for each month for a Microsoft Entra tenant.
     * @return a AzureADAuthentication
     */
    @jakarta.annotation.Nullable
    public AzureADAuthentication getAzureADAuthentication() {
        return this.BackingStore.get("azureADAuthentication");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("azureADAuthentication", (n) -> { this.setAzureADAuthentication(n.getObjectValue(AzureADAuthentication::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("azureADAuthentication", this.getAzureADAuthentication());
    }
    /**
     * Sets the azureADAuthentication property value. Collects the Microsoft Entra SLA attainment for each month for a Microsoft Entra tenant.
     * @param value Value to set for the azureADAuthentication property.
     */
    public void setAzureADAuthentication(@jakarta.annotation.Nullable final AzureADAuthentication value) {
        this.BackingStore.set("azureADAuthentication", value);
    }
}
