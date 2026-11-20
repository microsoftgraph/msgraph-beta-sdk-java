package com.microsoft.graph.beta.models;

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
/**
 * One user&apos;s raw usage detail, distinct from the processed report at userUsageRecords.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CostManagementUserUsageDetail implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CostManagementUserUsageDetail} and sets the default values.
     */
    public CostManagementUserUsageDetail() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CostManagementUserUsageDetail}
     */
    @jakarta.annotation.Nonnull
    public static CostManagementUserUsageDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CostManagementUserUsageDetail();
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
     * Gets the consumedQuantity property value. Raw, billable-flagged consumption attributed to this user over the requested window, boundedto the latest processed watermark rather than reprocessed. Read-only.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getConsumedQuantity() {
        return this.backingStore.get("consumedQuantity");
    }
    /**
     * Gets the dataStatus property value. Freshness of the source activity data this detail was computed from, when the native sourcereports an as-of timestamp for the window. Null rather than fabricated when the source hasnone to report. Read-only.
     * @return a {@link CostManagementUsageDataStatus}
     */
    @jakarta.annotation.Nullable
    public CostManagementUsageDataStatus getDataStatus() {
        return this.backingStore.get("dataStatus");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("consumedQuantity", (n) -> { this.setConsumedQuantity(n.getDoubleValue()); });
        deserializerMap.put("dataStatus", (n) -> { this.setDataStatus(n.getObjectValue(CostManagementUsageDataStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("services", (n) -> { this.setServices(n.getCollectionOfObjectValues(CostManagementUserUsageServiceDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("sessionCount", (n) -> { this.setSessionCount(n.getLongValue()); });
        deserializerMap.put("sessions", (n) -> { this.setSessions(n.getCollectionOfObjectValues(CostManagementUserUsageSessionDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("unit", (n) -> { this.setUnit(n.getEnumValue(CostManagementUnit::forValue)); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
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
     * Gets the services property value. This user&apos;s raw consumption, split by governed service. The same native grouped result isalso addressable directly at the services navigation collection.
     * @return a {@link java.util.List<CostManagementUserUsageServiceDetail>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CostManagementUserUsageServiceDetail> getServices() {
        return this.backingStore.get("services");
    }
    /**
     * Gets the sessionCount property value. Count of billable-flagged activity sessions, bounded to the latest processed watermark, thatcontributed to consumedQuantity. Excludes non-billable activity; the timestamp window and rawsource distinguish this count from the processed completed-day report. Read-only.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getSessionCount() {
        return this.backingStore.get("sessionCount");
    }
    /**
     * Gets the sessions property value. This user&apos;s raw usage grouped by session identifiers represented by the native source.Activity without a session identifier may be omitted even when included in the parent total;child quantities need not sum to the parent&apos;s consumedQuantity. Also available as a direct collection.
     * @return a {@link java.util.List<CostManagementUserUsageSessionDetail>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CostManagementUserUsageSessionDetail> getSessions() {
        return this.backingStore.get("sessions");
    }
    /**
     * Gets the unit property value. Unit in which consumption quantities are expressed. Values are consumption units, not currency.
     * @return a {@link CostManagementUnit}
     */
    @jakarta.annotation.Nullable
    public CostManagementUnit getUnit() {
        return this.backingStore.get("unit");
    }
    /**
     * Gets the userId property value. The identifier of the user this detail covers. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.backingStore.get("userId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("services", this.getServices());
        writer.writeCollectionOfObjectValues("sessions", this.getSessions());
        writer.writeEnumValue("unit", this.getUnit());
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
     * Sets the consumedQuantity property value. Raw, billable-flagged consumption attributed to this user over the requested window, boundedto the latest processed watermark rather than reprocessed. Read-only.
     * @param value Value to set for the consumedQuantity property.
     */
    public void setConsumedQuantity(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("consumedQuantity", value);
    }
    /**
     * Sets the dataStatus property value. Freshness of the source activity data this detail was computed from, when the native sourcereports an as-of timestamp for the window. Null rather than fabricated when the source hasnone to report. Read-only.
     * @param value Value to set for the dataStatus property.
     */
    public void setDataStatus(@jakarta.annotation.Nullable final CostManagementUsageDataStatus value) {
        this.backingStore.set("dataStatus", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the services property value. This user&apos;s raw consumption, split by governed service. The same native grouped result isalso addressable directly at the services navigation collection.
     * @param value Value to set for the services property.
     */
    public void setServices(@jakarta.annotation.Nullable final java.util.List<CostManagementUserUsageServiceDetail> value) {
        this.backingStore.set("services", value);
    }
    /**
     * Sets the sessionCount property value. Count of billable-flagged activity sessions, bounded to the latest processed watermark, thatcontributed to consumedQuantity. Excludes non-billable activity; the timestamp window and rawsource distinguish this count from the processed completed-day report. Read-only.
     * @param value Value to set for the sessionCount property.
     */
    public void setSessionCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("sessionCount", value);
    }
    /**
     * Sets the sessions property value. This user&apos;s raw usage grouped by session identifiers represented by the native source.Activity without a session identifier may be omitted even when included in the parent total;child quantities need not sum to the parent&apos;s consumedQuantity. Also available as a direct collection.
     * @param value Value to set for the sessions property.
     */
    public void setSessions(@jakarta.annotation.Nullable final java.util.List<CostManagementUserUsageSessionDetail> value) {
        this.backingStore.set("sessions", value);
    }
    /**
     * Sets the unit property value. Unit in which consumption quantities are expressed. Values are consumption units, not currency.
     * @param value Value to set for the unit property.
     */
    public void setUnit(@jakarta.annotation.Nullable final CostManagementUnit value) {
        this.backingStore.set("unit", value);
    }
    /**
     * Sets the userId property value. The identifier of the user this detail covers. Read-only.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
}
