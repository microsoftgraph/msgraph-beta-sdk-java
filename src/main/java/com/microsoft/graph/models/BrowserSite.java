package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Singleton entity which is used to specify IE mode site metadata */
public class BrowserSite extends Entity implements Parsable {
    /** Controls the behavior of redirected sites. If true, indicates that the site will open in Internet Explorer 11 or Microsoft Edge even if the site is navigated to as part of a HTTP or meta refresh redirection chain. */
    private Boolean _allowRedirect;
    /** The comment for the site. */
    private String _comment;
    /** The compatibilityMode property */
    private BrowserSiteCompatibilityMode _compatibilityMode;
    /** The date and time when the site was created. */
    private OffsetDateTime _createdDateTime;
    /** The date and time when the site was deleted. */
    private OffsetDateTime _deletedDateTime;
    /** The history of modifications applied to the site. */
    private java.util.List<BrowserSiteHistory> _history;
    /** The user who last modified the site. */
    private IdentitySet _lastModifiedBy;
    /** The date and time when the site was last modified. */
    private OffsetDateTime _lastModifiedDateTime;
    /** The mergeType property */
    private BrowserSiteMergeType _mergeType;
    /** The status property */
    private BrowserSiteStatus _status;
    /** The targetEnvironment property */
    private BrowserSiteTargetEnvironment _targetEnvironment;
    /** The URL of the site. */
    private String _webUrl;
    /**
     * Instantiates a new browserSite and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public BrowserSite() {
        super();
        this.setOdataType("#microsoft.graph.browserSite");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a browserSite
     */
    @javax.annotation.Nonnull
    public static BrowserSite createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BrowserSite();
    }
    /**
     * Gets the allowRedirect property value. Controls the behavior of redirected sites. If true, indicates that the site will open in Internet Explorer 11 or Microsoft Edge even if the site is navigated to as part of a HTTP or meta refresh redirection chain.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowRedirect() {
        return this._allowRedirect;
    }
    /**
     * Gets the comment property value. The comment for the site.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getComment() {
        return this._comment;
    }
    /**
     * Gets the compatibilityMode property value. The compatibilityMode property
     * @return a browserSiteCompatibilityMode
     */
    @javax.annotation.Nullable
    public BrowserSiteCompatibilityMode getCompatibilityMode() {
        return this._compatibilityMode;
    }
    /**
     * Gets the createdDateTime property value. The date and time when the site was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the deletedDateTime property value. The date and time when the site was deleted.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDeletedDateTime() {
        return this._deletedDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final BrowserSite currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowRedirect", (n) -> { currentObject.setAllowRedirect(n.getBooleanValue()); });
        deserializerMap.put("comment", (n) -> { currentObject.setComment(n.getStringValue()); });
        deserializerMap.put("compatibilityMode", (n) -> { currentObject.setCompatibilityMode(n.getEnumValue(BrowserSiteCompatibilityMode.class)); });
        deserializerMap.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deletedDateTime", (n) -> { currentObject.setDeletedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("history", (n) -> { currentObject.setHistory(n.getCollectionOfObjectValues(BrowserSiteHistory::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedBy", (n) -> { currentObject.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("mergeType", (n) -> { currentObject.setMergeType(n.getEnumValue(BrowserSiteMergeType.class)); });
        deserializerMap.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(BrowserSiteStatus.class)); });
        deserializerMap.put("targetEnvironment", (n) -> { currentObject.setTargetEnvironment(n.getEnumValue(BrowserSiteTargetEnvironment.class)); });
        deserializerMap.put("webUrl", (n) -> { currentObject.setWebUrl(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the history property value. The history of modifications applied to the site.
     * @return a browserSiteHistory
     */
    @javax.annotation.Nullable
    public java.util.List<BrowserSiteHistory> getHistory() {
        return this._history;
    }
    /**
     * Gets the lastModifiedBy property value. The user who last modified the site.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this._lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time when the site was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the mergeType property value. The mergeType property
     * @return a browserSiteMergeType
     */
    @javax.annotation.Nullable
    public BrowserSiteMergeType getMergeType() {
        return this._mergeType;
    }
    /**
     * Gets the status property value. The status property
     * @return a browserSiteStatus
     */
    @javax.annotation.Nullable
    public BrowserSiteStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the targetEnvironment property value. The targetEnvironment property
     * @return a browserSiteTargetEnvironment
     */
    @javax.annotation.Nullable
    public BrowserSiteTargetEnvironment getTargetEnvironment() {
        return this._targetEnvironment;
    }
    /**
     * Gets the webUrl property value. The URL of the site.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWebUrl() {
        return this._webUrl;
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
        writer.writeBooleanValue("allowRedirect", this.getAllowRedirect());
        writer.writeStringValue("comment", this.getComment());
        writer.writeEnumValue("compatibilityMode", this.getCompatibilityMode());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeOffsetDateTimeValue("deletedDateTime", this.getDeletedDateTime());
        writer.writeCollectionOfObjectValues("history", this.getHistory());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeEnumValue("mergeType", this.getMergeType());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeEnumValue("targetEnvironment", this.getTargetEnvironment());
        writer.writeStringValue("webUrl", this.getWebUrl());
    }
    /**
     * Sets the allowRedirect property value. Controls the behavior of redirected sites. If true, indicates that the site will open in Internet Explorer 11 or Microsoft Edge even if the site is navigated to as part of a HTTP or meta refresh redirection chain.
     * @param value Value to set for the allowRedirect property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowRedirect(@javax.annotation.Nullable final Boolean value) {
        this._allowRedirect = value;
    }
    /**
     * Sets the comment property value. The comment for the site.
     * @param value Value to set for the comment property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComment(@javax.annotation.Nullable final String value) {
        this._comment = value;
    }
    /**
     * Sets the compatibilityMode property value. The compatibilityMode property
     * @param value Value to set for the compatibilityMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompatibilityMode(@javax.annotation.Nullable final BrowserSiteCompatibilityMode value) {
        this._compatibilityMode = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time when the site was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the deletedDateTime property value. The date and time when the site was deleted.
     * @param value Value to set for the deletedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeletedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._deletedDateTime = value;
    }
    /**
     * Sets the history property value. The history of modifications applied to the site.
     * @param value Value to set for the history property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHistory(@javax.annotation.Nullable final java.util.List<BrowserSiteHistory> value) {
        this._history = value;
    }
    /**
     * Sets the lastModifiedBy property value. The user who last modified the site.
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when the site was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the mergeType property value. The mergeType property
     * @param value Value to set for the mergeType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMergeType(@javax.annotation.Nullable final BrowserSiteMergeType value) {
        this._mergeType = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final BrowserSiteStatus value) {
        this._status = value;
    }
    /**
     * Sets the targetEnvironment property value. The targetEnvironment property
     * @param value Value to set for the targetEnvironment property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetEnvironment(@javax.annotation.Nullable final BrowserSiteTargetEnvironment value) {
        this._targetEnvironment = value;
    }
    /**
     * Sets the webUrl property value. The URL of the site.
     * @param value Value to set for the webUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebUrl(@javax.annotation.Nullable final String value) {
        this._webUrl = value;
    }
}
