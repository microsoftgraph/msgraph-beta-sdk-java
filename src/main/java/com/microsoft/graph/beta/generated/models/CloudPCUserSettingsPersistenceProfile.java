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
public class CloudPCUserSettingsPersistenceProfile implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CloudPCUserSettingsPersistenceProfile} and sets the default values.
     */
    public CloudPCUserSettingsPersistenceProfile() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPCUserSettingsPersistenceProfile}
     */
    @jakarta.annotation.Nonnull
    public static CloudPCUserSettingsPersistenceProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPCUserSettingsPersistenceProfile();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("lastProfileAttachedDateTime", (n) -> { this.setLastProfileAttachedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("profileId", (n) -> { this.setProfileId(n.getStringValue()); });
        deserializerMap.put("profileSizeInGB", (n) -> { this.setProfileSizeInGB(n.getIntegerValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(CloudPCUserSettingsPersistenceProfileStatus::forValue)); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastProfileAttachedDateTime property value. The last time the user settings persistence profile was attached to the Cloud PC. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastProfileAttachedDateTime() {
        return this.backingStore.get("lastProfileAttachedDateTime");
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
     * Gets the profileId property value. Indicates the unique identifier of the Cloud PC user settings persistence profile for the selected Cloud PC user settings persistence. Required. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProfileId() {
        return this.backingStore.get("profileId");
    }
    /**
     * Gets the profileSizeInGB property value. Indicates the maximum allowed size in gigabytes of the cloud profile for a specific user. For example, 10 GB of allocated size returns 10 as a response. Required. Read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getProfileSizeInGB() {
        return this.backingStore.get("profileSizeInGB");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link CloudPCUserSettingsPersistenceProfileStatus}
     */
    @jakarta.annotation.Nullable
    public CloudPCUserSettingsPersistenceProfileStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the userPrincipalName property value. The user principal name of the owner of the cloud profile. For example, connie@contoso.com. Required. Read-only.
     * @return a {@link String}
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
        writer.writeOffsetDateTimeValue("lastProfileAttachedDateTime", this.getLastProfileAttachedDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("profileId", this.getProfileId());
        writer.writeIntegerValue("profileSizeInGB", this.getProfileSizeInGB());
        writer.writeEnumValue("status", this.getStatus());
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
     * Sets the lastProfileAttachedDateTime property value. The last time the user settings persistence profile was attached to the Cloud PC. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the lastProfileAttachedDateTime property.
     */
    public void setLastProfileAttachedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastProfileAttachedDateTime", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the profileId property value. Indicates the unique identifier of the Cloud PC user settings persistence profile for the selected Cloud PC user settings persistence. Required. Read-only.
     * @param value Value to set for the profileId property.
     */
    public void setProfileId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("profileId", value);
    }
    /**
     * Sets the profileSizeInGB property value. Indicates the maximum allowed size in gigabytes of the cloud profile for a specific user. For example, 10 GB of allocated size returns 10 as a response. Required. Read-only.
     * @param value Value to set for the profileSizeInGB property.
     */
    public void setProfileSizeInGB(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("profileSizeInGB", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final CloudPCUserSettingsPersistenceProfileStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the userPrincipalName property value. The user principal name of the owner of the cloud profile. For example, connie@contoso.com. Required. Read-only.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalName", value);
    }
}
