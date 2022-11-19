package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** A singleton entity which is used to specify IE mode site list metadata */
public class BrowserSiteList extends Entity implements Parsable {
    /** The description of the site list. */
    private String _description;
    /** The name of the site list. */
    private String _displayName;
    /** The user who last modified the site list. */
    private IdentitySet _lastModifiedBy;
    /** The date and time when the site list was last modified. */
    private OffsetDateTime _lastModifiedDateTime;
    /** The user who published the site list. */
    private IdentitySet _publishedBy;
    /** The date and time when the site list was published. */
    private OffsetDateTime _publishedDateTime;
    /** The current revision of the site list. */
    private String _revision;
    /** A collection of shared cookies defined for the site list. */
    private java.util.List<BrowserSharedCookie> _sharedCookies;
    /** A collection of sites defined for the site list. */
    private java.util.List<BrowserSite> _sites;
    /** The status property */
    private BrowserSiteListStatus _status;
    /**
     * Instantiates a new browserSiteList and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public BrowserSiteList() {
        super();
        this.setOdataType("#microsoft.graph.browserSiteList");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a browserSiteList
     */
    @javax.annotation.Nonnull
    public static BrowserSiteList createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BrowserSiteList();
    }
    /**
     * Gets the description property value. The description of the site list.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The name of the site list.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final BrowserSiteList currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { currentObject.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("publishedBy", (n) -> { currentObject.setPublishedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("publishedDateTime", (n) -> { currentObject.setPublishedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("revision", (n) -> { currentObject.setRevision(n.getStringValue()); });
        deserializerMap.put("sharedCookies", (n) -> { currentObject.setSharedCookies(n.getCollectionOfObjectValues(BrowserSharedCookie::createFromDiscriminatorValue)); });
        deserializerMap.put("sites", (n) -> { currentObject.setSites(n.getCollectionOfObjectValues(BrowserSite::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(BrowserSiteListStatus.class)); });
        return deserializerMap
    }
    /**
     * Gets the lastModifiedBy property value. The user who last modified the site list.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this._lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time when the site list was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the publishedBy property value. The user who published the site list.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getPublishedBy() {
        return this._publishedBy;
    }
    /**
     * Gets the publishedDateTime property value. The date and time when the site list was published.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getPublishedDateTime() {
        return this._publishedDateTime;
    }
    /**
     * Gets the revision property value. The current revision of the site list.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRevision() {
        return this._revision;
    }
    /**
     * Gets the sharedCookies property value. A collection of shared cookies defined for the site list.
     * @return a browserSharedCookie
     */
    @javax.annotation.Nullable
    public java.util.List<BrowserSharedCookie> getSharedCookies() {
        return this._sharedCookies;
    }
    /**
     * Gets the sites property value. A collection of sites defined for the site list.
     * @return a browserSite
     */
    @javax.annotation.Nullable
    public java.util.List<BrowserSite> getSites() {
        return this._sites;
    }
    /**
     * Gets the status property value. The status property
     * @return a browserSiteListStatus
     */
    @javax.annotation.Nullable
    public BrowserSiteListStatus getStatus() {
        return this._status;
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
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeObjectValue("publishedBy", this.getPublishedBy());
        writer.writeOffsetDateTimeValue("publishedDateTime", this.getPublishedDateTime());
        writer.writeStringValue("revision", this.getRevision());
        writer.writeCollectionOfObjectValues("sharedCookies", this.getSharedCookies());
        writer.writeCollectionOfObjectValues("sites", this.getSites());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the description property value. The description of the site list.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The name of the site list.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the lastModifiedBy property value. The user who last modified the site list.
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when the site list was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the publishedBy property value. The user who published the site list.
     * @param value Value to set for the publishedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublishedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._publishedBy = value;
    }
    /**
     * Sets the publishedDateTime property value. The date and time when the site list was published.
     * @param value Value to set for the publishedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublishedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._publishedDateTime = value;
    }
    /**
     * Sets the revision property value. The current revision of the site list.
     * @param value Value to set for the revision property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRevision(@javax.annotation.Nullable final String value) {
        this._revision = value;
    }
    /**
     * Sets the sharedCookies property value. A collection of shared cookies defined for the site list.
     * @param value Value to set for the sharedCookies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharedCookies(@javax.annotation.Nullable final java.util.List<BrowserSharedCookie> value) {
        this._sharedCookies = value;
    }
    /**
     * Sets the sites property value. A collection of sites defined for the site list.
     * @param value Value to set for the sites property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSites(@javax.annotation.Nullable final java.util.List<BrowserSite> value) {
        this._sites = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final BrowserSiteListStatus value) {
        this._status = value;
    }
}
