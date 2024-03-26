package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class KnownIssue extends Entity implements Parsable {
    /**
     * Instantiates a new {@link KnownIssue} and sets the default values.
     */
    public KnownIssue() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link KnownIssue}
     */
    @jakarta.annotation.Nonnull
    public static KnownIssue createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new KnownIssue();
    }
    /**
     * Gets the description property value. The description of the particular known issue.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("knownIssueHistories", (n) -> { this.setKnownIssueHistories(n.getCollectionOfObjectValues(KnownIssueHistoryItem::createFromDiscriminatorValue)); });
        deserializerMap.put("lastUpdatedDateTime", (n) -> { this.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("originatingKnowledgeBaseArticle", (n) -> { this.setOriginatingKnowledgeBaseArticle(n.getObjectValue(KnowledgeBaseArticle::createFromDiscriminatorValue)); });
        deserializerMap.put("resolvedDateTime", (n) -> { this.setResolvedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("resolvingKnowledgeBaseArticle", (n) -> { this.setResolvingKnowledgeBaseArticle(n.getObjectValue(KnowledgeBaseArticle::createFromDiscriminatorValue)); });
        deserializerMap.put("safeguardHoldIds", (n) -> { this.setSafeguardHoldIds(n.getCollectionOfPrimitiveValues(Integer.class)); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(WindowsReleaseHealthStatus::forValue)); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        deserializerMap.put("webViewUrl", (n) -> { this.setWebViewUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the knownIssueHistories property value. The knownIssueHistories property
     * @return a {@link java.util.List<KnownIssueHistoryItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<KnownIssueHistoryItem> getKnownIssueHistories() {
        return this.backingStore.get("knownIssueHistories");
    }
    /**
     * Gets the lastUpdatedDateTime property value. The date and time when the known issue was last updated. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this.backingStore.get("lastUpdatedDateTime");
    }
    /**
     * Gets the originatingKnowledgeBaseArticle property value. Knowledge base article associated with the release when the known issue was first reported.
     * @return a {@link KnowledgeBaseArticle}
     */
    @jakarta.annotation.Nullable
    public KnowledgeBaseArticle getOriginatingKnowledgeBaseArticle() {
        return this.backingStore.get("originatingKnowledgeBaseArticle");
    }
    /**
     * Gets the resolvedDateTime property value. The date and time when the known issue was resolved or mitigated. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getResolvedDateTime() {
        return this.backingStore.get("resolvedDateTime");
    }
    /**
     * Gets the resolvingKnowledgeBaseArticle property value. Knowledge base article associated with the release when the known issue was resolved or mitigated.
     * @return a {@link KnowledgeBaseArticle}
     */
    @jakarta.annotation.Nullable
    public KnowledgeBaseArticle getResolvingKnowledgeBaseArticle() {
        return this.backingStore.get("resolvingKnowledgeBaseArticle");
    }
    /**
     * Gets the safeguardHoldIds property value. The safeguardHoldIds property
     * @return a {@link java.util.List<Integer>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Integer> getSafeguardHoldIds() {
        return this.backingStore.get("safeguardHoldIds");
    }
    /**
     * Gets the startDateTime property value. The date and time when the known issue was first reported. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.backingStore.get("startDateTime");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link WindowsReleaseHealthStatus}
     */
    @jakarta.annotation.Nullable
    public WindowsReleaseHealthStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the title property value. The title of the known issue.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.backingStore.get("title");
    }
    /**
     * Gets the webViewUrl property value. The URL to the known issue in the Windows Release Health dashboard on Microsoft 365 admin center.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWebViewUrl() {
        return this.backingStore.get("webViewUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeCollectionOfObjectValues("knownIssueHistories", this.getKnownIssueHistories());
        writer.writeOffsetDateTimeValue("lastUpdatedDateTime", this.getLastUpdatedDateTime());
        writer.writeObjectValue("originatingKnowledgeBaseArticle", this.getOriginatingKnowledgeBaseArticle());
        writer.writeOffsetDateTimeValue("resolvedDateTime", this.getResolvedDateTime());
        writer.writeObjectValue("resolvingKnowledgeBaseArticle", this.getResolvingKnowledgeBaseArticle());
        writer.writeCollectionOfPrimitiveValues("safeguardHoldIds", this.getSafeguardHoldIds());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("title", this.getTitle());
        writer.writeStringValue("webViewUrl", this.getWebViewUrl());
    }
    /**
     * Sets the description property value. The description of the particular known issue.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the knownIssueHistories property value. The knownIssueHistories property
     * @param value Value to set for the knownIssueHistories property.
     */
    public void setKnownIssueHistories(@jakarta.annotation.Nullable final java.util.List<KnownIssueHistoryItem> value) {
        this.backingStore.set("knownIssueHistories", value);
    }
    /**
     * Sets the lastUpdatedDateTime property value. The date and time when the known issue was last updated. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the lastUpdatedDateTime property.
     */
    public void setLastUpdatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastUpdatedDateTime", value);
    }
    /**
     * Sets the originatingKnowledgeBaseArticle property value. Knowledge base article associated with the release when the known issue was first reported.
     * @param value Value to set for the originatingKnowledgeBaseArticle property.
     */
    public void setOriginatingKnowledgeBaseArticle(@jakarta.annotation.Nullable final KnowledgeBaseArticle value) {
        this.backingStore.set("originatingKnowledgeBaseArticle", value);
    }
    /**
     * Sets the resolvedDateTime property value. The date and time when the known issue was resolved or mitigated. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the resolvedDateTime property.
     */
    public void setResolvedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("resolvedDateTime", value);
    }
    /**
     * Sets the resolvingKnowledgeBaseArticle property value. Knowledge base article associated with the release when the known issue was resolved or mitigated.
     * @param value Value to set for the resolvingKnowledgeBaseArticle property.
     */
    public void setResolvingKnowledgeBaseArticle(@jakarta.annotation.Nullable final KnowledgeBaseArticle value) {
        this.backingStore.set("resolvingKnowledgeBaseArticle", value);
    }
    /**
     * Sets the safeguardHoldIds property value. The safeguardHoldIds property
     * @param value Value to set for the safeguardHoldIds property.
     */
    public void setSafeguardHoldIds(@jakarta.annotation.Nullable final java.util.List<Integer> value) {
        this.backingStore.set("safeguardHoldIds", value);
    }
    /**
     * Sets the startDateTime property value. The date and time when the known issue was first reported. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("startDateTime", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final WindowsReleaseHealthStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the title property value. The title of the known issue.
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("title", value);
    }
    /**
     * Sets the webViewUrl property value. The URL to the known issue in the Windows Release Health dashboard on Microsoft 365 admin center.
     * @param value Value to set for the webViewUrl property.
     */
    public void setWebViewUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("webViewUrl", value);
    }
}
