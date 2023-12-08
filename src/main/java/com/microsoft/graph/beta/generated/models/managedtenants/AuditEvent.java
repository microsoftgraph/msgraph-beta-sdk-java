package com.microsoft.graph.beta.models.managedtenants;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuditEvent extends Entity implements Parsable {
    /**
     * Instantiates a new AuditEvent and sets the default values.
     */
    public AuditEvent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AuditEvent
     */
    @jakarta.annotation.Nonnull
    public static AuditEvent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuditEvent();
    }
    /**
     * Gets the activity property value. A string that uniquely represents the operation that occurred. Required. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getActivity() {
        return this.backingStore.get("activity");
    }
    /**
     * Gets the activityDateTime property value. The time when the activity occurred. Required. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getActivityDateTime() {
        return this.backingStore.get("activityDateTime");
    }
    /**
     * Gets the activityId property value. The identifier of the activity request that made the audit event. Required. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getActivityId() {
        return this.backingStore.get("activityId");
    }
    /**
     * Gets the category property value. A category that represents a logical grouping of activities. Required. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCategory() {
        return this.backingStore.get("category");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activity", (n) -> { this.setActivity(n.getStringValue()); });
        deserializerMap.put("activityDateTime", (n) -> { this.setActivityDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("activityId", (n) -> { this.setActivityId(n.getStringValue()); });
        deserializerMap.put("category", (n) -> { this.setCategory(n.getStringValue()); });
        deserializerMap.put("httpVerb", (n) -> { this.setHttpVerb(n.getStringValue()); });
        deserializerMap.put("initiatedByAppId", (n) -> { this.setInitiatedByAppId(n.getStringValue()); });
        deserializerMap.put("initiatedByUpn", (n) -> { this.setInitiatedByUpn(n.getStringValue()); });
        deserializerMap.put("initiatedByUserId", (n) -> { this.setInitiatedByUserId(n.getStringValue()); });
        deserializerMap.put("ipAddress", (n) -> { this.setIpAddress(n.getStringValue()); });
        deserializerMap.put("requestBody", (n) -> { this.setRequestBody(n.getStringValue()); });
        deserializerMap.put("requestUrl", (n) -> { this.setRequestUrl(n.getStringValue()); });
        deserializerMap.put("tenantIds", (n) -> { this.setTenantIds(n.getStringValue()); });
        deserializerMap.put("tenantNames", (n) -> { this.setTenantNames(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the httpVerb property value. The HTTP verb that was used when making the API request. Required. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getHttpVerb() {
        return this.backingStore.get("httpVerb");
    }
    /**
     * Gets the initiatedByAppId property value. The identifier of the app that was used to make the request. Required. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInitiatedByAppId() {
        return this.backingStore.get("initiatedByAppId");
    }
    /**
     * Gets the initiatedByUpn property value. The UPN of the user who initiated the activity. Required. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInitiatedByUpn() {
        return this.backingStore.get("initiatedByUpn");
    }
    /**
     * Gets the initiatedByUserId property value. The identifier of the user who initiated the activity. Required. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInitiatedByUserId() {
        return this.backingStore.get("initiatedByUserId");
    }
    /**
     * Gets the ipAddress property value. The IP address of where the activity was initiated. This may be an IPv4 or IPv6 address. Required. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIpAddress() {
        return this.backingStore.get("ipAddress");
    }
    /**
     * Gets the requestBody property value. The raw HTTP request body. Some sensitive information may be removed.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRequestBody() {
        return this.backingStore.get("requestBody");
    }
    /**
     * Gets the requestUrl property value. The raw HTTP request URL. Required. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRequestUrl() {
        return this.backingStore.get("requestUrl");
    }
    /**
     * Gets the tenantIds property value. The collection of Microsoft Entra tenant identifiers for the managed tenants that were affected by a change, and is formatted as a list of comma-separated values. Required. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTenantIds() {
        return this.backingStore.get("tenantIds");
    }
    /**
     * Gets the tenantNames property value. The collection of tenant names that were affected by a change, and is formatted as a list of comma-separated values. Required. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTenantNames() {
        return this.backingStore.get("tenantNames");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the activity property value. A string that uniquely represents the operation that occurred. Required. Read-only.
     * @param value Value to set for the activity property.
     */
    public void setActivity(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("activity", value);
    }
    /**
     * Sets the activityDateTime property value. The time when the activity occurred. Required. Read-only.
     * @param value Value to set for the activityDateTime property.
     */
    public void setActivityDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("activityDateTime", value);
    }
    /**
     * Sets the activityId property value. The identifier of the activity request that made the audit event. Required. Read-only.
     * @param value Value to set for the activityId property.
     */
    public void setActivityId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("activityId", value);
    }
    /**
     * Sets the category property value. A category that represents a logical grouping of activities. Required. Read-only.
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("category", value);
    }
    /**
     * Sets the httpVerb property value. The HTTP verb that was used when making the API request. Required. Read-only.
     * @param value Value to set for the httpVerb property.
     */
    public void setHttpVerb(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("httpVerb", value);
    }
    /**
     * Sets the initiatedByAppId property value. The identifier of the app that was used to make the request. Required. Read-only.
     * @param value Value to set for the initiatedByAppId property.
     */
    public void setInitiatedByAppId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("initiatedByAppId", value);
    }
    /**
     * Sets the initiatedByUpn property value. The UPN of the user who initiated the activity. Required. Read-only.
     * @param value Value to set for the initiatedByUpn property.
     */
    public void setInitiatedByUpn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("initiatedByUpn", value);
    }
    /**
     * Sets the initiatedByUserId property value. The identifier of the user who initiated the activity. Required. Read-only.
     * @param value Value to set for the initiatedByUserId property.
     */
    public void setInitiatedByUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("initiatedByUserId", value);
    }
    /**
     * Sets the ipAddress property value. The IP address of where the activity was initiated. This may be an IPv4 or IPv6 address. Required. Read-only.
     * @param value Value to set for the ipAddress property.
     */
    public void setIpAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ipAddress", value);
    }
    /**
     * Sets the requestBody property value. The raw HTTP request body. Some sensitive information may be removed.
     * @param value Value to set for the requestBody property.
     */
    public void setRequestBody(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("requestBody", value);
    }
    /**
     * Sets the requestUrl property value. The raw HTTP request URL. Required. Read-only.
     * @param value Value to set for the requestUrl property.
     */
    public void setRequestUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("requestUrl", value);
    }
    /**
     * Sets the tenantIds property value. The collection of Microsoft Entra tenant identifiers for the managed tenants that were affected by a change, and is formatted as a list of comma-separated values. Required. Read-only.
     * @param value Value to set for the tenantIds property.
     */
    public void setTenantIds(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantIds", value);
    }
    /**
     * Sets the tenantNames property value. The collection of tenant names that were affected by a change, and is formatted as a list of comma-separated values. Required. Read-only.
     * @param value Value to set for the tenantNames property.
     */
    public void setTenantNames(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantNames", value);
    }
}
