package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WebPartData implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Audience information of the web part. By using this property, specific content will be prioritized to specific audiences.
     */
    private java.util.List<String> audiences;
    /**
     * Data version of the web part. The value is defined by the web part developer. Different dataVersions usually refers to a different property structure.
     */
    private String dataVersion;
    /**
     * Description of the web part.
     */
    private String description;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Properties bag of the web part.
     */
    private Json properties;
    /**
     * Contains collections of data that can be processed by server side services like search index and link fixup.
     */
    private ServerProcessedContent serverProcessedContent;
    /**
     * Title of the web part.
     */
    private String title;
    /**
     * Instantiates a new webPartData and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WebPartData() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a webPartData
     */
    @javax.annotation.Nonnull
    public static WebPartData createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WebPartData();
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
     * Gets the audiences property value. Audience information of the web part. By using this property, specific content will be prioritized to specific audiences.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAudiences() {
        return this.audiences;
    }
    /**
     * Gets the dataVersion property value. Data version of the web part. The value is defined by the web part developer. Different dataVersions usually refers to a different property structure.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDataVersion() {
        return this.dataVersion;
    }
    /**
     * Gets the description property value. Description of the web part.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("audiences", (n) -> { this.setAudiences(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("dataVersion", (n) -> { this.setDataVersion(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("properties", (n) -> { this.setProperties(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("serverProcessedContent", (n) -> { this.setServerProcessedContent(n.getObjectValue(ServerProcessedContent::createFromDiscriminatorValue)); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the properties property value. Properties bag of the web part.
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getProperties() {
        return this.properties;
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
     * Gets the title property value. Title of the web part.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTitle() {
        return this.title;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("audiences", this.getAudiences());
        writer.writeStringValue("dataVersion", this.getDataVersion());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("properties", this.getProperties());
        writer.writeObjectValue("serverProcessedContent", this.getServerProcessedContent());
        writer.writeStringValue("title", this.getTitle());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the audiences property value. Audience information of the web part. By using this property, specific content will be prioritized to specific audiences.
     * @param value Value to set for the audiences property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAudiences(@javax.annotation.Nullable final java.util.List<String> value) {
        this.audiences = value;
    }
    /**
     * Sets the dataVersion property value. Data version of the web part. The value is defined by the web part developer. Different dataVersions usually refers to a different property structure.
     * @param value Value to set for the dataVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDataVersion(@javax.annotation.Nullable final String value) {
        this.dataVersion = value;
    }
    /**
     * Sets the description property value. Description of the web part.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the properties property value. Properties bag of the web part.
     * @param value Value to set for the properties property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProperties(@javax.annotation.Nullable final Json value) {
        this.properties = value;
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
     * Sets the title property value. Title of the web part.
     * @param value Value to set for the title property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTitle(@javax.annotation.Nullable final String value) {
        this.title = value;
    }
}
