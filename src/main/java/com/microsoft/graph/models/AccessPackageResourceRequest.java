package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReview entities. */
public class AccessPackageResourceRequest extends Entity implements Parsable {
    /** The accessPackageResource property */
    private AccessPackageResource _accessPackageResource;
    /** The unique ID of the access package catalog. */
    private String _catalogId;
    /** The executeImmediately property */
    private Boolean _executeImmediately;
    /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _expirationDateTime;
    /** If set, does not add the resource. */
    private Boolean _isValidationOnly;
    /** The requestor's justification for adding or removing the resource. */
    private String _justification;
    /** Read-only. Nullable. Supports $expand. */
    private AccessPackageSubject _requestor;
    /** The outcome of whether the service was able to add the resource to the catalog.  The value is Delivered if the resource was added or removed. Read-Only. */
    private String _requestState;
    /** The requestStatus property */
    private String _requestStatus;
    /** Use AdminAdd to add a resource, if the caller is an administrator or resource owner, or AdminRemove to remove a resource. */
    private String _requestType;
    /**
     * Instantiates a new accessPackageResourceRequest and sets the default values.
     * @return a void
     */
    public AccessPackageResourceRequest() {
        super();
        this.setOdataType("#microsoft.graph.accessPackageResourceRequest");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageResourceRequest
     */
    @javax.annotation.Nonnull
    public static AccessPackageResourceRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageResourceRequest();
    }
    /**
     * Gets the accessPackageResource property value. The accessPackageResource property
     * @return a accessPackageResource
     */
    @javax.annotation.Nullable
    public AccessPackageResource getAccessPackageResource() {
        return this._accessPackageResource;
    }
    /**
     * Gets the catalogId property value. The unique ID of the access package catalog.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCatalogId() {
        return this._catalogId;
    }
    /**
     * Gets the executeImmediately property value. The executeImmediately property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getExecuteImmediately() {
        return this._executeImmediately;
    }
    /**
     * Gets the expirationDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
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
        final AccessPackageResourceRequest currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("accessPackageResource", (n) -> { currentObject.setAccessPackageResource(n.getObjectValue(AccessPackageResource::createFromDiscriminatorValue)); });
            this.put("catalogId", (n) -> { currentObject.setCatalogId(n.getStringValue()); });
            this.put("executeImmediately", (n) -> { currentObject.setExecuteImmediately(n.getBooleanValue()); });
            this.put("expirationDateTime", (n) -> { currentObject.setExpirationDateTime(n.getOffsetDateTimeValue()); });
            this.put("isValidationOnly", (n) -> { currentObject.setIsValidationOnly(n.getBooleanValue()); });
            this.put("justification", (n) -> { currentObject.setJustification(n.getStringValue()); });
            this.put("requestor", (n) -> { currentObject.setRequestor(n.getObjectValue(AccessPackageSubject::createFromDiscriminatorValue)); });
            this.put("requestState", (n) -> { currentObject.setRequestState(n.getStringValue()); });
            this.put("requestStatus", (n) -> { currentObject.setRequestStatus(n.getStringValue()); });
            this.put("requestType", (n) -> { currentObject.setRequestType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the isValidationOnly property value. If set, does not add the resource.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsValidationOnly() {
        return this._isValidationOnly;
    }
    /**
     * Gets the justification property value. The requestor's justification for adding or removing the resource.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJustification() {
        return this._justification;
    }
    /**
     * Gets the requestor property value. Read-only. Nullable. Supports $expand.
     * @return a accessPackageSubject
     */
    @javax.annotation.Nullable
    public AccessPackageSubject getRequestor() {
        return this._requestor;
    }
    /**
     * Gets the requestState property value. The outcome of whether the service was able to add the resource to the catalog.  The value is Delivered if the resource was added or removed. Read-Only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRequestState() {
        return this._requestState;
    }
    /**
     * Gets the requestStatus property value. The requestStatus property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRequestStatus() {
        return this._requestStatus;
    }
    /**
     * Gets the requestType property value. Use AdminAdd to add a resource, if the caller is an administrator or resource owner, or AdminRemove to remove a resource.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRequestType() {
        return this._requestType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setAccessPackageResource(@javax.annotation.Nullable final AccessPackageResource value) {
        this._accessPackageResource = value;
    }
    /**
     * Sets the catalogId property value. The unique ID of the access package catalog.
     * @param value Value to set for the catalogId property.
     * @return a void
     */
    public void setCatalogId(@javax.annotation.Nullable final String value) {
        this._catalogId = value;
    }
    /**
     * Sets the executeImmediately property value. The executeImmediately property
     * @param value Value to set for the executeImmediately property.
     * @return a void
     */
    public void setExecuteImmediately(@javax.annotation.Nullable final Boolean value) {
        this._executeImmediately = value;
    }
    /**
     * Sets the expirationDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expirationDateTime = value;
    }
    /**
     * Sets the isValidationOnly property value. If set, does not add the resource.
     * @param value Value to set for the isValidationOnly property.
     * @return a void
     */
    public void setIsValidationOnly(@javax.annotation.Nullable final Boolean value) {
        this._isValidationOnly = value;
    }
    /**
     * Sets the justification property value. The requestor's justification for adding or removing the resource.
     * @param value Value to set for the justification property.
     * @return a void
     */
    public void setJustification(@javax.annotation.Nullable final String value) {
        this._justification = value;
    }
    /**
     * Sets the requestor property value. Read-only. Nullable. Supports $expand.
     * @param value Value to set for the requestor property.
     * @return a void
     */
    public void setRequestor(@javax.annotation.Nullable final AccessPackageSubject value) {
        this._requestor = value;
    }
    /**
     * Sets the requestState property value. The outcome of whether the service was able to add the resource to the catalog.  The value is Delivered if the resource was added or removed. Read-Only.
     * @param value Value to set for the requestState property.
     * @return a void
     */
    public void setRequestState(@javax.annotation.Nullable final String value) {
        this._requestState = value;
    }
    /**
     * Sets the requestStatus property value. The requestStatus property
     * @param value Value to set for the requestStatus property.
     * @return a void
     */
    public void setRequestStatus(@javax.annotation.Nullable final String value) {
        this._requestStatus = value;
    }
    /**
     * Sets the requestType property value. Use AdminAdd to add a resource, if the caller is an administrator or resource owner, or AdminRemove to remove a resource.
     * @param value Value to set for the requestType property.
     * @return a void
     */
    public void setRequestType(@javax.annotation.Nullable final String value) {
        this._requestType = value;
    }
}
