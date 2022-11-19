package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class SecurityAction extends Entity implements Parsable {
    /** Reason for invoking this action. */
    private String _actionReason;
    /** The Application ID of the calling application that submitted (POST) the action. The appId should be extracted from the auth token and not entered manually by the calling application. */
    private String _appId;
    /** Azure tenant ID of the entity to determine which tenant the entity belongs to (multi-tenancy support). The azureTenantId should be extracted from the auth token and not entered manually by the calling application. */
    private String _azureTenantId;
    /** The clientContext property */
    private String _clientContext;
    /** Timestamp when the action was completed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _completedDateTime;
    /** Timestamp when the action is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _createdDateTime;
    /** Error info when the action fails. */
    private ResultInfo _errorInfo;
    /** Timestamp when this action was last updated. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _lastActionDateTime;
    /** Action name. */
    private String _name;
    /** Collection of parameters (key-value pairs) necessary to invoke the action, for example, URL or fileHash to block.). Required. */
    private java.util.List<KeyValuePair> _parameters;
    /** Collection of securityActionState to keep the history of an action. */
    private java.util.List<SecurityActionState> _states;
    /** Status of the action. Possible values are: NotStarted, Running, Completed, Failed. */
    private OperationStatus _status;
    /** The user principal name of the signed-in user that submitted  (POST) the action. The user should be extracted from the auth token and not entered manually by the calling application. */
    private String _user;
    /** Complex Type containing details about the Security product/service vendor, provider, and sub-provider (for example, vendor=Microsoft; provider=Windows Defender ATP; sub-provider=AppLocker). */
    private SecurityVendorInformation _vendorInformation;
    /**
     * Instantiates a new securityAction and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SecurityAction() {
        super();
        this.setOdataType("#microsoft.graph.securityAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a securityAction
     */
    @javax.annotation.Nonnull
    public static SecurityAction createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SecurityAction();
    }
    /**
     * Gets the actionReason property value. Reason for invoking this action.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActionReason() {
        return this._actionReason;
    }
    /**
     * Gets the appId property value. The Application ID of the calling application that submitted (POST) the action. The appId should be extracted from the auth token and not entered manually by the calling application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppId() {
        return this._appId;
    }
    /**
     * Gets the azureTenantId property value. Azure tenant ID of the entity to determine which tenant the entity belongs to (multi-tenancy support). The azureTenantId should be extracted from the auth token and not entered manually by the calling application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureTenantId() {
        return this._azureTenantId;
    }
    /**
     * Gets the clientContext property value. The clientContext property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClientContext() {
        return this._clientContext;
    }
    /**
     * Gets the completedDateTime property value. Timestamp when the action was completed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCompletedDateTime() {
        return this._completedDateTime;
    }
    /**
     * Gets the createdDateTime property value. Timestamp when the action is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the errorInfo property value. Error info when the action fails.
     * @return a resultInfo
     */
    @javax.annotation.Nullable
    public ResultInfo getErrorInfo() {
        return this._errorInfo;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SecurityAction currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actionReason", (n) -> { currentObject.setActionReason(n.getStringValue()); });
        deserializerMap.put("appId", (n) -> { currentObject.setAppId(n.getStringValue()); });
        deserializerMap.put("azureTenantId", (n) -> { currentObject.setAzureTenantId(n.getStringValue()); });
        deserializerMap.put("clientContext", (n) -> { currentObject.setClientContext(n.getStringValue()); });
        deserializerMap.put("completedDateTime", (n) -> { currentObject.setCompletedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("errorInfo", (n) -> { currentObject.setErrorInfo(n.getObjectValue(ResultInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("lastActionDateTime", (n) -> { currentObject.setLastActionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
        deserializerMap.put("parameters", (n) -> { currentObject.setParameters(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("states", (n) -> { currentObject.setStates(n.getCollectionOfObjectValues(SecurityActionState::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(OperationStatus.class)); });
        deserializerMap.put("user", (n) -> { currentObject.setUser(n.getStringValue()); });
        deserializerMap.put("vendorInformation", (n) -> { currentObject.setVendorInformation(n.getObjectValue(SecurityVendorInformation::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastActionDateTime property value. Timestamp when this action was last updated. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastActionDateTime() {
        return this._lastActionDateTime;
    }
    /**
     * Gets the name property value. Action name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the parameters property value. Collection of parameters (key-value pairs) necessary to invoke the action, for example, URL or fileHash to block.). Required.
     * @return a keyValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValuePair> getParameters() {
        return this._parameters;
    }
    /**
     * Gets the states property value. Collection of securityActionState to keep the history of an action.
     * @return a securityActionState
     */
    @javax.annotation.Nullable
    public java.util.List<SecurityActionState> getStates() {
        return this._states;
    }
    /**
     * Gets the status property value. Status of the action. Possible values are: NotStarted, Running, Completed, Failed.
     * @return a operationStatus
     */
    @javax.annotation.Nullable
    public OperationStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the user property value. The user principal name of the signed-in user that submitted  (POST) the action. The user should be extracted from the auth token and not entered manually by the calling application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUser() {
        return this._user;
    }
    /**
     * Gets the vendorInformation property value. Complex Type containing details about the Security product/service vendor, provider, and sub-provider (for example, vendor=Microsoft; provider=Windows Defender ATP; sub-provider=AppLocker).
     * @return a securityVendorInformation
     */
    @javax.annotation.Nullable
    public SecurityVendorInformation getVendorInformation() {
        return this._vendorInformation;
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
        writer.writeStringValue("actionReason", this.getActionReason());
        writer.writeStringValue("appId", this.getAppId());
        writer.writeStringValue("azureTenantId", this.getAzureTenantId());
        writer.writeStringValue("clientContext", this.getClientContext());
        writer.writeOffsetDateTimeValue("completedDateTime", this.getCompletedDateTime());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("errorInfo", this.getErrorInfo());
        writer.writeOffsetDateTimeValue("lastActionDateTime", this.getLastActionDateTime());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfObjectValues("parameters", this.getParameters());
        writer.writeCollectionOfObjectValues("states", this.getStates());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("user", this.getUser());
        writer.writeObjectValue("vendorInformation", this.getVendorInformation());
    }
    /**
     * Sets the actionReason property value. Reason for invoking this action.
     * @param value Value to set for the actionReason property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActionReason(@javax.annotation.Nullable final String value) {
        this._actionReason = value;
    }
    /**
     * Sets the appId property value. The Application ID of the calling application that submitted (POST) the action. The appId should be extracted from the auth token and not entered manually by the calling application.
     * @param value Value to set for the appId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppId(@javax.annotation.Nullable final String value) {
        this._appId = value;
    }
    /**
     * Sets the azureTenantId property value. Azure tenant ID of the entity to determine which tenant the entity belongs to (multi-tenancy support). The azureTenantId should be extracted from the auth token and not entered manually by the calling application.
     * @param value Value to set for the azureTenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAzureTenantId(@javax.annotation.Nullable final String value) {
        this._azureTenantId = value;
    }
    /**
     * Sets the clientContext property value. The clientContext property
     * @param value Value to set for the clientContext property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClientContext(@javax.annotation.Nullable final String value) {
        this._clientContext = value;
    }
    /**
     * Sets the completedDateTime property value. Timestamp when the action was completed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the completedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompletedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._completedDateTime = value;
    }
    /**
     * Sets the createdDateTime property value. Timestamp when the action is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the errorInfo property value. Error info when the action fails.
     * @param value Value to set for the errorInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrorInfo(@javax.annotation.Nullable final ResultInfo value) {
        this._errorInfo = value;
    }
    /**
     * Sets the lastActionDateTime property value. Timestamp when this action was last updated. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastActionDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastActionDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastActionDateTime = value;
    }
    /**
     * Sets the name property value. Action name.
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the parameters property value. Collection of parameters (key-value pairs) necessary to invoke the action, for example, URL or fileHash to block.). Required.
     * @param value Value to set for the parameters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParameters(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this._parameters = value;
    }
    /**
     * Sets the states property value. Collection of securityActionState to keep the history of an action.
     * @param value Value to set for the states property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStates(@javax.annotation.Nullable final java.util.List<SecurityActionState> value) {
        this._states = value;
    }
    /**
     * Sets the status property value. Status of the action. Possible values are: NotStarted, Running, Completed, Failed.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final OperationStatus value) {
        this._status = value;
    }
    /**
     * Sets the user property value. The user principal name of the signed-in user that submitted  (POST) the action. The user should be extracted from the auth token and not entered manually by the calling application.
     * @param value Value to set for the user property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUser(@javax.annotation.Nullable final String value) {
        this._user = value;
    }
    /**
     * Sets the vendorInformation property value. Complex Type containing details about the Security product/service vendor, provider, and sub-provider (for example, vendor=Microsoft; provider=Windows Defender ATP; sub-provider=AppLocker).
     * @param value Value to set for the vendorInformation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVendorInformation(@javax.annotation.Nullable final SecurityVendorInformation value) {
        this._vendorInformation = value;
    }
}
