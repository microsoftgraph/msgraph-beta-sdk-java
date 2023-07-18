package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SitePage extends BaseItem implements Parsable {
    /**
     * Indicates the layout of the content in a given SharePoint page, including horizontal sections and vertical sections.
     */
    private CanvasLayout canvasLayout;
    /**
     * The contentType property
     */
    private ContentTypeInfo contentType;
    /**
     * The pageLayout property
     */
    private PageLayoutType pageLayout;
    /**
     * Indicates the promotion kind of the sitePage. The possible values are: microsoftReserved, page, newsPost, unknownFutureValue.
     */
    private PagePromotionType promotionKind;
    /**
     * The publishingState property
     */
    private PublicationFacet publishingState;
    /**
     * Reactions information for the page.
     */
    private ReactionsFacet reactions;
    /**
     * Determines whether or not to show comments at the bottom of the page.
     */
    private Boolean showComments;
    /**
     * Determines whether or not to show recommended pages at the bottom of the page.
     */
    private Boolean showRecommendedPages;
    /**
     * Url of the sitePage's thumbnail image
     */
    private String thumbnailWebUrl;
    /**
     * The title property
     */
    private String title;
    /**
     * Title area on the SharePoint page.
     */
    private TitleArea titleArea;
    /**
     * Collection of webparts on the SharePoint page.
     */
    private java.util.List<WebPart> webParts;
    /**
     * Instantiates a new sitePage and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
     * Gets the canvasLayout property value. Indicates the layout of the content in a given SharePoint page, including horizontal sections and vertical sections.
     * @return a canvasLayout
     */
    @javax.annotation.Nullable
    public CanvasLayout getCanvasLayout() {
        return this.canvasLayout;
    }
    /**
     * Gets the contentType property value. The contentType property
     * @return a contentTypeInfo
     */
    @javax.annotation.Nullable
    public ContentTypeInfo getContentType() {
        return this.contentType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("canvasLayout", (n) -> { this.setCanvasLayout(n.getObjectValue(CanvasLayout::createFromDiscriminatorValue)); });
        deserializerMap.put("contentType", (n) -> { this.setContentType(n.getObjectValue(ContentTypeInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("pageLayout", (n) -> { this.setPageLayout(n.getEnumValue(PageLayoutType.class)); });
        deserializerMap.put("promotionKind", (n) -> { this.setPromotionKind(n.getEnumValue(PagePromotionType.class)); });
        deserializerMap.put("publishingState", (n) -> { this.setPublishingState(n.getObjectValue(PublicationFacet::createFromDiscriminatorValue)); });
        deserializerMap.put("reactions", (n) -> { this.setReactions(n.getObjectValue(ReactionsFacet::createFromDiscriminatorValue)); });
        deserializerMap.put("showComments", (n) -> { this.setShowComments(n.getBooleanValue()); });
        deserializerMap.put("showRecommendedPages", (n) -> { this.setShowRecommendedPages(n.getBooleanValue()); });
        deserializerMap.put("thumbnailWebUrl", (n) -> { this.setThumbnailWebUrl(n.getStringValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        deserializerMap.put("titleArea", (n) -> { this.setTitleArea(n.getObjectValue(TitleArea::createFromDiscriminatorValue)); });
        deserializerMap.put("webParts", (n) -> { this.setWebParts(n.getCollectionOfObjectValues(WebPart::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the pageLayout property value. The pageLayout property
     * @return a pageLayoutType
     */
    @javax.annotation.Nullable
    public PageLayoutType getPageLayout() {
        return this.pageLayout;
    }
    /**
     * Gets the promotionKind property value. Indicates the promotion kind of the sitePage. The possible values are: microsoftReserved, page, newsPost, unknownFutureValue.
     * @return a pagePromotionType
     */
    @javax.annotation.Nullable
    public PagePromotionType getPromotionKind() {
        return this.promotionKind;
    }
    /**
     * Gets the publishingState property value. The publishingState property
     * @return a publicationFacet
     */
    @javax.annotation.Nullable
    public PublicationFacet getPublishingState() {
        return this.publishingState;
    }
    /**
     * Gets the reactions property value. Reactions information for the page.
     * @return a reactionsFacet
     */
    @javax.annotation.Nullable
    public ReactionsFacet getReactions() {
        return this.reactions;
    }
    /**
     * Gets the showComments property value. Determines whether or not to show comments at the bottom of the page.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowComments() {
        return this.showComments;
    }
    /**
     * Gets the showRecommendedPages property value. Determines whether or not to show recommended pages at the bottom of the page.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowRecommendedPages() {
        return this.showRecommendedPages;
    }
    /**
     * Gets the thumbnailWebUrl property value. Url of the sitePage's thumbnail image
     * @return a string
     */
    @javax.annotation.Nullable
    public String getThumbnailWebUrl() {
        return this.thumbnailWebUrl;
    }
    /**
     * Gets the title property value. The title property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTitle() {
        return this.title;
    }
    /**
     * Gets the titleArea property value. Title area on the SharePoint page.
     * @return a titleArea
     */
    @javax.annotation.Nullable
    public TitleArea getTitleArea() {
        return this.titleArea;
    }
    /**
     * Gets the webParts property value. Collection of webparts on the SharePoint page.
     * @return a webPart
     */
    @javax.annotation.Nullable
    public java.util.List<WebPart> getWebParts() {
        return this.webParts;
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
        writer.writeObjectValue("canvasLayout", this.getCanvasLayout());
        writer.writeObjectValue("contentType", this.getContentType());
        writer.writeEnumValue("pageLayout", this.getPageLayout());
        writer.writeEnumValue("promotionKind", this.getPromotionKind());
        writer.writeObjectValue("publishingState", this.getPublishingState());
        writer.writeObjectValue("reactions", this.getReactions());
        writer.writeBooleanValue("showComments", this.getShowComments());
        writer.writeBooleanValue("showRecommendedPages", this.getShowRecommendedPages());
        writer.writeStringValue("thumbnailWebUrl", this.getThumbnailWebUrl());
        writer.writeStringValue("title", this.getTitle());
        writer.writeObjectValue("titleArea", this.getTitleArea());
        writer.writeCollectionOfObjectValues("webParts", this.getWebParts());
    }
    /**
     * Sets the canvasLayout property value. Indicates the layout of the content in a given SharePoint page, including horizontal sections and vertical sections.
     * @param value Value to set for the canvasLayout property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCanvasLayout(@javax.annotation.Nullable final CanvasLayout value) {
        this.canvasLayout = value;
    }
    /**
     * Sets the contentType property value. The contentType property
     * @param value Value to set for the contentType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentType(@javax.annotation.Nullable final ContentTypeInfo value) {
        this.contentType = value;
    }
    /**
     * Sets the pageLayout property value. The pageLayout property
     * @param value Value to set for the pageLayout property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPageLayout(@javax.annotation.Nullable final PageLayoutType value) {
        this.pageLayout = value;
    }
    /**
     * Sets the promotionKind property value. Indicates the promotion kind of the sitePage. The possible values are: microsoftReserved, page, newsPost, unknownFutureValue.
     * @param value Value to set for the promotionKind property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPromotionKind(@javax.annotation.Nullable final PagePromotionType value) {
        this.promotionKind = value;
    }
    /**
     * Sets the publishingState property value. The publishingState property
     * @param value Value to set for the publishingState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublishingState(@javax.annotation.Nullable final PublicationFacet value) {
        this.publishingState = value;
    }
    /**
     * Sets the reactions property value. Reactions information for the page.
     * @param value Value to set for the reactions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReactions(@javax.annotation.Nullable final ReactionsFacet value) {
        this.reactions = value;
    }
    /**
     * Sets the showComments property value. Determines whether or not to show comments at the bottom of the page.
     * @param value Value to set for the showComments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShowComments(@javax.annotation.Nullable final Boolean value) {
        this.showComments = value;
    }
    /**
     * Sets the showRecommendedPages property value. Determines whether or not to show recommended pages at the bottom of the page.
     * @param value Value to set for the showRecommendedPages property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShowRecommendedPages(@javax.annotation.Nullable final Boolean value) {
        this.showRecommendedPages = value;
    }
    /**
     * Sets the thumbnailWebUrl property value. Url of the sitePage's thumbnail image
     * @param value Value to set for the thumbnailWebUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setThumbnailWebUrl(@javax.annotation.Nullable final String value) {
        this.thumbnailWebUrl = value;
    }
    /**
     * Sets the title property value. The title property
     * @param value Value to set for the title property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTitle(@javax.annotation.Nullable final String value) {
        this.title = value;
    }
    /**
     * Sets the titleArea property value. Title area on the SharePoint page.
     * @param value Value to set for the titleArea property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTitleArea(@javax.annotation.Nullable final TitleArea value) {
        this.titleArea = value;
    }
    /**
     * Sets the webParts property value. Collection of webparts on the SharePoint page.
     * @param value Value to set for the webParts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebParts(@javax.annotation.Nullable final java.util.List<WebPart> value) {
        this.webParts = value;
    }
}
