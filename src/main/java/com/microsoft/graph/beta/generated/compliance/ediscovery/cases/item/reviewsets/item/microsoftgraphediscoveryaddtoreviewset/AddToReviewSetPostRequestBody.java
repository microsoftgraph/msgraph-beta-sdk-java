package com.microsoft.graph.beta.compliance.ediscovery.cases.item.reviewsets.item.microsoftgraphediscoveryaddtoreviewset;

import com.microsoft.graph.beta.models.ediscovery.AdditionalDataOptions;
import com.microsoft.graph.beta.models.ediscovery.SourceCollection;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AddToReviewSetPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new AddToReviewSetPostRequestBody and sets the default values.
     */
    public AddToReviewSetPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AddToReviewSetPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static AddToReviewSetPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AddToReviewSetPostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the additionalDataOptions property value. The additionalDataOptions property
     * @return a EnumSet<AdditionalDataOptions>
     */
    @jakarta.annotation.Nullable
    public EnumSet<AdditionalDataOptions> getAdditionalDataOptions() {
        return this.backingStore.get("additionalDataOptions");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("additionalDataOptions", (n) -> { this.setAdditionalDataOptions(n.getEnumSetValue(AdditionalDataOptions::forValue)); });
        deserializerMap.put("sourceCollection", (n) -> { this.setSourceCollection(n.getObjectValue(SourceCollection::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the sourceCollection property value. The sourceCollection property
     * @return a SourceCollection
     */
    @jakarta.annotation.Nullable
    public SourceCollection getSourceCollection() {
        return this.backingStore.get("sourceCollection");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumSetValue("additionalDataOptions", this.getAdditionalDataOptions());
        writer.writeObjectValue("sourceCollection", this.getSourceCollection());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the additionalDataOptions property value. The additionalDataOptions property
     * @param value Value to set for the additionalDataOptions property.
     */
    public void setAdditionalDataOptions(@jakarta.annotation.Nullable final EnumSet<AdditionalDataOptions> value) {
        this.backingStore.set("additionalDataOptions", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the sourceCollection property value. The sourceCollection property
     * @param value Value to set for the sourceCollection property.
     */
    public void setSourceCollection(@jakarta.annotation.Nullable final SourceCollection value) {
        this.backingStore.set("sourceCollection", value);
    }
}
