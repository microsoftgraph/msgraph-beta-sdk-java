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
public class AccessReviewRecurrenceSettings implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new AccessReviewRecurrenceSettings and sets the default values.
     */
    public AccessReviewRecurrenceSettings() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessReviewRecurrenceSettings
     */
    @jakarta.annotation.Nonnull
    public static AccessReviewRecurrenceSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewRecurrenceSettings();
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
     * Gets the durationInDays property value. The duration in days for recurrence.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDurationInDays() {
        return this.BackingStore.get("durationInDays");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("durationInDays", (n) -> { this.setDurationInDays(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("recurrenceCount", (n) -> { this.setRecurrenceCount(n.getIntegerValue()); });
        deserializerMap.put("recurrenceEndType", (n) -> { this.setRecurrenceEndType(n.getStringValue()); });
        deserializerMap.put("recurrenceType", (n) -> { this.setRecurrenceType(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the recurrenceCount property value. The count of recurrences, if the value of recurrenceEndType is occurrences, or 0 otherwise.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getRecurrenceCount() {
        return this.BackingStore.get("recurrenceCount");
    }
    /**
     * Gets the recurrenceEndType property value. How the recurrence ends. Possible values: never, endBy, occurrences, or recurrenceCount. If it's never, then there's no explicit end of the recurrence series. If it's endBy, then the recurrence ends at a certain date. If it's occurrences, then the series ends after recurrenceCount instances of the review have completed.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRecurrenceEndType() {
        return this.BackingStore.get("recurrenceEndType");
    }
    /**
     * Gets the recurrenceType property value. The recurrence interval. Possible values: onetime, weekly, monthly, quarterly, halfyearly or annual.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRecurrenceType() {
        return this.BackingStore.get("recurrenceType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("durationInDays", this.getDurationInDays());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("recurrenceCount", this.getRecurrenceCount());
        writer.writeStringValue("recurrenceEndType", this.getRecurrenceEndType());
        writer.writeStringValue("recurrenceType", this.getRecurrenceType());
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
     * Sets the durationInDays property value. The duration in days for recurrence.
     * @param value Value to set for the durationInDays property.
     */
    public void setDurationInDays(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("durationInDays", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the recurrenceCount property value. The count of recurrences, if the value of recurrenceEndType is occurrences, or 0 otherwise.
     * @param value Value to set for the recurrenceCount property.
     */
    public void setRecurrenceCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("recurrenceCount", value);
    }
    /**
     * Sets the recurrenceEndType property value. How the recurrence ends. Possible values: never, endBy, occurrences, or recurrenceCount. If it's never, then there's no explicit end of the recurrence series. If it's endBy, then the recurrence ends at a certain date. If it's occurrences, then the series ends after recurrenceCount instances of the review have completed.
     * @param value Value to set for the recurrenceEndType property.
     */
    public void setRecurrenceEndType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("recurrenceEndType", value);
    }
    /**
     * Sets the recurrenceType property value. The recurrence interval. Possible values: onetime, weekly, monthly, quarterly, halfyearly or annual.
     * @param value Value to set for the recurrenceType property.
     */
    public void setRecurrenceType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("recurrenceType", value);
    }
}
