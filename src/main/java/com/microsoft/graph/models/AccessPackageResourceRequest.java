package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessPackageResourceRequest extends Entity implements Parsable {
    /**
     * The accessPackageResource property
     */
    private AccessPackageResource accessPackageResource;
    /**
     * The unique ID of the access package catalog.
     */
    private String catalogId;
    /**
     * The executeImmediately property
     */
    private Boolean executeImmediately;
    /**
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    private OffsetDateTime expirationDateTime;
    /**
     * If set, does not add the resource.
     */
    private Boolean isValidationOnly;
    /**
     * The requestor's justification for adding or removing the resource.
     */
    private String justification;
    /**
     * Read-only. Nullable. Supports $expand.
     */
    private AccessPackageSubject requestor;
    /**
     * The outcome of whether the service was able to add the resource to the catalog.  The value is Delivered if the resource was added or removed. Read-Only.
     */
    private String requestState;
    /**
     * The requestStatus property
     */
    private String requestStatus;
    /**
     * Use AdminAdd to add a resource, if the caller is an administrator or resource owner, AdminUpdate to update a resource, or AdminRemove to remove a resource.
     */
    private String requestType;
    /**
     * Instantiates a new AccessPackageResourceRequest and sets the default values.
     */
    public AccessPackageResourceRequest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessPackageResourceRequest
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageResourceRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageResourceRequest();
    }
    /**
     * Gets the accessPackageResource property value. The accessPackageResource property
     * @return a AccessPackageResource
     */
    @jakarta.annotation.Nullable
    public AccessPackageResource getAccessPackageResource() {
        return this.accessPackageResource;
    }
    /**
     * Gets the catalogId property value. The unique ID of the access package catalog.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCatalogId() {
        return this.catalogId;
    }
    /**
     * Gets the executeImmediately property value. The executeImmediately property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getExecuteImmediately() {
        return this.executeImmediately;
    }
    /**
     * Gets the expirationDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
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
        deserializerMap.put("accessPackageResource", (n) -> { this.setAccessPackageResource(n.getObjectValue(AccessPackageResource::createFromDiscriminatorValue)); });
        deserializerMap.put("catalogId", (n) -> { this.setCatalogId(n.getStringValue()); });
        deserializerMap.put("executeImmediately", (n) -> { this.setExecuteImmediately(n.getBooleanValue()); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("isValidationOnly", (n) -> { this.setIsValidationOnly(n.getBooleanValue()); });
        deserializerMap.put("justification", (n) -> { this.setJustification(n.getStringValue()); });
        deserializerMap.put("requestor", (n) -> { this.setRequestor(n.getObjectValue(AccessPackageSubject::createFromDiscriminatorValue)); });
        deserializerMap.put("requestState", (n) -> { this.setRequestState(n.getStringValue()); });
        deserializerMap.put("requestStatus", (n) -> { this.setRequestStatus(n.getStringValue()); });
        deserializerMap.put("requestType", (n) -> { this.setRequestType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isValidationOnly property value. If set, does not add the resource.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsValidationOnly() {
        return this.isValidationOnly;
    }
    /**
     * Gets the justification property value. The requestor's justification for adding or removing the resource.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getJustification() {
        return this.justification;
    }
    /**
     * Gets the requestor property value. Read-only. Nullable. Supports $expand.
     * @return a AccessPackageSubject
     */
    @jakarta.annotation.Nullable
    public AccessPackageSubject getRequestor() {
        return this.requestor;
    }
    /**
     * Gets the requestState property value. The outcome of whether the service was able to add the resource to the catalog.  The value is Delivered if the resource was added or removed. Read-Only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRequestState() {
        return this.requestState;
    }
    /**
     * Gets the requestStatus property value. The requestStatus property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRequestStatus() {
        return this.requestStatus;
    }
    /**
     * Gets the requestType property value. Use AdminAdd to add a resource, if the caller is an administrator or resource owner, AdminUpdate to update a resource, or AdminRemove to remove a resource.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRequestType() {
        return this.requestType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("accessPackageResource", this.getAccessPackageResource());
        writer.writeStringValue("catalogId", this.getCatalogId());
        writer.writeBooleanValue("executeImmediately", this.getExecuteImmediately());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeBooleanValue("isValidationOnly", this.getIsValidationOnly());
        writer.writeStringValue("justification", this.getJustification());
        writer.writeObjectValue("requestor", this.getRequestor());
        writer.writeStringValue("requestState", this.getRequestState());
        writer.writeStringValue("requestStatus", this.getRequestStatus());
        writer.writeStringValue("requestType", this.getRequestType());
    }
    /**
     * Sets the accessPackageResource property value. The accessPackageResource property
     * @param value Value to set for the accessPackageResource property.
     */
    public void setAccessPackageResource(@jakarta.annotation.Nullable final AccessPackageResource value) {
        this.accessPackageResource = value;
    }
    /**
     * Sets the catalogId property value. The unique ID of the access package catalog.
     * @param value Value to set for the catalogId property.
     */
    public void setCatalogId(@jakarta.annotation.Nullable final String value) {
        this.catalogId = value;
    }
    /**
     * Sets the executeImmediately property value. The executeImmediately property
     * @param value Value to set for the executeImmediately property.
     */
    public void setExecuteImmediately(@jakarta.annotation.Nullable final Boolean value) {
        this.executeImmediately = value;
    }
    /**
     * Sets the expirationDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.expirationDateTime = value;
    }
    /**
     * Sets the isValidationOnly property value. If set, does not add the resource.
     * @param value Value to set for the isValidationOnly property.
     */
    public void setIsValidationOnly(@jakarta.annotation.Nullable final Boolean value) {
        this.isValidationOnly = value;
    }
    /**
     * Sets the justification property value. The requestor's justification for adding or removing the resource.
     * @param value Value to set for the justification property.
     */
    public void setJustification(@jakarta.annotation.Nullable final String value) {
        this.justification = value;
    }
    /**
     * Sets the requestor property value. Read-only. Nullable. Supports $expand.
     * @param value Value to set for the requestor property.
     */
    public void setRequestor(@jakarta.annotation.Nullable final AccessPackageSubject value) {
        this.requestor = value;
    }
    /**
     * Sets the requestState property value. The outcome of whether the service was able to add the resource to the catalog.  The value is Delivered if the resource was added or removed. Read-Only.
     * @param value Value to set for the requestState property.
     */
    public void setRequestState(@jakarta.annotation.Nullable final String value) {
        this.requestState = value;
    }
    /**
     * Sets the requestStatus property value. The requestStatus property
     * @param value Value to set for the requestStatus property.
     */
    public void setRequestStatus(@jakarta.annotation.Nullable final String value) {
        this.requestStatus = value;
    }
    /**
     * Sets the requestType property value. Use AdminAdd to add a resource, if the caller is an administrator or resource owner, AdminUpdate to update a resource, or AdminRemove to remove a resource.
     * @param value Value to set for the requestType property.
     */
    public void setRequestType(@jakarta.annotation.Nullable final String value) {
        this.requestType = value;
    }
}
