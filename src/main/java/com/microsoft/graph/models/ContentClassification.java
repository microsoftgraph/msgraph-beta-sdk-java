package com.microsoft.graph.models;

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
public class ContentClassification implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new ContentClassification and sets the default values.
     */
    public ContentClassification() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ContentClassification
     */
    @jakarta.annotation.Nonnull
    public static ContentClassification createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ContentClassification();
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
     * Gets the confidence property value. The confidence property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getConfidence() {
        return this.BackingStore.get("confidence");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("confidence", (n) -> { this.setConfidence(n.getIntegerValue()); });
        deserializerMap.put("matches", (n) -> { this.setMatches(n.getCollectionOfObjectValues(MatchLocation::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("sensitiveTypeId", (n) -> { this.setSensitiveTypeId(n.getStringValue()); });
        deserializerMap.put("uniqueCount", (n) -> { this.setUniqueCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the matches property value. The matches property
     * @return a java.util.List<MatchLocation>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MatchLocation> getMatches() {
        return this.BackingStore.get("matches");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Gets the sensitiveTypeId property value. The sensitiveTypeId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSensitiveTypeId() {
        return this.BackingStore.get("sensitiveTypeId");
    }
    /**
     * Gets the uniqueCount property value. The uniqueCount property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getUniqueCount() {
        return this.BackingStore.get("uniqueCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("confidence", this.getConfidence());
        writer.writeCollectionOfObjectValues("matches", this.getMatches());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("sensitiveTypeId", this.getSensitiveTypeId());
        writer.writeIntegerValue("uniqueCount", this.getUniqueCount());
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
     * Sets the confidence property value. The confidence property
     * @param value Value to set for the confidence property.
     */
    public void setConfidence(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("confidence", value);
    }
    /**
     * Sets the matches property value. The matches property
     * @param value Value to set for the matches property.
     */
    public void setMatches(@jakarta.annotation.Nullable final java.util.List<MatchLocation> value) {
        this.BackingStore.set("matches", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the sensitiveTypeId property value. The sensitiveTypeId property
     * @param value Value to set for the sensitiveTypeId property.
     */
    public void setSensitiveTypeId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("sensitiveTypeId", value);
    }
    /**
     * Sets the uniqueCount property value. The uniqueCount property
     * @param value Value to set for the uniqueCount property.
     */
    public void setUniqueCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("uniqueCount", value);
    }
}
