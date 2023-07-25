package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A class containing the properties for Audit Actor.
 */
public class AuditActor implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Name of the Application.
     */
    private String applicationDisplayName;
    /**
     * AAD Application Id.
     */
    private String applicationId;
    /**
     * Actor Type.
     */
    private String auditActorType;
    /**
     * IPAddress.
     */
    private String ipAddress;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Remote Tenant Id
     */
    private String remoteTenantId;
    /**
     * Remote User Id
     */
    private String remoteUserId;
    /**
     * Service Principal Name (SPN).
     */
    private String servicePrincipalName;
    /**
     * Actor Type.
     */
    private String type;
    /**
     * User Id.
     */
    private String userId;
    /**
     * List of user permissions when the audit was performed.
     */
    private java.util.List<String> userPermissions;
    /**
     * User Principal Name (UPN).
     */
    private String userPrincipalName;
    /**
     * List of user scope tags when the audit was performed.
     */
    private java.util.List<RoleScopeTagInfo> userRoleScopeTags;
    /**
     * Instantiates a new auditActor and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AuditActor() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a auditActor
     */
    @javax.annotation.Nonnull
    public static AuditActor createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuditActor();
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
     * Gets the applicationDisplayName property value. Name of the Application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApplicationDisplayName() {
        return this.applicationDisplayName;
    }
    /**
     * Gets the applicationId property value. AAD Application Id.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApplicationId() {
        return this.applicationId;
    }
    /**
     * Gets the auditActorType property value. Actor Type.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAuditActorType() {
        return this.auditActorType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("applicationDisplayName", (n) -> { this.setApplicationDisplayName(n.getStringValue()); });
        deserializerMap.put("applicationId", (n) -> { this.setApplicationId(n.getStringValue()); });
        deserializerMap.put("auditActorType", (n) -> { this.setAuditActorType(n.getStringValue()); });
        deserializerMap.put("ipAddress", (n) -> { this.setIpAddress(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("remoteTenantId", (n) -> { this.setRemoteTenantId(n.getStringValue()); });
        deserializerMap.put("remoteUserId", (n) -> { this.setRemoteUserId(n.getStringValue()); });
        deserializerMap.put("servicePrincipalName", (n) -> { this.setServicePrincipalName(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("userPermissions", (n) -> { this.setUserPermissions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("userRoleScopeTags", (n) -> { this.setUserRoleScopeTags(n.getCollectionOfObjectValues(RoleScopeTagInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the ipAddress property value. IPAddress.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIpAddress() {
        return this.ipAddress;
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
     * Gets the remoteTenantId property value. Remote Tenant Id
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRemoteTenantId() {
        return this.remoteTenantId;
    }
    /**
     * Gets the remoteUserId property value. Remote User Id
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRemoteUserId() {
        return this.remoteUserId;
    }
    /**
     * Gets the servicePrincipalName property value. Service Principal Name (SPN).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServicePrincipalName() {
        return this.servicePrincipalName;
    }
    /**
     * Gets the type property value. Actor Type.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this.type;
    }
    /**
     * Gets the userId property value. User Id.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Gets the userPermissions property value. List of user permissions when the audit was performed.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getUserPermissions() {
        return this.userPermissions;
    }
    /**
     * Gets the userPrincipalName property value. User Principal Name (UPN).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }
    /**
     * Gets the userRoleScopeTags property value. List of user scope tags when the audit was performed.
     * @return a roleScopeTagInfo
     */
    @javax.annotation.Nullable
    public java.util.List<RoleScopeTagInfo> getUserRoleScopeTags() {
        return this.userRoleScopeTags;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("applicationDisplayName", this.getApplicationDisplayName());
        writer.writeStringValue("applicationId", this.getApplicationId());
        writer.writeStringValue("auditActorType", this.getAuditActorType());
        writer.writeStringValue("ipAddress", this.getIpAddress());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("remoteTenantId", this.getRemoteTenantId());
        writer.writeStringValue("remoteUserId", this.getRemoteUserId());
        writer.writeStringValue("servicePrincipalName", this.getServicePrincipalName());
        writer.writeStringValue("type", this.getType());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeCollectionOfPrimitiveValues("userPermissions", this.getUserPermissions());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
        writer.writeCollectionOfObjectValues("userRoleScopeTags", this.getUserRoleScopeTags());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the applicationDisplayName property value. Name of the Application.
     * @param value Value to set for the applicationDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationDisplayName(@javax.annotation.Nullable final String value) {
        this.applicationDisplayName = value;
    }
    /**
     * Sets the applicationId property value. AAD Application Id.
     * @param value Value to set for the applicationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationId(@javax.annotation.Nullable final String value) {
        this.applicationId = value;
    }
    /**
     * Sets the auditActorType property value. Actor Type.
     * @param value Value to set for the auditActorType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuditActorType(@javax.annotation.Nullable final String value) {
        this.auditActorType = value;
    }
    /**
     * Sets the ipAddress property value. IPAddress.
     * @param value Value to set for the ipAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIpAddress(@javax.annotation.Nullable final String value) {
        this.ipAddress = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the remoteTenantId property value. Remote Tenant Id
     * @param value Value to set for the remoteTenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemoteTenantId(@javax.annotation.Nullable final String value) {
        this.remoteTenantId = value;
    }
    /**
     * Sets the remoteUserId property value. Remote User Id
     * @param value Value to set for the remoteUserId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemoteUserId(@javax.annotation.Nullable final String value) {
        this.remoteUserId = value;
    }
    /**
     * Sets the servicePrincipalName property value. Service Principal Name (SPN).
     * @param value Value to set for the servicePrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServicePrincipalName(@javax.annotation.Nullable final String value) {
        this.servicePrincipalName = value;
    }
    /**
     * Sets the type property value. Actor Type.
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final String value) {
        this.type = value;
    }
    /**
     * Sets the userId property value. User Id.
     * @param value Value to set for the userId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserId(@javax.annotation.Nullable final String value) {
        this.userId = value;
    }
    /**
     * Sets the userPermissions property value. List of user permissions when the audit was performed.
     * @param value Value to set for the userPermissions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPermissions(@javax.annotation.Nullable final java.util.List<String> value) {
        this.userPermissions = value;
    }
    /**
     * Sets the userPrincipalName property value. User Principal Name (UPN).
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
    /**
     * Sets the userRoleScopeTags property value. List of user scope tags when the audit was performed.
     * @param value Value to set for the userRoleScopeTags property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserRoleScopeTags(@javax.annotation.Nullable final java.util.List<RoleScopeTagInfo> value) {
        this.userRoleScopeTags = value;
    }
}
