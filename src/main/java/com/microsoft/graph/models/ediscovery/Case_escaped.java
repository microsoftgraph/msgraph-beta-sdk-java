package com.microsoft.graph.models.ediscovery;

import com.microsoft.graph.models.Entity;
import com.microsoft.graph.models.IdentitySet;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class Case_escaped extends Entity implements Parsable {
    /** The user who closed the case. */
    private IdentitySet _closedBy;
    /** The date and time when the case was closed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _closedDateTime;
    /** The date and time when the entity was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _createdDateTime;
    /** Returns a list of case custodian objects for this case.  Nullable. */
    private java.util.List<Custodian> _custodians;
    /** The case description. */
    private String _description;
    /** The case name. */
    private String _displayName;
    /** The external case number for customer reference. */
    private String _externalId;
    /** The last user who modified the entity. */
    private IdentitySet _lastModifiedBy;
    /** The latest date and time when the case was modified. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _lastModifiedDateTime;
    /** Returns a list of case legalHold objects for this case.  Nullable. */
    private java.util.List<LegalHold> _legalHolds;
    /** Returns a list of case noncustodialDataSource objects for this case.  Nullable. */
    private java.util.List<NoncustodialDataSource> _noncustodialDataSources;
    /** Returns a list of case operation objects for this case. Nullable. */
    private java.util.List<CaseOperation> _operations;
    /** Returns a list of reviewSet objects in the case. Read-only. Nullable. */
    private java.util.List<ReviewSet> _reviewSets;
    /** The settings property */
    private CaseSettings _settings;
    /** Returns a list of sourceCollection objects associated with this case. */
    private java.util.List<SourceCollection> _sourceCollections;
    /** The case status. Possible values are unknown, active, pendingDelete, closing, closed, and closedWithError. For details, see the following table. */
    private CaseStatus _status;
    /** Returns a list of tag objects associated to this case. */
    private java.util.List<Tag> _tags;
    /**
     * Instantiates a new case_escaped and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Case_escaped() {
        super();
        this.setOdataType("#microsoft.graph.ediscovery.case");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a case_escaped
     */
    @javax.annotation.Nonnull
    public static Case_escaped createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Case_escaped();
    }
    /**
     * Gets the closedBy property value. The user who closed the case.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getClosedBy() {
        return this._closedBy;
    }
    /**
     * Gets the closedDateTime property value. The date and time when the case was closed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getClosedDateTime() {
        return this._closedDateTime;
    }
    /**
     * Gets the createdDateTime property value. The date and time when the entity was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the custodians property value. Returns a list of case custodian objects for this case.  Nullable.
     * @return a custodian
     */
    @javax.annotation.Nullable
    public java.util.List<Custodian> getCustodians() {
        return this._custodians;
    }
    /**
     * Gets the description property value. The case description.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The case name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the externalId property value. The external case number for customer reference.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalId() {
        return this._externalId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Case_escaped currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("closedBy", (n) -> { currentObject.setClosedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("closedDateTime", (n) -> { currentObject.setClosedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("custodians", (n) -> { currentObject.setCustodians(n.getCollectionOfObjectValues(Custodian::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        deserializerMap.put("externalId", (n) -> { currentObject.setExternalId(n.getStringValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { currentObject.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("legalHolds", (n) -> { currentObject.setLegalHolds(n.getCollectionOfObjectValues(LegalHold::createFromDiscriminatorValue)); });
        deserializerMap.put("noncustodialDataSources", (n) -> { currentObject.setNoncustodialDataSources(n.getCollectionOfObjectValues(NoncustodialDataSource::createFromDiscriminatorValue)); });
        deserializerMap.put("operations", (n) -> { currentObject.setOperations(n.getCollectionOfObjectValues(CaseOperation::createFromDiscriminatorValue)); });
        deserializerMap.put("reviewSets", (n) -> { currentObject.setReviewSets(n.getCollectionOfObjectValues(ReviewSet::createFromDiscriminatorValue)); });
        deserializerMap.put("settings", (n) -> { currentObject.setSettings(n.getObjectValue(CaseSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("sourceCollections", (n) -> { currentObject.setSourceCollections(n.getCollectionOfObjectValues(SourceCollection::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(CaseStatus.class)); });
        deserializerMap.put("tags", (n) -> { currentObject.setTags(n.getCollectionOfObjectValues(Tag::createFromDiscriminatorValue)); });
        return deserializerMap
    }
    /**
     * Gets the lastModifiedBy property value. The last user who modified the entity.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this._lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. The latest date and time when the case was modified. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the legalHolds property value. Returns a list of case legalHold objects for this case.  Nullable.
     * @return a legalHold
     */
    @javax.annotation.Nullable
    public java.util.List<LegalHold> getLegalHolds() {
        return this._legalHolds;
    }
    /**
     * Gets the noncustodialDataSources property value. Returns a list of case noncustodialDataSource objects for this case.  Nullable.
     * @return a noncustodialDataSource
     */
    @javax.annotation.Nullable
    public java.util.List<NoncustodialDataSource> getNoncustodialDataSources() {
        return this._noncustodialDataSources;
    }
    /**
     * Gets the operations property value. Returns a list of case operation objects for this case. Nullable.
     * @return a caseOperation
     */
    @javax.annotation.Nullable
    public java.util.List<CaseOperation> getOperations() {
        return this._operations;
    }
    /**
     * Gets the reviewSets property value. Returns a list of reviewSet objects in the case. Read-only. Nullable.
     * @return a reviewSet
     */
    @javax.annotation.Nullable
    public java.util.List<ReviewSet> getReviewSets() {
        return this._reviewSets;
    }
    /**
     * Gets the settings property value. The settings property
     * @return a caseSettings
     */
    @javax.annotation.Nullable
    public CaseSettings getSettings() {
        return this._settings;
    }
    /**
     * Gets the sourceCollections property value. Returns a list of sourceCollection objects associated with this case.
     * @return a sourceCollection
     */
    @javax.annotation.Nullable
    public java.util.List<SourceCollection> getSourceCollections() {
        return this._sourceCollections;
    }
    /**
     * Gets the status property value. The case status. Possible values are unknown, active, pendingDelete, closing, closed, and closedWithError. For details, see the following table.
     * @return a caseStatus
     */
    @javax.annotation.Nullable
    public CaseStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the tags property value. Returns a list of tag objects associated to this case.
     * @return a tag
     */
    @javax.annotation.Nullable
    public java.util.List<Tag> getTags() {
        return this._tags;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClosedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._closedBy = value;
    }
    /**
     * Sets the closedDateTime property value. The date and time when the case was closed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the closedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClosedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._closedDateTime = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time when the entity was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the custodians property value. Returns a list of case custodian objects for this case.  Nullable.
     * @param value Value to set for the custodians property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustodians(@javax.annotation.Nullable final java.util.List<Custodian> value) {
        this._custodians = value;
    }
    /**
     * Sets the description property value. The case description.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The case name.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the externalId property value. The external case number for customer reference.
     * @param value Value to set for the externalId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalId(@javax.annotation.Nullable final String value) {
        this._externalId = value;
    }
    /**
     * Sets the lastModifiedBy property value. The last user who modified the entity.
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The latest date and time when the case was modified. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the legalHolds property value. Returns a list of case legalHold objects for this case.  Nullable.
     * @param value Value to set for the legalHolds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLegalHolds(@javax.annotation.Nullable final java.util.List<LegalHold> value) {
        this._legalHolds = value;
    }
    /**
     * Sets the noncustodialDataSources property value. Returns a list of case noncustodialDataSource objects for this case.  Nullable.
     * @param value Value to set for the noncustodialDataSources property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNoncustodialDataSources(@javax.annotation.Nullable final java.util.List<NoncustodialDataSource> value) {
        this._noncustodialDataSources = value;
    }
    /**
     * Sets the operations property value. Returns a list of case operation objects for this case. Nullable.
     * @param value Value to set for the operations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperations(@javax.annotation.Nullable final java.util.List<CaseOperation> value) {
        this._operations = value;
    }
    /**
     * Sets the reviewSets property value. Returns a list of reviewSet objects in the case. Read-only. Nullable.
     * @param value Value to set for the reviewSets property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReviewSets(@javax.annotation.Nullable final java.util.List<ReviewSet> value) {
        this._reviewSets = value;
    }
    /**
     * Sets the settings property value. The settings property
     * @param value Value to set for the settings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettings(@javax.annotation.Nullable final CaseSettings value) {
        this._settings = value;
    }
    /**
     * Sets the sourceCollections property value. Returns a list of sourceCollection objects associated with this case.
     * @param value Value to set for the sourceCollections property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSourceCollections(@javax.annotation.Nullable final java.util.List<SourceCollection> value) {
        this._sourceCollections = value;
    }
    /**
     * Sets the status property value. The case status. Possible values are unknown, active, pendingDelete, closing, closed, and closedWithError. For details, see the following table.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final CaseStatus value) {
        this._status = value;
    }
    /**
     * Sets the tags property value. Returns a list of tag objects associated to this case.
     * @param value Value to set for the tags property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTags(@javax.annotation.Nullable final java.util.List<Tag> value) {
        this._tags = value;
    }
}
