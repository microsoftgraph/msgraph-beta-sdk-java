package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcCloudApp extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CloudPcCloudApp} and sets the default values.
     */
    public CloudPcCloudApp() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcCloudApp}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcCloudApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcCloudApp();
    }
    /**
     * Gets the actionFailedErrorCode property value. The actionFailedErrorCode property
     * @return a {@link CloudPcCloudAppActionFailedErrorCode}
     */
    @jakarta.annotation.Nullable
    public CloudPcCloudAppActionFailedErrorCode getActionFailedErrorCode() {
        return this.backingStore.get("actionFailedErrorCode");
    }
    /**
     * Gets the actionFailedErrorMessage property value. The actionFailedErrorMessage property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActionFailedErrorMessage() {
        return this.backingStore.get("actionFailedErrorMessage");
    }
    /**
     * Gets the addedDateTime property value. The addedDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAddedDateTime() {
        return this.backingStore.get("addedDateTime");
    }
    /**
     * Gets the appDetail property value. The appDetail property
     * @return a {@link CloudPcCloudAppDetail}
     */
    @jakarta.annotation.Nullable
    public CloudPcCloudAppDetail getAppDetail() {
        return this.backingStore.get("appDetail");
    }
    /**
     * Gets the appStatus property value. The appStatus property
     * @return a {@link CloudPcCloudAppStatus}
     */
    @jakarta.annotation.Nullable
    public CloudPcCloudAppStatus getAppStatus() {
        return this.backingStore.get("appStatus");
    }
    /**
     * Gets the availableToUser property value. The availableToUser property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAvailableToUser() {
        return this.backingStore.get("availableToUser");
    }
    /**
     * Gets the description property value. The description property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the discoveredAppName property value. The discoveredAppName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDiscoveredAppName() {
        return this.backingStore.get("discoveredAppName");
    }
    /**
     * Gets the displayName property value. The displayName property
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actionFailedErrorCode", (n) -> { this.setActionFailedErrorCode(n.getEnumValue(CloudPcCloudAppActionFailedErrorCode::forValue)); });
        deserializerMap.put("actionFailedErrorMessage", (n) -> { this.setActionFailedErrorMessage(n.getStringValue()); });
        deserializerMap.put("addedDateTime", (n) -> { this.setAddedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("appDetail", (n) -> { this.setAppDetail(n.getObjectValue(CloudPcCloudAppDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("appStatus", (n) -> { this.setAppStatus(n.getEnumValue(CloudPcCloudAppStatus::forValue)); });
        deserializerMap.put("availableToUser", (n) -> { this.setAvailableToUser(n.getBooleanValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("discoveredAppName", (n) -> { this.setDiscoveredAppName(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastPublishedDateTime", (n) -> { this.setLastPublishedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("provisioningPolicyId", (n) -> { this.setProvisioningPolicyId(n.getStringValue()); });
        deserializerMap.put("scopeIds", (n) -> { this.setScopeIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the lastPublishedDateTime property value. The lastPublishedDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastPublishedDateTime() {
        return this.backingStore.get("lastPublishedDateTime");
    }
    /**
     * Gets the provisioningPolicyId property value. The provisioningPolicyId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProvisioningPolicyId() {
        return this.backingStore.get("provisioningPolicyId");
    }
    /**
     * Gets the scopeIds property value. The scopeIds property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getScopeIds() {
        return this.backingStore.get("scopeIds");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("actionFailedErrorCode", this.getActionFailedErrorCode());
        writer.writeStringValue("actionFailedErrorMessage", this.getActionFailedErrorMessage());
        writer.writeOffsetDateTimeValue("addedDateTime", this.getAddedDateTime());
        writer.writeObjectValue("appDetail", this.getAppDetail());
        writer.writeEnumValue("appStatus", this.getAppStatus());
        writer.writeBooleanValue("availableToUser", this.getAvailableToUser());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("discoveredAppName", this.getDiscoveredAppName());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastPublishedDateTime", this.getLastPublishedDateTime());
        writer.writeStringValue("provisioningPolicyId", this.getProvisioningPolicyId());
        writer.writeCollectionOfPrimitiveValues("scopeIds", this.getScopeIds());
    }
    /**
     * Sets the actionFailedErrorCode property value. The actionFailedErrorCode property
     * @param value Value to set for the actionFailedErrorCode property.
     */
    public void setActionFailedErrorCode(@jakarta.annotation.Nullable final CloudPcCloudAppActionFailedErrorCode value) {
        this.backingStore.set("actionFailedErrorCode", value);
    }
    /**
     * Sets the actionFailedErrorMessage property value. The actionFailedErrorMessage property
     * @param value Value to set for the actionFailedErrorMessage property.
     */
    public void setActionFailedErrorMessage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("actionFailedErrorMessage", value);
    }
    /**
     * Sets the addedDateTime property value. The addedDateTime property
     * @param value Value to set for the addedDateTime property.
     */
    public void setAddedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("addedDateTime", value);
    }
    /**
     * Sets the appDetail property value. The appDetail property
     * @param value Value to set for the appDetail property.
     */
    public void setAppDetail(@jakarta.annotation.Nullable final CloudPcCloudAppDetail value) {
        this.backingStore.set("appDetail", value);
    }
    /**
     * Sets the appStatus property value. The appStatus property
     * @param value Value to set for the appStatus property.
     */
    public void setAppStatus(@jakarta.annotation.Nullable final CloudPcCloudAppStatus value) {
        this.backingStore.set("appStatus", value);
    }
    /**
     * Sets the availableToUser property value. The availableToUser property
     * @param value Value to set for the availableToUser property.
     */
    public void setAvailableToUser(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("availableToUser", value);
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the discoveredAppName property value. The discoveredAppName property
     * @param value Value to set for the discoveredAppName property.
     */
    public void setDiscoveredAppName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("discoveredAppName", value);
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the lastPublishedDateTime property value. The lastPublishedDateTime property
     * @param value Value to set for the lastPublishedDateTime property.
     */
    public void setLastPublishedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastPublishedDateTime", value);
    }
    /**
     * Sets the provisioningPolicyId property value. The provisioningPolicyId property
     * @param value Value to set for the provisioningPolicyId property.
     */
    public void setProvisioningPolicyId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("provisioningPolicyId", value);
    }
    /**
     * Sets the scopeIds property value. The scopeIds property
     * @param value Value to set for the scopeIds property.
     */
    public void setScopeIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("scopeIds", value);
    }
}
