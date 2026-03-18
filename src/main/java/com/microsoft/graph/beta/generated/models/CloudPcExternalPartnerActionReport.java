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
public class CloudPcExternalPartnerActionReport implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CloudPcExternalPartnerActionReport} and sets the default values.
     */
    public CloudPcExternalPartnerActionReport() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcExternalPartnerActionReport}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcExternalPartnerActionReport createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcExternalPartnerActionReport();
    }
    /**
     * Gets the actionType property value. The actionType property
     * @return a {@link CloudPcExternalPartnerActionType}
     */
    @jakarta.annotation.Nullable
    public CloudPcExternalPartnerActionType getActionType() {
        return this.backingStore.get("actionType");
    }
    /**
     * Gets the activityId property value. TheIDofexternalpartneractivity.Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActivityId() {
        return this.backingStore.get("activityId");
    }
    /**
     * Gets the activityMessage property value. The message of external partner activity. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActivityMessage() {
        return this.backingStore.get("activityMessage");
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
     * Gets the agentName property value. The agent name of the external partner. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAgentName() {
        return this.backingStore.get("agentName");
    }
    /**
     * Gets the agentSetting property value. The agent setting of the external partner. Read-only.
     * @return a {@link CloudPcExternalPartnerAgentSetting}
     */
    @jakarta.annotation.Nullable
    public CloudPcExternalPartnerAgentSetting getAgentSetting() {
        return this.backingStore.get("agentSetting");
    }
    /**
     * Gets the authenticatedAppId property value. Indicates the authenticated Microsoft Entra (Azure AD) app ID of the action request. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAuthenticatedAppId() {
        return this.backingStore.get("authenticatedAppId");
    }
    /**
     * Gets the authenticatedAppName property value. Indicates the authenticated Microsoft Entra (Azure AD) app name of the action request. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAuthenticatedAppName() {
        return this.backingStore.get("authenticatedAppName");
    }
    /**
     * Gets the authenticatedMethod property value. The authenticatedMethod property
     * @return a {@link CloudPcExternalPartnerAuthenticatedMethod}
     */
    @jakarta.annotation.Nullable
    public CloudPcExternalPartnerAuthenticatedMethod getAuthenticatedMethod() {
        return this.backingStore.get("authenticatedMethod");
    }
    /**
     * Gets the authenticatedUserPrincipalName property value. Indicates the authenticated Microsoft Entra (Azure AD) user principal name of the action request. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAuthenticatedUserPrincipalName() {
        return this.backingStore.get("authenticatedUserPrincipalName");
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
     * Gets the cloudPcId property value. The Cloud PC&apos;s ID of the partner agent is deployed. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCloudPcId() {
        return this.backingStore.get("cloudPcId");
    }
    /**
     * Gets the cloudPcName property value. The Cloud PC&apos;s Name of the partner agent is deployed. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCloudPcName() {
        return this.backingStore.get("cloudPcName");
    }
    /**
     * Gets the createdDateTime property value. The create time of the action. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: &apos;2014-01-01T00:00:00Z&apos;. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("actionType", (n) -> { this.setActionType(n.getEnumValue(CloudPcExternalPartnerActionType::forValue)); });
        deserializerMap.put("activityId", (n) -> { this.setActivityId(n.getStringValue()); });
        deserializerMap.put("activityMessage", (n) -> { this.setActivityMessage(n.getStringValue()); });
        deserializerMap.put("agentName", (n) -> { this.setAgentName(n.getStringValue()); });
        deserializerMap.put("agentSetting", (n) -> { this.setAgentSetting(n.getObjectValue(CloudPcExternalPartnerAgentSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("authenticatedAppId", (n) -> { this.setAuthenticatedAppId(n.getStringValue()); });
        deserializerMap.put("authenticatedAppName", (n) -> { this.setAuthenticatedAppName(n.getStringValue()); });
        deserializerMap.put("authenticatedMethod", (n) -> { this.setAuthenticatedMethod(n.getEnumValue(CloudPcExternalPartnerAuthenticatedMethod::forValue)); });
        deserializerMap.put("authenticatedUserPrincipalName", (n) -> { this.setAuthenticatedUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("cloudPcId", (n) -> { this.setCloudPcId(n.getStringValue()); });
        deserializerMap.put("cloudPcName", (n) -> { this.setCloudPcName(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("actionType", this.getActionType());
        writer.writeStringValue("activityId", this.getActivityId());
        writer.writeStringValue("activityMessage", this.getActivityMessage());
        writer.writeStringValue("agentName", this.getAgentName());
        writer.writeObjectValue("agentSetting", this.getAgentSetting());
        writer.writeStringValue("authenticatedAppId", this.getAuthenticatedAppId());
        writer.writeStringValue("authenticatedAppName", this.getAuthenticatedAppName());
        writer.writeEnumValue("authenticatedMethod", this.getAuthenticatedMethod());
        writer.writeStringValue("authenticatedUserPrincipalName", this.getAuthenticatedUserPrincipalName());
        writer.writeStringValue("cloudPcId", this.getCloudPcId());
        writer.writeStringValue("cloudPcName", this.getCloudPcName());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actionType property value. The actionType property
     * @param value Value to set for the actionType property.
     */
    public void setActionType(@jakarta.annotation.Nullable final CloudPcExternalPartnerActionType value) {
        this.backingStore.set("actionType", value);
    }
    /**
     * Sets the activityId property value. TheIDofexternalpartneractivity.Read-only.
     * @param value Value to set for the activityId property.
     */
    public void setActivityId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("activityId", value);
    }
    /**
     * Sets the activityMessage property value. The message of external partner activity. Read-only.
     * @param value Value to set for the activityMessage property.
     */
    public void setActivityMessage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("activityMessage", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the agentName property value. The agent name of the external partner. Read-only.
     * @param value Value to set for the agentName property.
     */
    public void setAgentName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("agentName", value);
    }
    /**
     * Sets the agentSetting property value. The agent setting of the external partner. Read-only.
     * @param value Value to set for the agentSetting property.
     */
    public void setAgentSetting(@jakarta.annotation.Nullable final CloudPcExternalPartnerAgentSetting value) {
        this.backingStore.set("agentSetting", value);
    }
    /**
     * Sets the authenticatedAppId property value. Indicates the authenticated Microsoft Entra (Azure AD) app ID of the action request. Read-only.
     * @param value Value to set for the authenticatedAppId property.
     */
    public void setAuthenticatedAppId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("authenticatedAppId", value);
    }
    /**
     * Sets the authenticatedAppName property value. Indicates the authenticated Microsoft Entra (Azure AD) app name of the action request. Read-only.
     * @param value Value to set for the authenticatedAppName property.
     */
    public void setAuthenticatedAppName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("authenticatedAppName", value);
    }
    /**
     * Sets the authenticatedMethod property value. The authenticatedMethod property
     * @param value Value to set for the authenticatedMethod property.
     */
    public void setAuthenticatedMethod(@jakarta.annotation.Nullable final CloudPcExternalPartnerAuthenticatedMethod value) {
        this.backingStore.set("authenticatedMethod", value);
    }
    /**
     * Sets the authenticatedUserPrincipalName property value. Indicates the authenticated Microsoft Entra (Azure AD) user principal name of the action request. Read-only.
     * @param value Value to set for the authenticatedUserPrincipalName property.
     */
    public void setAuthenticatedUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("authenticatedUserPrincipalName", value);
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
     * Sets the cloudPcId property value. The Cloud PC&apos;s ID of the partner agent is deployed. Read-only.
     * @param value Value to set for the cloudPcId property.
     */
    public void setCloudPcId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("cloudPcId", value);
    }
    /**
     * Sets the cloudPcName property value. The Cloud PC&apos;s Name of the partner agent is deployed. Read-only.
     * @param value Value to set for the cloudPcName property.
     */
    public void setCloudPcName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("cloudPcName", value);
    }
    /**
     * Sets the createdDateTime property value. The create time of the action. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: &apos;2014-01-01T00:00:00Z&apos;. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
