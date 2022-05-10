package microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.IdentitySet;
public class EdiscoveryCase extends Case_escaped implements Parsable {
    /** The closedBy property */
    private IdentitySet _closedBy;
    /** The closedDateTime property */
    private OffsetDateTime _closedDateTime;
    /** The custodians property */
    private java.util.List<EdiscoveryCustodian> _custodians;
    /** The externalId property */
    private String _externalId;
    /** The legalHolds property */
    private java.util.List<EdiscoveryHoldPolicy> _legalHolds;
    /** The noncustodialDataSources property */
    private java.util.List<EdiscoveryNoncustodialDataSource> _noncustodialDataSources;
    /** The operations property */
    private java.util.List<CaseOperation> _operations;
    /** The reviewSets property */
    private java.util.List<EdiscoveryReviewSet> _reviewSets;
    /** The searches property */
    private java.util.List<EdiscoverySearch> _searches;
    /** The settings property */
    private EdiscoveryCaseSettings _settings;
    /** The tags property */
    private java.util.List<EdiscoveryReviewTag> _tags;
    /**
     * Instantiates a new ediscoveryCase and sets the default values.
     * @return a void
     */
    public EdiscoveryCase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ediscoveryCase
     */
    @javax.annotation.Nonnull
    public static EdiscoveryCase createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EdiscoveryCase();
    }
    /**
     * Gets the closedBy property value. The closedBy property
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getClosedBy() {
        return this._closedBy;
    }
    /**
     * Gets the closedDateTime property value. The closedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getClosedDateTime() {
        return this._closedDateTime;
    }
    /**
     * Gets the custodians property value. The custodians property
     * @return a ediscoveryCustodian
     */
    @javax.annotation.Nullable
    public java.util.List<EdiscoveryCustodian> getCustodians() {
        return this._custodians;
    }
    /**
     * Gets the externalId property value. The externalId property
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
        final EdiscoveryCase currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("closedBy", (n) -> { currentObject.setClosedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("closedDateTime", (n) -> { currentObject.setClosedDateTime(n.getOffsetDateTimeValue()); });
            this.put("custodians", (n) -> { currentObject.setCustodians(n.getCollectionOfObjectValues(EdiscoveryCustodian::createFromDiscriminatorValue)); });
            this.put("externalId", (n) -> { currentObject.setExternalId(n.getStringValue()); });
            this.put("legalHolds", (n) -> { currentObject.setLegalHolds(n.getCollectionOfObjectValues(EdiscoveryHoldPolicy::createFromDiscriminatorValue)); });
            this.put("noncustodialDataSources", (n) -> { currentObject.setNoncustodialDataSources(n.getCollectionOfObjectValues(EdiscoveryNoncustodialDataSource::createFromDiscriminatorValue)); });
            this.put("operations", (n) -> { currentObject.setOperations(n.getCollectionOfObjectValues(CaseOperation::createFromDiscriminatorValue)); });
            this.put("reviewSets", (n) -> { currentObject.setReviewSets(n.getCollectionOfObjectValues(EdiscoveryReviewSet::createFromDiscriminatorValue)); });
            this.put("searches", (n) -> { currentObject.setSearches(n.getCollectionOfObjectValues(EdiscoverySearch::createFromDiscriminatorValue)); });
            this.put("settings", (n) -> { currentObject.setSettings(n.getObjectValue(EdiscoveryCaseSettings::createFromDiscriminatorValue)); });
            this.put("tags", (n) -> { currentObject.setTags(n.getCollectionOfObjectValues(EdiscoveryReviewTag::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the legalHolds property value. The legalHolds property
     * @return a ediscoveryHoldPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<EdiscoveryHoldPolicy> getLegalHolds() {
        return this._legalHolds;
    }
    /**
     * Gets the noncustodialDataSources property value. The noncustodialDataSources property
     * @return a ediscoveryNoncustodialDataSource
     */
    @javax.annotation.Nullable
    public java.util.List<EdiscoveryNoncustodialDataSource> getNoncustodialDataSources() {
        return this._noncustodialDataSources;
    }
    /**
     * Gets the operations property value. The operations property
     * @return a caseOperation
     */
    @javax.annotation.Nullable
    public java.util.List<CaseOperation> getOperations() {
        return this._operations;
    }
    /**
     * Gets the reviewSets property value. The reviewSets property
     * @return a ediscoveryReviewSet
     */
    @javax.annotation.Nullable
    public java.util.List<EdiscoveryReviewSet> getReviewSets() {
        return this._reviewSets;
    }
    /**
     * Gets the searches property value. The searches property
     * @return a ediscoverySearch
     */
    @javax.annotation.Nullable
    public java.util.List<EdiscoverySearch> getSearches() {
        return this._searches;
    }
    /**
     * Gets the settings property value. The settings property
     * @return a ediscoveryCaseSettings
     */
    @javax.annotation.Nullable
    public EdiscoveryCaseSettings getSettings() {
        return this._settings;
    }
    /**
     * Gets the tags property value. The tags property
     * @return a ediscoveryReviewTag
     */
    @javax.annotation.Nullable
    public java.util.List<EdiscoveryReviewTag> getTags() {
        return this._tags;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("closedBy", this.getClosedBy());
        writer.writeOffsetDateTimeValue("closedDateTime", this.getClosedDateTime());
        writer.writeCollectionOfObjectValues("custodians", this.getCustodians());
        writer.writeStringValue("externalId", this.getExternalId());
        writer.writeCollectionOfObjectValues("legalHolds", this.getLegalHolds());
        writer.writeCollectionOfObjectValues("noncustodialDataSources", this.getNoncustodialDataSources());
        writer.writeCollectionOfObjectValues("operations", this.getOperations());
        writer.writeCollectionOfObjectValues("reviewSets", this.getReviewSets());
        writer.writeCollectionOfObjectValues("searches", this.getSearches());
        writer.writeObjectValue("settings", this.getSettings());
        writer.writeCollectionOfObjectValues("tags", this.getTags());
    }
    /**
     * Sets the closedBy property value. The closedBy property
     * @param value Value to set for the closedBy property.
     * @return a void
     */
    public void setClosedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._closedBy = value;
    }
    /**
     * Sets the closedDateTime property value. The closedDateTime property
     * @param value Value to set for the closedDateTime property.
     * @return a void
     */
    public void setClosedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._closedDateTime = value;
    }
    /**
     * Sets the custodians property value. The custodians property
     * @param value Value to set for the custodians property.
     * @return a void
     */
    public void setCustodians(@javax.annotation.Nullable final java.util.List<EdiscoveryCustodian> value) {
        this._custodians = value;
    }
    /**
     * Sets the externalId property value. The externalId property
     * @param value Value to set for the externalId property.
     * @return a void
     */
    public void setExternalId(@javax.annotation.Nullable final String value) {
        this._externalId = value;
    }
    /**
     * Sets the legalHolds property value. The legalHolds property
     * @param value Value to set for the legalHolds property.
     * @return a void
     */
    public void setLegalHolds(@javax.annotation.Nullable final java.util.List<EdiscoveryHoldPolicy> value) {
        this._legalHolds = value;
    }
    /**
     * Sets the noncustodialDataSources property value. The noncustodialDataSources property
     * @param value Value to set for the noncustodialDataSources property.
     * @return a void
     */
    public void setNoncustodialDataSources(@javax.annotation.Nullable final java.util.List<EdiscoveryNoncustodialDataSource> value) {
        this._noncustodialDataSources = value;
    }
    /**
     * Sets the operations property value. The operations property
     * @param value Value to set for the operations property.
     * @return a void
     */
    public void setOperations(@javax.annotation.Nullable final java.util.List<CaseOperation> value) {
        this._operations = value;
    }
    /**
     * Sets the reviewSets property value. The reviewSets property
     * @param value Value to set for the reviewSets property.
     * @return a void
     */
    public void setReviewSets(@javax.annotation.Nullable final java.util.List<EdiscoveryReviewSet> value) {
        this._reviewSets = value;
    }
    /**
     * Sets the searches property value. The searches property
     * @param value Value to set for the searches property.
     * @return a void
     */
    public void setSearches(@javax.annotation.Nullable final java.util.List<EdiscoverySearch> value) {
        this._searches = value;
    }
    /**
     * Sets the settings property value. The settings property
     * @param value Value to set for the settings property.
     * @return a void
     */
    public void setSettings(@javax.annotation.Nullable final EdiscoveryCaseSettings value) {
        this._settings = value;
    }
    /**
     * Sets the tags property value. The tags property
     * @param value Value to set for the tags property.
     * @return a void
     */
    public void setTags(@javax.annotation.Nullable final java.util.List<EdiscoveryReviewTag> value) {
        this._tags = value;
    }
}
