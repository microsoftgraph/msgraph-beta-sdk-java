package microsoft.graph.models.ediscovery;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.Entity;
import microsoft.graph.models.IdentitySet;
public class LegalHold extends Entity implements Parsable {
    /** KQL query that specifies content to be held in the specified locations. To learn more, see Keyword queries and search conditions for Content Search and eDiscovery.  To hold all content in the specified locations, leave contentQuery blank. */
    private String _contentQuery;
    /** The user who created the legal hold. */
    private IdentitySet _createdBy;
    /** The date and time the legal hold was created. */
    private OffsetDateTime _createdDateTime;
    /** The legal hold description. */
    private String _description;
    /** The display name of the legal hold. */
    private String _displayName;
    /** Lists any errors that happened while placing the hold. */
    private java.util.List<String> _errors;
    /** Indicates whether the hold is enabled and actively holding content. */
    private Boolean _isEnabled;
    /** the user who last modified the legal hold. */
    private IdentitySet _lastModifiedBy;
    /** The date and time the legal hold was last modified. */
    private OffsetDateTime _lastModifiedDateTime;
    /** Data source entity for SharePoint sites associated with the legal hold. */
    private java.util.List<SiteSource> _siteSources;
    /** The status of the legal hold. Possible values are: Pending, Error, Success, UnknownFutureValue. */
    private LegalHoldStatus _status;
    /** The unifiedGroupSources property */
    private java.util.List<UnifiedGroupSource> _unifiedGroupSources;
    /** Data source entity for a the legal hold. This is the container for a mailbox and OneDrive for Business site. */
    private java.util.List<UserSource> _userSources;
    /**
     * Instantiates a new legalHold and sets the default values.
     * @return a void
     */
    public LegalHold() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a legalHold
     */
    @javax.annotation.Nonnull
    public static LegalHold createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LegalHold();
    }
    /**
     * Gets the contentQuery property value. KQL query that specifies content to be held in the specified locations. To learn more, see Keyword queries and search conditions for Content Search and eDiscovery.  To hold all content in the specified locations, leave contentQuery blank.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContentQuery() {
        return this._contentQuery;
    }
    /**
     * Gets the createdBy property value. The user who created the legal hold.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the createdDateTime property value. The date and time the legal hold was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the description property value. The legal hold description.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The display name of the legal hold.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the errors property value. Lists any errors that happened while placing the hold.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getErrors() {
        return this._errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final LegalHold currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("contentQuery", (n) -> { currentObject.setContentQuery(n.getStringValue()); });
            this.put("createdBy", (n) -> { currentObject.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("errors", (n) -> { currentObject.setErrors(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("isEnabled", (n) -> { currentObject.setIsEnabled(n.getBooleanValue()); });
            this.put("lastModifiedBy", (n) -> { currentObject.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("siteSources", (n) -> { currentObject.setSiteSources(n.getCollectionOfObjectValues(SiteSource::createFromDiscriminatorValue)); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(LegalHoldStatus.class)); });
            this.put("unifiedGroupSources", (n) -> { currentObject.setUnifiedGroupSources(n.getCollectionOfObjectValues(UnifiedGroupSource::createFromDiscriminatorValue)); });
            this.put("userSources", (n) -> { currentObject.setUserSources(n.getCollectionOfObjectValues(UserSource::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the isEnabled property value. Indicates whether the hold is enabled and actively holding content.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEnabled() {
        return this._isEnabled;
    }
    /**
     * Gets the lastModifiedBy property value. the user who last modified the legal hold.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this._lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time the legal hold was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the siteSources property value. Data source entity for SharePoint sites associated with the legal hold.
     * @return a siteSource
     */
    @javax.annotation.Nullable
    public java.util.List<SiteSource> getSiteSources() {
        return this._siteSources;
    }
    /**
     * Gets the status property value. The status of the legal hold. Possible values are: Pending, Error, Success, UnknownFutureValue.
     * @return a legalHoldStatus
     */
    @javax.annotation.Nullable
    public LegalHoldStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the unifiedGroupSources property value. The unifiedGroupSources property
     * @return a unifiedGroupSource
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedGroupSource> getUnifiedGroupSources() {
        return this._unifiedGroupSources;
    }
    /**
     * Gets the userSources property value. Data source entity for a the legal hold. This is the container for a mailbox and OneDrive for Business site.
     * @return a userSource
     */
    @javax.annotation.Nullable
    public java.util.List<UserSource> getUserSources() {
        return this._userSources;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("contentQuery", this.getContentQuery());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfPrimitiveValues("errors", this.getErrors());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfObjectValues("siteSources", this.getSiteSources());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeCollectionOfObjectValues("unifiedGroupSources", this.getUnifiedGroupSources());
        writer.writeCollectionOfObjectValues("userSources", this.getUserSources());
    }
    /**
     * Sets the contentQuery property value. KQL query that specifies content to be held in the specified locations. To learn more, see Keyword queries and search conditions for Content Search and eDiscovery.  To hold all content in the specified locations, leave contentQuery blank.
     * @param value Value to set for the contentQuery property.
     * @return a void
     */
    public void setContentQuery(@javax.annotation.Nullable final String value) {
        this._contentQuery = value;
    }
    /**
     * Sets the createdBy property value. The user who created the legal hold.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time the legal hold was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the description property value. The legal hold description.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The display name of the legal hold.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the errors property value. Lists any errors that happened while placing the hold.
     * @param value Value to set for the errors property.
     * @return a void
     */
    public void setErrors(@javax.annotation.Nullable final java.util.List<String> value) {
        this._errors = value;
    }
    /**
     * Sets the isEnabled property value. Indicates whether the hold is enabled and actively holding content.
     * @param value Value to set for the isEnabled property.
     * @return a void
     */
    public void setIsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isEnabled = value;
    }
    /**
     * Sets the lastModifiedBy property value. the user who last modified the legal hold.
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    public void setLastModifiedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time the legal hold was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the siteSources property value. Data source entity for SharePoint sites associated with the legal hold.
     * @param value Value to set for the siteSources property.
     * @return a void
     */
    public void setSiteSources(@javax.annotation.Nullable final java.util.List<SiteSource> value) {
        this._siteSources = value;
    }
    /**
     * Sets the status property value. The status of the legal hold. Possible values are: Pending, Error, Success, UnknownFutureValue.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final LegalHoldStatus value) {
        this._status = value;
    }
    /**
     * Sets the unifiedGroupSources property value. The unifiedGroupSources property
     * @param value Value to set for the unifiedGroupSources property.
     * @return a void
     */
    public void setUnifiedGroupSources(@javax.annotation.Nullable final java.util.List<UnifiedGroupSource> value) {
        this._unifiedGroupSources = value;
    }
    /**
     * Sets the userSources property value. Data source entity for a the legal hold. This is the container for a mailbox and OneDrive for Business site.
     * @param value Value to set for the userSources property.
     * @return a void
     */
    public void setUserSources(@javax.annotation.Nullable final java.util.List<UserSource> value) {
        this._userSources = value;
    }
}
