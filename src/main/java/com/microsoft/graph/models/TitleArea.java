package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TitleArea implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Alternative text on the title area.
     */
    private String alternativeText;
    /**
     * Indicates whether the title area has a gradient effect enabled.
     */
    private Boolean enableGradientEffect;
    /**
     * URL of the image in the title area.
     */
    private String imageWebUrl;
    /**
     * Enumeration value that indicates the layout of the title area. The possible values are: imageAndTitle, plain, colorBlock, overlap, unknownFutureValue.
     */
    private TitleAreaLayoutType layout;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Contains collections of data that can be processed by server side services like search index and link fixup.
     */
    private ServerProcessedContent serverProcessedContent;
    /**
     * Indicates whether the author should be shown in title area.
     */
    private Boolean showAuthor;
    /**
     * Indicates whether the published date should be shown in title area.
     */
    private Boolean showPublishedDate;
    /**
     * Indicates whether the text block above title should be shown in title area.
     */
    private Boolean showTextBlockAboveTitle;
    /**
     * The text above title line.
     */
    private String textAboveTitle;
    /**
     * Enumeration value that indicates the text alignment of the title area. The possible values are: left, center, unknownFutureValue.
     */
    private TitleAreaTextAlignmentType textAlignment;
    /**
     * Instantiates a new titleArea and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TitleArea() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a titleArea
     */
    @javax.annotation.Nonnull
    public static TitleArea createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TitleArea();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the alternativeText property value. Alternative text on the title area.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAlternativeText() {
        return this.alternativeText;
    }
    /**
     * Gets the enableGradientEffect property value. Indicates whether the title area has a gradient effect enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableGradientEffect() {
        return this.enableGradientEffect;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("alternativeText", (n) -> { this.setAlternativeText(n.getStringValue()); });
        deserializerMap.put("enableGradientEffect", (n) -> { this.setEnableGradientEffect(n.getBooleanValue()); });
        deserializerMap.put("imageWebUrl", (n) -> { this.setImageWebUrl(n.getStringValue()); });
        deserializerMap.put("layout", (n) -> { this.setLayout(n.getEnumValue(TitleAreaLayoutType.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("serverProcessedContent", (n) -> { this.setServerProcessedContent(n.getObjectValue(ServerProcessedContent::createFromDiscriminatorValue)); });
        deserializerMap.put("showAuthor", (n) -> { this.setShowAuthor(n.getBooleanValue()); });
        deserializerMap.put("showPublishedDate", (n) -> { this.setShowPublishedDate(n.getBooleanValue()); });
        deserializerMap.put("showTextBlockAboveTitle", (n) -> { this.setShowTextBlockAboveTitle(n.getBooleanValue()); });
        deserializerMap.put("textAboveTitle", (n) -> { this.setTextAboveTitle(n.getStringValue()); });
        deserializerMap.put("textAlignment", (n) -> { this.setTextAlignment(n.getEnumValue(TitleAreaTextAlignmentType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the imageWebUrl property value. URL of the image in the title area.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getImageWebUrl() {
        return this.imageWebUrl;
    }
    /**
     * Gets the layout property value. Enumeration value that indicates the layout of the title area. The possible values are: imageAndTitle, plain, colorBlock, overlap, unknownFutureValue.
     * @return a titleAreaLayoutType
     */
    @javax.annotation.Nullable
    public TitleAreaLayoutType getLayout() {
        return this.layout;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the serverProcessedContent property value. Contains collections of data that can be processed by server side services like search index and link fixup.
     * @return a serverProcessedContent
     */
    @javax.annotation.Nullable
    public ServerProcessedContent getServerProcessedContent() {
        return this.serverProcessedContent;
    }
    /**
     * Gets the showAuthor property value. Indicates whether the author should be shown in title area.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowAuthor() {
        return this.showAuthor;
    }
    /**
     * Gets the showPublishedDate property value. Indicates whether the published date should be shown in title area.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowPublishedDate() {
        return this.showPublishedDate;
    }
    /**
     * Gets the showTextBlockAboveTitle property value. Indicates whether the text block above title should be shown in title area.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowTextBlockAboveTitle() {
        return this.showTextBlockAboveTitle;
    }
    /**
     * Gets the textAboveTitle property value. The text above title line.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTextAboveTitle() {
        return this.textAboveTitle;
    }
    /**
     * Gets the textAlignment property value. Enumeration value that indicates the text alignment of the title area. The possible values are: left, center, unknownFutureValue.
     * @return a titleAreaTextAlignmentType
     */
    @javax.annotation.Nullable
    public TitleAreaTextAlignmentType getTextAlignment() {
        return this.textAlignment;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("alternativeText", this.getAlternativeText());
        writer.writeBooleanValue("enableGradientEffect", this.getEnableGradientEffect());
        writer.writeStringValue("imageWebUrl", this.getImageWebUrl());
        writer.writeEnumValue("layout", this.getLayout());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("serverProcessedContent", this.getServerProcessedContent());
        writer.writeBooleanValue("showAuthor", this.getShowAuthor());
        writer.writeBooleanValue("showPublishedDate", this.getShowPublishedDate());
        writer.writeBooleanValue("showTextBlockAboveTitle", this.getShowTextBlockAboveTitle());
        writer.writeStringValue("textAboveTitle", this.getTextAboveTitle());
        writer.writeEnumValue("textAlignment", this.getTextAlignment());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the alternativeText property value. Alternative text on the title area.
     * @param value Value to set for the alternativeText property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlternativeText(@javax.annotation.Nullable final String value) {
        this.alternativeText = value;
    }
    /**
     * Sets the enableGradientEffect property value. Indicates whether the title area has a gradient effect enabled.
     * @param value Value to set for the enableGradientEffect property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnableGradientEffect(@javax.annotation.Nullable final Boolean value) {
        this.enableGradientEffect = value;
    }
    /**
     * Sets the imageWebUrl property value. URL of the image in the title area.
     * @param value Value to set for the imageWebUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setImageWebUrl(@javax.annotation.Nullable final String value) {
        this.imageWebUrl = value;
    }
    /**
     * Sets the layout property value. Enumeration value that indicates the layout of the title area. The possible values are: imageAndTitle, plain, colorBlock, overlap, unknownFutureValue.
     * @param value Value to set for the layout property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLayout(@javax.annotation.Nullable final TitleAreaLayoutType value) {
        this.layout = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the serverProcessedContent property value. Contains collections of data that can be processed by server side services like search index and link fixup.
     * @param value Value to set for the serverProcessedContent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServerProcessedContent(@javax.annotation.Nullable final ServerProcessedContent value) {
        this.serverProcessedContent = value;
    }
    /**
     * Sets the showAuthor property value. Indicates whether the author should be shown in title area.
     * @param value Value to set for the showAuthor property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShowAuthor(@javax.annotation.Nullable final Boolean value) {
        this.showAuthor = value;
    }
    /**
     * Sets the showPublishedDate property value. Indicates whether the published date should be shown in title area.
     * @param value Value to set for the showPublishedDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShowPublishedDate(@javax.annotation.Nullable final Boolean value) {
        this.showPublishedDate = value;
    }
    /**
     * Sets the showTextBlockAboveTitle property value. Indicates whether the text block above title should be shown in title area.
     * @param value Value to set for the showTextBlockAboveTitle property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShowTextBlockAboveTitle(@javax.annotation.Nullable final Boolean value) {
        this.showTextBlockAboveTitle = value;
    }
    /**
     * Sets the textAboveTitle property value. The text above title line.
     * @param value Value to set for the textAboveTitle property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTextAboveTitle(@javax.annotation.Nullable final String value) {
        this.textAboveTitle = value;
    }
    /**
     * Sets the textAlignment property value. Enumeration value that indicates the text alignment of the title area. The possible values are: left, center, unknownFutureValue.
     * @param value Value to set for the textAlignment property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTextAlignment(@javax.annotation.Nullable final TitleAreaTextAlignmentType value) {
        this.textAlignment = value;
    }
}
