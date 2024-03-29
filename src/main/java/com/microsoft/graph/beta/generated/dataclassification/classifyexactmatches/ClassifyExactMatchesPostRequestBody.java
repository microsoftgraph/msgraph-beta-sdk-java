package com.microsoft.graph.beta.dataclassification.classifyexactmatches;

import com.microsoft.graph.beta.models.ContentClassification;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ClassifyExactMatchesPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ClassifyExactMatchesPostRequestBody} and sets the default values.
     */
    public ClassifyExactMatchesPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ClassifyExactMatchesPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static ClassifyExactMatchesPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ClassifyExactMatchesPostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
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
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the contentClassifications property value. The contentClassifications property
     * @return a {@link java.util.List<ContentClassification>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ContentClassification> getContentClassifications() {
        return this.backingStore.get("contentClassifications");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("contentClassifications", (n) -> { this.setContentClassifications(n.getCollectionOfObjectValues(ContentClassification::createFromDiscriminatorValue)); });
        deserializerMap.put("sensitiveTypeIds", (n) -> { this.setSensitiveTypeIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("text", (n) -> { this.setText(n.getStringValue()); });
        deserializerMap.put("timeoutInMs", (n) -> { this.setTimeoutInMs(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the sensitiveTypeIds property value. The sensitiveTypeIds property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSensitiveTypeIds() {
        return this.backingStore.get("sensitiveTypeIds");
    }
    /**
     * Gets the text property value. The text property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getText() {
        return this.backingStore.get("text");
    }
    /**
     * Gets the timeoutInMs property value. The timeoutInMs property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTimeoutInMs() {
        return this.backingStore.get("timeoutInMs");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("contentClassifications", this.getContentClassifications());
        writer.writeCollectionOfPrimitiveValues("sensitiveTypeIds", this.getSensitiveTypeIds());
        writer.writeStringValue("text", this.getText());
        writer.writeStringValue("timeoutInMs", this.getTimeoutInMs());
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
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the contentClassifications property value. The contentClassifications property
     * @param value Value to set for the contentClassifications property.
     */
    public void setContentClassifications(@jakarta.annotation.Nullable final java.util.List<ContentClassification> value) {
        this.backingStore.set("contentClassifications", value);
    }
    /**
     * Sets the sensitiveTypeIds property value. The sensitiveTypeIds property
     * @param value Value to set for the sensitiveTypeIds property.
     */
    public void setSensitiveTypeIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("sensitiveTypeIds", value);
    }
    /**
     * Sets the text property value. The text property
     * @param value Value to set for the text property.
     */
    public void setText(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("text", value);
    }
    /**
     * Sets the timeoutInMs property value. The timeoutInMs property
     * @param value Value to set for the timeoutInMs property.
     */
    public void setTimeoutInMs(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("timeoutInMs", value);
    }
}
