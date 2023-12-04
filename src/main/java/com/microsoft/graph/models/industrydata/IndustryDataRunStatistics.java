package com.microsoft.graph.models.industrydata;

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
public class IndustryDataRunStatistics implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new IndustryDataRunStatistics and sets the default values.
     */
    public IndustryDataRunStatistics() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IndustryDataRunStatistics
     */
    @jakarta.annotation.Nonnull
    public static IndustryDataRunStatistics createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IndustryDataRunStatistics();
    }
    /**
     * Gets the activityStatistics property value. The collection of statistics for each activity included in this run.
     * @return a java.util.List<IndustryDataActivityStatistics>
     */
    @jakarta.annotation.Nullable
    public java.util.List<IndustryDataActivityStatistics> getActivityStatistics() {
        return this.backingStore.get("activityStatistics");
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("activityStatistics", (n) -> { this.setActivityStatistics(n.getCollectionOfObjectValues(IndustryDataActivityStatistics::createFromDiscriminatorValue)); });
        deserializerMap.put("inboundTotals", (n) -> { this.setInboundTotals(n.getObjectValue(AggregatedInboundStatistics::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("runId", (n) -> { this.setRunId(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(IndustryDataRunStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the inboundTotals property value. The aggregate statistics for all inbound flows.
     * @return a AggregatedInboundStatistics
     */
    @jakarta.annotation.Nullable
    public AggregatedInboundStatistics getInboundTotals() {
        return this.backingStore.get("inboundTotals");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the runId property value. The ID of the underlying run for the statistics.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRunId() {
        return this.backingStore.get("runId");
    }
    /**
     * Gets the status property value. The status property
     * @return a IndustryDataRunStatus
     */
    @jakarta.annotation.Nullable
    public IndustryDataRunStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the activityStatistics property value. The collection of statistics for each activity included in this run.
     * @param value Value to set for the activityStatistics property.
     */
    public void setActivityStatistics(@jakarta.annotation.Nullable final java.util.List<IndustryDataActivityStatistics> value) {
        this.backingStore.set("activityStatistics", value);
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
     * Sets the inboundTotals property value. The aggregate statistics for all inbound flows.
     * @param value Value to set for the inboundTotals property.
     */
    public void setInboundTotals(@jakarta.annotation.Nullable final AggregatedInboundStatistics value) {
        this.backingStore.set("inboundTotals", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the runId property value. The ID of the underlying run for the statistics.
     * @param value Value to set for the runId property.
     */
    public void setRunId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("runId", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final IndustryDataRunStatus value) {
        this.backingStore.set("status", value);
    }
}
