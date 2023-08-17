package com.microsoft.graph.deviceappmanagement.mobileapps.item.updaterelationships;

import com.microsoft.graph.models.MobileAppRelationship;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UpdateRelationshipsPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The relationships property
     */
    private java.util.List<MobileAppRelationship> relationships;
    /**
     * Instantiates a new updateRelationshipsPostRequestBody and sets the default values.
     */
    public UpdateRelationshipsPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a updateRelationshipsPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static UpdateRelationshipsPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateRelationshipsPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("relationships", (n) -> { this.setRelationships(n.getCollectionOfObjectValues(MobileAppRelationship::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the relationships property value. The relationships property
     * @return a mobileAppRelationship
     */
    @jakarta.annotation.Nullable
    public java.util.List<MobileAppRelationship> getRelationships() {
        return this.relationships;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("relationships", this.getRelationships());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the relationships property value. The relationships property
     * @param value Value to set for the relationships property.
     */
    public void setRelationships(@jakarta.annotation.Nullable final java.util.List<MobileAppRelationship> value) {
        this.relationships = value;
    }
}
