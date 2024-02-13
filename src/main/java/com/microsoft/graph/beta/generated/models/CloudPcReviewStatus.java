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
public class CloudPcReviewStatus implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CloudPcReviewStatus} and sets the default values.
     */
    public CloudPcReviewStatus() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcReviewStatus}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcReviewStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcReviewStatus();
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
     * Gets the azureStorageAccountId property value. The resource ID of the Azure Storage account in which the Cloud PC snapshot is being saved.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAzureStorageAccountId() {
        return this.backingStore.get("azureStorageAccountId");
    }
    /**
     * Gets the azureStorageAccountName property value. The name of the Azure Storage account in which the Cloud PC snapshot is being saved.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAzureStorageAccountName() {
        return this.backingStore.get("azureStorageAccountName");
    }
    /**
     * Gets the azureStorageContainerName property value. The name of the container in an Azure Storage account in which the Cloud PC snapshot is being saved.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAzureStorageContainerName() {
        return this.backingStore.get("azureStorageContainerName");
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("azureStorageAccountId", (n) -> { this.setAzureStorageAccountId(n.getStringValue()); });
        deserializerMap.put("azureStorageAccountName", (n) -> { this.setAzureStorageAccountName(n.getStringValue()); });
        deserializerMap.put("azureStorageContainerName", (n) -> { this.setAzureStorageContainerName(n.getStringValue()); });
        deserializerMap.put("inReview", (n) -> { this.setInReview(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("restorePointDateTime", (n) -> { this.setRestorePointDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("reviewStartDateTime", (n) -> { this.setReviewStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("subscriptionId", (n) -> { this.setSubscriptionId(n.getStringValue()); });
        deserializerMap.put("subscriptionName", (n) -> { this.setSubscriptionName(n.getStringValue()); });
        deserializerMap.put("userAccessLevel", (n) -> { this.setUserAccessLevel(n.getEnumValue(CloudPcUserAccessLevel::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the inReview property value. True if the Cloud PC is set to in review by the administrator.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getInReview() {
        return this.backingStore.get("inReview");
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
     * Gets the restorePointDateTime property value. The specific date and time of the Cloud PC snapshot that was taken and saved automatically, when the Cloud PC is set to in review. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 appears as 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRestorePointDateTime() {
        return this.backingStore.get("restorePointDateTime");
    }
    /**
     * Gets the reviewStartDateTime property value. The specific date and time when the Cloud PC was set to in review. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 appears as 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReviewStartDateTime() {
        return this.backingStore.get("reviewStartDateTime");
    }
    /**
     * Gets the subscriptionId property value. The ID of the Azure subscription in which the Cloud PC snapshot is being saved, in GUID format.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubscriptionId() {
        return this.backingStore.get("subscriptionId");
    }
    /**
     * Gets the subscriptionName property value. The name of the Azure subscription in which the Cloud PC snapshot is being saved.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubscriptionName() {
        return this.backingStore.get("subscriptionName");
    }
    /**
     * Gets the userAccessLevel property value. The userAccessLevel property
     * @return a {@link CloudPcUserAccessLevel}
     */
    @jakarta.annotation.Nullable
    public CloudPcUserAccessLevel getUserAccessLevel() {
        return this.backingStore.get("userAccessLevel");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("azureStorageAccountId", this.getAzureStorageAccountId());
        writer.writeStringValue("azureStorageAccountName", this.getAzureStorageAccountName());
        writer.writeStringValue("azureStorageContainerName", this.getAzureStorageContainerName());
        writer.writeBooleanValue("inReview", this.getInReview());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeOffsetDateTimeValue("restorePointDateTime", this.getRestorePointDateTime());
        writer.writeOffsetDateTimeValue("reviewStartDateTime", this.getReviewStartDateTime());
        writer.writeStringValue("subscriptionId", this.getSubscriptionId());
        writer.writeStringValue("subscriptionName", this.getSubscriptionName());
        writer.writeEnumValue("userAccessLevel", this.getUserAccessLevel());
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
     * Sets the azureStorageAccountId property value. The resource ID of the Azure Storage account in which the Cloud PC snapshot is being saved.
     * @param value Value to set for the azureStorageAccountId property.
     */
    public void setAzureStorageAccountId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("azureStorageAccountId", value);
    }
    /**
     * Sets the azureStorageAccountName property value. The name of the Azure Storage account in which the Cloud PC snapshot is being saved.
     * @param value Value to set for the azureStorageAccountName property.
     */
    public void setAzureStorageAccountName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("azureStorageAccountName", value);
    }
    /**
     * Sets the azureStorageContainerName property value. The name of the container in an Azure Storage account in which the Cloud PC snapshot is being saved.
     * @param value Value to set for the azureStorageContainerName property.
     */
    public void setAzureStorageContainerName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("azureStorageContainerName", value);
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
     * Sets the inReview property value. True if the Cloud PC is set to in review by the administrator.
     * @param value Value to set for the inReview property.
     */
    public void setInReview(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("inReview", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the restorePointDateTime property value. The specific date and time of the Cloud PC snapshot that was taken and saved automatically, when the Cloud PC is set to in review. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 appears as 2014-01-01T00:00:00Z.
     * @param value Value to set for the restorePointDateTime property.
     */
    public void setRestorePointDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("restorePointDateTime", value);
    }
    /**
     * Sets the reviewStartDateTime property value. The specific date and time when the Cloud PC was set to in review. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 appears as 2014-01-01T00:00:00Z.
     * @param value Value to set for the reviewStartDateTime property.
     */
    public void setReviewStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("reviewStartDateTime", value);
    }
    /**
     * Sets the subscriptionId property value. The ID of the Azure subscription in which the Cloud PC snapshot is being saved, in GUID format.
     * @param value Value to set for the subscriptionId property.
     */
    public void setSubscriptionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subscriptionId", value);
    }
    /**
     * Sets the subscriptionName property value. The name of the Azure subscription in which the Cloud PC snapshot is being saved.
     * @param value Value to set for the subscriptionName property.
     */
    public void setSubscriptionName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subscriptionName", value);
    }
    /**
     * Sets the userAccessLevel property value. The userAccessLevel property
     * @param value Value to set for the userAccessLevel property.
     */
    public void setUserAccessLevel(@jakarta.annotation.Nullable final CloudPcUserAccessLevel value) {
        this.backingStore.set("userAccessLevel", value);
    }
}
