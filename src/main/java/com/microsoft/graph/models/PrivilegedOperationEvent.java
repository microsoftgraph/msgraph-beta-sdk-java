package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrivilegedOperationEvent extends Entity implements Parsable {
    /** The additionalInformation property */
    private String additionalInformation;
    /** The creationDateTime property */
    private OffsetDateTime creationDateTime;
    /** The expirationDateTime property */
    private OffsetDateTime expirationDateTime;
    /** The referenceKey property */
    private String referenceKey;
    /** The referenceSystem property */
    private String referenceSystem;
    /** The requestorId property */
    private String requestorId;
    /** The requestorName property */
    private String requestorName;
    /** The requestType property */
    private String requestType;
    /** The roleId property */
    private String roleId;
    /** The roleName property */
    private String roleName;
    /** The tenantId property */
    private String tenantId;
    /** The userId property */
    private String userId;
    /** The userMail property */
    private String userMail;
    /** The userName property */
    private String userName;
    /**
     * Instantiates a new PrivilegedOperationEvent and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PrivilegedOperationEvent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PrivilegedOperationEvent
     */
    @javax.annotation.Nonnull
    public static PrivilegedOperationEvent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivilegedOperationEvent();
    }
    /**
     * Gets the additionalInformation property value. The additionalInformation property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAdditionalInformation() {
        return this.additionalInformation;
    }
    /**
     * Gets the creationDateTime property value. The creationDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreationDateTime() {
        return this.creationDateTime;
    }
    /**
     * Gets the expirationDateTime property value. The expirationDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("additionalInformation", (n) -> { this.setAdditionalInformation(n.getStringValue()); });
        deserializerMap.put("creationDateTime", (n) -> { this.setCreationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("referenceKey", (n) -> { this.setReferenceKey(n.getStringValue()); });
        deserializerMap.put("referenceSystem", (n) -> { this.setReferenceSystem(n.getStringValue()); });
        deserializerMap.put("requestorId", (n) -> { this.setRequestorId(n.getStringValue()); });
        deserializerMap.put("requestorName", (n) -> { this.setRequestorName(n.getStringValue()); });
        deserializerMap.put("requestType", (n) -> { this.setRequestType(n.getStringValue()); });
        deserializerMap.put("roleId", (n) -> { this.setRoleId(n.getStringValue()); });
        deserializerMap.put("roleName", (n) -> { this.setRoleName(n.getStringValue()); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("userMail", (n) -> { this.setUserMail(n.getStringValue()); });
        deserializerMap.put("userName", (n) -> { this.setUserName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the referenceKey property value. The referenceKey property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReferenceKey() {
        return this.referenceKey;
    }
    /**
     * Gets the referenceSystem property value. The referenceSystem property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReferenceSystem() {
        return this.referenceSystem;
    }
    /**
     * Gets the requestorId property value. The requestorId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRequestorId() {
        return this.requestorId;
    }
    /**
     * Gets the requestorName property value. The requestorName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRequestorName() {
        return this.requestorName;
    }
    /**
     * Gets the requestType property value. The requestType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRequestType() {
        return this.requestType;
    }
    /**
     * Gets the roleId property value. The roleId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoleId() {
        return this.roleId;
    }
    /**
     * Gets the roleName property value. The roleName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoleName() {
        return this.roleName;
    }
    /**
     * Gets the tenantId property value. The tenantId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Gets the userId property value. The userId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Gets the userMail property value. The userMail property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserMail() {
        return this.userMail;
    }
    /**
     * Gets the userName property value. The userName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserName() {
        return this.userName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("additionalInformation", this.getAdditionalInformation());
        writer.writeOffsetDateTimeValue("creationDateTime", this.getCreationDateTime());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeStringValue("referenceKey", this.getReferenceKey());
        writer.writeStringValue("referenceSystem", this.getReferenceSystem());
        writer.writeStringValue("requestorId", this.getRequestorId());
        writer.writeStringValue("requestorName", this.getRequestorName());
        writer.writeStringValue("requestType", this.getRequestType());
        writer.writeStringValue("roleId", this.getRoleId());
        writer.writeStringValue("roleName", this.getRoleName());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("userMail", this.getUserMail());
        writer.writeStringValue("userName", this.getUserName());
    }
    /**
     * Sets the additionalInformation property value. The additionalInformation property
     * @param value Value to set for the additionalInformation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalInformation(@javax.annotation.Nullable final String value) {
        this.additionalInformation = value;
    }
    /**
     * Sets the creationDateTime property value. The creationDateTime property
     * @param value Value to set for the creationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.creationDateTime = value;
    }
    /**
     * Sets the expirationDateTime property value. The expirationDateTime property
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.expirationDateTime = value;
    }
    /**
     * Sets the referenceKey property value. The referenceKey property
     * @param value Value to set for the referenceKey property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReferenceKey(@javax.annotation.Nullable final String value) {
        this.referenceKey = value;
    }
    /**
     * Sets the referenceSystem property value. The referenceSystem property
     * @param value Value to set for the referenceSystem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReferenceSystem(@javax.annotation.Nullable final String value) {
        this.referenceSystem = value;
    }
    /**
     * Sets the requestorId property value. The requestorId property
     * @param value Value to set for the requestorId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequestorId(@javax.annotation.Nullable final String value) {
        this.requestorId = value;
    }
    /**
     * Sets the requestorName property value. The requestorName property
     * @param value Value to set for the requestorName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequestorName(@javax.annotation.Nullable final String value) {
        this.requestorName = value;
    }
    /**
     * Sets the requestType property value. The requestType property
     * @param value Value to set for the requestType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequestType(@javax.annotation.Nullable final String value) {
        this.requestType = value;
    }
    /**
     * Sets the roleId property value. The roleId property
     * @param value Value to set for the roleId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleId(@javax.annotation.Nullable final String value) {
        this.roleId = value;
    }
    /**
     * Sets the roleName property value. The roleName property
     * @param value Value to set for the roleName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleName(@javax.annotation.Nullable final String value) {
        this.roleName = value;
    }
    /**
     * Sets the tenantId property value. The tenantId property
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this.tenantId = value;
    }
    /**
     * Sets the userId property value. The userId property
     * @param value Value to set for the userId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserId(@javax.annotation.Nullable final String value) {
        this.userId = value;
    }
    /**
     * Sets the userMail property value. The userMail property
     * @param value Value to set for the userMail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserMail(@javax.annotation.Nullable final String value) {
        this.userMail = value;
    }
    /**
     * Sets the userName property value. The userName property
     * @param value Value to set for the userName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserName(@javax.annotation.Nullable final String value) {
        this.userName = value;
    }
}
