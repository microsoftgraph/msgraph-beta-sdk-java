package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AzureADAuthentication extends Entity implements Parsable {
    /**
     * A list of monthly serviceLevelAgreementAttainment objects.
     */
    private java.util.List<ServiceLevelAgreementAttainment> attainments;
    /**
     * Instantiates a new azureADAuthentication and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public AzureADAuthentication() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a azureADAuthentication
     */
    @jakarta.annotation.Nonnull
    public static AzureADAuthentication createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AzureADAuthentication();
    }
    /**
     * Gets the attainments property value. A list of monthly serviceLevelAgreementAttainment objects.
     * @return a serviceLevelAgreementAttainment
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceLevelAgreementAttainment> getAttainments() {
        return this.attainments;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
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
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("attainments", this.getAttainments());
    }
    /**
     * Sets the attainments property value. A list of monthly serviceLevelAgreementAttainment objects.
     * @param value Value to set for the attainments property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAttainments(@jakarta.annotation.Nullable final java.util.List<ServiceLevelAgreementAttainment> value) {
        this.attainments = value;
    }
}
