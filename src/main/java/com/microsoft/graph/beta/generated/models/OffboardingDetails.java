package com.microsoft.graph.beta.models;

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
public class OffboardingDetails implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link OffboardingDetails} and sets the default values.
     */
    public OffboardingDetails() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OffboardingDetails}
     */
    @jakarta.annotation.Nonnull
    public static OffboardingDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OffboardingDetails();
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
     * Gets the cancelledCount property value. The cancelledCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCancelledCount() {
        return this.backingStore.get("cancelledCount");
    }
    /**
     * Gets the failedCount property value. The failedCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFailedCount() {
        return this.backingStore.get("failedCount");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("cancelledCount", (n) -> { this.setCancelledCount(n.getIntegerValue()); });
        deserializerMap.put("failedCount", (n) -> { this.setFailedCount(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("offboardedCount", (n) -> { this.setOffboardedCount(n.getIntegerValue()); });
        deserializerMap.put("offboardEndDateTime", (n) -> { this.setOffboardEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("offboardingStatus", (n) -> { this.setOffboardingStatus(n.getStringValue()); });
        deserializerMap.put("offboardStartDateTime", (n) -> { this.setOffboardStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("totalRequestedCount", (n) -> { this.setTotalRequestedCount(n.getIntegerValue()); });
        return deserializerMap;
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
     * Gets the offboardedCount property value. The offboardedCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getOffboardedCount() {
        return this.backingStore.get("offboardedCount");
    }
    /**
     * Gets the offboardEndDateTime property value. The offboardEndDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getOffboardEndDateTime() {
        return this.backingStore.get("offboardEndDateTime");
    }
    /**
     * Gets the offboardingStatus property value. The offboardingStatus property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOffboardingStatus() {
        return this.backingStore.get("offboardingStatus");
    }
    /**
     * Gets the offboardStartDateTime property value. The offboardStartDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getOffboardStartDateTime() {
        return this.backingStore.get("offboardStartDateTime");
    }
    /**
     * Gets the totalRequestedCount property value. The totalRequestedCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalRequestedCount() {
        return this.backingStore.get("totalRequestedCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("cancelledCount", this.getCancelledCount());
        writer.writeIntegerValue("failedCount", this.getFailedCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("offboardedCount", this.getOffboardedCount());
        writer.writeOffsetDateTimeValue("offboardEndDateTime", this.getOffboardEndDateTime());
        writer.writeStringValue("offboardingStatus", this.getOffboardingStatus());
        writer.writeOffsetDateTimeValue("offboardStartDateTime", this.getOffboardStartDateTime());
        writer.writeIntegerValue("totalRequestedCount", this.getTotalRequestedCount());
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
     * Sets the cancelledCount property value. The cancelledCount property
     * @param value Value to set for the cancelledCount property.
     */
    public void setCancelledCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("cancelledCount", value);
    }
    /**
     * Sets the failedCount property value. The failedCount property
     * @param value Value to set for the failedCount property.
     */
    public void setFailedCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("failedCount", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the offboardedCount property value. The offboardedCount property
     * @param value Value to set for the offboardedCount property.
     */
    public void setOffboardedCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("offboardedCount", value);
    }
    /**
     * Sets the offboardEndDateTime property value. The offboardEndDateTime property
     * @param value Value to set for the offboardEndDateTime property.
     */
    public void setOffboardEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("offboardEndDateTime", value);
    }
    /**
     * Sets the offboardingStatus property value. The offboardingStatus property
     * @param value Value to set for the offboardingStatus property.
     */
    public void setOffboardingStatus(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("offboardingStatus", value);
    }
    /**
     * Sets the offboardStartDateTime property value. The offboardStartDateTime property
     * @param value Value to set for the offboardStartDateTime property.
     */
    public void setOffboardStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("offboardStartDateTime", value);
    }
    /**
     * Sets the totalRequestedCount property value. The totalRequestedCount property
     * @param value Value to set for the totalRequestedCount property.
     */
    public void setTotalRequestedCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalRequestedCount", value);
    }
}
