package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrivilegedOperationEvent extends Entity implements Parsable {
    /**
     * The additionalInformation property
     */
    private String additionalInformation;
    /**
     * The creationDateTime property
     */
    private OffsetDateTime creationDateTime;
    /**
     * The expirationDateTime property
     */
    private OffsetDateTime expirationDateTime;
    /**
     * The referenceKey property
     */
    private String referenceKey;
    /**
     * The referenceSystem property
     */
    private String referenceSystem;
    /**
     * The requestorId property
     */
    private String requestorId;
    /**
     * The requestorName property
     */
    private String requestorName;
    /**
     * The requestType property
     */
    private String requestType;
    /**
     * The roleId property
     */
    private String roleId;
    /**
     * The roleName property
     */
    private String roleName;
    /**
     * The tenantId property
     */
    private String tenantId;
    /**
     * The userId property
     */
    private String userId;
    /**
     * The userMail property
     */
    private String userMail;
    /**
     * The userName property
     */
    private String userName;
    /**
     * Instantiates a new privilegedOperationEvent and sets the default values.
     */
    public PrivilegedOperationEvent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a privilegedOperationEvent
     */
    @jakarta.annotation.Nonnull
    public static PrivilegedOperationEvent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivilegedOperationEvent();
    }
    /**
     * Gets the additionalInformation property value. The additionalInformation property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAdditionalInformation() {
        return this.additionalInformation;
    }
    /**
     * Gets the creationDateTime property value. The creationDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreationDateTime() {
        return this.creationDateTime;
    }
    /**
     * Gets the expirationDateTime property value. The expirationDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
    @jakarta.annotation.Nullable
    public String getReferenceKey() {
        return this.referenceKey;
    }
    /**
     * Gets the referenceSystem property value. The referenceSystem property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getReferenceSystem() {
        return this.referenceSystem;
    }
    /**
     * Gets the requestorId property value. The requestorId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRequestorId() {
        return this.requestorId;
    }
    /**
     * Gets the requestorName property value. The requestorName property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRequestorName() {
        return this.requestorName;
    }
    /**
     * Gets the requestType property value. The requestType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRequestType() {
        return this.requestType;
    }
    /**
     * Gets the roleId property value. The roleId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRoleId() {
        return this.roleId;
    }
    /**
     * Gets the roleName property value. The roleName property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRoleName() {
        return this.roleName;
    }
    /**
     * Gets the tenantId property value. The tenantId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Gets the userId property value. The userId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Gets the userMail property value. The userMail property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserMail() {
        return this.userMail;
    }
    /**
     * Gets the userName property value. The userName property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserName() {
        return this.userName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAdditionalInformation(@jakarta.annotation.Nullable final String value) {
        this.additionalInformation = value;
    }
    /**
     * Sets the creationDateTime property value. The creationDateTime property
     * @param value Value to set for the creationDateTime property.
     */
    public void setCreationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.creationDateTime = value;
    }
    /**
     * Sets the expirationDateTime property value. The expirationDateTime property
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.expirationDateTime = value;
    }
    /**
     * Sets the referenceKey property value. The referenceKey property
     * @param value Value to set for the referenceKey property.
     */
    public void setReferenceKey(@jakarta.annotation.Nullable final String value) {
        this.referenceKey = value;
    }
    /**
     * Sets the referenceSystem property value. The referenceSystem property
     * @param value Value to set for the referenceSystem property.
     */
    public void setReferenceSystem(@jakarta.annotation.Nullable final String value) {
        this.referenceSystem = value;
    }
    /**
     * Sets the requestorId property value. The requestorId property
     * @param value Value to set for the requestorId property.
     */
    public void setRequestorId(@jakarta.annotation.Nullable final String value) {
        this.requestorId = value;
    }
    /**
     * Sets the requestorName property value. The requestorName property
     * @param value Value to set for the requestorName property.
     */
    public void setRequestorName(@jakarta.annotation.Nullable final String value) {
        this.requestorName = value;
    }
    /**
     * Sets the requestType property value. The requestType property
     * @param value Value to set for the requestType property.
     */
    public void setRequestType(@jakarta.annotation.Nullable final String value) {
        this.requestType = value;
    }
    /**
     * Sets the roleId property value. The roleId property
     * @param value Value to set for the roleId property.
     */
    public void setRoleId(@jakarta.annotation.Nullable final String value) {
        this.roleId = value;
    }
    /**
     * Sets the roleName property value. The roleName property
     * @param value Value to set for the roleName property.
     */
    public void setRoleName(@jakarta.annotation.Nullable final String value) {
        this.roleName = value;
    }
    /**
     * Sets the tenantId property value. The tenantId property
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.tenantId = value;
    }
    /**
     * Sets the userId property value. The userId property
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
    /**
     * Sets the userMail property value. The userMail property
     * @param value Value to set for the userMail property.
     */
    public void setUserMail(@jakarta.annotation.Nullable final String value) {
        this.userMail = value;
    }
    /**
     * Sets the userName property value. The userName property
     * @param value Value to set for the userName property.
     */
    public void setUserName(@jakarta.annotation.Nullable final String value) {
        this.userName = value;
    }
}
