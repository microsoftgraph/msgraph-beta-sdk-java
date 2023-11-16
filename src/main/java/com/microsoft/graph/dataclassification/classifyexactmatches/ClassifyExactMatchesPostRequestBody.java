package com.microsoft.graph.dataclassification.classifyexactmatches;

import com.microsoft.graph.models.ContentClassification;
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
    private BackingStore BackingStore;
    /**
     * Instantiates a new ClassifyExactMatchesPostRequestBody and sets the default values.
     */
    public ClassifyExactMatchesPostRequestBody() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ClassifyExactMatchesPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ClassifyExactMatchesPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ClassifyExactMatchesPostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the contentClassifications property value. The contentClassifications property
     * @return a java.util.List<ContentClassification>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ContentClassification> getContentClassifications() {
        return this.BackingStore.get("contentClassifications");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
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
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSensitiveTypeIds() {
        return this.BackingStore.get("sensitiveTypeIds");
    }
    /**
     * Gets the text property value. The text property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getText() {
        return this.BackingStore.get("text");
    }
    /**
     * Gets the timeoutInMs property value. The timeoutInMs property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTimeoutInMs() {
        return this.BackingStore.get("timeoutInMs");
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
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the contentClassifications property value. The contentClassifications property
     * @param value Value to set for the contentClassifications property.
     */
    public void setContentClassifications(@jakarta.annotation.Nullable final java.util.List<ContentClassification> value) {
        this.BackingStore.set("contentClassifications", value);
    }
    /**
     * Sets the sensitiveTypeIds property value. The sensitiveTypeIds property
     * @param value Value to set for the sensitiveTypeIds property.
     */
    public void setSensitiveTypeIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("sensitiveTypeIds", value);
    }
    /**
     * Sets the text property value. The text property
     * @param value Value to set for the text property.
     */
    public void setText(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("text", value);
    }
    /**
     * Sets the timeoutInMs property value. The timeoutInMs property
     * @param value Value to set for the timeoutInMs property.
     */
    public void setTimeoutInMs(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("timeoutInMs", value);
    }
}
