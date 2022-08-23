package microsoft.graph.models.managedtenants;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.Entity;
/** Provides operations to manage the collection of accessReview entities. */
public class AuditEvent extends Entity implements Parsable {
    /** A string which uniquely represents the operation that occurred. Required. Read-only. */
    private String _activity;
    /** The time when the activity ocurred. Required. Read-only. */
    private OffsetDateTime _activityDateTime;
    /** The identifier of the activity request that made the audit event. Required. Read-only. */
    private String _activityId;
    /** A category which represents a logical grouping of activities. Required. Read-only. */
    private String _category;
    /** The HTTP verb that was used when making the API request. Required. Read-only. */
    private String _httpVerb;
    /** The identifier of the app that was used to make the request. Required. Read-only. */
    private String _initiatedByAppId;
    /** The UPN of the user who initiated the activity. Required. Read-only. */
    private String _initiatedByUpn;
    /** The identifier of the user who initiated the activity. Required. Read-only. */
    private String _initiatedByUserId;
    /** The IP address of where the activity was initiated. This may be an IPv4 or IPv6 address. Required. Read-only. */
    private String _ipAddress;
    /** The raw HTTP request body. Some sensitive information may be removed. */
    private String _requestBody;
    /** The raw HTTP request URL. Required. Read-only. */
    private String _requestUrl;
    /** The collection of Azure Active Directory tenant identifiers for the managed tenants that were impacted by this change. This is formatted as a list of comma-separated values. Required. Read-only. */
    private String _tenantIds;
    /** The collection of tenant names that were impacted by this change. This is formatted as a list of comma-separated values. Required. Read-only. */
    private String _tenantNames;
    /**
     * Instantiates a new auditEvent and sets the default values.
     * @return a void
     */
    public AuditEvent() {
        super();
        this.setOdataType("#microsoft.graph.managedTenants.auditEvent");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a auditEvent
     */
    @javax.annotation.Nonnull
    public static AuditEvent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuditEvent();
    }
    /**
     * Gets the activity property value. A string which uniquely represents the operation that occurred. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActivity() {
        return this._activity;
    }
    /**
     * Gets the activityDateTime property value. The time when the activity ocurred. Required. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getActivityDateTime() {
        return this._activityDateTime;
    }
    /**
     * Gets the activityId property value. The identifier of the activity request that made the audit event. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActivityId() {
        return this._activityId;
    }
    /**
     * Gets the category property value. A category which represents a logical grouping of activities. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCategory() {
        return this._category;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AuditEvent currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("activity", (n) -> { currentObject.setActivity(n.getStringValue()); });
            this.put("activityDateTime", (n) -> { currentObject.setActivityDateTime(n.getOffsetDateTimeValue()); });
            this.put("activityId", (n) -> { currentObject.setActivityId(n.getStringValue()); });
            this.put("category", (n) -> { currentObject.setCategory(n.getStringValue()); });
            this.put("httpVerb", (n) -> { currentObject.setHttpVerb(n.getStringValue()); });
            this.put("initiatedByAppId", (n) -> { currentObject.setInitiatedByAppId(n.getStringValue()); });
            this.put("initiatedByUpn", (n) -> { currentObject.setInitiatedByUpn(n.getStringValue()); });
            this.put("initiatedByUserId", (n) -> { currentObject.setInitiatedByUserId(n.getStringValue()); });
            this.put("ipAddress", (n) -> { currentObject.setIpAddress(n.getStringValue()); });
            this.put("requestBody", (n) -> { currentObject.setRequestBody(n.getStringValue()); });
            this.put("requestUrl", (n) -> { currentObject.setRequestUrl(n.getStringValue()); });
            this.put("tenantIds", (n) -> { currentObject.setTenantIds(n.getStringValue()); });
            this.put("tenantNames", (n) -> { currentObject.setTenantNames(n.getStringValue()); });
        }};
    }
    /**
     * Gets the httpVerb property value. The HTTP verb that was used when making the API request. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHttpVerb() {
        return this._httpVerb;
    }
    /**
     * Gets the initiatedByAppId property value. The identifier of the app that was used to make the request. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInitiatedByAppId() {
        return this._initiatedByAppId;
    }
    /**
     * Gets the initiatedByUpn property value. The UPN of the user who initiated the activity. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInitiatedByUpn() {
        return this._initiatedByUpn;
    }
    /**
     * Gets the initiatedByUserId property value. The identifier of the user who initiated the activity. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInitiatedByUserId() {
        return this._initiatedByUserId;
    }
    /**
     * Gets the ipAddress property value. The IP address of where the activity was initiated. This may be an IPv4 or IPv6 address. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIpAddress() {
        return this._ipAddress;
    }
    /**
     * Gets the requestBody property value. The raw HTTP request body. Some sensitive information may be removed.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRequestBody() {
        return this._requestBody;
    }
    /**
     * Gets the requestUrl property value. The raw HTTP request URL. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRequestUrl() {
        return this._requestUrl;
    }
    /**
     * Gets the tenantIds property value. The collection of Azure Active Directory tenant identifiers for the managed tenants that were impacted by this change. This is formatted as a list of comma-separated values. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantIds() {
        return this._tenantIds;
    }
    /**
     * Gets the tenantNames property value. The collection of tenant names that were impacted by this change. This is formatted as a list of comma-separated values. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantNames() {
        return this._tenantNames;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("activity", this.getActivity());
        writer.writeOffsetDateTimeValue("activityDateTime", this.getActivityDateTime());
        writer.writeStringValue("activityId", this.getActivityId());
        writer.writeStringValue("category", this.getCategory());
        writer.writeStringValue("httpVerb", this.getHttpVerb());
        writer.writeStringValue("initiatedByAppId", this.getInitiatedByAppId());
        writer.writeStringValue("initiatedByUpn", this.getInitiatedByUpn());
        writer.writeStringValue("initiatedByUserId", this.getInitiatedByUserId());
        writer.writeStringValue("ipAddress", this.getIpAddress());
        writer.writeStringValue("requestBody", this.getRequestBody());
        writer.writeStringValue("requestUrl", this.getRequestUrl());
        writer.writeStringValue("tenantIds", this.getTenantIds());
        writer.writeStringValue("tenantNames", this.getTenantNames());
    }
    /**
     * Sets the activity property value. A string which uniquely represents the operation that occurred. Required. Read-only.
     * @param value Value to set for the activity property.
     * @return a void
     */
    public void setActivity(@javax.annotation.Nullable final String value) {
        this._activity = value;
    }
    /**
     * Sets the activityDateTime property value. The time when the activity ocurred. Required. Read-only.
     * @param value Value to set for the activityDateTime property.
     * @return a void
     */
    public void setActivityDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._activityDateTime = value;
    }
    /**
     * Sets the activityId property value. The identifier of the activity request that made the audit event. Required. Read-only.
     * @param value Value to set for the activityId property.
     * @return a void
     */
    public void setActivityId(@javax.annotation.Nullable final String value) {
        this._activityId = value;
    }
    /**
     * Sets the category property value. A category which represents a logical grouping of activities. Required. Read-only.
     * @param value Value to set for the category property.
     * @return a void
     */
    public void setCategory(@javax.annotation.Nullable final String value) {
        this._category = value;
    }
    /**
     * Sets the httpVerb property value. The HTTP verb that was used when making the API request. Required. Read-only.
     * @param value Value to set for the httpVerb property.
     * @return a void
     */
    public void setHttpVerb(@javax.annotation.Nullable final String value) {
        this._httpVerb = value;
    }
    /**
     * Sets the initiatedByAppId property value. The identifier of the app that was used to make the request. Required. Read-only.
     * @param value Value to set for the initiatedByAppId property.
     * @return a void
     */
    public void setInitiatedByAppId(@javax.annotation.Nullable final String value) {
        this._initiatedByAppId = value;
    }
    /**
     * Sets the initiatedByUpn property value. The UPN of the user who initiated the activity. Required. Read-only.
     * @param value Value to set for the initiatedByUpn property.
     * @return a void
     */
    public void setInitiatedByUpn(@javax.annotation.Nullable final String value) {
        this._initiatedByUpn = value;
    }
    /**
     * Sets the initiatedByUserId property value. The identifier of the user who initiated the activity. Required. Read-only.
     * @param value Value to set for the initiatedByUserId property.
     * @return a void
     */
    public void setInitiatedByUserId(@javax.annotation.Nullable final String value) {
        this._initiatedByUserId = value;
    }
    /**
     * Sets the ipAddress property value. The IP address of where the activity was initiated. This may be an IPv4 or IPv6 address. Required. Read-only.
     * @param value Value to set for the ipAddress property.
     * @return a void
     */
    public void setIpAddress(@javax.annotation.Nullable final String value) {
        this._ipAddress = value;
    }
    /**
     * Sets the requestBody property value. The raw HTTP request body. Some sensitive information may be removed.
     * @param value Value to set for the requestBody property.
     * @return a void
     */
    public void setRequestBody(@javax.annotation.Nullable final String value) {
        this._requestBody = value;
    }
    /**
     * Sets the requestUrl property value. The raw HTTP request URL. Required. Read-only.
     * @param value Value to set for the requestUrl property.
     * @return a void
     */
    public void setRequestUrl(@javax.annotation.Nullable final String value) {
        this._requestUrl = value;
    }
    /**
     * Sets the tenantIds property value. The collection of Azure Active Directory tenant identifiers for the managed tenants that were impacted by this change. This is formatted as a list of comma-separated values. Required. Read-only.
     * @param value Value to set for the tenantIds property.
     * @return a void
     */
    public void setTenantIds(@javax.annotation.Nullable final String value) {
        this._tenantIds = value;
    }
    /**
     * Sets the tenantNames property value. The collection of tenant names that were impacted by this change. This is formatted as a list of comma-separated values. Required. Read-only.
     * @param value Value to set for the tenantNames property.
     * @return a void
     */
    public void setTenantNames(@javax.annotation.Nullable final String value) {
        this._tenantNames = value;
    }
}
