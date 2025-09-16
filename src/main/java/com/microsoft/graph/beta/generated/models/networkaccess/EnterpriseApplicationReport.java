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
public class EnterpriseApplicationReport implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link EnterpriseApplicationReport} and sets the default values.
     */
    public EnterpriseApplicationReport() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EnterpriseApplicationReport}
     */
    @jakarta.annotation.Nonnull
    public static EnterpriseApplicationReport createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EnterpriseApplicationReport();
    }
    /**
     * Gets the accessType property value. The type of accessed application. The possible values are: quickAccess, privateAccess, unknownFutureValue, appAccess. Use the Prefer: include-unknown-enum-members request header to get the following values from this evolvable enum: appAccess.
     * @return a {@link AccessType}
     */
    @jakarta.annotation.Nullable
    public AccessType getAccessType() {
        return this.backingStore.get("accessType");
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
     * Gets the applicationId property value. The unique identifier for the enterprise application (appId) in Microsoft Entra ID.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApplicationId() {
        return this.backingStore.get("applicationId");
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
     * Gets the deviceCount property value. Number of devices that accessed this application.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("accessType", (n) -> { this.setAccessType(n.getEnumValue(AccessType::forValue)); });
        deserializerMap.put("applicationId", (n) -> { this.setApplicationId(n.getStringValue()); });
        deserializerMap.put("deviceCount", (n) -> { this.setDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("firstAccessDateTime", (n) -> { this.setFirstAccessDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastAccessDateTime", (n) -> { this.setLastAccessDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
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
     * Gets the lastAccessDateTime property value. Timestamp of the last access to the application.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastAccessDateTime() {
        return this.backingStore.get("lastAccessDateTime");
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
     * Gets the transactionCount property value. Number of transactions to this application.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTransactionCount() {
        return this.backingStore.get("transactionCount");
    }
    /**
     * Gets the userCount property value. Number of users that accessed this application.
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
        writer.writeEnumValue("accessType", this.getAccessType());
        writer.writeStringValue("applicationId", this.getApplicationId());
        writer.writeIntegerValue("deviceCount", this.getDeviceCount());
        writer.writeOffsetDateTimeValue("firstAccessDateTime", this.getFirstAccessDateTime());
        writer.writeOffsetDateTimeValue("lastAccessDateTime", this.getLastAccessDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeLongValue("totalBytesReceived", this.getTotalBytesReceived());
        writer.writeLongValue("totalBytesSent", this.getTotalBytesSent());
        writer.writeEnumValue("trafficType", this.getTrafficType());
        writer.writeIntegerValue("transactionCount", this.getTransactionCount());
        writer.writeIntegerValue("userCount", this.getUserCount());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accessType property value. The type of accessed application. The possible values are: quickAccess, privateAccess, unknownFutureValue, appAccess. Use the Prefer: include-unknown-enum-members request header to get the following values from this evolvable enum: appAccess.
     * @param value Value to set for the accessType property.
     */
    public void setAccessType(@jakarta.annotation.Nullable final AccessType value) {
        this.backingStore.set("accessType", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the applicationId property value. The unique identifier for the enterprise application (appId) in Microsoft Entra ID.
     * @param value Value to set for the applicationId property.
     */
    public void setApplicationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("applicationId", value);
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
     * Sets the deviceCount property value. Number of devices that accessed this application.
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
     * Sets the lastAccessDateTime property value. Timestamp of the last access to the application.
     * @param value Value to set for the lastAccessDateTime property.
     */
    public void setLastAccessDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastAccessDateTime", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
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
     * Sets the transactionCount property value. Number of transactions to this application.
     * @param value Value to set for the transactionCount property.
     */
    public void setTransactionCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("transactionCount", value);
    }
    /**
     * Sets the userCount property value. Number of users that accessed this application.
     * @param value Value to set for the userCount property.
     */
    public void setUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("userCount", value);
    }
}
