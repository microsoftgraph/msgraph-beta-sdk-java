package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class SitePage extends BaseItem implements Parsable {
    /** The content type of the page. */
    private ContentTypeInfo _contentType;
    /** The pageLayoutType property */
    private String _pageLayoutType;
    /** The publishingState property */
    private PublicationFacet _publishingState;
    /** The title property */
    private String _title;
    /** The webParts property */
    private java.util.List<WebPart> _webParts;
    /**
     * Instantiates a new sitePage and sets the default values.
     * @return a void
     */
    public SitePage() {
        super();
        this.setOdataType("#microsoft.graph.sitePage");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sitePage
     */
    @javax.annotation.Nonnull
    public static SitePage createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SitePage();
    }
    /**
     * Gets the contentType property value. The content type of the page.
     * @return a contentTypeInfo
     */
    @javax.annotation.Nullable
    public ContentTypeInfo getContentType() {
        return this._contentType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SitePage currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("contentType", (n) -> { currentObject.setContentType(n.getObjectValue(ContentTypeInfo::createFromDiscriminatorValue)); });
            this.put("pageLayoutType", (n) -> { currentObject.setPageLayoutType(n.getStringValue()); });
            this.put("publishingState", (n) -> { currentObject.setPublishingState(n.getObjectValue(PublicationFacet::createFromDiscriminatorValue)); });
            this.put("title", (n) -> { currentObject.setTitle(n.getStringValue()); });
            this.put("webParts", (n) -> { currentObject.setWebParts(n.getCollectionOfObjectValues(WebPart::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the pageLayoutType property value. The pageLayoutType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPageLayoutType() {
        return this._pageLayoutType;
    }
    /**
     * Gets the publishingState property value. The publishingState property
     * @return a publicationFacet
     */
    @javax.annotation.Nullable
    public PublicationFacet getPublishingState() {
        return this._publishingState;
    }
    /**
     * Gets the title property value. The title property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTitle() {
        return this._title;
    }
    /**
     * Gets the webParts property value. The webParts property
     * @return a webPart
     */
    @javax.annotation.Nullable
    public java.util.List<WebPart> getWebParts() {
        return this._webParts;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("contentType", this.getContentType());
        writer.writeStringValue("pageLayoutType", this.getPageLayoutType());
        writer.writeObjectValue("publishingState", this.getPublishingState());
        writer.writeStringValue("title", this.getTitle());
        writer.writeCollectionOfObjectValues("webParts", this.getWebParts());
    }
    /**
     * Sets the contentType property value. The content type of the page.
     * @param value Value to set for the contentType property.
     * @return a void
     */
    public void setContentType(@javax.annotation.Nullable final ContentTypeInfo value) {
        this._contentType = value;
    }
    /**
     * Sets the pageLayoutType property value. The pageLayoutType property
     * @param value Value to set for the pageLayoutType property.
     * @return a void
     */
    public void setPageLayoutType(@javax.annotation.Nullable final String value) {
        this._pageLayoutType = value;
    }
    /**
     * Sets the publishingState property value. The publishingState property
     * @param value Value to set for the publishingState property.
     * @return a void
     */
    public void setPublishingState(@javax.annotation.Nullable final PublicationFacet value) {
        this._publishingState = value;
    }
    /**
     * Sets the title property value. The title property
     * @param value Value to set for the title property.
     * @return a void
     */
    public void setTitle(@javax.annotation.Nullable final String value) {
        this._title = value;
    }
    /**
     * Sets the webParts property value. The webParts property
     * @param value Value to set for the webParts property.
     * @return a void
     */
    public void setWebParts(@javax.annotation.Nullable final java.util.List<WebPart> value) {
        this._webParts = value;
    }
}
