package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AlertFrequencyPoint implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AlertFrequencyPoint} and sets the default values.
     */
    public AlertFrequencyPoint() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AlertFrequencyPoint}
     */
    @jakarta.annotation.Nonnull
    public static AlertFrequencyPoint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AlertFrequencyPoint();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("highSeverityCount", (n) -> { this.setHighSeverityCount(n.getLongValue()); });
        deserializerMap.put("informationalSeverityCount", (n) -> { this.setInformationalSeverityCount(n.getLongValue()); });
        deserializerMap.put("lowSeverityCount", (n) -> { this.setLowSeverityCount(n.getLongValue()); });
        deserializerMap.put("mediumSeverityCount", (n) -> { this.setMediumSeverityCount(n.getLongValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("timeStampDateTime", (n) -> { this.setTimeStampDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the highSeverityCount property value. Total number of high alert severity. Required.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getHighSeverityCount() {
        return this.backingStore.get("highSeverityCount");
    }
    /**
     * Gets the informationalSeverityCount property value. Total number of informational alert severity. Required.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getInformationalSeverityCount() {
        return this.backingStore.get("informationalSeverityCount");
    }
    /**
     * Gets the lowSeverityCount property value. Total number of low alert severity. Required.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getLowSeverityCount() {
        return this.backingStore.get("lowSeverityCount");
    }
    /**
     * Gets the mediumSeverityCount property value. Total number of medium alert severity. Required.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getMediumSeverityCount() {
        return this.backingStore.get("mediumSeverityCount");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the timeStampDateTime property value. The time bucket for counting the alert severities. Required.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getTimeStampDateTime() {
        return this.backingStore.get("timeStampDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("highSeverityCount", this.getHighSeverityCount());
        writer.writeLongValue("informationalSeverityCount", this.getInformationalSeverityCount());
        writer.writeLongValue("lowSeverityCount", this.getLowSeverityCount());
        writer.writeLongValue("mediumSeverityCount", this.getMediumSeverityCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeOffsetDateTimeValue("timeStampDateTime", this.getTimeStampDateTime());
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
     * Sets the highSeverityCount property value. Total number of high alert severity. Required.
     * @param value Value to set for the highSeverityCount property.
     */
    public void setHighSeverityCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("highSeverityCount", value);
    }
    /**
     * Sets the informationalSeverityCount property value. Total number of informational alert severity. Required.
     * @param value Value to set for the informationalSeverityCount property.
     */
    public void setInformationalSeverityCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("informationalSeverityCount", value);
    }
    /**
     * Sets the lowSeverityCount property value. Total number of low alert severity. Required.
     * @param value Value to set for the lowSeverityCount property.
     */
    public void setLowSeverityCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("lowSeverityCount", value);
    }
    /**
     * Sets the mediumSeverityCount property value. Total number of medium alert severity. Required.
     * @param value Value to set for the mediumSeverityCount property.
     */
    public void setMediumSeverityCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("mediumSeverityCount", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the timeStampDateTime property value. The time bucket for counting the alert severities. Required.
     * @param value Value to set for the timeStampDateTime property.
     */
    public void setTimeStampDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("timeStampDateTime", value);
    }
}
