package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrivilegedOperationEvent extends Entity implements Parsable {
    /** Detailed human readable information for the event. */
    private String _additionalInformation;
    /** Indicates the time when the event is created. */
    private OffsetDateTime _creationDateTime;
    /** This is only used when the requestType is Activate, and it indicates the expiration time for the role activation. */
    private OffsetDateTime _expirationDateTime;
    /** Incident/Request ticket number during role activation. The value is presented only if the ticket number is provided during role activation. */
    private String _referenceKey;
    /** Incident/Request ticketing system provided during tole activation. The value is presented only if the ticket system is provided during role activation. */
    private String _referenceSystem;
    /** The user id of the requestor who initiates the operation. */
    private String _requestorId;
    /** The user name of the requestor who initiates the operation. */
    private String _requestorName;
    /** The request operation type. The requestType value can be: Assign (role assignment), Activate (role activation), Unassign (remove role assignment), Deactivate (role deactivation), ScanAlertsNow (scan security alerts), DismissAlert (dismiss security alert), FixAlertItem (fix a security alert issue),  AccessReview_Review (review an Access Review), AccessReview_Create (create an Access Review) , AccessReview_Update (update an Access Review), AccessReview_Delete (delete an Access Review). */
    private String _requestType;
    /** The id of the role that is associated with the operation. */
    private String _roleId;
    /** The name of the role. */
    private String _roleName;
    /** The tenant (organization) id. */
    private String _tenantId;
    /** The id of the user that is associated with the operation. */
    private String _userId;
    /** The user's email. */
    private String _userMail;
    /** The user's display name. */
    private String _userName;
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
     * Gets the additionalInformation property value. Detailed human readable information for the event.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAdditionalInformation() {
        return this._additionalInformation;
    }
    /**
     * Gets the creationDateTime property value. Indicates the time when the event is created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreationDateTime() {
        return this._creationDateTime;
    }
    /**
     * Gets the expirationDateTime property value. This is only used when the requestType is Activate, and it indicates the expiration time for the role activation.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this._expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
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
     * Gets the referenceKey property value. Incident/Request ticket number during role activation. The value is presented only if the ticket number is provided during role activation.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReferenceKey() {
        return this._referenceKey;
    }
    /**
     * Gets the referenceSystem property value. Incident/Request ticketing system provided during tole activation. The value is presented only if the ticket system is provided during role activation.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReferenceSystem() {
        return this._referenceSystem;
    }
    /**
     * Gets the requestorId property value. The user id of the requestor who initiates the operation.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRequestorId() {
        return this._requestorId;
    }
    /**
     * Gets the requestorName property value. The user name of the requestor who initiates the operation.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRequestorName() {
        return this._requestorName;
    }
    /**
     * Gets the requestType property value. The request operation type. The requestType value can be: Assign (role assignment), Activate (role activation), Unassign (remove role assignment), Deactivate (role deactivation), ScanAlertsNow (scan security alerts), DismissAlert (dismiss security alert), FixAlertItem (fix a security alert issue),  AccessReview_Review (review an Access Review), AccessReview_Create (create an Access Review) , AccessReview_Update (update an Access Review), AccessReview_Delete (delete an Access Review).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRequestType() {
        return this._requestType;
    }
    /**
     * Gets the roleId property value. The id of the role that is associated with the operation.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoleId() {
        return this._roleId;
    }
    /**
     * Gets the roleName property value. The name of the role.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoleName() {
        return this._roleName;
    }
    /**
     * Gets the tenantId property value. The tenant (organization) id.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this._tenantId;
    }
    /**
     * Gets the userId property value. The id of the user that is associated with the operation.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this._userId;
    }
    /**
     * Gets the userMail property value. The user's email.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserMail() {
        return this._userMail;
    }
    /**
     * Gets the userName property value. The user's display name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserName() {
        return this._userName;
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
     * Sets the additionalInformation property value. Detailed human readable information for the event.
     * @param value Value to set for the additionalInformation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalInformation(@javax.annotation.Nullable final String value) {
        this._additionalInformation = value;
    }
    /**
     * Sets the creationDateTime property value. Indicates the time when the event is created.
     * @param value Value to set for the creationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._creationDateTime = value;
    }
    /**
     * Sets the expirationDateTime property value. This is only used when the requestType is Activate, and it indicates the expiration time for the role activation.
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expirationDateTime = value;
    }
    /**
     * Sets the referenceKey property value. Incident/Request ticket number during role activation. The value is presented only if the ticket number is provided during role activation.
     * @param value Value to set for the referenceKey property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReferenceKey(@javax.annotation.Nullable final String value) {
        this._referenceKey = value;
    }
    /**
     * Sets the referenceSystem property value. Incident/Request ticketing system provided during tole activation. The value is presented only if the ticket system is provided during role activation.
     * @param value Value to set for the referenceSystem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReferenceSystem(@javax.annotation.Nullable final String value) {
        this._referenceSystem = value;
    }
    /**
     * Sets the requestorId property value. The user id of the requestor who initiates the operation.
     * @param value Value to set for the requestorId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequestorId(@javax.annotation.Nullable final String value) {
        this._requestorId = value;
    }
    /**
     * Sets the requestorName property value. The user name of the requestor who initiates the operation.
     * @param value Value to set for the requestorName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequestorName(@javax.annotation.Nullable final String value) {
        this._requestorName = value;
    }
    /**
     * Sets the requestType property value. The request operation type. The requestType value can be: Assign (role assignment), Activate (role activation), Unassign (remove role assignment), Deactivate (role deactivation), ScanAlertsNow (scan security alerts), DismissAlert (dismiss security alert), FixAlertItem (fix a security alert issue),  AccessReview_Review (review an Access Review), AccessReview_Create (create an Access Review) , AccessReview_Update (update an Access Review), AccessReview_Delete (delete an Access Review).
     * @param value Value to set for the requestType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequestType(@javax.annotation.Nullable final String value) {
        this._requestType = value;
    }
    /**
     * Sets the roleId property value. The id of the role that is associated with the operation.
     * @param value Value to set for the roleId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleId(@javax.annotation.Nullable final String value) {
        this._roleId = value;
    }
    /**
     * Sets the roleName property value. The name of the role.
     * @param value Value to set for the roleName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleName(@javax.annotation.Nullable final String value) {
        this._roleName = value;
    }
    /**
     * Sets the tenantId property value. The tenant (organization) id.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this._tenantId = value;
    }
    /**
     * Sets the userId property value. The id of the user that is associated with the operation.
     * @param value Value to set for the userId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
    /**
     * Sets the userMail property value. The user's email.
     * @param value Value to set for the userMail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserMail(@javax.annotation.Nullable final String value) {
        this._userMail = value;
    }
    /**
     * Sets the userName property value. The user's display name.
     * @param value Value to set for the userName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserName(@javax.annotation.Nullable final String value) {
        this._userName = value;
    }
}
