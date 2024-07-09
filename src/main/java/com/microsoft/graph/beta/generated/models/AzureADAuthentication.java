package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AzureADAuthentication extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AzureADAuthentication} and sets the default values.
     */
    public AzureADAuthentication() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AzureADAuthentication}
     */
    @jakarta.annotation.Nonnull
    public static AzureADAuthentication createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AzureADAuthentication();
    }
    /**
     * Gets the attainments property value. SLA data for a Microsoft Entra tenant for a calendar month.
     * @return a {@link java.util.List<ServiceLevelAgreementAttainment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceLevelAgreementAttainment> getAttainments() {
        return this.backingStore.get("attainments");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("attainments", (n) -> { this.setAttainments(n.getCollectionOfObjectValues(ServiceLevelAgreementAttainment::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("attainments", this.getAttainments());
    }
    /**
     * Sets the attainments property value. SLA data for a Microsoft Entra tenant for a calendar month.
     * @param value Value to set for the attainments property.
     */
    public void setAttainments(@jakarta.annotation.Nullable final java.util.List<ServiceLevelAgreementAttainment> value) {
        this.backingStore.set("attainments", value);
    }
}
