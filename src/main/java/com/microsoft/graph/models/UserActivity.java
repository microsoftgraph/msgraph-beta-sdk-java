package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserActivity extends Entity implements Parsable {
    /** The activationUrl property */
    private String activationUrl;
    /** The activitySourceHost property */
    private String activitySourceHost;
    /** The appActivityId property */
    private String appActivityId;
    /** The appDisplayName property */
    private String appDisplayName;
    /** The contentInfo property */
    private Json contentInfo;
    /** The contentUrl property */
    private String contentUrl;
    /** The createdDateTime property */
    private OffsetDateTime createdDateTime;
    /** The expirationDateTime property */
    private OffsetDateTime expirationDateTime;
    /** The fallbackUrl property */
    private String fallbackUrl;
    /** The historyItems property */
    private java.util.List<ActivityHistoryItem> historyItems;
    /** The lastModifiedDateTime property */
    private OffsetDateTime lastModifiedDateTime;
    /** The status property */
    private Status status;
    /** The userTimezone property */
    private String userTimezone;
    /** The visualElements property */
    private VisualInfo visualElements;
    /**
     * Instantiates a new userActivity and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserActivity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userActivity
     */
    @javax.annotation.Nonnull
    public static UserActivity createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserActivity();
    }
    /**
     * Gets the activationUrl property value. The activationUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActivationUrl() {
        return this.activationUrl;
    }
    /**
     * Gets the activitySourceHost property value. The activitySourceHost property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActivitySourceHost() {
        return this.activitySourceHost;
    }
    /**
     * Gets the appActivityId property value. The appActivityId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppActivityId() {
        return this.appActivityId;
    }
    /**
     * Gets the appDisplayName property value. The appDisplayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppDisplayName() {
        return this.appDisplayName;
    }
    /**
     * Gets the contentInfo property value. The contentInfo property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getContentInfo() {
        return this.contentInfo;
    }
    /**
     * Gets the contentUrl property value. The contentUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContentUrl() {
        return this.contentUrl;
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
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
     * Gets the fallbackUrl property value. The fallbackUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFallbackUrl() {
        return this.fallbackUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activationUrl", (n) -> { this.setActivationUrl(n.getStringValue()); });
        deserializerMap.put("activitySourceHost", (n) -> { this.setActivitySourceHost(n.getStringValue()); });
        deserializerMap.put("appActivityId", (n) -> { this.setAppActivityId(n.getStringValue()); });
        deserializerMap.put("appDisplayName", (n) -> { this.setAppDisplayName(n.getStringValue()); });
        deserializerMap.put("contentInfo", (n) -> { this.setContentInfo(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("contentUrl", (n) -> { this.setContentUrl(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("fallbackUrl", (n) -> { this.setFallbackUrl(n.getStringValue()); });
        deserializerMap.put("historyItems", (n) -> { this.setHistoryItems(n.getCollectionOfObjectValues(ActivityHistoryItem::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(Status.class)); });
        deserializerMap.put("userTimezone", (n) -> { this.setUserTimezone(n.getStringValue()); });
        deserializerMap.put("visualElements", (n) -> { this.setVisualElements(n.getObjectValue(VisualInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the historyItems property value. The historyItems property
     * @return a activityHistoryItem
     */
    @javax.annotation.Nullable
    public java.util.List<ActivityHistoryItem> getHistoryItems() {
        return this.historyItems;
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the status property value. The status property
     * @return a status
     */
    @javax.annotation.Nullable
    public Status getStatus() {
        return this.status;
    }
    /**
     * Gets the userTimezone property value. The userTimezone property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserTimezone() {
        return this.userTimezone;
    }
    /**
     * Gets the visualElements property value. The visualElements property
     * @return a VisualInfo
     */
    @javax.annotation.Nullable
    public VisualInfo getVisualElements() {
        return this.visualElements;
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
        writer.writeStringValue("activationUrl", this.getActivationUrl());
        writer.writeStringValue("activitySourceHost", this.getActivitySourceHost());
        writer.writeStringValue("appActivityId", this.getAppActivityId());
        writer.writeStringValue("appDisplayName", this.getAppDisplayName());
        writer.writeObjectValue("contentInfo", this.getContentInfo());
        writer.writeStringValue("contentUrl", this.getContentUrl());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeStringValue("fallbackUrl", this.getFallbackUrl());
        writer.writeCollectionOfObjectValues("historyItems", this.getHistoryItems());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("userTimezone", this.getUserTimezone());
        writer.writeObjectValue("visualElements", this.getVisualElements());
    }
    /**
     * Sets the activationUrl property value. The activationUrl property
     * @param value Value to set for the activationUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivationUrl(@javax.annotation.Nullable final String value) {
        this.activationUrl = value;
    }
    /**
     * Sets the activitySourceHost property value. The activitySourceHost property
     * @param value Value to set for the activitySourceHost property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivitySourceHost(@javax.annotation.Nullable final String value) {
        this.activitySourceHost = value;
    }
    /**
     * Sets the appActivityId property value. The appActivityId property
     * @param value Value to set for the appActivityId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppActivityId(@javax.annotation.Nullable final String value) {
        this.appActivityId = value;
    }
    /**
     * Sets the appDisplayName property value. The appDisplayName property
     * @param value Value to set for the appDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppDisplayName(@javax.annotation.Nullable final String value) {
        this.appDisplayName = value;
    }
    /**
     * Sets the contentInfo property value. The contentInfo property
     * @param value Value to set for the contentInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentInfo(@javax.annotation.Nullable final Json value) {
        this.contentInfo = value;
    }
    /**
     * Sets the contentUrl property value. The contentUrl property
     * @param value Value to set for the contentUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentUrl(@javax.annotation.Nullable final String value) {
        this.contentUrl = value;
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
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
     * Sets the fallbackUrl property value. The fallbackUrl property
     * @param value Value to set for the fallbackUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFallbackUrl(@javax.annotation.Nullable final String value) {
        this.fallbackUrl = value;
    }
    /**
     * Sets the historyItems property value. The historyItems property
     * @param value Value to set for the historyItems property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHistoryItems(@javax.annotation.Nullable final java.util.List<ActivityHistoryItem> value) {
        this.historyItems = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final Status value) {
        this.status = value;
    }
    /**
     * Sets the userTimezone property value. The userTimezone property
     * @param value Value to set for the userTimezone property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserTimezone(@javax.annotation.Nullable final String value) {
        this.userTimezone = value;
    }
    /**
     * Sets the visualElements property value. The visualElements property
     * @param value Value to set for the visualElements property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVisualElements(@javax.annotation.Nullable final VisualInfo value) {
        this.visualElements = value;
    }
}
