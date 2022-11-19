package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** A class containing the properties for Audit Actor. */
public class AuditActor implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Name of the Application. */
    private String _applicationDisplayName;
    /** AAD Application Id. */
    private String _applicationId;
    /** Actor Type. */
    private String _auditActorType;
    /** IPAddress. */
    private String _ipAddress;
    /** The OdataType property */
    private String _odataType;
    /** Remote Tenant Id */
    private String _remoteTenantId;
    /** Remote User Id */
    private String _remoteUserId;
    /** Service Principal Name (SPN). */
    private String _servicePrincipalName;
    /** Actor Type. */
    private String _type;
    /** User Id. */
    private String _userId;
    /** List of user permissions when the audit was performed. */
    private java.util.List<String> _userPermissions;
    /** User Principal Name (UPN). */
    private String _userPrincipalName;
    /** List of user scope tags when the audit was performed. */
    private java.util.List<RoleScopeTagInfo> _userRoleScopeTags;
    /**
     * Instantiates a new auditActor and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AuditActor() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.auditActor");
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
        return this._additionalData;
    }
    /**
     * Gets the applicationDisplayName property value. Name of the Application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApplicationDisplayName() {
        return this._applicationDisplayName;
    }
    /**
     * Gets the applicationId property value. AAD Application Id.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApplicationId() {
        return this._applicationId;
    }
    /**
     * Gets the auditActorType property value. Actor Type.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAuditActorType() {
        return this._auditActorType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AuditActor currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(13);
        deserializerMap.put("applicationDisplayName", (n) -> { currentObject.setApplicationDisplayName(n.getStringValue()); });
        deserializerMap.put("applicationId", (n) -> { currentObject.setApplicationId(n.getStringValue()); });
        deserializerMap.put("auditActorType", (n) -> { currentObject.setAuditActorType(n.getStringValue()); });
        deserializerMap.put("ipAddress", (n) -> { currentObject.setIpAddress(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("remoteTenantId", (n) -> { currentObject.setRemoteTenantId(n.getStringValue()); });
        deserializerMap.put("remoteUserId", (n) -> { currentObject.setRemoteUserId(n.getStringValue()); });
        deserializerMap.put("servicePrincipalName", (n) -> { currentObject.setServicePrincipalName(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { currentObject.setType(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { currentObject.setUserId(n.getStringValue()); });
        deserializerMap.put("userPermissions", (n) -> { currentObject.setUserPermissions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("userRoleScopeTags", (n) -> { currentObject.setUserRoleScopeTags(n.getCollectionOfObjectValues(RoleScopeTagInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the ipAddress property value. IPAddress.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIpAddress() {
        return this._ipAddress;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the remoteTenantId property value. Remote Tenant Id
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRemoteTenantId() {
        return this._remoteTenantId;
    }
    /**
     * Gets the remoteUserId property value. Remote User Id
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRemoteUserId() {
        return this._remoteUserId;
    }
    /**
     * Gets the servicePrincipalName property value. Service Principal Name (SPN).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServicePrincipalName() {
        return this._servicePrincipalName;
    }
    /**
     * Gets the type property value. Actor Type.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this._type;
    }
    /**
     * Gets the userId property value. User Id.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this._userId;
    }
    /**
     * Gets the userPermissions property value. List of user permissions when the audit was performed.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getUserPermissions() {
        return this._userPermissions;
    }
    /**
     * Gets the userPrincipalName property value. User Principal Name (UPN).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this._userPrincipalName;
    }
    /**
     * Gets the userRoleScopeTags property value. List of user scope tags when the audit was performed.
     * @return a roleScopeTagInfo
     */
    @javax.annotation.Nullable
    public java.util.List<RoleScopeTagInfo> getUserRoleScopeTags() {
        return this._userRoleScopeTags;
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the applicationDisplayName property value. Name of the Application.
     * @param value Value to set for the applicationDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationDisplayName(@javax.annotation.Nullable final String value) {
        this._applicationDisplayName = value;
    }
    /**
     * Sets the applicationId property value. AAD Application Id.
     * @param value Value to set for the applicationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationId(@javax.annotation.Nullable final String value) {
        this._applicationId = value;
    }
    /**
     * Sets the auditActorType property value. Actor Type.
     * @param value Value to set for the auditActorType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuditActorType(@javax.annotation.Nullable final String value) {
        this._auditActorType = value;
    }
    /**
     * Sets the ipAddress property value. IPAddress.
     * @param value Value to set for the ipAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIpAddress(@javax.annotation.Nullable final String value) {
        this._ipAddress = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the remoteTenantId property value. Remote Tenant Id
     * @param value Value to set for the remoteTenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemoteTenantId(@javax.annotation.Nullable final String value) {
        this._remoteTenantId = value;
    }
    /**
     * Sets the remoteUserId property value. Remote User Id
     * @param value Value to set for the remoteUserId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemoteUserId(@javax.annotation.Nullable final String value) {
        this._remoteUserId = value;
    }
    /**
     * Sets the servicePrincipalName property value. Service Principal Name (SPN).
     * @param value Value to set for the servicePrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServicePrincipalName(@javax.annotation.Nullable final String value) {
        this._servicePrincipalName = value;
    }
    /**
     * Sets the type property value. Actor Type.
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final String value) {
        this._type = value;
    }
    /**
     * Sets the userId property value. User Id.
     * @param value Value to set for the userId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
    /**
     * Sets the userPermissions property value. List of user permissions when the audit was performed.
     * @param value Value to set for the userPermissions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPermissions(@javax.annotation.Nullable final java.util.List<String> value) {
        this._userPermissions = value;
    }
    /**
     * Sets the userPrincipalName property value. User Principal Name (UPN).
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
    /**
     * Sets the userRoleScopeTags property value. List of user scope tags when the audit was performed.
     * @param value Value to set for the userRoleScopeTags property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserRoleScopeTags(@javax.annotation.Nullable final java.util.List<RoleScopeTagInfo> value) {
        this._userRoleScopeTags = value;
    }
}
