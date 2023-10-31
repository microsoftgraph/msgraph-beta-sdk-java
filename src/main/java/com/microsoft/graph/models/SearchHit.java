package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SearchHit implements AdditionalDataHolder, Parsable {
    /**
     * The _summary property
     */
    private String _summary;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The name of the content source that the externalItem is part of.
     */
    private String contentSource;
    /**
     * The internal identifier for the item. The format of the identifier varies based on the entity type. For details, see hitId format.
     */
    private String hitId;
    /**
     * The _id property
     */
    private String id;
    /**
     * Indicates whether the current result is collapses when the collapseProperties property in the searchRequest is used.
     */
    private Boolean isCollapsed;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The rank or the order of the result.
     */
    private Integer rank;
    /**
     * The resource property
     */
    private Entity resource;
    /**
     * ID of the result template for rendering the search result. This ID must map to a display layout in the resultTemplates dictionary, included in the searchresponse as well.
     */
    private String resultTemplateId;
    /**
     * The _score property
     */
    private Integer score;
    /**
     * The _source property
     */
    private Entity source;
    /**
     * A summary of the result, if a summary is available.
     */
    private String summary;
    /**
     * Instantiates a new SearchHit and sets the default values.
     */
    public SearchHit() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SearchHit
     */
    @jakarta.annotation.Nonnull
    public static SearchHit createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SearchHit();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the contentSource property value. The name of the content source that the externalItem is part of.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContentSource() {
        return this.contentSource;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("_summary", (n) -> { this.setSummary(n.getStringValue()); });
        deserializerMap.put("contentSource", (n) -> { this.setContentSource(n.getStringValue()); });
        deserializerMap.put("hitId", (n) -> { this.setHitId(n.getStringValue()); });
        deserializerMap.put("_id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("isCollapsed", (n) -> { this.setIsCollapsed(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("rank", (n) -> { this.setRank(n.getIntegerValue()); });
        deserializerMap.put("resource", (n) -> { this.setResource(n.getObjectValue(Entity::createFromDiscriminatorValue)); });
        deserializerMap.put("resultTemplateId", (n) -> { this.setResultTemplateId(n.getStringValue()); });
        deserializerMap.put("_score", (n) -> { this.setScore(n.getIntegerValue()); });
        deserializerMap.put("_source", (n) -> { this.setSource(n.getObjectValue(Entity::createFromDiscriminatorValue)); });
        deserializerMap.put("summary", (n) -> { this.setSummary(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hitId property value. The internal identifier for the item. The format of the identifier varies based on the entity type. For details, see hitId format.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getHitId() {
        return this.hitId;
    }
    /**
     * Gets the _id property value. The _id property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the isCollapsed property value. Indicates whether the current result is collapses when the collapseProperties property in the searchRequest is used.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCollapsed() {
        return this.isCollapsed;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the rank property value. The rank or the order of the result.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getRank() {
        return this.rank;
    }
    /**
     * Gets the resource property value. The resource property
     * @return a Entity
     */
    @jakarta.annotation.Nullable
    public Entity getResource() {
        return this.resource;
    }
    /**
     * Gets the resultTemplateId property value. ID of the result template for rendering the search result. This ID must map to a display layout in the resultTemplates dictionary, included in the searchresponse as well.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getResultTemplateId() {
        return this.resultTemplateId;
    }
    /**
     * Gets the _score property value. The _score property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getScore() {
        return this.score;
    }
    /**
     * Gets the _source property value. The _source property
     * @return a Entity
     */
    @jakarta.annotation.Nullable
    public Entity getSource() {
        return this.source;
    }
    /**
     * Gets the _summary property value. The _summary property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSummary() {
        return this._summary;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("contentSource", this.getContentSource());
        writer.writeStringValue("hitId", this.getHitId());
        writer.writeStringValue("_id", this.getId());
        writer.writeBooleanValue("isCollapsed", this.getIsCollapsed());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("rank", this.getRank());
        writer.writeObjectValue("resource", this.getResource());
        writer.writeStringValue("resultTemplateId", this.getResultTemplateId());
        writer.writeIntegerValue("_score", this.getScore());
        writer.writeObjectValue("_source", this.getSource());
        writer.writeStringValue("summary", this.getSummary());
        writer.writeStringValue("_summary", this.getSummary());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the contentSource property value. The name of the content source that the externalItem is part of.
     * @param value Value to set for the contentSource property.
     */
    public void setContentSource(@jakarta.annotation.Nullable final String value) {
        this.contentSource = value;
    }
    /**
     * Sets the hitId property value. The internal identifier for the item. The format of the identifier varies based on the entity type. For details, see hitId format.
     * @param value Value to set for the hitId property.
     */
    public void setHitId(@jakarta.annotation.Nullable final String value) {
        this.hitId = value;
    }
    /**
     * Sets the _id property value. The _id property
     * @param value Value to set for the _id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the isCollapsed property value. Indicates whether the current result is collapses when the collapseProperties property in the searchRequest is used.
     * @param value Value to set for the isCollapsed property.
     */
    public void setIsCollapsed(@jakarta.annotation.Nullable final Boolean value) {
        this.isCollapsed = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the rank property value. The rank or the order of the result.
     * @param value Value to set for the rank property.
     */
    public void setRank(@jakarta.annotation.Nullable final Integer value) {
        this.rank = value;
    }
    /**
     * Sets the resource property value. The resource property
     * @param value Value to set for the resource property.
     */
    public void setResource(@jakarta.annotation.Nullable final Entity value) {
        this.resource = value;
    }
    /**
     * Sets the resultTemplateId property value. ID of the result template for rendering the search result. This ID must map to a display layout in the resultTemplates dictionary, included in the searchresponse as well.
     * @param value Value to set for the resultTemplateId property.
     */
    public void setResultTemplateId(@jakarta.annotation.Nullable final String value) {
        this.resultTemplateId = value;
    }
    /**
     * Sets the _score property value. The _score property
     * @param value Value to set for the _score property.
     */
    public void setScore(@jakarta.annotation.Nullable final Integer value) {
        this.score = value;
    }
    /**
     * Sets the _source property value. The _source property
     * @param value Value to set for the _source property.
     */
    public void setSource(@jakarta.annotation.Nullable final Entity value) {
        this.source = value;
    }
    /**
     * Sets the _summary property value. The _summary property
     * @param value Value to set for the _summary property.
     */
    public void setSummary(@jakarta.annotation.Nullable final String value) {
        this._summary = value;
    }
}
