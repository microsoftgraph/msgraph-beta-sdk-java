package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BaseSitePage extends BaseItem implements Parsable {
    /**
     * The name of the page layout of the page. The possible values are: microsoftReserved, article, home, unknownFutureValue.
     */
    private PageLayoutType pageLayout;
    /**
     * The publishing status and the MM.mm version of the page.
     */
    private PublicationFacet publishingState;
    /**
     * Title of the sitePage.
     */
    private String title;
    /**
     * Instantiates a new baseSitePage and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public BaseSitePage() {
        super();
        this.setOdataType("#microsoft.graph.baseSitePage");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a baseSitePage
     */
    @jakarta.annotation.Nonnull
    public static BaseSitePage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.sitePage": return new SitePage();
            }
        }
        return new BaseSitePage();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("pageLayout", (n) -> { this.setPageLayout(n.getEnumValue(PageLayoutType.class)); });
        deserializerMap.put("publishingState", (n) -> { this.setPublishingState(n.getObjectValue(PublicationFacet::createFromDiscriminatorValue)); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the pageLayout property value. The name of the page layout of the page. The possible values are: microsoftReserved, article, home, unknownFutureValue.
     * @return a pageLayoutType
     */
    @jakarta.annotation.Nullable
    public PageLayoutType getPageLayout() {
        return this.pageLayout;
    }
    /**
     * Gets the publishingState property value. The publishing status and the MM.mm version of the page.
     * @return a publicationFacet
     */
    @jakarta.annotation.Nullable
    public PublicationFacet getPublishingState() {
        return this.publishingState;
    }
    /**
     * Gets the title property value. Title of the sitePage.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.title;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("pageLayout", this.getPageLayout());
        writer.writeObjectValue("publishingState", this.getPublishingState());
        writer.writeStringValue("title", this.getTitle());
    }
    /**
     * Sets the pageLayout property value. The name of the page layout of the page. The possible values are: microsoftReserved, article, home, unknownFutureValue.
     * @param value Value to set for the pageLayout property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPageLayout(@jakarta.annotation.Nullable final PageLayoutType value) {
        this.pageLayout = value;
    }
    /**
     * Sets the publishingState property value. The publishing status and the MM.mm version of the page.
     * @param value Value to set for the publishingState property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPublishingState(@jakarta.annotation.Nullable final PublicationFacet value) {
        this.publishingState = value;
    }
    /**
     * Sets the title property value. Title of the sitePage.
     * @param value Value to set for the title property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.title = value;
    }
}
