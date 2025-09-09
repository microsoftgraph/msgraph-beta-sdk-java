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
public class ApplicationAnalyticsUsagePoint implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ApplicationAnalyticsUsagePoint} and sets the default values.
     */
    public ApplicationAnalyticsUsagePoint() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ApplicationAnalyticsUsagePoint}
     */
    @jakarta.annotation.Nonnull
    public static ApplicationAnalyticsUsagePoint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApplicationAnalyticsUsagePoint();
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
     * Gets the cloudAppsCount property value. The count attributed to cloud applications for the specified aggregation type.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getCloudAppsCount() {
        return this.backingStore.get("cloudAppsCount");
    }
    /**
     * Gets the enterpriseAppsCount property value. The count attributed to enterprise applications for the specified aggregation type.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getEnterpriseAppsCount() {
        return this.backingStore.get("enterpriseAppsCount");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("cloudAppsCount", (n) -> { this.setCloudAppsCount(n.getLongValue()); });
        deserializerMap.put("enterpriseAppsCount", (n) -> { this.setEnterpriseAppsCount(n.getLongValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("timeStampDateTime", (n) -> { this.setTimeStampDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("totalCount", (n) -> { this.setTotalCount(n.getLongValue()); });
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
     * Gets the timeStampDateTime property value. The date for which the aggregated data point represents.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getTimeStampDateTime() {
        return this.backingStore.get("timeStampDateTime");
    }
    /**
     * Gets the totalCount property value. The total count for the specified aggregation type (users, devices, or transactions).
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotalCount() {
        return this.backingStore.get("totalCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("cloudAppsCount", this.getCloudAppsCount());
        writer.writeLongValue("enterpriseAppsCount", this.getEnterpriseAppsCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeOffsetDateTimeValue("timeStampDateTime", this.getTimeStampDateTime());
        writer.writeLongValue("totalCount", this.getTotalCount());
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
     * Sets the cloudAppsCount property value. The count attributed to cloud applications for the specified aggregation type.
     * @param value Value to set for the cloudAppsCount property.
     */
    public void setCloudAppsCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("cloudAppsCount", value);
    }
    /**
     * Sets the enterpriseAppsCount property value. The count attributed to enterprise applications for the specified aggregation type.
     * @param value Value to set for the enterpriseAppsCount property.
     */
    public void setEnterpriseAppsCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("enterpriseAppsCount", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the timeStampDateTime property value. The date for which the aggregated data point represents.
     * @param value Value to set for the timeStampDateTime property.
     */
    public void setTimeStampDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("timeStampDateTime", value);
    }
    /**
     * Sets the totalCount property value. The total count for the specified aggregation type (users, devices, or transactions).
     * @param value Value to set for the totalCount property.
     */
    public void setTotalCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("totalCount", value);
    }
}
