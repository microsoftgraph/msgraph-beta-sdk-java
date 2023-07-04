package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcReviewStatus implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The resource ID of the Azure Storage account in which the Cloud PC snapshot is being saved.
     */
    private String azureStorageAccountId;
    /**
     * The name of the Azure Storage account in which the Cloud PC snapshot is being saved.
     */
    private String azureStorageAccountName;
    /**
     * The name of the container in an Azure Storage account in which the Cloud PC snapshot is being saved.
     */
    private String azureStorageContainerName;
    /**
     * True if the Cloud PC is set to in review by the administrator.
     */
    private Boolean inReview;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The specific date and time of the Cloud PC snapshot that was taken and saved automatically, when the Cloud PC is set to in review. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 appears as 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime restorePointDateTime;
    /**
     * The specific date and time when the Cloud PC was set to in review. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 appears as 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime reviewStartDateTime;
    /**
     * The ID of the Azure subscription in which the Cloud PC snapshot is being saved, in GUID format.
     */
    private String subscriptionId;
    /**
     * The name of the Azure subscription in which the Cloud PC snapshot is being saved.
     */
    private String subscriptionName;
    /**
     * The userAccessLevel property
     */
    private CloudPcUserAccessLevel userAccessLevel;
    /**
     * Instantiates a new cloudPcReviewStatus and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CloudPcReviewStatus() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cloudPcReviewStatus
     */
    @javax.annotation.Nonnull
    public static CloudPcReviewStatus createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcReviewStatus();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the azureStorageAccountId property value. The resource ID of the Azure Storage account in which the Cloud PC snapshot is being saved.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureStorageAccountId() {
        return this.azureStorageAccountId;
    }
    /**
     * Gets the azureStorageAccountName property value. The name of the Azure Storage account in which the Cloud PC snapshot is being saved.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureStorageAccountName() {
        return this.azureStorageAccountName;
    }
    /**
     * Gets the azureStorageContainerName property value. The name of the container in an Azure Storage account in which the Cloud PC snapshot is being saved.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureStorageContainerName() {
        return this.azureStorageContainerName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
        deserializerMap.put("userAccessLevel", (n) -> { this.setUserAccessLevel(n.getEnumValue(CloudPcUserAccessLevel.class)); });
        return deserializerMap;
    }
    /**
     * Gets the inReview property value. True if the Cloud PC is set to in review by the administrator.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getInReview() {
        return this.inReview;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the restorePointDateTime property value. The specific date and time of the Cloud PC snapshot that was taken and saved automatically, when the Cloud PC is set to in review. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 appears as 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getRestorePointDateTime() {
        return this.restorePointDateTime;
    }
    /**
     * Gets the reviewStartDateTime property value. The specific date and time when the Cloud PC was set to in review. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 appears as 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getReviewStartDateTime() {
        return this.reviewStartDateTime;
    }
    /**
     * Gets the subscriptionId property value. The ID of the Azure subscription in which the Cloud PC snapshot is being saved, in GUID format.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubscriptionId() {
        return this.subscriptionId;
    }
    /**
     * Gets the subscriptionName property value. The name of the Azure subscription in which the Cloud PC snapshot is being saved.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubscriptionName() {
        return this.subscriptionName;
    }
    /**
     * Gets the userAccessLevel property value. The userAccessLevel property
     * @return a CloudPcUserAccessLevel
     */
    @javax.annotation.Nullable
    public CloudPcUserAccessLevel getUserAccessLevel() {
        return this.userAccessLevel;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the azureStorageAccountId property value. The resource ID of the Azure Storage account in which the Cloud PC snapshot is being saved.
     * @param value Value to set for the azureStorageAccountId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAzureStorageAccountId(@javax.annotation.Nullable final String value) {
        this.azureStorageAccountId = value;
    }
    /**
     * Sets the azureStorageAccountName property value. The name of the Azure Storage account in which the Cloud PC snapshot is being saved.
     * @param value Value to set for the azureStorageAccountName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAzureStorageAccountName(@javax.annotation.Nullable final String value) {
        this.azureStorageAccountName = value;
    }
    /**
     * Sets the azureStorageContainerName property value. The name of the container in an Azure Storage account in which the Cloud PC snapshot is being saved.
     * @param value Value to set for the azureStorageContainerName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAzureStorageContainerName(@javax.annotation.Nullable final String value) {
        this.azureStorageContainerName = value;
    }
    /**
     * Sets the inReview property value. True if the Cloud PC is set to in review by the administrator.
     * @param value Value to set for the inReview property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInReview(@javax.annotation.Nullable final Boolean value) {
        this.inReview = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the restorePointDateTime property value. The specific date and time of the Cloud PC snapshot that was taken and saved automatically, when the Cloud PC is set to in review. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 appears as 2014-01-01T00:00:00Z.
     * @param value Value to set for the restorePointDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRestorePointDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.restorePointDateTime = value;
    }
    /**
     * Sets the reviewStartDateTime property value. The specific date and time when the Cloud PC was set to in review. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 appears as 2014-01-01T00:00:00Z.
     * @param value Value to set for the reviewStartDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReviewStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.reviewStartDateTime = value;
    }
    /**
     * Sets the subscriptionId property value. The ID of the Azure subscription in which the Cloud PC snapshot is being saved, in GUID format.
     * @param value Value to set for the subscriptionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubscriptionId(@javax.annotation.Nullable final String value) {
        this.subscriptionId = value;
    }
    /**
     * Sets the subscriptionName property value. The name of the Azure subscription in which the Cloud PC snapshot is being saved.
     * @param value Value to set for the subscriptionName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubscriptionName(@javax.annotation.Nullable final String value) {
        this.subscriptionName = value;
    }
    /**
     * Sets the userAccessLevel property value. The userAccessLevel property
     * @param value Value to set for the userAccessLevel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserAccessLevel(@javax.annotation.Nullable final CloudPcUserAccessLevel value) {
        this.userAccessLevel = value;
    }
}
