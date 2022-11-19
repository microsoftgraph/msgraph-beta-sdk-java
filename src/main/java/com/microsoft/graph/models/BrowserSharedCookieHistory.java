package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BrowserSharedCookieHistory implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The comment for the shared cookie. */
    private String _comment;
    /** The name of the cookie. */
    private String _displayName;
    /** Controls whether a cookie is a host-only or domain cookie. */
    private Boolean _hostOnly;
    /** The URL of the cookie. */
    private String _hostOrDomain;
    /** The lastModifiedBy property */
    private IdentitySet _lastModifiedBy;
    /** The OdataType property */
    private String _odataType;
    /** The path of the cookie. */
    private String _path;
    /** The date and time when the cookie was last published. */
    private OffsetDateTime _publishedDateTime;
    /** Specifies how the cookies are shared between Microsoft Edge and Internet Explorer. The possible values are: microsoftEdge, internetExplorer11, both, unknownFutureValue. */
    private BrowserSharedCookieSourceEnvironment _sourceEnvironment;
    /**
     * Instantiates a new browserSharedCookieHistory and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public BrowserSharedCookieHistory() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.browserSharedCookieHistory");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a browserSharedCookieHistory
     */
    @javax.annotation.Nonnull
    public static BrowserSharedCookieHistory createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BrowserSharedCookieHistory();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the comment property value. The comment for the shared cookie.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getComment() {
        return this._comment;
    }
    /**
     * Gets the displayName property value. The name of the cookie.
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
        final BrowserSharedCookieHistory currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(9);
        deserializerMap.put("comment", (n) -> { currentObject.setComment(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        deserializerMap.put("hostOnly", (n) -> { currentObject.setHostOnly(n.getBooleanValue()); });
        deserializerMap.put("hostOrDomain", (n) -> { currentObject.setHostOrDomain(n.getStringValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { currentObject.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("path", (n) -> { currentObject.setPath(n.getStringValue()); });
        deserializerMap.put("publishedDateTime", (n) -> { currentObject.setPublishedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("sourceEnvironment", (n) -> { currentObject.setSourceEnvironment(n.getEnumValue(BrowserSharedCookieSourceEnvironment.class)); });
        return deserializerMap;
    }
    /**
     * Gets the hostOnly property value. Controls whether a cookie is a host-only or domain cookie.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHostOnly() {
        return this._hostOnly;
    }
    /**
     * Gets the hostOrDomain property value. The URL of the cookie.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHostOrDomain() {
        return this._hostOrDomain;
    }
    /**
     * Gets the lastModifiedBy property value. The lastModifiedBy property
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this._lastModifiedBy;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the path property value. The path of the cookie.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPath() {
        return this._path;
    }
    /**
     * Gets the publishedDateTime property value. The date and time when the cookie was last published.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getPublishedDateTime() {
        return this._publishedDateTime;
    }
    /**
     * Gets the sourceEnvironment property value. Specifies how the cookies are shared between Microsoft Edge and Internet Explorer. The possible values are: microsoftEdge, internetExplorer11, both, unknownFutureValue.
     * @return a browserSharedCookieSourceEnvironment
     */
    @javax.annotation.Nullable
    public BrowserSharedCookieSourceEnvironment getSourceEnvironment() {
        return this._sourceEnvironment;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("comment", this.getComment());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("hostOnly", this.getHostOnly());
        writer.writeStringValue("hostOrDomain", this.getHostOrDomain());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("path", this.getPath());
        writer.writeOffsetDateTimeValue("publishedDateTime", this.getPublishedDateTime());
        writer.writeEnumValue("sourceEnvironment", this.getSourceEnvironment());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the comment property value. The comment for the shared cookie.
     * @param value Value to set for the comment property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComment(@javax.annotation.Nullable final String value) {
        this._comment = value;
    }
    /**
     * Sets the displayName property value. The name of the cookie.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the hostOnly property value. Controls whether a cookie is a host-only or domain cookie.
     * @param value Value to set for the hostOnly property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHostOnly(@javax.annotation.Nullable final Boolean value) {
        this._hostOnly = value;
    }
    /**
     * Sets the hostOrDomain property value. The URL of the cookie.
     * @param value Value to set for the hostOrDomain property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHostOrDomain(@javax.annotation.Nullable final String value) {
        this._hostOrDomain = value;
    }
    /**
     * Sets the lastModifiedBy property value. The lastModifiedBy property
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._lastModifiedBy = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the path property value. The path of the cookie.
     * @param value Value to set for the path property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPath(@javax.annotation.Nullable final String value) {
        this._path = value;
    }
    /**
     * Sets the publishedDateTime property value. The date and time when the cookie was last published.
     * @param value Value to set for the publishedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublishedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._publishedDateTime = value;
    }
    /**
     * Sets the sourceEnvironment property value. Specifies how the cookies are shared between Microsoft Edge and Internet Explorer. The possible values are: microsoftEdge, internetExplorer11, both, unknownFutureValue.
     * @param value Value to set for the sourceEnvironment property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSourceEnvironment(@javax.annotation.Nullable final BrowserSharedCookieSourceEnvironment value) {
        this._sourceEnvironment = value;
    }
}
