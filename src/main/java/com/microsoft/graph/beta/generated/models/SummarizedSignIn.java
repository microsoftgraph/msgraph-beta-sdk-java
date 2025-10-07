package com.microsoft.graph.beta.models;

import com.microsoft.graph.beta.models.agentic.AgentSignIn;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SummarizedSignIn extends Entity implements Parsable {
    /**
     * Instantiates a new {@link SummarizedSignIn} and sets the default values.
     */
    public SummarizedSignIn() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SummarizedSignIn}
     */
    @jakarta.annotation.Nonnull
    public static SummarizedSignIn createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SummarizedSignIn();
    }
    /**
     * Gets the agent property value. Represents details about the agentic sign-in. Includes the type of agent as well as parent appId in some cases. Supports $filter (eq) for agentType.
     * @return a {@link AgentSignIn}
     */
    @jakarta.annotation.Nullable
    public AgentSignIn getAgent() {
        return this.backingStore.get("agent");
    }
    /**
     * Gets the aggregationDateTime property value. The aggregated day for which the summary applies to. This property always represents the entire day. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAggregationDateTime() {
        return this.backingStore.get("aggregationDateTime");
    }
    /**
     * Gets the appDisplayName property value. The application name displayed in the Microsoft Entra admin center. Supports $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppDisplayName() {
        return this.backingStore.get("appDisplayName");
    }
    /**
     * Gets the appId property value. The application identifier (client ID) in Microsoft Entra ID. Supports $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppId() {
        return this.backingStore.get("appId");
    }
    /**
     * Gets the conditionalAccessStatus property value. The status of the conditional access policy triggered. The possible values are: success, failure, notApplied, unknownFutureValue. Supports $filter (eq).
     * @return a {@link ConditionalAccessStatus}
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessStatus getConditionalAccessStatus() {
        return this.backingStore.get("conditionalAccessStatus");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("agent", (n) -> { this.setAgent(n.getObjectValue(AgentSignIn::createFromDiscriminatorValue)); });
        deserializerMap.put("aggregationDateTime", (n) -> { this.setAggregationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("appDisplayName", (n) -> { this.setAppDisplayName(n.getStringValue()); });
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
        deserializerMap.put("conditionalAccessStatus", (n) -> { this.setConditionalAccessStatus(n.getEnumValue(ConditionalAccessStatus::forValue)); });
        deserializerMap.put("firstSignInDateTime", (n) -> { this.setFirstSignInDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("ipAddress", (n) -> { this.setIpAddress(n.getStringValue()); });
        deserializerMap.put("managedServiceIdentity", (n) -> { this.setManagedServiceIdentity(n.getObjectValue(ManagedIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceDisplayName", (n) -> { this.setResourceDisplayName(n.getStringValue()); });
        deserializerMap.put("resourceId", (n) -> { this.setResourceId(n.getStringValue()); });
        deserializerMap.put("servicePrincipalId", (n) -> { this.setServicePrincipalId(n.getStringValue()); });
        deserializerMap.put("servicePrincipalName", (n) -> { this.setServicePrincipalName(n.getStringValue()); });
        deserializerMap.put("signInCount", (n) -> { this.setSignInCount(n.getLongValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getObjectValue(SignInStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the firstSignInDateTime property value. The earliest sign-in event included in this summary. This property always represents the entire day. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFirstSignInDateTime() {
        return this.backingStore.get("firstSignInDateTime");
    }
    /**
     * Gets the ipAddress property value. The IP address a user or autonomous agent used to reach a resource provider, used to determine Conditional Access compliance for some policies. For example, when a user interacts with Exchange Online, the IP address that Microsoft Exchange receives from the user can be recorded here. This value is often null. Supports $filter (eq, startswith).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIpAddress() {
        return this.backingStore.get("ipAddress");
    }
    /**
     * Gets the managedServiceIdentity property value. Contains information about the managed identity used for the sign in, including its type, associated Azure Resource Manager resource ID, and federated token information. Supports $filter (eq) for msiType.
     * @return a {@link ManagedIdentity}
     */
    @jakarta.annotation.Nullable
    public ManagedIdentity getManagedServiceIdentity() {
        return this.backingStore.get("managedServiceIdentity");
    }
    /**
     * Gets the resourceDisplayName property value. The name of the resource that the user signed in to. Supports $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceDisplayName() {
        return this.backingStore.get("resourceDisplayName");
    }
    /**
     * Gets the resourceId property value. The application identifier of the resource application that the user signed in to. Supports $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceId() {
        return this.backingStore.get("resourceId");
    }
    /**
     * Gets the servicePrincipalId property value. The application identifier of the specific service principal instance of the application identifier used for sign-in. This field is populated when you&apos;re signing in using an application and is different than the appId property. Supports $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getServicePrincipalId() {
        return this.backingStore.get("servicePrincipalId");
    }
    /**
     * Gets the servicePrincipalName property value. The application name used for sign-in. This field is populated when you&apos;re signing in using an application. Supports $filter (eq, startswith).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getServicePrincipalName() {
        return this.backingStore.get("servicePrincipalName");
    }
    /**
     * Gets the signInCount property value. The total number of sign-in events included in the summary.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getSignInCount() {
        return this.backingStore.get("signInCount");
    }
    /**
     * Gets the status property value. The sign-in status. Includes the error code and description of the error (for a sign-in failure). Supports $filter (eq) for errorCode.
     * @return a {@link SignInStatus}
     */
    @jakarta.annotation.Nullable
    public SignInStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the tenantId property value. The tenant identifier of the user initiating the sign-in. Supports $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.backingStore.get("tenantId");
    }
    /**
     * Gets the userPrincipalName property value. User principal name of the user that initiated the sign-in. This value is always in lowercase. For guest users whose values in the user object typically contain #EXT# before the domain part, this property stores the value in both lowercase and the &apos;true&apos; format. For example, while the user object stores AdeleVance_fabrikam.com#EXT#@contoso.com, the sign-in logs store adelevance@fabrikam.com. Supports $filter (eq).
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
        super.serialize(writer);
        writer.writeObjectValue("agent", this.getAgent());
        writer.writeOffsetDateTimeValue("aggregationDateTime", this.getAggregationDateTime());
        writer.writeStringValue("appDisplayName", this.getAppDisplayName());
        writer.writeStringValue("appId", this.getAppId());
        writer.writeEnumValue("conditionalAccessStatus", this.getConditionalAccessStatus());
        writer.writeOffsetDateTimeValue("firstSignInDateTime", this.getFirstSignInDateTime());
        writer.writeStringValue("ipAddress", this.getIpAddress());
        writer.writeObjectValue("managedServiceIdentity", this.getManagedServiceIdentity());
        writer.writeStringValue("resourceDisplayName", this.getResourceDisplayName());
        writer.writeStringValue("resourceId", this.getResourceId());
        writer.writeStringValue("servicePrincipalId", this.getServicePrincipalId());
        writer.writeStringValue("servicePrincipalName", this.getServicePrincipalName());
        writer.writeLongValue("signInCount", this.getSignInCount());
        writer.writeObjectValue("status", this.getStatus());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the agent property value. Represents details about the agentic sign-in. Includes the type of agent as well as parent appId in some cases. Supports $filter (eq) for agentType.
     * @param value Value to set for the agent property.
     */
    public void setAgent(@jakarta.annotation.Nullable final AgentSignIn value) {
        this.backingStore.set("agent", value);
    }
    /**
     * Sets the aggregationDateTime property value. The aggregated day for which the summary applies to. This property always represents the entire day. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the aggregationDateTime property.
     */
    public void setAggregationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("aggregationDateTime", value);
    }
    /**
     * Sets the appDisplayName property value. The application name displayed in the Microsoft Entra admin center. Supports $filter (eq).
     * @param value Value to set for the appDisplayName property.
     */
    public void setAppDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appDisplayName", value);
    }
    /**
     * Sets the appId property value. The application identifier (client ID) in Microsoft Entra ID. Supports $filter (eq).
     * @param value Value to set for the appId property.
     */
    public void setAppId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appId", value);
    }
    /**
     * Sets the conditionalAccessStatus property value. The status of the conditional access policy triggered. The possible values are: success, failure, notApplied, unknownFutureValue. Supports $filter (eq).
     * @param value Value to set for the conditionalAccessStatus property.
     */
    public void setConditionalAccessStatus(@jakarta.annotation.Nullable final ConditionalAccessStatus value) {
        this.backingStore.set("conditionalAccessStatus", value);
    }
    /**
     * Sets the firstSignInDateTime property value. The earliest sign-in event included in this summary. This property always represents the entire day. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the firstSignInDateTime property.
     */
    public void setFirstSignInDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("firstSignInDateTime", value);
    }
    /**
     * Sets the ipAddress property value. The IP address a user or autonomous agent used to reach a resource provider, used to determine Conditional Access compliance for some policies. For example, when a user interacts with Exchange Online, the IP address that Microsoft Exchange receives from the user can be recorded here. This value is often null. Supports $filter (eq, startswith).
     * @param value Value to set for the ipAddress property.
     */
    public void setIpAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ipAddress", value);
    }
    /**
     * Sets the managedServiceIdentity property value. Contains information about the managed identity used for the sign in, including its type, associated Azure Resource Manager resource ID, and federated token information. Supports $filter (eq) for msiType.
     * @param value Value to set for the managedServiceIdentity property.
     */
    public void setManagedServiceIdentity(@jakarta.annotation.Nullable final ManagedIdentity value) {
        this.backingStore.set("managedServiceIdentity", value);
    }
    /**
     * Sets the resourceDisplayName property value. The name of the resource that the user signed in to. Supports $filter (eq).
     * @param value Value to set for the resourceDisplayName property.
     */
    public void setResourceDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceDisplayName", value);
    }
    /**
     * Sets the resourceId property value. The application identifier of the resource application that the user signed in to. Supports $filter (eq).
     * @param value Value to set for the resourceId property.
     */
    public void setResourceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceId", value);
    }
    /**
     * Sets the servicePrincipalId property value. The application identifier of the specific service principal instance of the application identifier used for sign-in. This field is populated when you&apos;re signing in using an application and is different than the appId property. Supports $filter (eq).
     * @param value Value to set for the servicePrincipalId property.
     */
    public void setServicePrincipalId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("servicePrincipalId", value);
    }
    /**
     * Sets the servicePrincipalName property value. The application name used for sign-in. This field is populated when you&apos;re signing in using an application. Supports $filter (eq, startswith).
     * @param value Value to set for the servicePrincipalName property.
     */
    public void setServicePrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("servicePrincipalName", value);
    }
    /**
     * Sets the signInCount property value. The total number of sign-in events included in the summary.
     * @param value Value to set for the signInCount property.
     */
    public void setSignInCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("signInCount", value);
    }
    /**
     * Sets the status property value. The sign-in status. Includes the error code and description of the error (for a sign-in failure). Supports $filter (eq) for errorCode.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final SignInStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the tenantId property value. The tenant identifier of the user initiating the sign-in. Supports $filter (eq).
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantId", value);
    }
    /**
     * Sets the userPrincipalName property value. User principal name of the user that initiated the sign-in. This value is always in lowercase. For guest users whose values in the user object typically contain #EXT# before the domain part, this property stores the value in both lowercase and the &apos;true&apos; format. For example, while the user object stores AdeleVance_fabrikam.com#EXT#@contoso.com, the sign-in logs store adelevance@fabrikam.com. Supports $filter (eq).
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalName", value);
    }
}
