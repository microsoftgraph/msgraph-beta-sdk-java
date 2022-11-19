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
/** The history for the site modifications */
public class BrowserSiteHistory implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Controls the behavior of redirected sites. If true, indicates that the site will open in Internet Explorer 11 or Microsoft Edge even if the site is navigated to as part of a HTTP or meta refresh redirection chain. */
    private Boolean _allowRedirect;
    /** The comment for the site. */
    private String _comment;
    /** Controls what compatibility setting is used for specific sites or domains. The possible values are: default, internetExplorer8Enterprise, internetExplorer7Enterprise, internetExplorer11, internetExplorer10, internetExplorer9, internetExplorer8, internetExplorer7, internetExplorer5, unknownFutureValue. */
    private BrowserSiteCompatibilityMode _compatibilityMode;
    /** The user who last modified the site. */
    private IdentitySet _lastModifiedBy;
    /** The merge type of the site. The possible values are: noMerge, default, unknownFutureValue. */
    private BrowserSiteMergeType _mergeType;
    /** The OdataType property */
    private String _odataType;
    /** The date and time when the site was last published. */
    private OffsetDateTime _publishedDateTime;
    /** The target environment that the site should open in. The possible values are: internetExplorerMode, internetExplorer11, microsoftEdge, configurable, none, unknownFutureValue.Prior to June 15, 2022, the internetExplorer11 option would allow opening a site in the Internet Explorer 11 (IE11) desktop application. Following the retirement of IE11 on June 15, 2022, the internetExplorer11 option will no longer open an IE11 window and will instead behave the same as the internetExplorerMode option. */
    private BrowserSiteTargetEnvironment _targetEnvironment;
    /**
     * Instantiates a new browserSiteHistory and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public BrowserSiteHistory() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.browserSiteHistory");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a browserSiteHistory
     */
    @javax.annotation.Nonnull
    public static BrowserSiteHistory createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BrowserSiteHistory();
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
     * Gets the compatibilityMode property value. Controls what compatibility setting is used for specific sites or domains. The possible values are: default, internetExplorer8Enterprise, internetExplorer7Enterprise, internetExplorer11, internetExplorer10, internetExplorer9, internetExplorer8, internetExplorer7, internetExplorer5, unknownFutureValue.
     * @return a browserSiteCompatibilityMode
     */
    @javax.annotation.Nullable
    public BrowserSiteCompatibilityMode getCompatibilityMode() {
        return this._compatibilityMode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final BrowserSiteHistory currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(8);
        deserializerMap.put("allowRedirect", (n) -> { currentObject.setAllowRedirect(n.getBooleanValue()); });
        deserializerMap.put("comment", (n) -> { currentObject.setComment(n.getStringValue()); });
        deserializerMap.put("compatibilityMode", (n) -> { currentObject.setCompatibilityMode(n.getEnumValue(BrowserSiteCompatibilityMode.class)); });
        deserializerMap.put("lastModifiedBy", (n) -> { currentObject.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("mergeType", (n) -> { currentObject.setMergeType(n.getEnumValue(BrowserSiteMergeType.class)); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("publishedDateTime", (n) -> { currentObject.setPublishedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("targetEnvironment", (n) -> { currentObject.setTargetEnvironment(n.getEnumValue(BrowserSiteTargetEnvironment.class)); });
        return deserializerMap
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
     * Gets the mergeType property value. The merge type of the site. The possible values are: noMerge, default, unknownFutureValue.
     * @return a browserSiteMergeType
     */
    @javax.annotation.Nullable
    public BrowserSiteMergeType getMergeType() {
        return this._mergeType;
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
     * Gets the publishedDateTime property value. The date and time when the site was last published.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getPublishedDateTime() {
        return this._publishedDateTime;
    }
    /**
     * Gets the targetEnvironment property value. The target environment that the site should open in. The possible values are: internetExplorerMode, internetExplorer11, microsoftEdge, configurable, none, unknownFutureValue.Prior to June 15, 2022, the internetExplorer11 option would allow opening a site in the Internet Explorer 11 (IE11) desktop application. Following the retirement of IE11 on June 15, 2022, the internetExplorer11 option will no longer open an IE11 window and will instead behave the same as the internetExplorerMode option.
     * @return a browserSiteTargetEnvironment
     */
    @javax.annotation.Nullable
    public BrowserSiteTargetEnvironment getTargetEnvironment() {
        return this._targetEnvironment;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowRedirect", this.getAllowRedirect());
        writer.writeStringValue("comment", this.getComment());
        writer.writeEnumValue("compatibilityMode", this.getCompatibilityMode());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeEnumValue("mergeType", this.getMergeType());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeOffsetDateTimeValue("publishedDateTime", this.getPublishedDateTime());
        writer.writeEnumValue("targetEnvironment", this.getTargetEnvironment());
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
     * Sets the compatibilityMode property value. Controls what compatibility setting is used for specific sites or domains. The possible values are: default, internetExplorer8Enterprise, internetExplorer7Enterprise, internetExplorer11, internetExplorer10, internetExplorer9, internetExplorer8, internetExplorer7, internetExplorer5, unknownFutureValue.
     * @param value Value to set for the compatibilityMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompatibilityMode(@javax.annotation.Nullable final BrowserSiteCompatibilityMode value) {
        this._compatibilityMode = value;
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
     * Sets the mergeType property value. The merge type of the site. The possible values are: noMerge, default, unknownFutureValue.
     * @param value Value to set for the mergeType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMergeType(@javax.annotation.Nullable final BrowserSiteMergeType value) {
        this._mergeType = value;
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
     * Sets the publishedDateTime property value. The date and time when the site was last published.
     * @param value Value to set for the publishedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublishedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._publishedDateTime = value;
    }
    /**
     * Sets the targetEnvironment property value. The target environment that the site should open in. The possible values are: internetExplorerMode, internetExplorer11, microsoftEdge, configurable, none, unknownFutureValue.Prior to June 15, 2022, the internetExplorer11 option would allow opening a site in the Internet Explorer 11 (IE11) desktop application. Following the retirement of IE11 on June 15, 2022, the internetExplorer11 option will no longer open an IE11 window and will instead behave the same as the internetExplorerMode option.
     * @param value Value to set for the targetEnvironment property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetEnvironment(@javax.annotation.Nullable final BrowserSiteTargetEnvironment value) {
        this._targetEnvironment = value;
    }
}
