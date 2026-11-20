package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessReviewCatalogScope extends AccessReviewResourceScope implements Parsable {
    /**
     * Instantiates a new {@link AccessReviewCatalogScope} and sets the default values.
     */
    public AccessReviewCatalogScope() {
        super();
        this.setOdataType("#microsoft.graph.accessReviewCatalogScope");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AccessReviewCatalogScope}
     */
    @jakarta.annotation.Nonnull
    public static AccessReviewCatalogScope createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewCatalogScope();
    }
    /**
     * Gets the additionalCatalogResourceTypes property value. The additionalCatalogResourceTypes property
     * @return a {@link EnumSet<AccessReviewCatalogResourceType>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<AccessReviewCatalogResourceType> getAdditionalCatalogResourceTypes() {
        return this.backingStore.get("additionalCatalogResourceTypes");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("additionalCatalogResourceTypes", (n) -> { this.setAdditionalCatalogResourceTypes(n.getEnumSetValue(AccessReviewCatalogResourceType::forValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumSetValue("additionalCatalogResourceTypes", this.getAdditionalCatalogResourceTypes());
    }
    /**
     * Sets the additionalCatalogResourceTypes property value. The additionalCatalogResourceTypes property
     * @param value Value to set for the additionalCatalogResourceTypes property.
     */
    public void setAdditionalCatalogResourceTypes(@jakarta.annotation.Nullable final EnumSet<AccessReviewCatalogResourceType> value) {
        this.backingStore.set("additionalCatalogResourceTypes", value);
    }
}
