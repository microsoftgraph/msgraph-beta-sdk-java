package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SearchHit implements AdditionalDataHolder, Parsable {
    /** The _id property */
    private String __id;
    /** The _score property */
    private Integer __score;
    /** The _source property */
    private Entity __source;
    /** The _summary property */
    private String __summary;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The name of the content source which the externalItem is part of . */
    private String _contentSource;
    /** The internal identifier for the item. The format of the identifier varies based on the entity type. For details, see hitId format. */
    private String _hitId;
    /** The OdataType property */
    private String _odataType;
    /** The rank or the order of the result. */
    private Integer _rank;
    /** The resource property */
    private Entity _resource;
    /** ID of the result template for rendering the search result. This ID must map to a display layout in the resultTemplates dictionary, included in the searchresponse as well. */
    private String _resultTemplateId;
    /** A summary of the result, if a summary is available. */
    private String _summary;
    /**
     * Instantiates a new searchHit and sets the default values.
     * @return a void
     */
    public SearchHit() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.searchHit");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a searchHit
     */
    @javax.annotation.Nonnull
    public static SearchHit createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SearchHit();
    }
    /**
     * Gets the _id property value. The _id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String get_id() {
        return this.__id;
    }
    /**
     * Gets the _score property value. The _score property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer get_score() {
        return this.__score;
    }
    /**
     * Gets the _source property value. The _source property
     * @return a entity
     */
    @javax.annotation.Nullable
    public Entity get_source() {
        return this.__source;
    }
    /**
     * Gets the _summary property value. The _summary property
     * @return a string
     */
    @javax.annotation.Nullable
    public String get_summary() {
        return this.__summary;
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
     * Gets the contentSource property value. The name of the content source which the externalItem is part of .
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContentSource() {
        return this._contentSource;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SearchHit currentObject = this;
        return new HashMap<>(11) {{
            this.put("_id", (n) -> { currentObject.set_id(n.getStringValue()); });
            this.put("_score", (n) -> { currentObject.set_score(n.getIntegerValue()); });
            this.put("_source", (n) -> { currentObject.set_source(n.getObjectValue(Entity::createFromDiscriminatorValue)); });
            this.put("_summary", (n) -> { currentObject.set_summary(n.getStringValue()); });
            this.put("contentSource", (n) -> { currentObject.setContentSource(n.getStringValue()); });
            this.put("hitId", (n) -> { currentObject.setHitId(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("rank", (n) -> { currentObject.setRank(n.getIntegerValue()); });
            this.put("resource", (n) -> { currentObject.setResource(n.getObjectValue(Entity::createFromDiscriminatorValue)); });
            this.put("resultTemplateId", (n) -> { currentObject.setResultTemplateId(n.getStringValue()); });
            this.put("summary", (n) -> { currentObject.setSummary(n.getStringValue()); });
        }};
    }
    /**
     * Gets the hitId property value. The internal identifier for the item. The format of the identifier varies based on the entity type. For details, see hitId format.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHitId() {
        return this._hitId;
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
     * Gets the rank property value. The rank or the order of the result.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRank() {
        return this._rank;
    }
    /**
     * Gets the resource property value. The resource property
     * @return a entity
     */
    @javax.annotation.Nullable
    public Entity getResource() {
        return this._resource;
    }
    /**
     * Gets the resultTemplateId property value. ID of the result template for rendering the search result. This ID must map to a display layout in the resultTemplates dictionary, included in the searchresponse as well.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResultTemplateId() {
        return this._resultTemplateId;
    }
    /**
     * Gets the summary property value. A summary of the result, if a summary is available.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSummary() {
        return this._summary;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("contentSource", this.getContentSource());
        writer.writeStringValue("hitId", this.getHitId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("rank", this.getRank());
        writer.writeObjectValue("resource", this.getResource());
        writer.writeStringValue("resultTemplateId", this.getResultTemplateId());
        writer.writeStringValue("summary", this.getSummary());
        writer.writeStringValue("_id", this.get_id());
        writer.writeIntegerValue("_score", this.get_score());
        writer.writeObjectValue("_source", this.get_source());
        writer.writeStringValue("_summary", this.get_summary());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the _id property value. The _id property
     * @param value Value to set for the _id property.
     * @return a void
     */
    public void set_id(@javax.annotation.Nullable final String value) {
        this.__id = value;
    }
    /**
     * Sets the _score property value. The _score property
     * @param value Value to set for the _score property.
     * @return a void
     */
    public void set_score(@javax.annotation.Nullable final Integer value) {
        this.__score = value;
    }
    /**
     * Sets the _source property value. The _source property
     * @param value Value to set for the _source property.
     * @return a void
     */
    public void set_source(@javax.annotation.Nullable final Entity value) {
        this.__source = value;
    }
    /**
     * Sets the _summary property value. The _summary property
     * @param value Value to set for the _summary property.
     * @return a void
     */
    public void set_summary(@javax.annotation.Nullable final String value) {
        this.__summary = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the contentSource property value. The name of the content source which the externalItem is part of .
     * @param value Value to set for the contentSource property.
     * @return a void
     */
    public void setContentSource(@javax.annotation.Nullable final String value) {
        this._contentSource = value;
    }
    /**
     * Sets the hitId property value. The internal identifier for the item. The format of the identifier varies based on the entity type. For details, see hitId format.
     * @param value Value to set for the hitId property.
     * @return a void
     */
    public void setHitId(@javax.annotation.Nullable final String value) {
        this._hitId = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the rank property value. The rank or the order of the result.
     * @param value Value to set for the rank property.
     * @return a void
     */
    public void setRank(@javax.annotation.Nullable final Integer value) {
        this._rank = value;
    }
    /**
     * Sets the resource property value. The resource property
     * @param value Value to set for the resource property.
     * @return a void
     */
    public void setResource(@javax.annotation.Nullable final Entity value) {
        this._resource = value;
    }
    /**
     * Sets the resultTemplateId property value. ID of the result template for rendering the search result. This ID must map to a display layout in the resultTemplates dictionary, included in the searchresponse as well.
     * @param value Value to set for the resultTemplateId property.
     * @return a void
     */
    public void setResultTemplateId(@javax.annotation.Nullable final String value) {
        this._resultTemplateId = value;
    }
    /**
     * Sets the summary property value. A summary of the result, if a summary is available.
     * @param value Value to set for the summary property.
     * @return a void
     */
    public void setSummary(@javax.annotation.Nullable final String value) {
        this._summary = value;
    }
}
