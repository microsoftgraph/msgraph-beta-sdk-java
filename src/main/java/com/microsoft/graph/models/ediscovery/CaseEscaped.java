package com.microsoft.graph.models.ediscovery;

import com.microsoft.graph.models.Entity;
import com.microsoft.graph.models.IdentitySet;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CaseEscaped extends Entity implements Parsable {
    /**
     * The user who closed the case.
     */
    private IdentitySet closedBy;
    /**
     * The date and time when the case was closed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    private OffsetDateTime closedDateTime;
    /**
     * The date and time when the entity was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    private OffsetDateTime createdDateTime;
    /**
     * Returns a list of case custodian objects for this case.  Nullable.
     */
    private java.util.List<Custodian> custodians;
    /**
     * The case description.
     */
    private String description;
    /**
     * The case name.
     */
    private String displayName;
    /**
     * The external case number for customer reference.
     */
    private String externalId;
    /**
     * The last user who modified the entity.
     */
    private IdentitySet lastModifiedBy;
    /**
     * The latest date and time when the case was modified. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * Returns a list of case legalHold objects for this case.  Nullable.
     */
    private java.util.List<LegalHold> legalHolds;
    /**
     * Returns a list of case noncustodialDataSource objects for this case.  Nullable.
     */
    private java.util.List<NoncustodialDataSource> noncustodialDataSources;
    /**
     * Returns a list of case operation objects for this case. Nullable.
     */
    private java.util.List<CaseOperation> operations;
    /**
     * Returns a list of reviewSet objects in the case. Read-only. Nullable.
     */
    private java.util.List<ReviewSet> reviewSets;
    /**
     * The settings property
     */
    private CaseSettings settings;
    /**
     * Returns a list of sourceCollection objects associated with this case.
     */
    private java.util.List<SourceCollection> sourceCollections;
    /**
     * The case status. Possible values are unknown, active, pendingDelete, closing, closed, and closedWithError. For details, see the following table.
     */
    private CaseStatus status;
    /**
     * Returns a list of tag objects associated to this case.
     */
    private java.util.List<Tag> tags;
    /**
     * Instantiates a new caseEscaped and sets the default values.
     */
    public CaseEscaped() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a caseEscaped
     */
    @jakarta.annotation.Nonnull
    public static CaseEscaped createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CaseEscaped();
    }
    /**
     * Gets the closedBy property value. The user who closed the case.
     * @return a identitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getClosedBy() {
        return this.closedBy;
    }
    /**
     * Gets the closedDateTime property value. The date and time when the case was closed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getClosedDateTime() {
        return this.closedDateTime;
    }
    /**
     * Gets the createdDateTime property value. The date and time when the entity was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the custodians property value. Returns a list of case custodian objects for this case.  Nullable.
     * @return a custodian
     */
    @jakarta.annotation.Nullable
    public java.util.List<Custodian> getCustodians() {
        return this.custodians;
    }
    /**
     * Gets the description property value. The case description.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The case name.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the externalId property value. The external case number for customer reference.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getExternalId() {
        return this.externalId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("closedBy", (n) -> { this.setClosedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("closedDateTime", (n) -> { this.setClosedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("custodians", (n) -> { this.setCustodians(n.getCollectionOfObjectValues(Custodian::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("externalId", (n) -> { this.setExternalId(n.getStringValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("legalHolds", (n) -> { this.setLegalHolds(n.getCollectionOfObjectValues(LegalHold::createFromDiscriminatorValue)); });
        deserializerMap.put("noncustodialDataSources", (n) -> { this.setNoncustodialDataSources(n.getCollectionOfObjectValues(NoncustodialDataSource::createFromDiscriminatorValue)); });
        deserializerMap.put("operations", (n) -> { this.setOperations(n.getCollectionOfObjectValues(CaseOperation::createFromDiscriminatorValue)); });
        deserializerMap.put("reviewSets", (n) -> { this.setReviewSets(n.getCollectionOfObjectValues(ReviewSet::createFromDiscriminatorValue)); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(CaseSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("sourceCollections", (n) -> { this.setSourceCollections(n.getCollectionOfObjectValues(SourceCollection::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(CaseStatus.class)); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getCollectionOfObjectValues(Tag::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedBy property value. The last user who modified the entity.
     * @return a identitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. The latest date and time when the case was modified. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the legalHolds property value. Returns a list of case legalHold objects for this case.  Nullable.
     * @return a legalHold
     */
    @jakarta.annotation.Nullable
    public java.util.List<LegalHold> getLegalHolds() {
        return this.legalHolds;
    }
    /**
     * Gets the noncustodialDataSources property value. Returns a list of case noncustodialDataSource objects for this case.  Nullable.
     * @return a noncustodialDataSource
     */
    @jakarta.annotation.Nullable
    public java.util.List<NoncustodialDataSource> getNoncustodialDataSources() {
        return this.noncustodialDataSources;
    }
    /**
     * Gets the operations property value. Returns a list of case operation objects for this case. Nullable.
     * @return a caseOperation
     */
    @jakarta.annotation.Nullable
    public java.util.List<CaseOperation> getOperations() {
        return this.operations;
    }
    /**
     * Gets the reviewSets property value. Returns a list of reviewSet objects in the case. Read-only. Nullable.
     * @return a reviewSet
     */
    @jakarta.annotation.Nullable
    public java.util.List<ReviewSet> getReviewSets() {
        return this.reviewSets;
    }
    /**
     * Gets the settings property value. The settings property
     * @return a caseSettings
     */
    @jakarta.annotation.Nullable
    public CaseSettings getSettings() {
        return this.settings;
    }
    /**
     * Gets the sourceCollections property value. Returns a list of sourceCollection objects associated with this case.
     * @return a sourceCollection
     */
    @jakarta.annotation.Nullable
    public java.util.List<SourceCollection> getSourceCollections() {
        return this.sourceCollections;
    }
    /**
     * Gets the status property value. The case status. Possible values are unknown, active, pendingDelete, closing, closed, and closedWithError. For details, see the following table.
     * @return a caseStatus
     */
    @jakarta.annotation.Nullable
    public CaseStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the tags property value. Returns a list of tag objects associated to this case.
     * @return a tag
     */
    @jakarta.annotation.Nullable
    public java.util.List<Tag> getTags() {
        return this.tags;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("closedBy", this.getClosedBy());
        writer.writeOffsetDateTimeValue("closedDateTime", this.getClosedDateTime());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeCollectionOfObjectValues("custodians", this.getCustodians());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("externalId", this.getExternalId());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfObjectValues("legalHolds", this.getLegalHolds());
        writer.writeCollectionOfObjectValues("noncustodialDataSources", this.getNoncustodialDataSources());
        writer.writeCollectionOfObjectValues("operations", this.getOperations());
        writer.writeCollectionOfObjectValues("reviewSets", this.getReviewSets());
        writer.writeObjectValue("settings", this.getSettings());
        writer.writeCollectionOfObjectValues("sourceCollections", this.getSourceCollections());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeCollectionOfObjectValues("tags", this.getTags());
    }
    /**
     * Sets the closedBy property value. The user who closed the case.
     * @param value Value to set for the closedBy property.
     */
    public void setClosedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.closedBy = value;
    }
    /**
     * Sets the closedDateTime property value. The date and time when the case was closed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the closedDateTime property.
     */
    public void setClosedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.closedDateTime = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time when the entity was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the custodians property value. Returns a list of case custodian objects for this case.  Nullable.
     * @param value Value to set for the custodians property.
     */
    public void setCustodians(@jakarta.annotation.Nullable final java.util.List<Custodian> value) {
        this.custodians = value;
    }
    /**
     * Sets the description property value. The case description.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The case name.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the externalId property value. The external case number for customer reference.
     * @param value Value to set for the externalId property.
     */
    public void setExternalId(@jakarta.annotation.Nullable final String value) {
        this.externalId = value;
    }
    /**
     * Sets the lastModifiedBy property value. The last user who modified the entity.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The latest date and time when the case was modified. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the legalHolds property value. Returns a list of case legalHold objects for this case.  Nullable.
     * @param value Value to set for the legalHolds property.
     */
    public void setLegalHolds(@jakarta.annotation.Nullable final java.util.List<LegalHold> value) {
        this.legalHolds = value;
    }
    /**
     * Sets the noncustodialDataSources property value. Returns a list of case noncustodialDataSource objects for this case.  Nullable.
     * @param value Value to set for the noncustodialDataSources property.
     */
    public void setNoncustodialDataSources(@jakarta.annotation.Nullable final java.util.List<NoncustodialDataSource> value) {
        this.noncustodialDataSources = value;
    }
    /**
     * Sets the operations property value. Returns a list of case operation objects for this case. Nullable.
     * @param value Value to set for the operations property.
     */
    public void setOperations(@jakarta.annotation.Nullable final java.util.List<CaseOperation> value) {
        this.operations = value;
    }
    /**
     * Sets the reviewSets property value. Returns a list of reviewSet objects in the case. Read-only. Nullable.
     * @param value Value to set for the reviewSets property.
     */
    public void setReviewSets(@jakarta.annotation.Nullable final java.util.List<ReviewSet> value) {
        this.reviewSets = value;
    }
    /**
     * Sets the settings property value. The settings property
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final CaseSettings value) {
        this.settings = value;
    }
    /**
     * Sets the sourceCollections property value. Returns a list of sourceCollection objects associated with this case.
     * @param value Value to set for the sourceCollections property.
     */
    public void setSourceCollections(@jakarta.annotation.Nullable final java.util.List<SourceCollection> value) {
        this.sourceCollections = value;
    }
    /**
     * Sets the status property value. The case status. Possible values are unknown, active, pendingDelete, closing, closed, and closedWithError. For details, see the following table.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final CaseStatus value) {
        this.status = value;
    }
    /**
     * Sets the tags property value. Returns a list of tag objects associated to this case.
     * @param value Value to set for the tags property.
     */
    public void setTags(@jakarta.annotation.Nullable final java.util.List<Tag> value) {
        this.tags = value;
    }
}
