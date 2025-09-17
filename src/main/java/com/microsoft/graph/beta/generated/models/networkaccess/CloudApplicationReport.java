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
public class CloudApplicationReport implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CloudApplicationReport} and sets the default values.
     */
    public CloudApplicationReport() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudApplicationReport}
     */
    @jakarta.annotation.Nonnull
    public static CloudApplicationReport createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudApplicationReport();
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
     * Gets the category property value. The category property
     * @return a {@link CloudApplicationCategory}
     */
    @jakarta.annotation.Nullable
    public CloudApplicationCategory getCategory() {
        return this.backingStore.get("category");
    }
    /**
     * Gets the cloudApplicationCatalogId property value. The ID of the application in the SaaS application catalog.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCloudApplicationCatalogId() {
        return this.backingStore.get("cloudApplicationCatalogId");
    }
    /**
     * Gets the complianceScore property value. The compliance score of the application.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getComplianceScore() {
        return this.backingStore.get("complianceScore");
    }
    /**
     * Gets the deviceCount property value. Number of devices under this application.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDeviceCount() {
        return this.backingStore.get("deviceCount");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(17);
        deserializerMap.put("category", (n) -> { this.setCategory(n.getEnumValue(CloudApplicationCategory::forValue)); });
        deserializerMap.put("cloudApplicationCatalogId", (n) -> { this.setCloudApplicationCatalogId(n.getStringValue()); });
        deserializerMap.put("complianceScore", (n) -> { this.setComplianceScore(n.getIntegerValue()); });
        deserializerMap.put("deviceCount", (n) -> { this.setDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("firstAccessDateTime", (n) -> { this.setFirstAccessDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("generalScore", (n) -> { this.setGeneralScore(n.getIntegerValue()); });
        deserializerMap.put("lastAccessDateTime", (n) -> { this.setLastAccessDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("legalScore", (n) -> { this.setLegalScore(n.getIntegerValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("riskScore", (n) -> { this.setRiskScore(n.getIntegerValue()); });
        deserializerMap.put("securityScore", (n) -> { this.setSecurityScore(n.getIntegerValue()); });
        deserializerMap.put("totalBytesReceived", (n) -> { this.setTotalBytesReceived(n.getLongValue()); });
        deserializerMap.put("totalBytesSent", (n) -> { this.setTotalBytesSent(n.getLongValue()); });
        deserializerMap.put("trafficType", (n) -> { this.setTrafficType(n.getEnumValue(TrafficType::forValue)); });
        deserializerMap.put("transactionCount", (n) -> { this.setTransactionCount(n.getIntegerValue()); });
        deserializerMap.put("userCount", (n) -> { this.setUserCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the firstAccessDateTime property value. Timestamp of the first access to the application.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFirstAccessDateTime() {
        return this.backingStore.get("firstAccessDateTime");
    }
    /**
     * Gets the generalScore property value. The general score of the application.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getGeneralScore() {
        return this.backingStore.get("generalScore");
    }
    /**
     * Gets the lastAccessDateTime property value. Timestamp of the last access to the application.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastAccessDateTime() {
        return this.backingStore.get("lastAccessDateTime");
    }
    /**
     * Gets the legalScore property value. The legal score of the application.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLegalScore() {
        return this.backingStore.get("legalScore");
    }
    /**
     * Gets the name property value. The name of the application (e.g., ChatGPT, Salesforce, Bing).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
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
     * Gets the riskScore property value. The risk score of the application.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRiskScore() {
        return this.backingStore.get("riskScore");
    }
    /**
     * Gets the securityScore property value. The security score of the application.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSecurityScore() {
        return this.backingStore.get("securityScore");
    }
    /**
     * Gets the totalBytesReceived property value. Total bytes received from the application.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotalBytesReceived() {
        return this.backingStore.get("totalBytesReceived");
    }
    /**
     * Gets the totalBytesSent property value. Total bytes sent to the application.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotalBytesSent() {
        return this.backingStore.get("totalBytesSent");
    }
    /**
     * Gets the trafficType property value. The trafficType property
     * @return a {@link TrafficType}
     */
    @jakarta.annotation.Nullable
    public TrafficType getTrafficType() {
        return this.backingStore.get("trafficType");
    }
    /**
     * Gets the transactionCount property value. Number of transactions under this application.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTransactionCount() {
        return this.backingStore.get("transactionCount");
    }
    /**
     * Gets the userCount property value. Number of users under this application.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUserCount() {
        return this.backingStore.get("userCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("category", this.getCategory());
        writer.writeStringValue("cloudApplicationCatalogId", this.getCloudApplicationCatalogId());
        writer.writeIntegerValue("complianceScore", this.getComplianceScore());
        writer.writeIntegerValue("deviceCount", this.getDeviceCount());
        writer.writeOffsetDateTimeValue("firstAccessDateTime", this.getFirstAccessDateTime());
        writer.writeIntegerValue("generalScore", this.getGeneralScore());
        writer.writeOffsetDateTimeValue("lastAccessDateTime", this.getLastAccessDateTime());
        writer.writeIntegerValue("legalScore", this.getLegalScore());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("riskScore", this.getRiskScore());
        writer.writeIntegerValue("securityScore", this.getSecurityScore());
        writer.writeLongValue("totalBytesReceived", this.getTotalBytesReceived());
        writer.writeLongValue("totalBytesSent", this.getTotalBytesSent());
        writer.writeEnumValue("trafficType", this.getTrafficType());
        writer.writeIntegerValue("transactionCount", this.getTransactionCount());
        writer.writeIntegerValue("userCount", this.getUserCount());
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
     * Sets the category property value. The category property
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final CloudApplicationCategory value) {
        this.backingStore.set("category", value);
    }
    /**
     * Sets the cloudApplicationCatalogId property value. The ID of the application in the SaaS application catalog.
     * @param value Value to set for the cloudApplicationCatalogId property.
     */
    public void setCloudApplicationCatalogId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("cloudApplicationCatalogId", value);
    }
    /**
     * Sets the complianceScore property value. The compliance score of the application.
     * @param value Value to set for the complianceScore property.
     */
    public void setComplianceScore(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("complianceScore", value);
    }
    /**
     * Sets the deviceCount property value. Number of devices under this application.
     * @param value Value to set for the deviceCount property.
     */
    public void setDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("deviceCount", value);
    }
    /**
     * Sets the firstAccessDateTime property value. Timestamp of the first access to the application.
     * @param value Value to set for the firstAccessDateTime property.
     */
    public void setFirstAccessDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("firstAccessDateTime", value);
    }
    /**
     * Sets the generalScore property value. The general score of the application.
     * @param value Value to set for the generalScore property.
     */
    public void setGeneralScore(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("generalScore", value);
    }
    /**
     * Sets the lastAccessDateTime property value. Timestamp of the last access to the application.
     * @param value Value to set for the lastAccessDateTime property.
     */
    public void setLastAccessDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastAccessDateTime", value);
    }
    /**
     * Sets the legalScore property value. The legal score of the application.
     * @param value Value to set for the legalScore property.
     */
    public void setLegalScore(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("legalScore", value);
    }
    /**
     * Sets the name property value. The name of the application (e.g., ChatGPT, Salesforce, Bing).
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the riskScore property value. The risk score of the application.
     * @param value Value to set for the riskScore property.
     */
    public void setRiskScore(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("riskScore", value);
    }
    /**
     * Sets the securityScore property value. The security score of the application.
     * @param value Value to set for the securityScore property.
     */
    public void setSecurityScore(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("securityScore", value);
    }
    /**
     * Sets the totalBytesReceived property value. Total bytes received from the application.
     * @param value Value to set for the totalBytesReceived property.
     */
    public void setTotalBytesReceived(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("totalBytesReceived", value);
    }
    /**
     * Sets the totalBytesSent property value. Total bytes sent to the application.
     * @param value Value to set for the totalBytesSent property.
     */
    public void setTotalBytesSent(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("totalBytesSent", value);
    }
    /**
     * Sets the trafficType property value. The trafficType property
     * @param value Value to set for the trafficType property.
     */
    public void setTrafficType(@jakarta.annotation.Nullable final TrafficType value) {
        this.backingStore.set("trafficType", value);
    }
    /**
     * Sets the transactionCount property value. Number of transactions under this application.
     * @param value Value to set for the transactionCount property.
     */
    public void setTransactionCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("transactionCount", value);
    }
    /**
     * Sets the userCount property value. Number of users under this application.
     * @param value Value to set for the userCount property.
     */
    public void setUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("userCount", value);
    }
}
