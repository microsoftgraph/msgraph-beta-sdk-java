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
public class User implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link User} and sets the default values.
     */
    public User() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link User}
     */
    @jakarta.annotation.Nonnull
    public static User createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new User();
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
     * Gets the displayName property value. User display Name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("firstAccessDateTime", (n) -> { this.setFirstAccessDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastAccessDateTime", (n) -> { this.setLastAccessDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("totalBytesReceived", (n) -> { this.setTotalBytesReceived(n.getLongValue()); });
        deserializerMap.put("totalBytesSent", (n) -> { this.setTotalBytesSent(n.getLongValue()); });
        deserializerMap.put("trafficType", (n) -> { this.setTrafficType(n.getEnumValue(TrafficType::forValue)); });
        deserializerMap.put("transactionCount", (n) -> { this.setTransactionCount(n.getLongValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("userType", (n) -> { this.setUserType(n.getEnumValue(UserType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the firstAccessDateTime property value. The firstAccessDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFirstAccessDateTime() {
        return this.backingStore.get("firstAccessDateTime");
    }
    /**
     * Gets the lastAccessDateTime property value. The date and time of the most recent access.
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
     * Gets the totalBytesReceived property value. The totalBytesReceived property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotalBytesReceived() {
        return this.backingStore.get("totalBytesReceived");
    }
    /**
     * Gets the totalBytesSent property value. The totalBytesSent property
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
     * Gets the transactionCount property value. The transactionCount property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTransactionCount() {
        return this.backingStore.get("transactionCount");
    }
    /**
     * Gets the userId property value. The ID for the user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.backingStore.get("userId");
    }
    /**
     * Gets the userPrincipalName property value. A unique identifier that is associated with a user in a system or directory. Typically, this value is an email address that is used for user authentication and identification.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.backingStore.get("userPrincipalName");
    }
    /**
     * Gets the userType property value. The userType property
     * @return a {@link UserType}
     */
    @jakarta.annotation.Nullable
    public UserType getUserType() {
        return this.backingStore.get("userType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("firstAccessDateTime", this.getFirstAccessDateTime());
        writer.writeOffsetDateTimeValue("lastAccessDateTime", this.getLastAccessDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeLongValue("totalBytesReceived", this.getTotalBytesReceived());
        writer.writeLongValue("totalBytesSent", this.getTotalBytesSent());
        writer.writeEnumValue("trafficType", this.getTrafficType());
        writer.writeLongValue("transactionCount", this.getTransactionCount());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
        writer.writeEnumValue("userType", this.getUserType());
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
     * Sets the displayName property value. User display Name.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the firstAccessDateTime property value. The firstAccessDateTime property
     * @param value Value to set for the firstAccessDateTime property.
     */
    public void setFirstAccessDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("firstAccessDateTime", value);
    }
    /**
     * Sets the lastAccessDateTime property value. The date and time of the most recent access.
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
     * Sets the totalBytesReceived property value. The totalBytesReceived property
     * @param value Value to set for the totalBytesReceived property.
     */
    public void setTotalBytesReceived(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("totalBytesReceived", value);
    }
    /**
     * Sets the totalBytesSent property value. The totalBytesSent property
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
     * Sets the transactionCount property value. The transactionCount property
     * @param value Value to set for the transactionCount property.
     */
    public void setTransactionCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("transactionCount", value);
    }
    /**
     * Sets the userId property value. The ID for the user.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
    /**
     * Sets the userPrincipalName property value. A unique identifier that is associated with a user in a system or directory. Typically, this value is an email address that is used for user authentication and identification.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalName", value);
    }
    /**
     * Sets the userType property value. The userType property
     * @param value Value to set for the userType property.
     */
    public void setUserType(@jakarta.annotation.Nullable final UserType value) {
        this.backingStore.set("userType", value);
    }
}
