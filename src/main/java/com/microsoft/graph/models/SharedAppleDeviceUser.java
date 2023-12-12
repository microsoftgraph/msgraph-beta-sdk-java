package com.microsoft.graph.models;

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
public class SharedAppleDeviceUser implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new SharedAppleDeviceUser and sets the default values.
     */
    public SharedAppleDeviceUser() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SharedAppleDeviceUser
     */
    @jakarta.annotation.Nonnull
    public static SharedAppleDeviceUser createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharedAppleDeviceUser();
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
     * Gets the dataQuota property value. Data quota
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getDataQuota() {
        return this.backingStore.get("dataQuota");
    }
    /**
     * Gets the dataToSync property value. Data to sync
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDataToSync() {
        return this.backingStore.get("dataToSync");
    }
    /**
     * Gets the dataUsed property value. Data quota
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getDataUsed() {
        return this.backingStore.get("dataUsed");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("dataQuota", (n) -> { this.setDataQuota(n.getLongValue()); });
        deserializerMap.put("dataToSync", (n) -> { this.setDataToSync(n.getBooleanValue()); });
        deserializerMap.put("dataUsed", (n) -> { this.setDataUsed(n.getLongValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the userPrincipalName property value. User name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.backingStore.get("userPrincipalName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("dataQuota", this.getDataQuota());
        writer.writeBooleanValue("dataToSync", this.getDataToSync());
        writer.writeLongValue("dataUsed", this.getDataUsed());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
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
     * Sets the dataQuota property value. Data quota
     * @param value Value to set for the dataQuota property.
     */
    public void setDataQuota(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("dataQuota", value);
    }
    /**
     * Sets the dataToSync property value. Data to sync
     * @param value Value to set for the dataToSync property.
     */
    public void setDataToSync(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("dataToSync", value);
    }
    /**
     * Sets the dataUsed property value. Data quota
     * @param value Value to set for the dataUsed property.
     */
    public void setDataUsed(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("dataUsed", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the userPrincipalName property value. User name
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalName", value);
    }
}
